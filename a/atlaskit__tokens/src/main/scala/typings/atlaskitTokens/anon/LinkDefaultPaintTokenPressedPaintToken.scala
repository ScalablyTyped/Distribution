package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkDefaultPaintTokenPressedPaintToken[BaseToken] extends StObject {
  
  var link: DefaultPaintTokenPressedPaintToken[BaseToken]
  
  var text: DiscoveryInformation[BaseToken]
}
object LinkDefaultPaintTokenPressedPaintToken {
  
  inline def apply[BaseToken](link: DefaultPaintTokenPressedPaintToken[BaseToken], text: DiscoveryInformation[BaseToken]): LinkDefaultPaintTokenPressedPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDefaultPaintTokenPressedPaintToken[BaseToken]]
  }
  
  extension [Self <: LinkDefaultPaintTokenPressedPaintToken[?], BaseToken](x: Self & LinkDefaultPaintTokenPressedPaintToken[BaseToken]) {
    
    inline def setLink(value: DefaultPaintTokenPressedPaintToken[BaseToken]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: DiscoveryInformation[BaseToken]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
