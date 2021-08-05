package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topojsonMod {
  
  trait Options extends StObject {
    
    var `object`: String
  }
  object Options {
    
    inline def apply(`object`: String): Options = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
