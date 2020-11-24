package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoHide extends js.Object {
  
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
  implicit class AutoHideOps[Self <: AutoHide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoEllipsis(value: Boolean): Self = this.set("autoEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FontWeight): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
