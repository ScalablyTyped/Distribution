package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePipelineOutput extends js.Object {
  /**
    * The structure of the updated pipeline.
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
}

object UpdatePipelineOutput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration = null): UpdatePipelineOutput = {
    val __obj = js.Dynamic.literal()
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    __obj.asInstanceOf[UpdatePipelineOutput]
  }
}

