package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyImageRequest extends StObject {
  
  /**
    * The description that the image will have when it is copied to the destination.
    */
  var DestinationImageDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The name that the image will have when it is copied to the destination.
    */
  var DestinationImageName: Name
  
  /**
    * The destination region to which the image will be copied. This parameter is required, even if you are copying an image within the same region.
    */
  var DestinationRegion: RegionName
  
  /**
    * The name of the image to copy.
    */
  var SourceImageName: Name
}
object CopyImageRequest {
  
  inline def apply(DestinationImageName: Name, DestinationRegion: RegionName, SourceImageName: Name): CopyImageRequest = {
    val __obj = js.Dynamic.literal(DestinationImageName = DestinationImageName.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any], SourceImageName = SourceImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyImageRequest]
  }
  
  extension [Self <: CopyImageRequest](x: Self) {
    
    inline def setDestinationImageDescription(value: Description): Self = StObject.set(x, "DestinationImageDescription", value.asInstanceOf[js.Any])
    
    inline def setDestinationImageDescriptionUndefined: Self = StObject.set(x, "DestinationImageDescription", js.undefined)
    
    inline def setDestinationImageName(value: Name): Self = StObject.set(x, "DestinationImageName", value.asInstanceOf[js.Any])
    
    inline def setDestinationRegion(value: RegionName): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceImageName(value: Name): Self = StObject.set(x, "SourceImageName", value.asInstanceOf[js.Any])
  }
}
