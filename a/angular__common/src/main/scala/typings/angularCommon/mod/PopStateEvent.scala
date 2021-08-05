package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopStateEvent extends StObject {
  
  var pop: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[js.Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PopStateEvent {
  
  inline def apply(): PopStateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopStateEvent]
  }
  
  extension [Self <: PopStateEvent](x: Self) {
    
    inline def setPop(value: Boolean): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
    
    inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    inline def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
