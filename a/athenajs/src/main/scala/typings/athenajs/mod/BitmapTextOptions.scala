package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitmapTextOptions extends DrawableOptions {
  
  var charHeight: Double = js.native
  
  var charWidth: Double = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var imageId: js.UndefOr[String] = js.native
  
  var imageSrc: js.UndefOr[String] = js.native
  
  var offsetX: Double = js.native
  
  var scrollOffsetX: js.UndefOr[Double] = js.native
  
  var scrollOffsetY: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var startY: Double = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object BitmapTextOptions {
  
  @scala.inline
  def apply(charHeight: Double, charWidth: Double, offsetX: Double, startY: Double): BitmapTextOptions = {
    val __obj = js.Dynamic.literal(charHeight = charHeight.asInstanceOf[js.Any], charWidth = charWidth.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTextOptions]
  }
  
  @scala.inline
  implicit class BitmapTextOptionsOps[Self <: BitmapTextOptions] (val x: Self) extends AnyVal {
    
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
    def setCharHeight(value: Double): Self = this.set("charHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharWidth(value: Double): Self = this.set("charWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
    
    @scala.inline
    def setImageSrc(value: String): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSrc: Self = this.set("imageSrc", js.undefined)
    
    @scala.inline
    def setScrollOffsetX(value: Double): Self = this.set("scrollOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffsetX: Self = this.set("scrollOffsetX", js.undefined)
    
    @scala.inline
    def setScrollOffsetY(value: Double): Self = this.set("scrollOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffsetY: Self = this.set("scrollOffsetY", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
