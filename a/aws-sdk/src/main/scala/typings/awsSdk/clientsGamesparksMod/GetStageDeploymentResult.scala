package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStageDeploymentResult extends StObject {
  
  /**
    * Properties that provide details of the stage deployment.
    */
  var StageDeployment: js.UndefOr[StageDeploymentDetails] = js.undefined
}
object GetStageDeploymentResult {
  
  inline def apply(): GetStageDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStageDeploymentResult]
  }
  
  extension [Self <: GetStageDeploymentResult](x: Self) {
    
    inline def setStageDeployment(value: StageDeploymentDetails): Self = StObject.set(x, "StageDeployment", value.asInstanceOf[js.Any])
    
    inline def setStageDeploymentUndefined: Self = StObject.set(x, "StageDeployment", js.undefined)
  }
}
