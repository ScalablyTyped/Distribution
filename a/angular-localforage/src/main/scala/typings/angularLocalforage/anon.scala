package typings.angularLocalforage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultValue extends StObject {
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var key: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var scopeKey: js.UndefOr[String] = js.undefined
  }
  object DefaultValue {
    
    inline def apply(key: String): DefaultValue = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultValue]
    }
    
    extension [Self <: DefaultValue](x: Self) {
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScopeKey(value: String): Self = StObject.set(x, "scopeKey", value.asInstanceOf[js.Any])
      
      inline def setScopeKeyUndefined: Self = StObject.set(x, "scopeKey", js.undefined)
    }
  }
}
