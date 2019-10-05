package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFlowTemplateRequest extends js.Object {
  /**
    * The ID of the workflow. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn
  /**
    * The number of the workflow revision to retrieve.
    */
  var revisionNumber: js.UndefOr[Version] = js.undefined
}

object GetFlowTemplateRequest {
  @scala.inline
  def apply(id: Urn, revisionNumber: Int | Double = null): GetFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id)
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlowTemplateRequest]
  }
}

