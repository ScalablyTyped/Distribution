package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFederationTokenResponse extends js.Object {
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsDashSdk.clientsStsMod.Credentials] = js.undefined
  /**
    * Identifiers for the federated user associated with the credentials (such as arn:aws:sts::123456789012:federated-user/Bob or 123456789012:Bob). You can use the federated user's ARN in your resource-based policies, such as an Amazon S3 bucket policy. 
    */
  var FederatedUser: js.UndefOr[typings.awsDashSdk.clientsStsMod.FederatedUser] = js.undefined
  /**
    * A percentage value indicating the size of the policy in packed form. The service rejects policies for which the packed size is greater than 100 percent of the allowed value.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
}

object GetFederationTokenResponse {
  @scala.inline
  def apply(
    Credentials: Credentials = null,
    FederatedUser: FederatedUser = null,
    PackedPolicySize: Int | Double = null
  ): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials)
    if (FederatedUser != null) __obj.updateDynamic("FederatedUser")(FederatedUser)
    if (PackedPolicySize != null) __obj.updateDynamic("PackedPolicySize")(PackedPolicySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
}

