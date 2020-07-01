package typings.awsLambda.codepipelineMod

import typings.awsLambda.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineEvent extends js.Object {
  @JSName("CodePipeline.job")
  var CodePipelineDotjob: Data
}

object CodePipelineEvent {
  @scala.inline
  def apply(CodePipelineDotjob: Data): CodePipelineEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CodePipeline.job")(CodePipelineDotjob.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineEvent]
  }
}

