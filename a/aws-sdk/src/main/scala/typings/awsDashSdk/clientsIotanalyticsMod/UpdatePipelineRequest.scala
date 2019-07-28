package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePipelineRequest extends js.Object {
  /**
    * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing, renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda functions on messages for advanced processing; or performing mathematical transformations to normalize device data. The list can be 2-25 PipelineActivity objects and must contain both a channel and a datastore activity. Each entry in the list must contain only one activity, for example:  pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ] 
    */
  var pipelineActivities: PipelineActivities
  /**
    * The name of the pipeline to update.
    */
  var pipelineName: PipelineName
}

object UpdatePipelineRequest {
  @scala.inline
  def apply(pipelineActivities: PipelineActivities, pipelineName: PipelineName): UpdatePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineActivities = pipelineActivities, pipelineName = pipelineName)
  
    __obj.asInstanceOf[UpdatePipelineRequest]
  }
}

