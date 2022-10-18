package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateImageRequest extends StObject {
  
  /**
    * A list of properties to delete. Only the Description and DisplayName properties can be deleted.
    */
  var DeleteProperties: js.UndefOr[ImageDeletePropertyList] = js.undefined
  
  /**
    * The new description for the image.
    */
  var Description: js.UndefOr[ImageDescription] = js.undefined
  
  /**
    * The new display name for the image.
    */
  var DisplayName: js.UndefOr[ImageDisplayName] = js.undefined
  
  /**
    * The name of the image to update.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
  
  /**
    * The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on your behalf.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
}
object UpdateImageRequest {
  
  inline def apply(ImageName: ImageName): UpdateImageRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImageRequest]
  }
  
  extension [Self <: UpdateImageRequest](x: Self) {
    
    inline def setDeleteProperties(value: ImageDeletePropertyList): Self = StObject.set(x, "DeleteProperties", value.asInstanceOf[js.Any])
    
    inline def setDeletePropertiesUndefined: Self = StObject.set(x, "DeleteProperties", js.undefined)
    
    inline def setDeletePropertiesVarargs(value: ImageDeleteProperty*): Self = StObject.set(x, "DeleteProperties", js.Array(value*))
    
    inline def setDescription(value: ImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: ImageDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
