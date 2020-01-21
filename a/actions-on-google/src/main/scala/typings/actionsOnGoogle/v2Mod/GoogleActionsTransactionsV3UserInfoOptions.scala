package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3UserInfoOptions extends js.Object {
  /**
    * List of user info properties.
    */
  var userInfoProperties: js.UndefOr[js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties]] = js.undefined
}

object GoogleActionsTransactionsV3UserInfoOptions {
  @scala.inline
  def apply(userInfoProperties: js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties] = null): GoogleActionsTransactionsV3UserInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (userInfoProperties != null) __obj.updateDynamic("userInfoProperties")(userInfoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3UserInfoOptions]
  }
}

