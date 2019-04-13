package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePipelineStatusRequest extends js.Object {
  /**
    * The identifier of the pipeline to update.
    */
  var Id: awsDashSdkLib.clientsElastictranscoderMod.Id
  /**
    * The desired status of the pipeline:    Active: The pipeline is processing jobs.    Paused: The pipeline is not currently processing jobs.  
    */
  var Status: PipelineStatus
}

object UpdatePipelineStatusRequest {
  @scala.inline
  def apply(Id: Id, Status: PipelineStatus): UpdatePipelineStatusRequest = {
    val __obj = js.Dynamic.literal(Id = Id, Status = Status)
  
    __obj.asInstanceOf[UpdatePipelineStatusRequest]
  }
}

