package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scte35SegmentationDescriptor extends js.Object {
  /**
    * Holds the four SCTE-35 delivery restriction parameters.
    */
  var DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions] = js.undefined
  /**
    * Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
    */
  var SegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
    */
  var SegmentationCancelIndicator: Scte35SegmentationCancelIndicator
  /**
    * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a duration, the time_signal will continue until you insert a cancellation message.
    */
  var SegmentationDuration: js.UndefOr[__longMin0Max1099511627775] = js.undefined
  /**
    * Corresponds to SCTE-35 segmentation_event_id. 
    */
  var SegmentationEventId: __longMin0Max4294967295
  /**
    * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35 specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the ID in hex (for example, "0x34") or decimal (for example, "52").
    */
  var SegmentationTypeId: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
    */
  var SegmentationUpid: js.UndefOr[__string] = js.undefined
  /**
    * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35 specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example, "0x0C" ) or in decimal (for example, "12").
    */
  var SegmentationUpidType: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
    */
  var SegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
    */
  var SubSegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id.
    */
  var SubSegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined
}

object Scte35SegmentationDescriptor {
  @scala.inline
  def apply(
    SegmentationCancelIndicator: Scte35SegmentationCancelIndicator,
    SegmentationEventId: __longMin0Max4294967295,
    DeliveryRestrictions: Scte35DeliveryRestrictions = null,
    SegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined,
    SegmentationDuration: js.UndefOr[__longMin0Max1099511627775] = js.undefined,
    SegmentationTypeId: js.UndefOr[__integerMin0Max255] = js.undefined,
    SegmentationUpid: __string = null,
    SegmentationUpidType: js.UndefOr[__integerMin0Max255] = js.undefined,
    SegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined,
    SubSegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined,
    SubSegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined
  ): Scte35SegmentationDescriptor = {
    val __obj = js.Dynamic.literal(SegmentationCancelIndicator = SegmentationCancelIndicator.asInstanceOf[js.Any], SegmentationEventId = SegmentationEventId)
    if (DeliveryRestrictions != null) __obj.updateDynamic("DeliveryRestrictions")(DeliveryRestrictions)
    if (!js.isUndefined(SegmentNum)) __obj.updateDynamic("SegmentNum")(SegmentNum)
    if (!js.isUndefined(SegmentationDuration)) __obj.updateDynamic("SegmentationDuration")(SegmentationDuration)
    if (!js.isUndefined(SegmentationTypeId)) __obj.updateDynamic("SegmentationTypeId")(SegmentationTypeId)
    if (SegmentationUpid != null) __obj.updateDynamic("SegmentationUpid")(SegmentationUpid)
    if (!js.isUndefined(SegmentationUpidType)) __obj.updateDynamic("SegmentationUpidType")(SegmentationUpidType)
    if (!js.isUndefined(SegmentsExpected)) __obj.updateDynamic("SegmentsExpected")(SegmentsExpected)
    if (!js.isUndefined(SubSegmentNum)) __obj.updateDynamic("SubSegmentNum")(SubSegmentNum)
    if (!js.isUndefined(SubSegmentsExpected)) __obj.updateDynamic("SubSegmentsExpected")(SubSegmentsExpected)
    __obj.asInstanceOf[Scte35SegmentationDescriptor]
  }
}

