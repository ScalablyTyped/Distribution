package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiskConfigurationType extends js.Object {
  /**
    * The account takeover risk configuration object including the NotifyConfiguration object and Actions to take in the case of an account takeover.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.native
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The compromised credentials risk configuration object including the EventFilter and the EventAction 
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.native
  /**
    * The last modified date.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object RiskConfigurationType {
  @scala.inline
  def apply(
    AccountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationType = null,
    ClientId: ClientIdType = null,
    CompromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationType = null,
    LastModifiedDate: DateType = null,
    RiskExceptionConfiguration: RiskExceptionConfigurationType = null,
    UserPoolId: UserPoolIdType = null
  ): RiskConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (AccountTakeoverRiskConfiguration != null) __obj.updateDynamic("AccountTakeoverRiskConfiguration")(AccountTakeoverRiskConfiguration.asInstanceOf[js.Any])
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (CompromisedCredentialsRiskConfiguration != null) __obj.updateDynamic("CompromisedCredentialsRiskConfiguration")(CompromisedCredentialsRiskConfiguration.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (RiskExceptionConfiguration != null) __obj.updateDynamic("RiskExceptionConfiguration")(RiskExceptionConfiguration.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskConfigurationType]
  }
}

