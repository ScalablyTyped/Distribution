package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetail extends js.Object {
  /**
    * A brief description of the error.     SubnetNotFound: We couldn't find one of the subnets associated with the cluster.    SecurityGroupNotFound: We couldn't find one of the security groups associated with the cluster.    EniLimitReached: You have reached the elastic network interface limit for your account.    IpNotAvailable: A subnet associated with the cluster doesn't have any free IP addresses.    AccessDenied: You don't have permissions to perform the specified operation.    OperationNotPermitted: The service role associated with the cluster doesn't have the required access permissions for Amazon EKS.    VpcIdNotFound: We couldn't find the VPC associated with the cluster.  
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * A more complete description of the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * An optional field that contains the resource IDs associated with the error.
    */
  var resourceIds: js.UndefOr[StringList] = js.native
}

object ErrorDetail {
  @scala.inline
  def apply(errorCode: ErrorCode = null, errorMessage: String = null, resourceIds: StringList = null): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (resourceIds != null) __obj.updateDynamic("resourceIds")(resourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetail]
  }
}

