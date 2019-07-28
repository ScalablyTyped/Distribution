package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsLogGroupResponse extends js.Object {
  /**
    * The tags for the log group.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object ListTagsLogGroupResponse {
  @scala.inline
  def apply(tags: Tags = null): ListTagsLogGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsLogGroupResponse]
  }
}

