package typings.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsertOnly extends js.Object {
  var insertOnly: js.UndefOr[Boolean] = js.undefined
}

object AnonInsertOnly {
  @scala.inline
  def apply(insertOnly: js.UndefOr[Boolean] = js.undefined): AnonInsertOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertOnly)) __obj.updateDynamic("insertOnly")(insertOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsertOnly]
  }
}

