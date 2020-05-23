package typings.acceptLanguageParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickOptions extends js.Object {
  var loose: js.UndefOr[Boolean] = js.undefined
}

object PickOptions {
  @scala.inline
  def apply(loose: js.UndefOr[Boolean] = js.undefined): PickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickOptions]
  }
}

