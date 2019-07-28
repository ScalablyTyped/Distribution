package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueueTagsResult extends js.Object {
  /**
    * The list of all tags added to the specified queue.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}

object ListQueueTagsResult {
  @scala.inline
  def apply(Tags: TagMap = null): ListQueueTagsResult = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListQueueTagsResult]
  }
}

