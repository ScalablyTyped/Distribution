package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableStageTransitionInput extends StObject {
  
  /**
    * The name of the pipeline in which you want to enable the flow of artifacts from one stage to another.
    */
  var pipelineName: PipelineName
  
  /**
    * The name of the stage where you want to enable the transition of artifacts, either into the stage (inbound) or from that stage to the next stage (outbound).
    */
  var stageName: StageName
  
  /**
    * Specifies whether artifacts are allowed to enter the stage and be processed by the actions in that stage (inbound) or whether already processed artifacts are allowed to transition to the next stage (outbound).
    */
  var transitionType: StageTransitionType
}
object EnableStageTransitionInput {
  
  inline def apply(pipelineName: PipelineName, stageName: StageName, transitionType: StageTransitionType): EnableStageTransitionInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableStageTransitionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableStageTransitionInput] (val x: Self) extends AnyVal {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setTransitionType(value: StageTransitionType): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
  }
}
