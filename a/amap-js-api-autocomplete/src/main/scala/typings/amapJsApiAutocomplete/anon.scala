package typings.amapJsApiAutocomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Info extends StObject {
    
    var info: String
  }
  object Info {
    
    inline def apply(info: String): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tip extends StObject {
    
    var tip: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip
  }
  object Tip {
    
    inline def apply(tip: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip): Tip = {
      val __obj = js.Dynamic.literal(tip = tip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tip] (val x: Self) extends AnyVal {
      
      inline def setTip(value: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    }
  }
}
