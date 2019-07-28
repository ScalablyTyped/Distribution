package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowRunPropertiesRequest extends js.Object {
  /**
    * Name of the workflow which was run.
    */
  var Name: NameString
  /**
    * The ID of the workflow run whose run properties should be returned.
    */
  var RunId: IdString
}

object GetWorkflowRunPropertiesRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString): GetWorkflowRunPropertiesRequest = {
    val __obj = js.Dynamic.literal(Name = Name, RunId = RunId)
  
    __obj.asInstanceOf[GetWorkflowRunPropertiesRequest]
  }
}

