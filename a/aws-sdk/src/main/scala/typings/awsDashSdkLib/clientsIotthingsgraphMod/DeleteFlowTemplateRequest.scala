package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFlowTemplateRequest extends js.Object {
  /**
    * The ID of the workflow to be deleted. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn
}

object DeleteFlowTemplateRequest {
  @scala.inline
  def apply(id: Urn): DeleteFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[DeleteFlowTemplateRequest]
  }
}

