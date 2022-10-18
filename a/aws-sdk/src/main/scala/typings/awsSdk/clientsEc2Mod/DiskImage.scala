package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskImage extends StObject {
  
  /**
    * A description of the disk image.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the disk image.
    */
  var Image: js.UndefOr[DiskImageDetail] = js.undefined
  
  /**
    * Information about the volume.
    */
  var Volume: js.UndefOr[VolumeDetail] = js.undefined
}
object DiskImage {
  
  inline def apply(): DiskImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImage]
  }
  
  extension [Self <: DiskImage](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImage(value: DiskImageDetail): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setVolume(value: VolumeDetail): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}
