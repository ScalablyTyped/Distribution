package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentWidth extends StObject {
  
  var contentWidth: Double
}
object ContentWidth {
  
  inline def apply(contentWidth: Double): ContentWidth = {
    val __obj = js.Dynamic.literal(contentWidth = contentWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentWidth]
  }
  
  extension [Self <: ContentWidth](x: Self) {
    
    inline def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
  }
}
