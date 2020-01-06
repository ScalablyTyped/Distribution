package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportWorkspaceImageRequest extends js.Object {
  /**
    * The identifier of the EC2 image.
    */
  var Ec2ImageId: typings.awsDashSdk.clientsWorkspacesMod.Ec2ImageId = js.native
  /**
    * The description of the WorkSpace image.
    */
  var ImageDescription: WorkspaceImageDescription = js.native
  /**
    * The name of the WorkSpace image.
    */
  var ImageName: WorkspaceImageName = js.native
  /**
    * The ingestion process to be used when importing the image.
    */
  var IngestionProcess: WorkspaceImageIngestionProcess = js.native
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
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
    val __obj = js.Dynamic.literal(Ec2ImageId = Ec2ImageId.asInstanceOf[js.Any], ImageDescription = ImageDescription.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], IngestionProcess = IngestionProcess.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportWorkspaceImageRequest]
  }
}

