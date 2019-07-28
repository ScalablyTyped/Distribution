package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * 
    The key-value pair for the resource tag.
    
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: __mapOf__string = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

