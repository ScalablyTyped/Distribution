package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribedServer extends js.Object {
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the server to be described.
    */
  var Arn: awsDashSdkLib.clientsTransferMod.Arn
  /**
    * The virtual private cloud (VPC) endpoint settings that you configured for your SFTP server.
    */
  var EndpointDetails: js.UndefOr[EndpointDetails] = js.undefined
  /**
    * The type of endpoint that your SFTP server is connected to. If your SFTP server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[EndpointType] = js.undefined
  /**
    * This value contains the Message-Digest Algorithm (MD5) hash of the server's host key. This value is equivalent to the output of ssh-keygen -l -E md5 -f my-new-server-key command.
    */
  var HostKeyFingerprint: js.UndefOr[HostKeyFingerprint] = js.undefined
  /**
    * Specifies information to call a customer-supplied authentication API. This field is not populated when the IdentityProviderType of the server is SERVICE_MANAGED&gt;.
    */
  var IdentityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined
  /**
    * This property defines the mode of authentication method enabled for this service. A value of SERVICE_MANAGED, means that you are using this Server to store and access SFTP user credentials within the service. A value of API_GATEWAY indicates that you have integrated an API Gateway endpoint that will be invoked for authenticating your user into the service.
    */
  var IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
  /**
    * This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
  /**
    * This property is a unique system assigned identifier for the SFTP server that you instantiate.
    */
  var ServerId: js.UndefOr[ServerId] = js.undefined
  /**
    * The condition of the SFTP server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicated that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[State] = js.undefined
  /**
    * This property contains the key-value pairs that you can use to search for and group servers that were assigned to the server that was described.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * The number of users that are assigned to the SFTP server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[UserCount] = js.undefined
}

object DescribedServer {
  @scala.inline
  def apply(
    Arn: Arn,
    EndpointDetails: EndpointDetails = null,
    EndpointType: EndpointType = null,
    HostKeyFingerprint: HostKeyFingerprint = null,
    IdentityProviderDetails: IdentityProviderDetails = null,
    IdentityProviderType: IdentityProviderType = null,
    LoggingRole: Role = null,
    ServerId: ServerId = null,
    State: State = null,
    Tags: Tags = null,
    UserCount: js.UndefOr[UserCount] = js.undefined
  ): DescribedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn)
    if (EndpointDetails != null) __obj.updateDynamic("EndpointDetails")(EndpointDetails)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (HostKeyFingerprint != null) __obj.updateDynamic("HostKeyFingerprint")(HostKeyFingerprint)
    if (IdentityProviderDetails != null) __obj.updateDynamic("IdentityProviderDetails")(IdentityProviderDetails)
    if (IdentityProviderType != null) __obj.updateDynamic("IdentityProviderType")(IdentityProviderType.asInstanceOf[js.Any])
    if (LoggingRole != null) __obj.updateDynamic("LoggingRole")(LoggingRole)
    if (ServerId != null) __obj.updateDynamic("ServerId")(ServerId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(UserCount)) __obj.updateDynamic("UserCount")(UserCount)
    __obj.asInstanceOf[DescribedServer]
  }
}

