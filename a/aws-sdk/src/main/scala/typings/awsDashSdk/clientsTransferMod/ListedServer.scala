package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedServer extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) for the server to be listed.
    */
  var Arn: typings.awsDashSdk.clientsTransferMod.Arn = js.native
  /**
    * The type of VPC endpoint that your SFTP server is connected to. If your SFTP server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typings.awsDashSdk.clientsTransferMod.EndpointType] = js.native
  /**
    * The authentication method used to validate a user for the server that was specified. This can include Secure Shell (SSH), user name and password combinations, or your own custom authentication method. Valid values include SERVICE_MANAGED or API_GATEWAY.
    */
  var IdentityProviderType: js.UndefOr[typings.awsDashSdk.clientsTransferMod.IdentityProviderType] = js.native
  /**
    * The AWS Identity and Access Management entity that allows the server to turn on Amazon CloudWatch logging.
    */
  var LoggingRole: js.UndefOr[Role] = js.native
  /**
    * This value is the unique system assigned identifier for the SFTP servers that were listed.
    */
  var ServerId: js.UndefOr[typings.awsDashSdk.clientsTransferMod.ServerId] = js.native
  /**
    * This property describes the condition of the SFTP server for the server that was described. A value of ONLINE&gt; indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typings.awsDashSdk.clientsTransferMod.State] = js.native
  /**
    * This property is a numeric value that indicates the number of users that are assigned to the SFTP server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typings.awsDashSdk.clientsTransferMod.UserCount] = js.native
}

object ListedServer {
  @scala.inline
  def apply(
    Arn: Arn,
    EndpointType: EndpointType = null,
    IdentityProviderType: IdentityProviderType = null,
    LoggingRole: Role = null,
    ServerId: ServerId = null,
    State: State = null,
    UserCount: Int | Double = null
  ): ListedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (IdentityProviderType != null) __obj.updateDynamic("IdentityProviderType")(IdentityProviderType.asInstanceOf[js.Any])
    if (LoggingRole != null) __obj.updateDynamic("LoggingRole")(LoggingRole.asInstanceOf[js.Any])
    if (ServerId != null) __obj.updateDynamic("ServerId")(ServerId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (UserCount != null) __obj.updateDynamic("UserCount")(UserCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedServer]
  }
}

