package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPipelineExecutionInput extends js.Object {
  /**
    * The ID of the pipeline execution about which you want to get execution details.
    */
  var pipelineExecutionId: PipelineExecutionId
  /**
    * The name of the pipeline about which you want to get execution details.
    */
  var pipelineName: PipelineName
}

object GetPipelineExecutionInput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, pipelineName: PipelineName): GetPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId, pipelineName = pipelineName)
  
    __obj.asInstanceOf[GetPipelineExecutionInput]
  }
}

