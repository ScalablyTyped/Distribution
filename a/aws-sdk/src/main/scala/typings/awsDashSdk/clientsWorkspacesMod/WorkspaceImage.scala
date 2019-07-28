package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceImage extends js.Object {
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.undefined
  /**
    * The error code that is returned for the image.
    */
  var ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.undefined
  /**
    * The text of the error message that is returned for the image.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
  /**
    * The name of the image.
    */
  var Name: js.UndefOr[WorkspaceImageName] = js.undefined
  /**
    * The operating system that the image is running. 
    */
  var OperatingSystem: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.OperatingSystem] = js.undefined
  /**
    * Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is enabled, this value is set to DEDICATED. 
    */
  var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.undefined
  /**
    * The status of the image.
    */
  var State: js.UndefOr[WorkspaceImageState] = js.undefined
}

object WorkspaceImage {
  @scala.inline
  def apply(
    Description: WorkspaceImageDescription = null,
    ErrorCode: WorkspaceImageErrorCode = null,
    ErrorMessage: Description = null,
    ImageId: WorkspaceImageId = null,
    Name: WorkspaceImageName = null,
    OperatingSystem: OperatingSystem = null,
    RequiredTenancy: WorkspaceImageRequiredTenancy = null,
    State: WorkspaceImageState = null
  ): WorkspaceImage = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem)
    if (RequiredTenancy != null) __obj.updateDynamic("RequiredTenancy")(RequiredTenancy.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceImage]
  }
}

