package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  /**
    * The applications associated with the image.
    */
  var Applications: js.UndefOr[typings.awsSdk.appstreamMod.Applications] = js.native
  
  /**
    * The version of the AppStream 2.0 agent to use for instances that are launched from this image. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsSdk.appstreamMod.AppstreamAgentVersion] = js.native
  
  /**
    * The ARN of the image.
    */
  var Arn: js.UndefOr[typings.awsSdk.appstreamMod.Arn] = js.native
  
  /**
    * The ARN of the image from which this image was created.
    */
  var BaseImageArn: js.UndefOr[Arn] = js.native
  
  /**
    * The time the image was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The image name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
  
  /**
    * The name of the image builder that was used to create the private image. If the image is shared, this value is null.
    */
  var ImageBuilderName: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether an image builder can be launched from this image.
    */
  var ImageBuilderSupported: js.UndefOr[Boolean] = js.native
  
  /**
    * The permissions to provide to the destination AWS account for the specified image.
    */
  var ImagePermissions: js.UndefOr[typings.awsSdk.appstreamMod.ImagePermissions] = js.native
  
  /**
    * The name of the image.
    */
  var Name: String = js.native
  
  /**
    * The operating system platform of the image.
    */
  var Platform: js.UndefOr[PlatformType] = js.native
  
  /**
    * The release date of the public base image. For private images, this date is the release date of the base image from which the image was created.
    */
  var PublicBaseImageReleasedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The image starts in the PENDING state. If image creation succeeds, the state is AVAILABLE. If image creation fails, the state is FAILED.
    */
  var State: js.UndefOr[ImageState] = js.native
  
  /**
    * The reason why the last state change occurred.
    */
  var StateChangeReason: js.UndefOr[ImageStateChangeReason] = js.native
  
  /**
    * Indicates whether the image is public or private.
    */
  var Visibility: js.UndefOr[VisibilityType] = js.native
}
object Image {
  
  @scala.inline
  def apply(Name: String): Image = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: Applications): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: Application*): Self = StObject.set(x, "Applications", js.Array(value :_*))
    
    @scala.inline
    def setAppstreamAgentVersion(value: AppstreamAgentVersion): Self = StObject.set(x, "AppstreamAgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppstreamAgentVersionUndefined: Self = StObject.set(x, "AppstreamAgentVersion", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setBaseImageArn(value: Arn): Self = StObject.set(x, "BaseImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseImageArnUndefined: Self = StObject.set(x, "BaseImageArn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setImageBuilderName(value: String): Self = StObject.set(x, "ImageBuilderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuilderNameUndefined: Self = StObject.set(x, "ImageBuilderName", js.undefined)
    
    @scala.inline
    def setImageBuilderSupported(value: Boolean): Self = StObject.set(x, "ImageBuilderSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBuilderSupportedUndefined: Self = StObject.set(x, "ImageBuilderSupported", js.undefined)
    
    @scala.inline
    def setImagePermissions(value: ImagePermissions): Self = StObject.set(x, "ImagePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePermissionsUndefined: Self = StObject.set(x, "ImagePermissions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: PlatformType): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setPublicBaseImageReleasedDate(value: Timestamp): Self = StObject.set(x, "PublicBaseImageReleasedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicBaseImageReleasedDateUndefined: Self = StObject.set(x, "PublicBaseImageReleasedDate", js.undefined)
    
    @scala.inline
    def setState(value: ImageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeReason(value: ImageStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setVisibility(value: VisibilityType): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
