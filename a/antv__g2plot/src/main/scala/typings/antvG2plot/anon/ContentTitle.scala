package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTitle extends StObject {
  
  var content: StyleLineHeight
  
  var title: `false`
}
object ContentTitle {
  
  inline def apply(content: StyleLineHeight): ContentTitle = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = false)
    __obj.asInstanceOf[ContentTitle]
  }
  
  extension [Self <: ContentTitle](x: Self) {
    
    inline def setContent(value: StyleLineHeight): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
