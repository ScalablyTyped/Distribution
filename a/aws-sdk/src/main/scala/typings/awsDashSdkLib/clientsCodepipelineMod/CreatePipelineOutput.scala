package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePipelineOutput extends js.Object {
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
}

object CreatePipelineOutput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration = null): CreatePipelineOutput = {
    val __obj = js.Dynamic.literal()
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    __obj.asInstanceOf[CreatePipelineOutput]
  }
}

