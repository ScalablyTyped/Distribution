package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineEvent extends js.Object {
  var `CodePipeline.job`: awsDashLambdaLib.Anon_AccountId
}

object CodePipelineEvent {
  @scala.inline
  def apply(`CodePipeline.job`: awsDashLambdaLib.Anon_AccountId): CodePipelineEvent = {
    val __obj = js.Dynamic.literal(`CodePipeline.job` = `CodePipeline.job`)
  
    __obj.asInstanceOf[CodePipelineEvent]
  }
}

