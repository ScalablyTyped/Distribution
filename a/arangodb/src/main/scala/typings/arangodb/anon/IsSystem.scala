package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsSystem extends js.Object {
  var isSystem: js.UndefOr[Boolean] = js.undefined
}

object IsSystem {
  @scala.inline
  def apply(isSystem: js.UndefOr[Boolean] = js.undefined): IsSystem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSystem)) __obj.updateDynamic("isSystem")(isSystem.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSystem]
  }
}

