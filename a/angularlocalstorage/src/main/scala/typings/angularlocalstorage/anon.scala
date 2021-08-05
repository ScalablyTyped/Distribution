package typings.angularlocalstorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultValue extends StObject {
    
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    var storeName: js.UndefOr[String] = js.undefined
  }
  object DefaultValue {
    
    inline def apply(): DefaultValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultValue]
    }
    
    extension [Self <: DefaultValue](x: Self) {
      
      inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
      
      inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    }
  }
}
