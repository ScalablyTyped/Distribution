package typings.amapJsApi.AMap.Icon

import typings.amapJsApi.AMap.Pixel
import typings.amapJsApi.AMap.SizeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * 图标的取图地址
    */
  var image: js.UndefOr[String] = js.native
  
  /**
    * 图标取图偏移量
    */
  var imageOffset: js.UndefOr[Pixel] = js.native
  
  /**
    * 图标所用图片大小
    */
  var imageSize: js.UndefOr[SizeValue] = js.native
  
  /**
    * 图标尺寸
    */
  var size: js.UndefOr[SizeValue] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setImageSize(value: SizeValue): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
    
    @scala.inline
    def setSize(value: SizeValue): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
