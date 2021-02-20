package typings.awsLambda

import typings.awsLambda.anon.Executionid
import typings.awsLambda.anon.Pipeline
import typings.awsLambda.anon.Stage
import typings.awsLambda.awsLambdaStrings.`CodePipeline Action Execution State Change`
import typings.awsLambda.awsLambdaStrings.`CodePipeline Pipeline Execution State Change`
import typings.awsLambda.awsLambdaStrings.`CodePipeline Stage Execution State Change`
import typings.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipelineCloudwatchMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent
    - typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent
    - typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent
  */
  trait CodePipelineCloudWatchEvent extends StObject
  object CodePipelineCloudWatchEvent {
    
    @scala.inline
    def CodePipelineCloudWatchActionEvent(
      account: String,
      detail: Executionid,
      `detail-type`: `CodePipeline Action Execution State Change`,
      id: String,
      region: String,
      resources: js.Array[String],
      source: awsDotcodepipeline,
      time: String,
      version: String
    ): typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent]
    }
    
    @scala.inline
    def CodePipelineCloudWatchPipelineEvent(
      account: String,
      detail: Pipeline,
      `detail-type`: `CodePipeline Pipeline Execution State Change`,
      id: String,
      region: String,
      resources: js.Array[String],
      source: awsDotcodepipeline,
      time: String,
      version: String
    ): typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent]
    }
    
    @scala.inline
    def CodePipelineCloudWatchStageEvent(
      account: String,
      detail: Stage,
      `detail-type`: `CodePipeline Stage Execution State Change`,
      id: String,
      region: String,
      resources: js.Array[String],
      source: awsDotcodepipeline,
      time: String,
      version: String
    ): typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent]
    }
  }
  
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, Unit]
}
