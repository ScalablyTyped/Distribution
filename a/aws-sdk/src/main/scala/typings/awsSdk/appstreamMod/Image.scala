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
  def apply(
    Name: String,
    Applications: Applications = null,
    AppstreamAgentVersion: AppstreamAgentVersion = null,
    Arn: Arn = null,
    BaseImageArn: Arn = null,
    CreatedTime: Timestamp = null,
    Description: String = null,
    DisplayName: String = null,
    ImageBuilderName: String = null,
    ImageBuilderSupported: js.UndefOr[Boolean] = js.undefined,
    ImagePermissions: ImagePermissions = null,
    Platform: PlatformType = null,
    PublicBaseImageReleasedDate: Timestamp = null,
    State: ImageState = null,
    StateChangeReason: ImageStateChangeReason = null,
    Visibility: VisibilityType = null
  ): Image = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Applications != null) __obj.updateDynamic("Applications")(Applications.asInstanceOf[js.Any])
    if (AppstreamAgentVersion != null) __obj.updateDynamic("AppstreamAgentVersion")(AppstreamAgentVersion.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (BaseImageArn != null) __obj.updateDynamic("BaseImageArn")(BaseImageArn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ImageBuilderName != null) __obj.updateDynamic("ImageBuilderName")(ImageBuilderName.asInstanceOf[js.Any])
    if (!js.isUndefined(ImageBuilderSupported)) __obj.updateDynamic("ImageBuilderSupported")(ImageBuilderSupported.get.asInstanceOf[js.Any])
    if (ImagePermissions != null) __obj.updateDynamic("ImagePermissions")(ImagePermissions.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PublicBaseImageReleasedDate != null) __obj.updateDynamic("PublicBaseImageReleasedDate")(PublicBaseImageReleasedDate.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason.asInstanceOf[js.Any])
    if (Visibility != null) __obj.updateDynamic("Visibility")(Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

