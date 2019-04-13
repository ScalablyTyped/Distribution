package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * A map of the key-value pairs for the resource tag.
    */
  var tags: js.UndefOr[__mapOf__string] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(tags: __mapOf__string = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

