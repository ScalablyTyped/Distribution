package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clear extends StObject {
  
  var clear: String
}
object Clear {
  
  inline def apply(clear: String): Clear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clear]
  }
  
  extension [Self <: Clear](x: Self) {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
  }
}
