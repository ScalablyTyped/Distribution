package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineEvent extends js.Object {
  var `CodePipeline.job`: Anon_AccountId
}

object CodePipelineEvent {
  @scala.inline
  def apply(`CodePipeline.job`: Anon_AccountId): CodePipelineEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CodePipeline.job")(`CodePipeline.job`)
    __obj.asInstanceOf[CodePipelineEvent]
  }
}

