package typings.antdMobileRn.imagePickerIndexNativeMod

import typings.antdMobileRn.imagePickerPropsTypeMod.ImagePickerPropTypes
import typings.antdMobileRn.imagePickerStyleIndexNativeMod.IImagePickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePickerNativeProps extends ImagePickerPropTypes {
  
  @JSName("styles")
  var styles_ImagePickerNativeProps: js.UndefOr[IImagePickerStyle] = js.native
}
object ImagePickerNativeProps {
  
  @scala.inline
  def apply(): ImagePickerNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePickerNativeProps]
  }
  
  @scala.inline
  implicit class ImagePickerNativePropsOps[Self <: ImagePickerNativeProps] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: IImagePickerStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
