package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of resource tags.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.NextToken] = js.undefined
  /**
    * Array of resource tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: TagList = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

