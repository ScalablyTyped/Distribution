package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foldMod {
  
  trait Options extends StObject {
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var retains: js.UndefOr[js.Array[String]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRetains(value: js.Array[String]): Self = StObject.set(x, "retains", value.asInstanceOf[js.Any])
      
      inline def setRetainsUndefined: Self = StObject.set(x, "retains", js.undefined)
      
      inline def setRetainsVarargs(value: String*): Self = StObject.set(x, "retains", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
