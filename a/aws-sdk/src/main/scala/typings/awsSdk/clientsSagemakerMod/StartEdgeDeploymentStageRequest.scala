package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEdgeDeploymentStageRequest extends StObject {
  
  /**
    * The name of the edge deployment plan to start.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * The name of the stage to start.
    */
  var StageName: EntityName
}
object StartEdgeDeploymentStageRequest {
  
  inline def apply(EdgeDeploymentPlanName: EntityName, StageName: EntityName): StartEdgeDeploymentStageRequest = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEdgeDeploymentStageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartEdgeDeploymentStageRequest] (val x: Self) extends AnyVal {
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: EntityName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
