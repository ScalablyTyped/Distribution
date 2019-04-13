package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * A collection of key and value pairs.
    */
  var tags: TagList
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(tags: TagList): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(tags = tags)
  
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

