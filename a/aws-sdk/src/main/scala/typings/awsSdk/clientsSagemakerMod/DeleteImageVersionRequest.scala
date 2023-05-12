package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageVersionRequest extends StObject {
  
  /**
    * The alias of the image to delete.
    */
  var Alias: js.UndefOr[SageMakerImageVersionAlias] = js.undefined
  
  /**
    * The name of the image to delete.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
  
  /**
    * The version to delete.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.undefined
}
object DeleteImageVersionRequest {
  
  inline def apply(ImageName: ImageName): DeleteImageVersionRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteImageVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: SageMakerImageVersionAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
