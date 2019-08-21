package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListedServer extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) for the server to be listed.
    */
  var Arn: typings.awsDashSdk.clientsTransferMod.Arn
  /**
    * The type of VPC endpoint that your SFTP server is connected to. If your SFTP server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typings.awsDashSdk.clientsTransferMod.EndpointType] = js.undefined
  /**
    * The authentication method used to validate a user for the server that was specified. This can include Secure Shell (SSH), user name and password combinations, or your own custom authentication method. Valid values include SERVICE_MANAGED or API_GATEWAY.
    */
  var IdentityProviderType: js.UndefOr[typings.awsDashSdk.clientsTransferMod.IdentityProviderType] = js.undefined
  /**
    * The AWS Identity and Access Management entity that allows the server to turn on Amazon CloudWatch logging.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
  /**
    * This value is the unique system assigned identifier for the SFTP servers that were listed.
    */
  var ServerId: js.UndefOr[typings.awsDashSdk.clientsTransferMod.ServerId] = js.undefined
  /**
    * This property describes the condition of the SFTP server for the server that was described. A value of ONLINE&gt; indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typings.awsDashSdk.clientsTransferMod.State] = js.undefined
  /**
    * This property is a numeric value that indicates the number of users that are assigned to the SFTP server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typings.awsDashSdk.clientsTransferMod.UserCount] = js.undefined
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
    UserCount: js.UndefOr[UserCount] = js.undefined
  ): ListedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (IdentityProviderType != null) __obj.updateDynamic("IdentityProviderType")(IdentityProviderType.asInstanceOf[js.Any])
    if (LoggingRole != null) __obj.updateDynamic("LoggingRole")(LoggingRole)
    if (ServerId != null) __obj.updateDynamic("ServerId")(ServerId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (!js.isUndefined(UserCount)) __obj.updateDynamic("UserCount")(UserCount)
    __obj.asInstanceOf[ListedServer]
  }
}

