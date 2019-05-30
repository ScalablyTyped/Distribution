package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSystemInstancesResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of objects that contain summary data abour the system instances in the result set.
    */
  var summaries: js.UndefOr[SystemInstanceSummaries] = js.undefined
}

object SearchSystemInstancesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, summaries: SystemInstanceSummaries = null): SearchSystemInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (summaries != null) __obj.updateDynamic("summaries")(summaries)
    __obj.asInstanceOf[SearchSystemInstancesResponse]
  }
}

