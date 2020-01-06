package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * A collection of key and value pairs.
    */
  var tags: TagList = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(tags: TagList): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

