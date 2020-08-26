package typings.awsLambda.anon

import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executionid extends js.Object {
  var action: String = js.native
  var `execution-id`: String = js.native
  var pipeline: String = js.native
  var stage: String = js.native
  var state: CodePipelineActionState = js.native
  var `type`: Category = js.native
  var version: Double = js.native
}

object Executionid {
  @scala.inline
  def apply(
    action: String,
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineActionState,
    `type`: Category,
    version: Double
  ): Executionid = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executionid]
  }
  @scala.inline
  implicit class ExecutionidOps[Self <: Executionid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def `setExecution-id`(value: String): Self = this.set("execution-id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipeline(value: String): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: CodePipelineActionState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Category): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

