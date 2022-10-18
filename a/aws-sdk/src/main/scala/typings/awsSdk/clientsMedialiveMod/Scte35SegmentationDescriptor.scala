package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte35SegmentationDescriptor extends StObject {
  
  /**
    * Holds the four SCTE-35 delivery restriction parameters.
    */
  var DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions] = js.undefined
  
  /**
    * Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
    */
  var SegmentNum: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
    */
  var SegmentationCancelIndicator: Scte35SegmentationCancelIndicator
  
  /**
    * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a duration, the time_signal will continue until you insert a cancellation message.
    */
  var SegmentationDuration: js.UndefOr[longMin0Max1099511627775] = js.undefined
  
  /**
    * Corresponds to SCTE-35 segmentation_event_id. 
    */
  var SegmentationEventId: longMin0Max4294967295
  
  /**
    * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35 specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the ID in hex (for example, "0x34") or decimal (for example, "52").
    */
  var SegmentationTypeId: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
    */
  var SegmentationUpid: js.UndefOr[string] = js.undefined
  
  /**
    * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35 specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example, "0x0C" ) or in decimal (for example, "12").
    */
  var SegmentationUpidType: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
    */
  var SegmentsExpected: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
    */
  var SubSegmentNum: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id.
    */
  var SubSegmentsExpected: js.UndefOr[integerMin0Max255] = js.undefined
}
object Scte35SegmentationDescriptor {
  
  inline def apply(
    SegmentationCancelIndicator: Scte35SegmentationCancelIndicator,
    SegmentationEventId: longMin0Max4294967295
  ): Scte35SegmentationDescriptor = {
    val __obj = js.Dynamic.literal(SegmentationCancelIndicator = SegmentationCancelIndicator.asInstanceOf[js.Any], SegmentationEventId = SegmentationEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35SegmentationDescriptor]
  }
  
  extension [Self <: Scte35SegmentationDescriptor](x: Self) {
    
    inline def setDeliveryRestrictions(value: Scte35DeliveryRestrictions): Self = StObject.set(x, "DeliveryRestrictions", value.asInstanceOf[js.Any])
    
    inline def setDeliveryRestrictionsUndefined: Self = StObject.set(x, "DeliveryRestrictions", js.undefined)
    
    inline def setSegmentNum(value: integerMin0Max255): Self = StObject.set(x, "SegmentNum", value.asInstanceOf[js.Any])
    
    inline def setSegmentNumUndefined: Self = StObject.set(x, "SegmentNum", js.undefined)
    
    inline def setSegmentationCancelIndicator(value: Scte35SegmentationCancelIndicator): Self = StObject.set(x, "SegmentationCancelIndicator", value.asInstanceOf[js.Any])
    
    inline def setSegmentationDuration(value: longMin0Max1099511627775): Self = StObject.set(x, "SegmentationDuration", value.asInstanceOf[js.Any])
    
    inline def setSegmentationDurationUndefined: Self = StObject.set(x, "SegmentationDuration", js.undefined)
    
    inline def setSegmentationEventId(value: longMin0Max4294967295): Self = StObject.set(x, "SegmentationEventId", value.asInstanceOf[js.Any])
    
    inline def setSegmentationTypeId(value: integerMin0Max255): Self = StObject.set(x, "SegmentationTypeId", value.asInstanceOf[js.Any])
    
    inline def setSegmentationTypeIdUndefined: Self = StObject.set(x, "SegmentationTypeId", js.undefined)
    
    inline def setSegmentationUpid(value: string): Self = StObject.set(x, "SegmentationUpid", value.asInstanceOf[js.Any])
    
    inline def setSegmentationUpidType(value: integerMin0Max255): Self = StObject.set(x, "SegmentationUpidType", value.asInstanceOf[js.Any])
    
    inline def setSegmentationUpidTypeUndefined: Self = StObject.set(x, "SegmentationUpidType", js.undefined)
    
    inline def setSegmentationUpidUndefined: Self = StObject.set(x, "SegmentationUpid", js.undefined)
    
    inline def setSegmentsExpected(value: integerMin0Max255): Self = StObject.set(x, "SegmentsExpected", value.asInstanceOf[js.Any])
    
    inline def setSegmentsExpectedUndefined: Self = StObject.set(x, "SegmentsExpected", js.undefined)
    
    inline def setSubSegmentNum(value: integerMin0Max255): Self = StObject.set(x, "SubSegmentNum", value.asInstanceOf[js.Any])
    
    inline def setSubSegmentNumUndefined: Self = StObject.set(x, "SubSegmentNum", js.undefined)
    
    inline def setSubSegmentsExpected(value: integerMin0Max255): Self = StObject.set(x, "SubSegmentsExpected", value.asInstanceOf[js.Any])
    
    inline def setSubSegmentsExpectedUndefined: Self = StObject.set(x, "SubSegmentsExpected", js.undefined)
  }
}
