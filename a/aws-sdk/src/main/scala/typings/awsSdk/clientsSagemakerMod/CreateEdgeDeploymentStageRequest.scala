package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEdgeDeploymentStageRequest extends StObject {
  
  /**
    * The name of the edge deployment plan.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * List of stages to be added to the edge deployment plan.
    */
  var Stages: DeploymentStages
}
object CreateEdgeDeploymentStageRequest {
  
  inline def apply(EdgeDeploymentPlanName: EntityName, Stages: DeploymentStages): CreateEdgeDeploymentStageRequest = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], Stages = Stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEdgeDeploymentStageRequest]
  }
  
  extension [Self <: CreateEdgeDeploymentStageRequest](x: Self) {
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setStages(value: DeploymentStages): Self = StObject.set(x, "Stages", value.asInstanceOf[js.Any])
    
    inline def setStagesVarargs(value: DeploymentStage*): Self = StObject.set(x, "Stages", js.Array(value*))
  }
}
