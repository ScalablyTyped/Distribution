package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeNewline extends js.Object {
  var includeNewline: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeNewline {
  @scala.inline
  def apply(includeNewline: js.UndefOr[Boolean] = js.undefined): AnonIncludeNewline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNewline)) __obj.updateDynamic("includeNewline")(includeNewline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeNewline]
  }
}

