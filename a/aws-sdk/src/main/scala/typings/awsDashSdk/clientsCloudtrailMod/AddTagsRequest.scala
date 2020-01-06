package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsRequest extends js.Object {
  /**
    * Specifies the ARN of the trail to which one or more tags will be added. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String = js.native
  /**
    * Contains a list of CloudTrail tags, up to a limit of 50
    */
  var TagsList: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.TagsList] = js.native
}

object AddTagsRequest {
  @scala.inline
  def apply(ResourceId: String, TagsList: TagsList = null): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (TagsList != null) __obj.updateDynamic("TagsList")(TagsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
}

