package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkText extends StObject {
  
  var link: PressedPaintToken
  
  var text: Subtlest
}
object LinkText {
  
  inline def apply(link: PressedPaintToken, text: Subtlest): LinkText = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkText] (val x: Self) extends AnyVal {
    
    inline def setLink(value: PressedPaintToken): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: Subtlest): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
