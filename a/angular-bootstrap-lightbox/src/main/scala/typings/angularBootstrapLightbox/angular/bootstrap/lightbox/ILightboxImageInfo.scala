package typings.angularBootstrapLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightboxImageInfo extends js.Object {
  
  var caption: js.UndefOr[String] = js.native
  
  var height: Double = js.native
  
  var thumbUrl: js.UndefOr[String] = js.native
  
  var url: String = js.native
  
  var width: Double = js.native
}
object ILightboxImageInfo {
  
  @scala.inline
  def apply(height: Double, url: String, width: Double): ILightboxImageInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightboxImageInfo]
  }
  
  @scala.inline
  implicit class ILightboxImageInfoOps[Self <: ILightboxImageInfo] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setThumbUrl(value: String): Self = this.set("thumbUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbUrl: Self = this.set("thumbUrl", js.undefined)
  }
}
