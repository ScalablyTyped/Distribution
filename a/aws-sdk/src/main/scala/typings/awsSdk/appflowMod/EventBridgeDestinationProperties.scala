package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBridgeDestinationProperties extends StObject {
  
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.native
  
  /**
    *  The object specified in the Amazon EventBridge flow destination. 
    */
  var `object`: Object = js.native
}
object EventBridgeDestinationProperties {
  
  @scala.inline
  def apply(`object`: Object): EventBridgeDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridgeDestinationProperties]
  }
  
  @scala.inline
  implicit class EventBridgeDestinationPropertiesMutableBuilder[Self <: EventBridgeDestinationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
