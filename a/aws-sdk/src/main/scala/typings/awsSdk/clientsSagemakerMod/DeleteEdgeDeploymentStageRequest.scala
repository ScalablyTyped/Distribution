package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEdgeDeploymentStageRequest extends StObject {
  
  /**
    * The name of the edge deployment plan from which the stage will be deleted.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * The name of the stage.
    */
  var StageName: EntityName
}
object DeleteEdgeDeploymentStageRequest {
  
  inline def apply(EdgeDeploymentPlanName: EntityName, StageName: EntityName): DeleteEdgeDeploymentStageRequest = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEdgeDeploymentStageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEdgeDeploymentStageRequest] (val x: Self) extends AnyVal {
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: EntityName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
