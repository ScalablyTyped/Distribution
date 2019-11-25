package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3ActionActionMetadata extends js.Object {
  /**
    * Time when this action will expire.
    */
  var expireTime: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3ActionActionMetadata {
  @scala.inline
  def apply(expireTime: String = null): GoogleActionsOrdersV3ActionActionMetadata = {
    val __obj = js.Dynamic.literal()
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3ActionActionMetadata]
  }
}

