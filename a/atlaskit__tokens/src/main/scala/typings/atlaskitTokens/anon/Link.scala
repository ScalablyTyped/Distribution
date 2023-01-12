package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var link: Pressed
  
  var text: Information
}
object Link {
  
  inline def apply(link: Pressed, text: Information): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    inline def setLink(value: Pressed): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: Information): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
