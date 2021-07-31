package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var autoRotate: Boolean
  
  var content: js.Any
  
  var offset: Double
  
  var position: String
  
  var style: FillFontFamily
}
object Offset {
  
  @scala.inline
  def apply(autoRotate: Boolean, content: js.Any, offset: Double, position: String, style: FillFontFamily): Offset = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FillFontFamily): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
