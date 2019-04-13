package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFlowOutputRequest extends js.Object {
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The IP address where you want to send the output.
    */
  var Destination: js.UndefOr[__string] = js.undefined
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[UpdateEncryption] = js.undefined
  /**
    * The flow that is associated with the output that you want to update.
    */
  var FlowArn: __string
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[__integer] = js.undefined
  /**
    * The ARN of the output that you want to update.
    */
  var OutputArn: __string
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[__integer] = js.undefined
  /**
    * The protocol to use for the output.
    */
  var Protocol: js.UndefOr[Protocol] = js.undefined
  /**
    * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[__integer] = js.undefined
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[__string] = js.undefined
}

object UpdateFlowOutputRequest {
  @scala.inline
  def apply(
    FlowArn: __string,
    OutputArn: __string,
    Description: __string = null,
    Destination: __string = null,
    Encryption: UpdateEncryption = null,
    MaxLatency: js.UndefOr[__integer] = js.undefined,
    Port: js.UndefOr[__integer] = js.undefined,
    Protocol: Protocol = null,
    SmoothingLatency: js.UndefOr[__integer] = js.undefined,
    StreamId: __string = null
  ): UpdateFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn, OutputArn = OutputArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(SmoothingLatency)) __obj.updateDynamic("SmoothingLatency")(SmoothingLatency)
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId)
    __obj.asInstanceOf[UpdateFlowOutputRequest]
  }
}

