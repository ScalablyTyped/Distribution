package typings.awsLambda.anon

import typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineStageState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stage extends StObject {
  
  var `execution-id`: String = js.native
  
  var pipeline: String = js.native
  
  var stage: String = js.native
  
  var state: CodePipelineStageState = js.native
  
  var version: Double = js.native
}
object Stage {
  
  @scala.inline
  def apply(
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineStageState,
    version: Double
  ): Stage = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  
  @scala.inline
  implicit class StageMutableBuilder[Self <: Stage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setExecution-id`(value: String): Self = StObject.set(x, "execution-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CodePipelineStageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
