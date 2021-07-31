package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var backgroundColor: Unit
  
  var color: Unit
  
  var fontFamily: Unit
  
  var position: String
}
object BackgroundColor {
  
  @scala.inline
  def apply(backgroundColor: Unit, color: Unit, fontFamily: Unit, position: String): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Unit): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Unit): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: Unit): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
