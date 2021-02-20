package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoRotate extends StObject {
  
  var autoRotate: Boolean = js.native
  
  var content: js.Any = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var position: String = js.native
  
  var style: LineWidth = js.native
}
object AutoRotate {
  
  @scala.inline
  def apply(
    autoRotate: Boolean,
    content: js.Any,
    offsetX: Double,
    offsetY: Double,
    position: String,
    style: LineWidth
  ): AutoRotate = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRotate]
  }
  
  @scala.inline
  implicit class AutoRotateMutableBuilder[Self <: AutoRotate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: LineWidth): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
