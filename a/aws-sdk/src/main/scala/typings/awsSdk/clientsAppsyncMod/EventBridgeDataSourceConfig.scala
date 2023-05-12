package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBridgeDataSourceConfig extends StObject {
  
  /**
    * The ARN of the event bus. For more information about event buses, see Amazon EventBridge event buses.
    */
  var eventBusArn: String
}
object EventBridgeDataSourceConfig {
  
  inline def apply(eventBusArn: String): EventBridgeDataSourceConfig = {
    val __obj = js.Dynamic.literal(eventBusArn = eventBusArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridgeDataSourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBridgeDataSourceConfig] (val x: Self) extends AnyVal {
    
    inline def setEventBusArn(value: String): Self = StObject.set(x, "eventBusArn", value.asInstanceOf[js.Any])
  }
}
