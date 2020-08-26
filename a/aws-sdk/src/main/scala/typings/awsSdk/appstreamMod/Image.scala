package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
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
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationsVarargs(value: Application*): Self = this.set("Applications", js.Array(value :_*))
    @scala.inline
    def setApplications(value: Applications): Self = this.set("Applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplications: Self = this.set("Applications", js.undefined)
    @scala.inline
    def setAppstreamAgentVersion(value: AppstreamAgentVersion): Self = this.set("AppstreamAgentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppstreamAgentVersion: Self = this.set("AppstreamAgentVersion", js.undefined)
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setBaseImageArn(value: Arn): Self = this.set("BaseImageArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseImageArn: Self = this.set("BaseImageArn", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setImageBuilderName(value: String): Self = this.set("ImageBuilderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBuilderName: Self = this.set("ImageBuilderName", js.undefined)
    @scala.inline
    def setImageBuilderSupported(value: Boolean): Self = this.set("ImageBuilderSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBuilderSupported: Self = this.set("ImageBuilderSupported", js.undefined)
    @scala.inline
    def setImagePermissions(value: ImagePermissions): Self = this.set("ImagePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePermissions: Self = this.set("ImagePermissions", js.undefined)
    @scala.inline
    def setPlatform(value: PlatformType): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setPublicBaseImageReleasedDate(value: Timestamp): Self = this.set("PublicBaseImageReleasedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicBaseImageReleasedDate: Self = this.set("PublicBaseImageReleasedDate", js.undefined)
    @scala.inline
    def setState(value: ImageState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateChangeReason(value: ImageStateChangeReason): Self = this.set("StateChangeReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateChangeReason: Self = this.set("StateChangeReason", js.undefined)
    @scala.inline
    def setVisibility(value: VisibilityType): Self = this.set("Visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("Visibility", js.undefined)
  }
  
}

