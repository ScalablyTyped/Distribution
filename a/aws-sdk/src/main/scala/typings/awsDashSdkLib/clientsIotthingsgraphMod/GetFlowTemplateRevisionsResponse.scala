package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFlowTemplateRevisionsResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of objects that provide summary data about each revision.
    */
  var summaries: js.UndefOr[FlowTemplateSummaries] = js.undefined
}

object GetFlowTemplateRevisionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, summaries: FlowTemplateSummaries = null): GetFlowTemplateRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (summaries != null) __obj.updateDynamic("summaries")(summaries)
    __obj.asInstanceOf[GetFlowTemplateRevisionsResponse]
  }
}

