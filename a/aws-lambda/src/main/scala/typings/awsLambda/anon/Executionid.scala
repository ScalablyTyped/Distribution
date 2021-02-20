package typings.awsLambda.anon

import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executionid extends StObject {
  
  var action: String = js.native
  
  var `execution-id`: String = js.native
  
  var pipeline: String = js.native
  
  var stage: String = js.native
  
  var state: CodePipelineActionState = js.native
  
  var `type`: Category = js.native
  
  var version: Double = js.native
}
object Executionid {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ExecutionidMutableBuilder[Self <: Executionid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExecution-id`(value: String): Self = StObject.set(x, "execution-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CodePipelineActionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Category): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
