package typings.awsLambda.anon

import typings.awsLambda.triggerCodepipelineCloudwatchStageMod.CodePipelineStageState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stage extends StObject {
  
  var `execution-id`: String
  
  var pipeline: String
  
  var stage: String
  
  var state: CodePipelineStageState
  
  var version: Double
}
object Stage {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Stage] (val x: Self) extends AnyVal {
    
    inline def `setExecution-id`(value: String): Self = StObject.set(x, "execution-id", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setState(value: CodePipelineStageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
