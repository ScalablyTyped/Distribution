package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var link: DefaultPressed
  
  var text: Discovery
}
object Link {
  
  inline def apply(link: DefaultPressed, text: Discovery): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    inline def setLink(value: DefaultPressed): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: Discovery): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
