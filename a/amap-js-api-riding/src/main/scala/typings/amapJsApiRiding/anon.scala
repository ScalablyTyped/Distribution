package typings.amapJsApiRiding

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
    
    extension [Self <: Info](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
}
