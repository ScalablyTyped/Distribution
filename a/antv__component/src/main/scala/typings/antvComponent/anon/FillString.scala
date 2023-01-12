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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillString] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
  }
}
