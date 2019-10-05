package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOutputRequest extends js.Object {
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[__listOf__string] = js.undefined
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var Destination: js.UndefOr[__string] = js.undefined
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Encryption] = js.undefined
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[__integer] = js.undefined
  /**
    * The name of the output. This value must be unique within the current flow.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[__integer] = js.undefined
  /**
    * The protocol to use for the output.
    */
  var Protocol: typings.awsDashSdk.clientsMediaconnectMod.Protocol
  /**
    * The remote ID for the Zixi-pull output stream.
    */
  var RemoteId: js.UndefOr[__string] = js.undefined
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[__integer] = js.undefined
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[__string] = js.undefined
}

object AddOutputRequest {
  @scala.inline
  def apply(
    Protocol: Protocol,
    CidrAllowList: __listOf__string = null,
    Description: __string = null,
    Destination: __string = null,
    Encryption: Encryption = null,
    MaxLatency: Int | Double = null,
    Name: __string = null,
    Port: Int | Double = null,
    RemoteId: __string = null,
    SmoothingLatency: Int | Double = null,
    StreamId: __string = null
  ): AddOutputRequest = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    if (CidrAllowList != null) __obj.updateDynamic("CidrAllowList")(CidrAllowList)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (MaxLatency != null) __obj.updateDynamic("MaxLatency")(MaxLatency.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (RemoteId != null) __obj.updateDynamic("RemoteId")(RemoteId)
    if (SmoothingLatency != null) __obj.updateDynamic("SmoothingLatency")(SmoothingLatency.asInstanceOf[js.Any])
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId)
    __obj.asInstanceOf[AddOutputRequest]
  }
}

