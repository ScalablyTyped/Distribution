package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionProperties extends StObject {
  
  /**
    * The timestamp of when the snapshot being converted was taken
    */
  var dataTimestamp: js.UndefOr[LargeBoundedString] = js.undefined
  
  /**
    * Whether the volume being converted uses UEFI or not
    */
  var forceUefi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The root volume name of a conversion job
    */
  var rootVolumeName: js.UndefOr[LargeBoundedString] = js.undefined
  
  /**
    * A mapping between the volumes being converted and the converted snapshot ids
    */
  var volumeToConversionMap: js.UndefOr[VolumeToConversionMap] = js.undefined
  
  /**
    * A mapping between the volumes and their sizes
    */
  var volumeToVolumeSize: js.UndefOr[VolumeToSizeMap] = js.undefined
}
object ConversionProperties {
  
  inline def apply(): ConversionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionProperties]
  }
  
  extension [Self <: ConversionProperties](x: Self) {
    
    inline def setDataTimestamp(value: LargeBoundedString): Self = StObject.set(x, "dataTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDataTimestampUndefined: Self = StObject.set(x, "dataTimestamp", js.undefined)
    
    inline def setForceUefi(value: Boolean): Self = StObject.set(x, "forceUefi", value.asInstanceOf[js.Any])
    
    inline def setForceUefiUndefined: Self = StObject.set(x, "forceUefi", js.undefined)
    
    inline def setRootVolumeName(value: LargeBoundedString): Self = StObject.set(x, "rootVolumeName", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeNameUndefined: Self = StObject.set(x, "rootVolumeName", js.undefined)
    
    inline def setVolumeToConversionMap(value: VolumeToConversionMap): Self = StObject.set(x, "volumeToConversionMap", value.asInstanceOf[js.Any])
    
    inline def setVolumeToConversionMapUndefined: Self = StObject.set(x, "volumeToConversionMap", js.undefined)
    
    inline def setVolumeToVolumeSize(value: VolumeToSizeMap): Self = StObject.set(x, "volumeToVolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeToVolumeSizeUndefined: Self = StObject.set(x, "volumeToVolumeSize", js.undefined)
  }
}
