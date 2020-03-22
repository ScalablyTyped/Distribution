package typings.awsLambda

import typings.awsLambda.handlerMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-lambda/trigger/codepipeline-cloudwatch", JSImport.Namespace)
@js.native
object codepipelineCloudwatchMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent
    - typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent
    - typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent
  */
  trait CodePipelineCloudWatchEvent extends js.Object
  
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, Unit]
}

