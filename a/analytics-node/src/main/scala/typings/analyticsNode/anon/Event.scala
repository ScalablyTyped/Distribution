package typings.analyticsNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var context: js.UndefOr[Any] = js.undefined
  
  var event: String
  
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
  
  var properties: js.UndefOr[Any] = js.undefined
  
  var timestamp: js.UndefOr[js.Date] = js.undefined
}
object Event {
  
  inline def apply(event: String): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
