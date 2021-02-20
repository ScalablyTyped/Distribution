package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiStage extends StObject {
  
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: js.UndefOr[String] = js.native
  
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: js.UndefOr[String] = js.native
  
  /**
    * Map containing method level throttling information for API stage in a usage plan.
    */
  var throttle: js.UndefOr[MapOfApiStageThrottleSettings] = js.native
}
object ApiStage {
  
  @scala.inline
  def apply(): ApiStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiStage]
  }
  
  @scala.inline
  implicit class ApiStageMutableBuilder[Self <: ApiStage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    @scala.inline
    def setThrottle(value: MapOfApiStageThrottleSettings): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
