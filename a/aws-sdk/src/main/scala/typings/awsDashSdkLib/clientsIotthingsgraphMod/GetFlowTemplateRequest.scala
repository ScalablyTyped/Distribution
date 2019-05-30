package typings
package awsDashSdkLib.clientsIotthingsgraphMod

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
  def apply(id: Urn, revisionNumber: js.UndefOr[Version] = js.undefined): GetFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(revisionNumber)) __obj.updateDynamic("revisionNumber")(revisionNumber)
    __obj.asInstanceOf[GetFlowTemplateRequest]
  }
}

