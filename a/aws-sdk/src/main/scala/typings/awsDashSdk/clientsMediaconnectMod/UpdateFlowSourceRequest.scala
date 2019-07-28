package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFlowSourceRequest extends js.Object {
  /**
    * The type of encryption used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[UpdateEncryption] = js.undefined
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[__string] = js.undefined
  /**
    * The flow that is associated with the source that you want to update.
    */
  var FlowArn: __string
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[__integer] = js.undefined
  /**
    * The smoothing max bitrate for RTP and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[__integer] = js.undefined
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[__integer] = js.undefined
  /**
    * The protocol that is used by the source.
    */
  var Protocol: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Protocol] = js.undefined
  /**
    * The ARN of the source that you want to update.
    */
  var SourceArn: __string
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[__string] = js.undefined
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[__string] = js.undefined
}

object UpdateFlowSourceRequest {
  @scala.inline
  def apply(
    FlowArn: __string,
    SourceArn: __string,
    Decryption: UpdateEncryption = null,
    Description: __string = null,
    EntitlementArn: __string = null,
    IngestPort: js.UndefOr[__integer] = js.undefined,
    MaxBitrate: js.UndefOr[__integer] = js.undefined,
    MaxLatency: js.UndefOr[__integer] = js.undefined,
    Protocol: Protocol = null,
    StreamId: __string = null,
    WhitelistCidr: __string = null
  ): UpdateFlowSourceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn, SourceArn = SourceArn)
    if (Decryption != null) __obj.updateDynamic("Decryption")(Decryption)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn)
    if (!js.isUndefined(IngestPort)) __obj.updateDynamic("IngestPort")(IngestPort)
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate)
    if (!js.isUndefined(MaxLatency)) __obj.updateDynamic("MaxLatency")(MaxLatency)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId)
    if (WhitelistCidr != null) __obj.updateDynamic("WhitelistCidr")(WhitelistCidr)
    __obj.asInstanceOf[UpdateFlowSourceRequest]
  }
}

