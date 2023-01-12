package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSignalMessage extends StObject {
  
  /**
    * The configurations for the SCTE-35 segmentation_descriptor message(s) sent with the time_signal message.
    */
  var SegmentationDescriptors: js.UndefOr[SegmentationDescriptorList] = js.undefined
}
object TimeSignalMessage {
  
  inline def apply(): TimeSignalMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSignalMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeSignalMessage] (val x: Self) extends AnyVal {
    
    inline def setSegmentationDescriptors(value: SegmentationDescriptorList): Self = StObject.set(x, "SegmentationDescriptors", value.asInstanceOf[js.Any])
    
    inline def setSegmentationDescriptorsUndefined: Self = StObject.set(x, "SegmentationDescriptors", js.undefined)
    
    inline def setSegmentationDescriptorsVarargs(value: SegmentationDescriptor*): Self = StObject.set(x, "SegmentationDescriptors", js.Array(value*))
  }
}
