package typings.analyticsNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integrations extends StObject {
  
  var context: js.UndefOr[Any] = js.undefined
  
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
  
  var timestamp: js.UndefOr[js.Date] = js.undefined
  
  var traits: js.UndefOr[Any] = js.undefined
}
object Integrations {
  
  inline def apply(): Integrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integrations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Integrations] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTraits(value: Any): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
  }
}
