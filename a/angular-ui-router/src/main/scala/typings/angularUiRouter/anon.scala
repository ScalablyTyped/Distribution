package typings.angularUiRouter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Globals extends StObject {
    
    /**
      * Currently resolved "resolve" values from the current state
      */
    var globals: StringDictionary[js.Any]
  }
  object Globals {
    
    inline def apply(globals: StringDictionary[js.Any]): Globals = {
      val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Globals]
    }
    
    extension [Self <: Globals](x: Self) {
      
      inline def setGlobals(value: StringDictionary[js.Any]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    }
  }
}
