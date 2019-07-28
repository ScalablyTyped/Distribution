package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStatusInput extends js.Object {
  /**
    * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both types.
    */
  var objectIds: idList
  /**
    * The ID of the pipeline that contains the objects.
    */
  var pipelineId: id
  /**
    * The status to be set on all the objects specified in objectIds. For components, use PAUSE or RESUME. For instances, use TRY_CANCEL, RERUN, or MARK_FINISHED.
    */
  var status: String
}

object SetStatusInput {
  @scala.inline
  def apply(objectIds: idList, pipelineId: id, status: String): SetStatusInput = {
    val __obj = js.Dynamic.literal(objectIds = objectIds, pipelineId = pipelineId, status = status)
  
    __obj.asInstanceOf[SetStatusInput]
  }
}

