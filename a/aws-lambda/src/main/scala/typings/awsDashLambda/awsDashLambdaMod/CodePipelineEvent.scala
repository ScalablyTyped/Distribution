package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineEvent extends js.Object {
  @JSName("CodePipeline.job")
  var CodePipelineDotjob: Anon_AccountId
}

object CodePipelineEvent {
  @scala.inline
  def apply(CodePipelineDotjob: Anon_AccountId): CodePipelineEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CodePipeline.job")(CodePipelineDotjob.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineEvent]
  }
}

