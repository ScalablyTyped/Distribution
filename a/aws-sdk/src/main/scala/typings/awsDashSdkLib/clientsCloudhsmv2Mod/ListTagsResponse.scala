package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResponse extends js.Object {
  /**
    * An opaque string that indicates that the response contains only a subset of tags. Use this value in a subsequent ListTags request to get more tags.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of tags.
    */
  var TagList: awsDashSdkLib.clientsCloudhsmv2Mod.TagList
}

object ListTagsResponse {
  @scala.inline
  def apply(TagList: TagList, NextToken: NextToken = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsResponse]
  }
}

