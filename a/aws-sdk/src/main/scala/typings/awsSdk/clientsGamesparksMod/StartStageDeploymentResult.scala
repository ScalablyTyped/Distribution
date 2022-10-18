package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStageDeploymentResult extends StObject {
  
  /**
    * Properties that describe the stage deployment.
    */
  var StageDeployment: js.UndefOr[StageDeploymentDetails] = js.undefined
}
object StartStageDeploymentResult {
  
  inline def apply(): StartStageDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartStageDeploymentResult]
  }
  
  extension [Self <: StartStageDeploymentResult](x: Self) {
    
    inline def setStageDeployment(value: StageDeploymentDetails): Self = StObject.set(x, "StageDeployment", value.asInstanceOf[js.Any])
    
    inline def setStageDeploymentUndefined: Self = StObject.set(x, "StageDeployment", js.undefined)
  }
}
