package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutWorkflowRunPropertiesRequest extends js.Object {
  /**
    * Name of the workflow which was run.
    */
  var Name: NameString = js.native
  /**
    * The ID of the workflow run for which the run properties should be updated.
    */
  var RunId: IdString = js.native
  /**
    * The properties to put for the specified run.
    */
  var RunProperties: WorkflowRunProperties = js.native
}

object PutWorkflowRunPropertiesRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString, RunProperties: WorkflowRunProperties): PutWorkflowRunPropertiesRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any], RunProperties = RunProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutWorkflowRunPropertiesRequest]
  }
}

