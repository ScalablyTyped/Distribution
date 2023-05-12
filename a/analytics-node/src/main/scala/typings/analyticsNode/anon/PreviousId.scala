package typings.analyticsNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousId extends StObject {
  
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
  
  var previousId: String | Double
}
object PreviousId {
  
  inline def apply(previousId: String | Double): PreviousId = {
    val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviousId] (val x: Self) extends AnyVal {
    
    inline def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setPreviousId(value: String | Double): Self = StObject.set(x, "previousId", value.asInstanceOf[js.Any])
  }
}
