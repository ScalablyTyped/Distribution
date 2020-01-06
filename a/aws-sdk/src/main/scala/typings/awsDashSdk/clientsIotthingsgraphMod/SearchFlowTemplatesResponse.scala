package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFlowTemplatesResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of objects that contain summary information about each workflow in the result set.
    */
  var summaries: js.UndefOr[FlowTemplateSummaries] = js.native
}

object SearchFlowTemplatesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, summaries: FlowTemplateSummaries = null): SearchFlowTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (summaries != null) __obj.updateDynamic("summaries")(summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFlowTemplatesResponse]
  }
}

