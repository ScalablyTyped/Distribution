package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte35DescriptorSettings extends StObject {
  
  /**
    * SCTE-35 Segmentation Descriptor.
    */
  var SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor
}
object Scte35DescriptorSettings {
  
  inline def apply(SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor): Scte35DescriptorSettings = {
    val __obj = js.Dynamic.literal(SegmentationDescriptorScte35DescriptorSettings = SegmentationDescriptorScte35DescriptorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35DescriptorSettings]
  }
  
  extension [Self <: Scte35DescriptorSettings](x: Self) {
    
    inline def setSegmentationDescriptorScte35DescriptorSettings(value: Scte35SegmentationDescriptor): Self = StObject.set(x, "SegmentationDescriptorScte35DescriptorSettings", value.asInstanceOf[js.Any])
  }
}
