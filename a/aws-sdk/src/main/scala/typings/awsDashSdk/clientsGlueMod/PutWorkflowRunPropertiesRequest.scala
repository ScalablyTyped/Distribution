package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutWorkflowRunPropertiesRequest extends js.Object {
  /**
    * Name of the workflow which was run.
    */
  var Name: NameString
  /**
    * The ID of the workflow run for which the run properties should be updated.
    */
  var RunId: IdString
  /**
    * The properties to put for the specified run.
    */
  var RunProperties: WorkflowRunProperties
}

object PutWorkflowRunPropertiesRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString, RunProperties: WorkflowRunProperties): PutWorkflowRunPropertiesRequest = {
    val __obj = js.Dynamic.literal(Name = Name, RunId = RunId, RunProperties = RunProperties)
  
    __obj.asInstanceOf[PutWorkflowRunPropertiesRequest]
  }
}

