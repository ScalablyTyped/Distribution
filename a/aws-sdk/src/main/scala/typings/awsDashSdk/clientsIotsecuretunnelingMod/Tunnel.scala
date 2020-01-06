package typings.awsDashSdk.clientsIotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tunnel extends js.Object {
  /**
    * The time when the tunnel was created.
    */
  var createdAt: js.UndefOr[DateType] = js.native
  /**
    * A description of the tunnel.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The destination configuration that specifies the thing name of the destination device and a service name that the local proxy uses to connect to the destination application.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.native
  /**
    * The connection state of the destination application.
    */
  var destinationConnectionState: js.UndefOr[ConnectionState] = js.native
  /**
    * The last time the tunnel was updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * The connection state of the source application.
    */
  var sourceConnectionState: js.UndefOr[ConnectionState] = js.native
  /**
    * The status of a tunnel. Valid values are: Open and Closed.
    */
  var status: js.UndefOr[TunnelStatus] = js.native
  /**
    * A list of tag metadata associated with the secure tunnel.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Timeout configuration for the tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.native
  /**
    * A unique alpha-numeric ID that identifies a tunnel.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.native
}

object Tunnel {
  @scala.inline
  def apply(
    createdAt: DateType = null,
    description: Description = null,
    destinationConfig: DestinationConfig = null,
    destinationConnectionState: ConnectionState = null,
    lastUpdatedAt: DateType = null,
    sourceConnectionState: ConnectionState = null,
    status: TunnelStatus = null,
    tags: TagList = null,
    timeoutConfig: TimeoutConfig = null,
    tunnelArn: TunnelArn = null,
    tunnelId: TunnelId = null
  ): Tunnel = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destinationConfig != null) __obj.updateDynamic("destinationConfig")(destinationConfig.asInstanceOf[js.Any])
    if (destinationConnectionState != null) __obj.updateDynamic("destinationConnectionState")(destinationConnectionState.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (sourceConnectionState != null) __obj.updateDynamic("sourceConnectionState")(sourceConnectionState.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeoutConfig != null) __obj.updateDynamic("timeoutConfig")(timeoutConfig.asInstanceOf[js.Any])
    if (tunnelArn != null) __obj.updateDynamic("tunnelArn")(tunnelArn.asInstanceOf[js.Any])
    if (tunnelId != null) __obj.updateDynamic("tunnelId")(tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tunnel]
  }
}

