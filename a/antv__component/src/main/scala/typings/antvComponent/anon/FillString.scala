package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillString extends StObject {
  
  var fill: String
}
object FillString {
  
  inline def apply(fill: String): FillString = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillString]
  }
  
  extension [Self <: FillString](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
  }
}
