package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUpdatesRequest extends js.Object {
  /**
    * The maximum number of update results returned by ListUpdates in paginated output. When this parameter is used, ListUpdates only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListUpdates request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListUpdates returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.undefined
  /**
    * The name of the Amazon EKS cluster for which to list updates.
    */
  var name: String
  /**
    * The nextToken value returned from a previous paginated ListUpdates request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListUpdatesRequest {
  @scala.inline
  def apply(
    name: String,
    maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.undefined,
    nextToken: String = null
  ): ListUpdatesRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListUpdatesRequest]
  }
}

