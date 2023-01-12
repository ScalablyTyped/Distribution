package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentationDescriptor extends StObject {
  
  /**
    * The segment number to assign to the segmentation_descriptor.segment_num message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value is 0.
    */
  var SegmentNum: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Event Identifier to assign to the segmentation_descriptor.segmentation_event_id message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The default value is 1.
    */
  var SegmentationEventId: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Type Identifier to assign to the segmentation_descriptor.segmentation_type_id message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is 48.
    */
  var SegmentationTypeId: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Upid to assign to the segmentation_descriptor.segmentation_upid message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. The value must be a hexadecimal string containing only the characters 0 though 9 and A through F. The default value is "" (an empty string).
    */
  var SegmentationUpid: js.UndefOr[String] = js.undefined
  
  /**
    * The Upid Type to assign to the segmentation_descriptor.segmentation_upid_type message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is 14.
    */
  var SegmentationUpidType: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of segments expected, which is assigned to the segmentation_descriptor.segments_expectedS message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification Values must be between 0 and 256, inclusive. The default value is 0.
    */
  var SegmentsExpected: js.UndefOr[Integer] = js.undefined
  
  /**
    * The sub-segment number to assign to the segmentation_descriptor.sub_segment_num message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The defualt value is null.
    */
  var SubSegmentNum: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of sub-segments expected, which is assigned to the segmentation_descriptor.sub_segments_expected message, as defined in section 10.3.3.1 of the 2022 SCTE-35 specification. Values must be between 0 and 256, inclusive. The default value is null.
    */
  var SubSegmentsExpected: js.UndefOr[Integer] = js.undefined
}
object SegmentationDescriptor {
  
  inline def apply(): SegmentationDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentationDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentationDescriptor] (val x: Self) extends AnyVal {
    
    inline def setSegmentNum(value: Integer): Self = StObject.set(x, "SegmentNum", value.asInstanceOf[js.Any])
    
    inline def setSegmentNumUndefined: Self = StObject.set(x, "SegmentNum", js.undefined)
    
    inline def setSegmentationEventId(value: Integer): Self = StObject.set(x, "SegmentationEventId", value.asInstanceOf[js.Any])
    
    inline def setSegmentationEventIdUndefined: Self = StObject.set(x, "SegmentationEventId", js.undefined)
    
    inline def setSegmentationTypeId(value: Integer): Self = StObject.set(x, "SegmentationTypeId", value.asInstanceOf[js.Any])
    
    inline def setSegmentationTypeIdUndefined: Self = StObject.set(x, "SegmentationTypeId", js.undefined)
    
    inline def setSegmentationUpid(value: String): Self = StObject.set(x, "SegmentationUpid", value.asInstanceOf[js.Any])
    
    inline def setSegmentationUpidType(value: Integer): Self = StObject.set(x, "SegmentationUpidType", value.asInstanceOf[js.Any])
    
    inline def setSegmentationUpidTypeUndefined: Self = StObject.set(x, "SegmentationUpidType", js.undefined)
    
    inline def setSegmentationUpidUndefined: Self = StObject.set(x, "SegmentationUpid", js.undefined)
    
    inline def setSegmentsExpected(value: Integer): Self = StObject.set(x, "SegmentsExpected", value.asInstanceOf[js.Any])
    
    inline def setSegmentsExpectedUndefined: Self = StObject.set(x, "SegmentsExpected", js.undefined)
    
    inline def setSubSegmentNum(value: Integer): Self = StObject.set(x, "SubSegmentNum", value.asInstanceOf[js.Any])
    
    inline def setSubSegmentNumUndefined: Self = StObject.set(x, "SubSegmentNum", js.undefined)
    
    inline def setSubSegmentsExpected(value: Integer): Self = StObject.set(x, "SubSegmentsExpected", value.asInstanceOf[js.Any])
    
    inline def setSubSegmentsExpectedUndefined: Self = StObject.set(x, "SubSegmentsExpected", js.undefined)
  }
}
