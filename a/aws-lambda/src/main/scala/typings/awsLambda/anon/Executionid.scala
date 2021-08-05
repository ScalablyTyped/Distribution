package typings.awsLambda.anon

import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Executionid extends StObject {
  
  var action: String
  
  var `execution-id`: String
  
  var pipeline: String
  
  var stage: String
  
  var state: CodePipelineActionState
  
  var `type`: Category
  
  var version: Double
}
object Executionid {
  
  inline def apply(
    action: String,
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineActionState,
    `type`: Category,
    version: Double
  ): Executionid = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executionid]
  }
  
  extension [Self <: Executionid](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def `setExecution-id`(value: String): Self = StObject.set(x, "execution-id", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setState(value: CodePipelineActionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: Category): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
