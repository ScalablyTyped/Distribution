package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRiskConfigurationRequest extends js.Object {
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object DescribeRiskConfigurationRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, ClientId: ClientIdType = null): DescribeRiskConfigurationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    __obj.asInstanceOf[DescribeRiskConfigurationRequest]
  }
}

