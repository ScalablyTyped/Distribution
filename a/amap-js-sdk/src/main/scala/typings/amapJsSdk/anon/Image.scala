package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.Pixel
import typings.amapJsSdk.AMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
  var image: js.UndefOr[String] = js.native
  
  var imageOffset: js.UndefOr[Pixel] = js.native
  
  var imageSize: js.UndefOr[Size] = js.native
  
  var size: js.UndefOr[Size] = js.native
}
object Image {
  
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageOffset(value: Pixel): Self = this.set("imageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOffset: Self = this.set("imageOffset", js.undefined)
    
    @scala.inline
    def setImageSize(value: Size): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
