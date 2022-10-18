package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageRequest extends StObject {
  
  /**
    * The name of the image to delete.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
}
object DeleteImageRequest {
  
  inline def apply(ImageName: ImageName): DeleteImageRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRequest]
  }
  
  extension [Self <: DeleteImageRequest](x: Self) {
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
  }
}
