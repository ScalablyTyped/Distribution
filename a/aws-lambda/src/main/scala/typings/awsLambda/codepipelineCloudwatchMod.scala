package typings.awsLambda

import typings.awsLambda.anon.Executionid
import typings.awsLambda.anon.Pipeline
import typings.awsLambda.anon.Stage
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipelineCloudwatchMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent
    - typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent
    - typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent
  */
  trait CodePipelineCloudWatchEvent extends StObject
  object CodePipelineCloudWatchEvent {
    
    inline def CodePipelineCloudWatchActionEvent(
      account: String,
      detail: Executionid,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codepipeline", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodePipeline Action Execution State Change")
      __obj.asInstanceOf[typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent]
    }
    
    inline def CodePipelineCloudWatchPipelineEvent(
      account: String,
      detail: Pipeline,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codepipeline", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodePipeline Pipeline Execution State Change")
      __obj.asInstanceOf[typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent]
    }
    
    inline def CodePipelineCloudWatchStageEvent(
      account: String,
      detail: Stage,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codepipeline", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodePipeline Stage Execution State Change")
      __obj.asInstanceOf[typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent]
    }
  }
  
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, Unit]
}
