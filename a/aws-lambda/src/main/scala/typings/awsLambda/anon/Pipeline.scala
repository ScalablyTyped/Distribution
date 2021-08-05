package typings.awsLambda.anon

import typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipeline extends StObject {
  
  var `execution-id`: String
  
  var pipeline: String
  
  var state: CodePipelineState
  
  var version: Double
}
object Pipeline {
  
  inline def apply(`execution-id`: String, pipeline: String, state: CodePipelineState, version: Double): Pipeline = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pipeline]
  }
  
  extension [Self <: Pipeline](x: Self) {
    
    inline def `setExecution-id`(value: String): Self = StObject.set(x, "execution-id", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setState(value: CodePipelineState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
