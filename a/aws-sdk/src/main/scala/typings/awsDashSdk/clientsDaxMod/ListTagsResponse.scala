package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResponse extends js.Object {
  /**
    * If this value is present, there are additional results to be displayed. To retrieve them, call ListTags again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of tags currently associated with the DAX cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsResponse {
  @scala.inline
  def apply(NextToken: String = null, Tags: TagList = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsResponse]
  }
}

