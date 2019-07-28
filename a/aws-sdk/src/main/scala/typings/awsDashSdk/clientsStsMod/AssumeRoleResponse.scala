package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssumeRoleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you can use to refer to the resulting temporary security credentials. For example, you can reference these credentials as a principal in a resource-based policy by using the ARN or assumed role ID. The ARN and ID include the RoleSessionName that you specified when you called AssumeRole. 
    */
  var AssumedRoleUser: js.UndefOr[typings.awsDashSdk.clientsStsMod.AssumedRoleUser] = js.undefined
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsDashSdk.clientsStsMod.Credentials] = js.undefined
  /**
    * A percentage value that indicates the size of the policy in packed form. The service rejects any policy with a packed size greater than 100 percent, which means the policy exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
}

object AssumeRoleResponse {
  @scala.inline
  def apply(
    AssumedRoleUser: AssumedRoleUser = null,
    Credentials: Credentials = null,
    PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
  ): AssumeRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (AssumedRoleUser != null) __obj.updateDynamic("AssumedRoleUser")(AssumedRoleUser)
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials)
    if (!js.isUndefined(PackedPolicySize)) __obj.updateDynamic("PackedPolicySize")(PackedPolicySize)
    __obj.asInstanceOf[AssumeRoleResponse]
  }
}

