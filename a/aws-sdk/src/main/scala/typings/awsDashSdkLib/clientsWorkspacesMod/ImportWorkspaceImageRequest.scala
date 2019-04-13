package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportWorkspaceImageRequest extends js.Object {
  /**
    * The identifier of the EC2 image.
    */
  var Ec2ImageId: awsDashSdkLib.clientsWorkspacesMod.Ec2ImageId
  /**
    * The description of the WorkSpace image.
    */
  var ImageDescription: WorkspaceImageDescription
  /**
    * The name of the WorkSpace image.
    */
  var ImageName: WorkspaceImageName
  /**
    * The ingestion process to be used when importing the image.
    */
  var IngestionProcess: WorkspaceImageIngestionProcess
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ImportWorkspaceImageRequest {
  @scala.inline
  def apply(
    Ec2ImageId: Ec2ImageId,
    ImageDescription: WorkspaceImageDescription,
    ImageName: WorkspaceImageName,
    IngestionProcess: WorkspaceImageIngestionProcess,
    Tags: TagList = null
  ): ImportWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Ec2ImageId = Ec2ImageId, ImageDescription = ImageDescription, ImageName = ImageName, IngestionProcess = IngestionProcess.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ImportWorkspaceImageRequest]
  }
}

