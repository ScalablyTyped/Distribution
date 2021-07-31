package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var style: TextAlign
  
  var text: AutoRotate
}
object Text {
  
  @scala.inline
  def apply(style: TextAlign, text: AutoRotate): Text = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: TextAlign): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: AutoRotate): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
