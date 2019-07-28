package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * An array that lists all the tags that are associated with the resource. Each tag consists of a required tag key (Key) and an associated tag value (Value)
    */
  var Tags: TagList
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: TagList): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags)
  
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

