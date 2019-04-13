package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatastoresResponse extends js.Object {
  /**
    * A list of "DatastoreSummary" objects.
    */
  var datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.undefined
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDatastoresResponse {
  @scala.inline
  def apply(datastoreSummaries: DatastoreSummaries = null, nextToken: NextToken = null): ListDatastoresResponse = {
    val __obj = js.Dynamic.literal()
    if (datastoreSummaries != null) __obj.updateDynamic("datastoreSummaries")(datastoreSummaries)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDatastoresResponse]
  }
}

