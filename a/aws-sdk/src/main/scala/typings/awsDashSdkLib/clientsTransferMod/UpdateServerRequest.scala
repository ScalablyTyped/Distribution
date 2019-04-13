package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServerRequest extends js.Object {
  var EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined
  var EndpointType: js.UndefOr[EndpointType] = js.undefined
  /**
    * This response parameter is an array containing all of the information required to call a customer's authentication API method.
    */
  var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined
  /**
    * Changes the AWS Identity and Access Management (IAM) role that allows Amazon S3 events to be logged in Amazon CloudWatch, turning logging on or off.
    */
  var LoggingRole: js.UndefOr[NullableRole] = js.undefined
  /**
    * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
}

object UpdateServerRequest {
  @scala.inline
  def apply(
    ServerId: ServerId,
    EndpointDetails: EndpointDetails = null,
    EndpointType: EndpointType = null,
    IdentityProviderDetails: IdentityProviderDetails = null,
    LoggingRole: NullableRole = null
  ): UpdateServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId)
    if (EndpointDetails != null) __obj.updateDynamic("EndpointDetails")(EndpointDetails)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (IdentityProviderDetails != null) __obj.updateDynamic("IdentityProviderDetails")(IdentityProviderDetails)
    if (LoggingRole != null) __obj.updateDynamic("LoggingRole")(LoggingRole)
    __obj.asInstanceOf[UpdateServerRequest]
  }
}

