package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemTemplateRevisionsResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of objects that contain summary data about the system template revisions.
    */
  var summaries: js.UndefOr[SystemTemplateSummaries] = js.undefined
}

object GetSystemTemplateRevisionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, summaries: SystemTemplateSummaries = null): GetSystemTemplateRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (summaries != null) __obj.updateDynamic("summaries")(summaries)
    __obj.asInstanceOf[GetSystemTemplateRevisionsResponse]
  }
}

