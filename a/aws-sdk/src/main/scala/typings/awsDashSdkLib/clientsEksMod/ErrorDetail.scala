package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetail extends js.Object {
  /**
    * A brief description of the error.     SubnetNotFound: One of the subnets associated with the cluster could not be found.    SecurityGroupNotFound: One of the security groups associated with the cluster could not be found.    EniLimitReached: You have reached the elastic network interface limit for your account.    IpNotAvailable: A subnet associated with the cluster does not have any free IP addresses.    AccessDenied: You do not have permissions to perform the specified operation.    OperationNotPermitted: The service role associated with the cluster does not have the required access permissions for Amazon EKS.    VpcIdNotFound: The VPC associated with the cluster could not be found.  
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * A more complete description of the error.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * An optional field that contains the resource IDs associated with the error.
    */
  var resourceIds: js.UndefOr[StringList] = js.undefined
}

object ErrorDetail {
  @scala.inline
  def apply(errorCode: ErrorCode = null, errorMessage: String = null, resourceIds: StringList = null): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (resourceIds != null) __obj.updateDynamic("resourceIds")(resourceIds)
    __obj.asInstanceOf[ErrorDetail]
  }
}

