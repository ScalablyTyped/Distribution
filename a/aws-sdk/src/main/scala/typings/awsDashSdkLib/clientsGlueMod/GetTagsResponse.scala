package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagsResponse extends js.Object {
  /**
    * The requested tags.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}

object GetTagsResponse {
  @scala.inline
  def apply(Tags: TagsMap = null): GetTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[GetTagsResponse]
  }
}

