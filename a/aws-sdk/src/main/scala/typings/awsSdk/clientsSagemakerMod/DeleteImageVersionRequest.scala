package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageVersionRequest extends StObject {
  
  /**
    * The name of the image.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
  
  /**
    * The version to delete.
    */
  var Version: ImageVersionNumber
}
object DeleteImageVersionRequest {
  
  inline def apply(ImageName: ImageName, Version: ImageVersionNumber): DeleteImageVersionRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageVersionRequest]
  }
  
  extension [Self <: DeleteImageVersionRequest](x: Self) {
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
