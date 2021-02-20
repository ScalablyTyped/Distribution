package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoHide extends StObject {
  
  var autoEllipsis: Boolean = js.native
  
  var autoHide: Boolean = js.native
  
  var autoRotate: Boolean = js.native
  
  var offset: Double = js.native
  
  var style: FontWeight = js.native
}
object AutoHide {
  
  @scala.inline
  def apply(autoEllipsis: Boolean, autoHide: Boolean, autoRotate: Boolean, offset: Double, style: FontWeight): AutoHide = {
    val __obj = js.Dynamic.literal(autoEllipsis = autoEllipsis.asInstanceOf[js.Any], autoHide = autoHide.asInstanceOf[js.Any], autoRotate = autoRotate.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHide]
  }
  
  @scala.inline
  implicit class AutoHideMutableBuilder[Self <: AutoHide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEllipsis(value: Boolean): Self = StObject.set(x, "autoEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FontWeight): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
