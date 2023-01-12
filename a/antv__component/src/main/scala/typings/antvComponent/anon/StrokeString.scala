package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeString extends StObject {
  
  var stroke: String
}
object StrokeString {
  
  inline def apply(stroke: String): StrokeString = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrokeString] (val x: Self) extends AnyVal {
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
