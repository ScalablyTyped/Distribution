package typings.antdMobileRn.imagePickerStyleIndexNativeMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImagePickerStyle extends js.Object {
  
  var closeText: TextStyle = js.native
  
  var closeWrap: ViewStyle = js.native
  
  var container: ViewStyle = js.native
  
  var image: ImageStyle = js.native
  
  var item: ViewStyle = js.native
  
  var plusText: TextStyle = js.native
  
  var plusWrap: ViewStyle = js.native
  
  var plusWrapHighlight: ViewStyle = js.native
  
  var plusWrapNormal: ViewStyle = js.native
  
  var size: ViewStyle = js.native
}
object IImagePickerStyle {
  
  @scala.inline
  def apply(
    closeText: TextStyle,
    closeWrap: ViewStyle,
    container: ViewStyle,
    image: ImageStyle,
    item: ViewStyle,
    plusText: TextStyle,
    plusWrap: ViewStyle,
    plusWrapHighlight: ViewStyle,
    plusWrapNormal: ViewStyle,
    size: ViewStyle
  ): IImagePickerStyle = {
    val __obj = js.Dynamic.literal(closeText = closeText.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], plusText = plusText.asInstanceOf[js.Any], plusWrap = plusWrap.asInstanceOf[js.Any], plusWrapHighlight = plusWrapHighlight.asInstanceOf[js.Any], plusWrapNormal = plusWrapNormal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImagePickerStyle]
  }
  
  @scala.inline
  implicit class IImagePickerStyleOps[Self <: IImagePickerStyle] (val x: Self) extends AnyVal {
    
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
    def setCloseText(value: TextStyle): Self = this.set("closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseWrap(value: ViewStyle): Self = this.set("closeWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageStyle): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ViewStyle): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlusText(value: TextStyle): Self = this.set("plusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlusWrap(value: ViewStyle): Self = this.set("plusWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlusWrapHighlight(value: ViewStyle): Self = this.set("plusWrapHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlusWrapNormal(value: ViewStyle): Self = this.set("plusWrapNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: ViewStyle): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
