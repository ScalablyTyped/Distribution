package typings.amapJsApiAutocomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Info extends StObject {
    
    var info: String = js.native
  }
  object Info {
    
    @scala.inline
    def apply(info: String): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tip extends StObject {
    
    var tip: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip = js.native
  }
  object Tip {
    
    @scala.inline
    def apply(tip: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip): Tip = {
      val __obj = js.Dynamic.literal(tip = tip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tip]
    }
    
    @scala.inline
    implicit class TipMutableBuilder[Self <: Tip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTip(value: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    }
  }
}
