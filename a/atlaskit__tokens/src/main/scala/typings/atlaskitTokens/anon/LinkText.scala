package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkText extends StObject {
  
  var link: DefaultPressed
  
  var text: Subtlest
}
object LinkText {
  
  inline def apply(link: DefaultPressed, text: Subtlest): LinkText = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkText]
  }
  
  extension [Self <: LinkText](x: Self) {
    
    inline def setLink(value: DefaultPressed): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: Subtlest): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
