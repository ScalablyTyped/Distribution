package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse extends js.Object {
  /**
    * If the result of the previous Search request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of SearchResult objects.
    */
  var Results: js.UndefOr[SearchResultsList] = js.undefined
}

object SearchResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Results: SearchResultsList = null): SearchResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Results != null) __obj.updateDynamic("Results")(Results)
    __obj.asInstanceOf[SearchResponse]
  }
}

