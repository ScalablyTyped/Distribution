package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var style: TextAlign
  
  var text: AutoRotate
}
object Text {
  
  inline def apply(style: TextAlign, text: AutoRotate): Text = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setStyle(value: TextAlign): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setText(value: AutoRotate): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
