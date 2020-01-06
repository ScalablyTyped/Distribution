package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRiskConfigurationRequest extends js.Object {
  /**
    * The account takeover risk configuration.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.native
  /**
    * The app client ID. If ClientId is null, then the risk configuration is mapped to userPoolId. When the client ID is null, the same risk configuration is applied to all the clients in the userPool. Otherwise, ClientId is mapped to the client. When the client ID is not null, the user pool configuration is overridden and the risk configuration for the client is used instead.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The compromised credentials risk configuration.
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.native
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.native
  /**
    * The user pool ID. 
    */
  var UserPoolId: UserPoolIdType = js.native
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
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (AccountTakeoverRiskConfiguration != null) __obj.updateDynamic("AccountTakeoverRiskConfiguration")(AccountTakeoverRiskConfiguration.asInstanceOf[js.Any])
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (CompromisedCredentialsRiskConfiguration != null) __obj.updateDynamic("CompromisedCredentialsRiskConfiguration")(CompromisedCredentialsRiskConfiguration.asInstanceOf[js.Any])
    if (RiskExceptionConfiguration != null) __obj.updateDynamic("RiskExceptionConfiguration")(RiskExceptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRiskConfigurationRequest]
  }
}

