package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTakeoverRiskConfigurationType extends js.Object {
  /**
    * Account takeover risk configuration actions
    */
  var Actions: AccountTakeoverActionsType = js.native
  /**
    * The notify configuration used to construct email notifications.
    */
  var NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.native
}

object AccountTakeoverRiskConfigurationType {
  @scala.inline
  def apply(Actions: AccountTakeoverActionsType, NotifyConfiguration: NotifyConfigurationType = null): AccountTakeoverRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    if (NotifyConfiguration != null) __obj.updateDynamic("NotifyConfiguration")(NotifyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTakeoverRiskConfigurationType]
  }
}

