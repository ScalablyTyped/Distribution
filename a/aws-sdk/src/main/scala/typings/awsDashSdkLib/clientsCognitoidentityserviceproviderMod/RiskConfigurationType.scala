package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiskConfigurationType extends js.Object {
  /**
    * The account takeover risk configuration object including the NotifyConfiguration object and Actions to take in the case of an account takeover.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  /**
    * The compromised credentials risk configuration object including the EventFilter and the EventAction 
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined
  /**
    * The last modified date.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
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
    if (AccountTakeoverRiskConfiguration != null) __obj.updateDynamic("AccountTakeoverRiskConfiguration")(AccountTakeoverRiskConfiguration)
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (CompromisedCredentialsRiskConfiguration != null) __obj.updateDynamic("CompromisedCredentialsRiskConfiguration")(CompromisedCredentialsRiskConfiguration)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (RiskExceptionConfiguration != null) __obj.updateDynamic("RiskExceptionConfiguration")(RiskExceptionConfiguration)
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    __obj.asInstanceOf[RiskConfigurationType]
  }
}

