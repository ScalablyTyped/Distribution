package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportVolumeTaskDetails extends StObject {
  
  /**
    * The Availability Zone where the resulting volume will reside.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bytes converted so far.
    */
  var BytesConverted: js.UndefOr[Long] = js.undefined
  
  /**
    * The description you provided when starting the import volume task.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The image.
    */
  var Image: js.UndefOr[DiskImageDescription] = js.undefined
  
  /**
    * The volume.
    */
  var Volume: js.UndefOr[DiskImageVolumeDescription] = js.undefined
}
object ImportVolumeTaskDetails {
  
  inline def apply(): ImportVolumeTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportVolumeTaskDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportVolumeTaskDetails] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setBytesConverted(value: Long): Self = StObject.set(x, "BytesConverted", value.asInstanceOf[js.Any])
    
    inline def setBytesConvertedUndefined: Self = StObject.set(x, "BytesConverted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImage(value: DiskImageDescription): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setVolume(value: DiskImageVolumeDescription): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}
