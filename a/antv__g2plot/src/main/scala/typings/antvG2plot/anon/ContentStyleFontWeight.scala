package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStyleFontWeight extends StObject {
  
  var content: StyleFontWeight
  
  var title: `false`
}
object ContentStyleFontWeight {
  
  inline def apply(content: StyleFontWeight): ContentStyleFontWeight = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = false)
    __obj.asInstanceOf[ContentStyleFontWeight]
  }
  
  extension [Self <: ContentStyleFontWeight](x: Self) {
    
    inline def setContent(value: StyleFontWeight): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
