package typings.angularCompiler.anon

import typings.angularCompiler.mod.JSDocTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with JSDocTag {
  
  var tagName: Unit
  
  var text: String
}
object Text {
  
  inline def apply(tagName: Unit, text: String): Text = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setTagName(value: Unit): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
