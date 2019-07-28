package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * The applications associated with the image.
    */
  var Applications: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Applications] = js.undefined
  /**
    * The version of the AppStream 2.0 agent to use for instances that are launched from this image. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.AppstreamAgentVersion] = js.undefined
  /**
    * The ARN of the image.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Arn] = js.undefined
  /**
    * The ARN of the image from which this image was created.
    */
  var BaseImageArn: js.UndefOr[Arn] = js.undefined
  /**
    * The time the image was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
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
    * The permissions to provide to the destination AWS account for the specified image.
    */
  var ImagePermissions: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ImagePermissions] = js.undefined
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
  var PublicBaseImageReleasedDate: js.UndefOr[Timestamp] = js.undefined
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
    val __obj = js.Dynamic.literal(Name = Name)
    if (Applications != null) __obj.updateDynamic("Applications")(Applications)
    if (AppstreamAgentVersion != null) __obj.updateDynamic("AppstreamAgentVersion")(AppstreamAgentVersion)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (BaseImageArn != null) __obj.updateDynamic("BaseImageArn")(BaseImageArn)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (ImageBuilderName != null) __obj.updateDynamic("ImageBuilderName")(ImageBuilderName)
    if (!js.isUndefined(ImageBuilderSupported)) __obj.updateDynamic("ImageBuilderSupported")(ImageBuilderSupported)
    if (ImagePermissions != null) __obj.updateDynamic("ImagePermissions")(ImagePermissions)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PublicBaseImageReleasedDate != null) __obj.updateDynamic("PublicBaseImageReleasedDate")(PublicBaseImageReleasedDate)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason)
    if (Visibility != null) __obj.updateDynamic("Visibility")(Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

