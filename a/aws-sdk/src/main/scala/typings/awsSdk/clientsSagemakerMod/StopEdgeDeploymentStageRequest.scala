package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEdgeDeploymentStageRequest extends StObject {
  
  /**
    * The name of the edge deployment plan to stop.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * The name of the stage to stop.
    */
  var StageName: EntityName
}
object StopEdgeDeploymentStageRequest {
  
  inline def apply(EdgeDeploymentPlanName: EntityName, StageName: EntityName): StopEdgeDeploymentStageRequest = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEdgeDeploymentStageRequest]
  }
  
  extension [Self <: StopEdgeDeploymentStageRequest](x: Self) {
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: EntityName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
