package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Follow extends StObject {
  
  var follow: Boolean
  
  def text(`type`: Any, defaultContent: Any, items: Any): Position
  
  var textBackground: Padding
  
  var `type`: String
}
object Follow {
  
  inline def apply(follow: Boolean, text: (Any, Any, Any) => Position, textBackground: Padding, `type`: String): Follow = {
    val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], text = js.Any.fromFunction3(text), textBackground = textBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Follow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Follow] (val x: Self) extends AnyVal {
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setText(value: (Any, Any, Any) => Position): Self = StObject.set(x, "text", js.Any.fromFunction3(value))
    
    inline def setTextBackground(value: Padding): Self = StObject.set(x, "textBackground", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
