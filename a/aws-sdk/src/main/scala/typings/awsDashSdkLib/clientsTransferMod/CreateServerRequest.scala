package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServerRequest extends js.Object {
  var EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined
  var EndpointType: js.UndefOr[EndpointType] = js.undefined
  /**
    * An array containing all of the information required to call a customer-supplied authentication API. This parameter is not required when the IdentityProviderType value of server that is created uses the SERVICE_MANAGED authentication method.
    */
  var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined
  /**
    * The mode of authentication enabled for this service. The default value is SERVICE_MANAGED, which allows you to store and access SFTP user credentials within the service. An IdentityProviderType value of API_GATEWAY indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
    */
  var IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
  /**
    * A value that allows the service to write your SFTP users' activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
  /**
    * Key-value pairs that can be used to group and search for servers.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object CreateServerRequest {
  @scala.inline
  def apply(
    EndpointDetails: EndpointDetails = null,
    EndpointType: EndpointType = null,
    IdentityProviderDetails: IdentityProviderDetails = null,
    IdentityProviderType: IdentityProviderType = null,
    LoggingRole: Role = null,
    Tags: Tags = null
  ): CreateServerRequest = {
    val __obj = js.Dynamic.literal()
    if (EndpointDetails != null) __obj.updateDynamic("EndpointDetails")(EndpointDetails)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (IdentityProviderDetails != null) __obj.updateDynamic("IdentityProviderDetails")(IdentityProviderDetails)
    if (IdentityProviderType != null) __obj.updateDynamic("IdentityProviderType")(IdentityProviderType.asInstanceOf[js.Any])
    if (LoggingRole != null) __obj.updateDynamic("LoggingRole")(LoggingRole)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateServerRequest]
  }
}

