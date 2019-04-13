package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The tags requested for the specified resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: TagList = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsResponse]
  }
}

