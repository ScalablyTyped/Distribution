package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOutputRequest extends js.Object {
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var Destination: __string
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[Encryption] = js.undefined
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
  var Port: __integer
  /**
    * The protocol to use for the output.
    */
  var Protocol: awsDashSdkLib.clientsMediaconnectMod.Protocol
  /**
    * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
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
    Destination: __string,
    Port: __integer,
    Protocol: Protocol,
    Description: __string = null,
    Encryption: Encryption = null,
    MaxLatency: js.UndefOr[__integer] = js.undefined,
    Name: __string = null,
    SmoothingLatency: js.UndefOr[__integer] = js.undefined,
    StreamId: __string = null
  ): AddOutputRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination, Port = Port, Protocol = Protocol.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(SmoothingLatency)) __obj.updateDynamic("SmoothingLatency")(SmoothingLatency)
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId)
    __obj.asInstanceOf[AddOutputRequest]
  }
}

