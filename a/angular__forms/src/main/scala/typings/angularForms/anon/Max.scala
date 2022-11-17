package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: "max"
}
object Max {
  
  inline def apply(): Max = {
    val __obj = js.Dynamic.literal(max = "max")
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(value: "max"): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
