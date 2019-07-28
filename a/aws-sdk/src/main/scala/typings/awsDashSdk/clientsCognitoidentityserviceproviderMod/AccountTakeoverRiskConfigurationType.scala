package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTakeoverRiskConfigurationType extends js.Object {
  /**
    * Account takeover risk configuration actions
    */
  var Actions: AccountTakeoverActionsType
  /**
    * The notify configuration used to construct email notifications.
    */
  var NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.undefined
}

object AccountTakeoverRiskConfigurationType {
  @scala.inline
  def apply(Actions: AccountTakeoverActionsType, NotifyConfiguration: NotifyConfigurationType = null): AccountTakeoverRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions)
    if (NotifyConfiguration != null) __obj.updateDynamic("NotifyConfiguration")(NotifyConfiguration)
    __obj.asInstanceOf[AccountTakeoverRiskConfigurationType]
  }
}

