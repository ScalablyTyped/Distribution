package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePipelineOutput extends js.Object {
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.native
  /**
    * Specifies the tags applied to the pipeline.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreatePipelineOutput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration = null, tags: TagList = null): CreatePipelineOutput = {
    val __obj = js.Dynamic.literal()
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineOutput]
  }
}

