package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeString extends StObject {
  
  var stroke: String = js.native
}
object StrokeString {
  
  @scala.inline
  def apply(stroke: String): StrokeString = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeString]
  }
  
  @scala.inline
  implicit class StrokeStringMutableBuilder[Self <: StrokeString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
