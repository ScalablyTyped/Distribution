package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsRequest extends js.Object {
  /**
    * Specifies the ARN of the trail from which tags should be removed. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String
  /**
    * Specifies a list of tags to be removed.
    */
  var TagsList: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.TagsList] = js.undefined
}

object RemoveTagsRequest {
  @scala.inline
  def apply(ResourceId: String, TagsList: TagsList = null): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (TagsList != null) __obj.updateDynamic("TagsList")(TagsList)
    __obj.asInstanceOf[RemoveTagsRequest]
  }
}

