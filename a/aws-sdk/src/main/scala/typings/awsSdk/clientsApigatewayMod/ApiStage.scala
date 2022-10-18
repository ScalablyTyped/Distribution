package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiStage extends StObject {
  
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: js.UndefOr[String] = js.undefined
  
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: js.UndefOr[String] = js.undefined
  
  /**
    * Map containing method level throttling information for API stage in a usage plan.
    */
  var throttle: js.UndefOr[MapOfApiStageThrottleSettings] = js.undefined
}
object ApiStage {
  
  inline def apply(): ApiStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiStage]
  }
  
  extension [Self <: ApiStage](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setThrottle(value: MapOfApiStageThrottleSettings): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
