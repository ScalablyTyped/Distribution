package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRiskConfigurationRequest extends js.Object {
  /**
    * The account takeover risk configuration.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined
  /**
    * The app client ID. If ClientId is null, then the risk configuration is mapped to userPoolId. When the client ID is null, the same risk configuration is applied to all the clients in the userPool. Otherwise, ClientId is mapped to the client. When the client ID is not null, the user pool configuration is overridden and the risk configuration for the client is used instead.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  /**
    * The compromised credentials risk configuration.
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
  /**
    * The user pool ID. 
    */
  var UserPoolId: UserPoolIdType
}

object SetRiskConfigurationRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    AccountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationType = null,
    ClientId: ClientIdType = null,
    CompromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationType = null,
    RiskExceptionConfiguration: RiskExceptionConfigurationType = null
  ): SetRiskConfigurationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (AccountTakeoverRiskConfiguration != null) __obj.updateDynamic("AccountTakeoverRiskConfiguration")(AccountTakeoverRiskConfiguration)
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (CompromisedCredentialsRiskConfiguration != null) __obj.updateDynamic("CompromisedCredentialsRiskConfiguration")(CompromisedCredentialsRiskConfiguration)
    if (RiskExceptionConfiguration != null) __obj.updateDynamic("RiskExceptionConfiguration")(RiskExceptionConfiguration)
    __obj.asInstanceOf[SetRiskConfigurationRequest]
  }
}

