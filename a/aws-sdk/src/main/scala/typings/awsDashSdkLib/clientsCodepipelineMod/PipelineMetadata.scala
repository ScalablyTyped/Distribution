package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineMetadata extends js.Object {
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.undefined
  /**
    * The date and time the pipeline was last updated, in timestamp format.
    */
  var updated: js.UndefOr[Timestamp] = js.undefined
}

object PipelineMetadata {
  @scala.inline
  def apply(created: Timestamp = null, pipelineArn: PipelineArn = null, updated: Timestamp = null): PipelineMetadata = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (pipelineArn != null) __obj.updateDynamic("pipelineArn")(pipelineArn)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[PipelineMetadata]
  }
}

