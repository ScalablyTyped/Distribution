package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * The applications associated with the image.
    */
  var Applications: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Applications] = js.undefined
  
  /**
    * The version of the AppStream 2.0 agent to use for instances that are launched from this image. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsSdk.clientsAppstreamMod.AppstreamAgentVersion] = js.undefined
  
  /**
    * The ARN of the image.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Arn] = js.undefined
  
  /**
    * The ARN of the image from which this image was created.
    */
  var BaseImageArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time the image was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The image name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the image builder that was used to create the private image. If the image is shared, this value is null.
    */
  var ImageBuilderName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether an image builder can be launched from this image.
    */
  var ImageBuilderSupported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the errors that are returned when a new image can't be created.
    */
  var ImageErrors: js.UndefOr[ResourceErrors] = js.undefined
  
  /**
    * The permissions to provide to the destination AWS account for the specified image.
    */
  var ImagePermissions: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ImagePermissions] = js.undefined
  
  /**
    * The name of the image.
    */
  var Name: String
  
  /**
    * The operating system platform of the image.
    */
  var Platform: js.UndefOr[PlatformType] = js.undefined
  
  /**
    * The release date of the public base image. For private images, this date is the release date of the base image from which the image was created.
    */
  var PublicBaseImageReleasedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The image starts in the PENDING state. If image creation succeeds, the state is AVAILABLE. If image creation fails, the state is FAILED.
    */
  var State: js.UndefOr[ImageState] = js.undefined
  
  /**
    * The reason why the last state change occurred.
    */
  var StateChangeReason: js.UndefOr[ImageStateChangeReason] = js.undefined
  
  /**
    * Indicates whether the image is public or private.
    */
  var Visibility: js.UndefOr[VisibilityType] = js.undefined
}
object Image {
  
  inline def apply(Name: String): Image = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setApplications(value: Applications): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    inline def setApplicationsVarargs(value: Application*): Self = StObject.set(x, "Applications", js.Array(value*))
    
    inline def setAppstreamAgentVersion(value: AppstreamAgentVersion): Self = StObject.set(x, "AppstreamAgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAppstreamAgentVersionUndefined: Self = StObject.set(x, "AppstreamAgentVersion", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setBaseImageArn(value: Arn): Self = StObject.set(x, "BaseImageArn", value.asInstanceOf[js.Any])
    
    inline def setBaseImageArnUndefined: Self = StObject.set(x, "BaseImageArn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setImageBuilderName(value: String): Self = StObject.set(x, "ImageBuilderName", value.asInstanceOf[js.Any])
    
    inline def setImageBuilderNameUndefined: Self = StObject.set(x, "ImageBuilderName", js.undefined)
    
    inline def setImageBuilderSupported(value: Boolean): Self = StObject.set(x, "ImageBuilderSupported", value.asInstanceOf[js.Any])
    
    inline def setImageBuilderSupportedUndefined: Self = StObject.set(x, "ImageBuilderSupported", js.undefined)
    
    inline def setImageErrors(value: ResourceErrors): Self = StObject.set(x, "ImageErrors", value.asInstanceOf[js.Any])
    
    inline def setImageErrorsUndefined: Self = StObject.set(x, "ImageErrors", js.undefined)
    
    inline def setImageErrorsVarargs(value: ResourceError*): Self = StObject.set(x, "ImageErrors", js.Array(value*))
    
    inline def setImagePermissions(value: ImagePermissions): Self = StObject.set(x, "ImagePermissions", value.asInstanceOf[js.Any])
    
    inline def setImagePermissionsUndefined: Self = StObject.set(x, "ImagePermissions", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: PlatformType): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setPublicBaseImageReleasedDate(value: js.Date): Self = StObject.set(x, "PublicBaseImageReleasedDate", value.asInstanceOf[js.Any])
    
    inline def setPublicBaseImageReleasedDateUndefined: Self = StObject.set(x, "PublicBaseImageReleasedDate", js.undefined)
    
    inline def setState(value: ImageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: ImageStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setVisibility(value: VisibilityType): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
