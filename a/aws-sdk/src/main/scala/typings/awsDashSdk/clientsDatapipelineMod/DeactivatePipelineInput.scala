package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeactivatePipelineInput extends js.Object {
  /**
    * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects to CANCELED. If this value is false, the pipeline is deactivated after all running objects finish.
    */
  var cancelActive: js.UndefOr[typings.awsDashSdk.clientsDatapipelineMod.cancelActive] = js.undefined
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
}

object DeactivatePipelineInput {
  @scala.inline
  def apply(pipelineId: id, cancelActive: js.UndefOr[cancelActive] = js.undefined): DeactivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId)
    if (!js.isUndefined(cancelActive)) __obj.updateDynamic("cancelActive")(cancelActive)
    __obj.asInstanceOf[DeactivatePipelineInput]
  }
}

