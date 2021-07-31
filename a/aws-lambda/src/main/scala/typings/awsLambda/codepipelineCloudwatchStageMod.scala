package typings.awsLambda

import typings.awsLambda.anon.Stage
import typings.awsLambda.awsLambdaStrings.`CodePipeline Stage Execution State Change`
import typings.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typings.awsLambda.codepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipelineCloudwatchStageMod {
  
  trait CodePipelineCloudWatchStageEvent
    extends StObject
       with CodePipelineCloudWatchEvent {
    
    var account: String
    
    var detail: Stage
    
    var `detail-type`: `CodePipeline Stage Execution State Change`
    
    var id: String
    
    var region: String
    
    var resources: js.Array[String]
    
    var source: awsDotcodepipeline
    
    var time: String
    
    var version: String
  }
  object CodePipelineCloudWatchStageEvent {
    
    @scala.inline
    def apply(
      account: String,
      detail: Stage,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): CodePipelineCloudWatchStageEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codepipeline", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodePipeline Stage Execution State Change")
      __obj.asInstanceOf[CodePipelineCloudWatchStageEvent]
    }
    
    @scala.inline
    implicit class CodePipelineCloudWatchStageEventMutableBuilder[Self <: CodePipelineCloudWatchStageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: Stage): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDetail-type`(value: `CodePipeline Stage Execution State Change`): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: awsDotcodepipeline): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type CodePipelineCloudWatchStageHandler = Handler[CodePipelineCloudWatchStageEvent, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.STARTED
    - typings.awsLambda.awsLambdaStrings.SUCCEEDED
    - typings.awsLambda.awsLambdaStrings.RESUMED
    - typings.awsLambda.awsLambdaStrings.FAILED
    - typings.awsLambda.awsLambdaStrings.CANCELED
  */
  trait CodePipelineStageState extends StObject
  object CodePipelineStageState {
    
    @scala.inline
    def CANCELED: typings.awsLambda.awsLambdaStrings.CANCELED = "CANCELED".asInstanceOf[typings.awsLambda.awsLambdaStrings.CANCELED]
    
    @scala.inline
    def FAILED: typings.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typings.awsLambda.awsLambdaStrings.FAILED]
    
    @scala.inline
    def RESUMED: typings.awsLambda.awsLambdaStrings.RESUMED = "RESUMED".asInstanceOf[typings.awsLambda.awsLambdaStrings.RESUMED]
    
    @scala.inline
    def STARTED: typings.awsLambda.awsLambdaStrings.STARTED = "STARTED".asInstanceOf[typings.awsLambda.awsLambdaStrings.STARTED]
    
    @scala.inline
    def SUCCEEDED: typings.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typings.awsLambda.awsLambdaStrings.SUCCEEDED]
  }
}
