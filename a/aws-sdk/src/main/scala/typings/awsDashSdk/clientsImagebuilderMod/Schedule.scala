package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  /**
    *  The condition configures when the pipeline should trigger a new image build. 
    */
  var pipelineExecutionStartCondition: js.UndefOr[PipelineExecutionStartCondition] = js.native
  /**
    *  The expression determines how often a pipeline starts the creation of new images. 
    */
  var scheduleExpression: js.UndefOr[NonEmptyString] = js.native
}

object Schedule {
  @scala.inline
  def apply(
    pipelineExecutionStartCondition: PipelineExecutionStartCondition = null,
    scheduleExpression: NonEmptyString = null
  ): Schedule = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionStartCondition != null) __obj.updateDynamic("pipelineExecutionStartCondition")(pipelineExecutionStartCondition.asInstanceOf[js.Any])
    if (scheduleExpression != null) __obj.updateDynamic("scheduleExpression")(scheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

