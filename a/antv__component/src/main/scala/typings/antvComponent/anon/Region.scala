package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var region: Style
  
  var text: ContentStyle
}
object Region {
  
  inline def apply(region: Style, text: ContentStyle): Region = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setRegion(value: Style): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setText(value: ContentStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
