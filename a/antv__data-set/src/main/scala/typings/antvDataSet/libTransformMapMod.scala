package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformMapMod {
  
  trait Options extends StObject {
    
    var callback: js.UndefOr[js.Function3[/* item */ Any, /* index */ Double, /* arr */ js.Array[Any], Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: (/* item */ Any, /* index */ Double, /* arr */ js.Array[Any]) => Any): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    }
  }
}
