package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentStyle extends StObject {
  
  var content: String = js.native
  
  var style: FontSize = js.native
}
object ContentStyle {
  
  @scala.inline
  def apply(content: String, style: FontSize): ContentStyle = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentStyle]
  }
  
  @scala.inline
  implicit class ContentStyleMutableBuilder[Self <: ContentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
