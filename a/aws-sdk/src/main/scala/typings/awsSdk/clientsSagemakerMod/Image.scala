package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * When the image was created.
    */
  var CreationTime: js.Date
  
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[ImageDescription] = js.undefined
  
  /**
    * The name of the image as displayed.
    */
  var DisplayName: js.UndefOr[ImageDisplayName] = js.undefined
  
  /**
    * When a create, update, or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var ImageArn: typings.awsSdk.clientsSagemakerMod.ImageArn
  
  /**
    * The name of the image.
    */
  var ImageName: typings.awsSdk.clientsSagemakerMod.ImageName
  
  /**
    * The status of the image.
    */
  var ImageStatus: typings.awsSdk.clientsSagemakerMod.ImageStatus
  
  /**
    * When the image was last modified.
    */
  var LastModifiedTime: js.Date
}
object Image {
  
  inline def apply(
    CreationTime: js.Date,
    ImageArn: ImageArn,
    ImageName: ImageName,
    ImageStatus: ImageStatus,
    LastModifiedTime: js.Date
  ): Image = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ImageArn = ImageArn.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], ImageStatus = ImageStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ImageDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: ImageDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setImageStatus(value: ImageStatus): Self = StObject.set(x, "ImageStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
