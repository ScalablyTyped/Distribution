package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorColor extends StObject {
  
  var backgroundColor: String = js.native
  
  var color: js.UndefOr[scala.Nothing] = js.native
  
  var fontFamily: js.UndefOr[scala.Nothing] = js.native
  
  var position: String = js.native
}
object BackgroundColorColor {
  
  @scala.inline
  def apply(backgroundColor: String, position: String): BackgroundColorColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorColor]
  }
  
  @scala.inline
  implicit class BackgroundColorColorMutableBuilder[Self <: BackgroundColorColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
