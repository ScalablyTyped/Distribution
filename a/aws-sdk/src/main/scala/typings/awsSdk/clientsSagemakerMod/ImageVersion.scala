package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageVersion extends StObject {
  
  /**
    * When the version was created.
    */
  var CreationTime: js.Date
  
  /**
    * When a create or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image the version is based on.
    */
  var ImageArn: typings.awsSdk.clientsSagemakerMod.ImageArn
  
  /**
    * The ARN of the version.
    */
  var ImageVersionArn: typings.awsSdk.clientsSagemakerMod.ImageVersionArn
  
  /**
    * The status of the version.
    */
  var ImageVersionStatus: typings.awsSdk.clientsSagemakerMod.ImageVersionStatus
  
  /**
    * When the version was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The version number.
    */
  var Version: ImageVersionNumber
}
object ImageVersion {
  
  inline def apply(
    CreationTime: js.Date,
    ImageArn: ImageArn,
    ImageVersionArn: ImageVersionArn,
    ImageVersionStatus: ImageVersionStatus,
    LastModifiedTime: js.Date,
    Version: ImageVersionNumber
  ): ImageVersion = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ImageArn = ImageArn.asInstanceOf[js.Any], ImageVersionArn = ImageVersionArn.asInstanceOf[js.Any], ImageVersionStatus = ImageVersionStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageVersion] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    inline def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageVersionStatus(value: ImageVersionStatus): Self = StObject.set(x, "ImageVersionStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
