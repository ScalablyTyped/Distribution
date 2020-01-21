package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsSystem extends js.Object {
  var isSystem: js.UndefOr[Boolean] = js.undefined
}

object AnonIsSystem {
  @scala.inline
  def apply(isSystem: js.UndefOr[Boolean] = js.undefined): AnonIsSystem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSystem)) __obj.updateDynamic("isSystem")(isSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsSystem]
  }
}

