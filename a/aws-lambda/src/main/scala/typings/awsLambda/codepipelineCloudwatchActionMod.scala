package typings.awsLambda

import typings.awsLambda.anon.Executionid
import typings.awsLambda.awsLambdaStrings.Build_
import typings.awsLambda.awsLambdaStrings.`CodePipeline Action Execution State Change`
import typings.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typings.awsLambda.codepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipelineCloudwatchActionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.Approval
    - typings.awsLambda.awsLambdaStrings.Build_
    - typings.awsLambda.awsLambdaStrings.Deploy
    - typings.awsLambda.awsLambdaStrings.Invoke
    - typings.awsLambda.awsLambdaStrings.Source
    - typings.awsLambda.awsLambdaStrings.Test
  */
  trait CodePipelineActionCategory extends StObject
  object CodePipelineActionCategory {
    
    inline def Approval: typings.awsLambda.awsLambdaStrings.Approval = "Approval".asInstanceOf[typings.awsLambda.awsLambdaStrings.Approval]
    
    inline def Build: Build_ = "Build".asInstanceOf[Build_]
    
    inline def Deploy: typings.awsLambda.awsLambdaStrings.Deploy = "Deploy".asInstanceOf[typings.awsLambda.awsLambdaStrings.Deploy]
    
    inline def Invoke: typings.awsLambda.awsLambdaStrings.Invoke = "Invoke".asInstanceOf[typings.awsLambda.awsLambdaStrings.Invoke]
    
    inline def Source: typings.awsLambda.awsLambdaStrings.Source = "Source".asInstanceOf[typings.awsLambda.awsLambdaStrings.Source]
    
    inline def Test: typings.awsLambda.awsLambdaStrings.Test = "Test".asInstanceOf[typings.awsLambda.awsLambdaStrings.Test]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.STARTED
    - typings.awsLambda.awsLambdaStrings.SUCCEEDED
    - typings.awsLambda.awsLambdaStrings.FAILED
    - typings.awsLambda.awsLambdaStrings.CANCELED
  */
  trait CodePipelineActionState extends StObject
  object CodePipelineActionState {
    
    inline def CANCELED: typings.awsLambda.awsLambdaStrings.CANCELED = "CANCELED".asInstanceOf[typings.awsLambda.awsLambdaStrings.CANCELED]
    
    inline def FAILED: typings.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typings.awsLambda.awsLambdaStrings.FAILED]
    
    inline def STARTED: typings.awsLambda.awsLambdaStrings.STARTED = "STARTED".asInstanceOf[typings.awsLambda.awsLambdaStrings.STARTED]
    
    inline def SUCCEEDED: typings.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typings.awsLambda.awsLambdaStrings.SUCCEEDED]
  }
  
  trait CodePipelineCloudWatchActionEvent
    extends StObject
       with CodePipelineCloudWatchEvent {
    
    var account: String
    
    var detail: Executionid
    
    var `detail-type`: `CodePipeline Action Execution State Change`
    
    var id: String
    
    var region: String
    
    var resources: js.Array[String]
    
    var source: awsDotcodepipeline
    
    var time: String
    
    var version: String
  }
  object CodePipelineCloudWatchActionEvent {
    
    inline def apply(
      account: String,
      detail: Executionid,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): CodePipelineCloudWatchActionEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codepipeline", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodePipeline Action Execution State Change")
      __obj.asInstanceOf[CodePipelineCloudWatchActionEvent]
    }
    
    extension [Self <: CodePipelineCloudWatchActionEvent](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: Executionid): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def `setDetail-type`(value: `CodePipeline Action Execution State Change`): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      inline def setSource(value: awsDotcodepipeline): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type CodePipelineCloudWatchActionHandler = Handler[CodePipelineCloudWatchActionEvent, Unit]
}
