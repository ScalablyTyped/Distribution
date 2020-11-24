package typings.antdMobileRn.toastStyleIndexNativeMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastStyle extends js.Object {
  
  var centering: ViewStyle = js.native
  
  var container: ViewStyle = js.native
  
  var content: TextStyle = js.native
  
  var iconToast: ViewStyle = js.native
  
  var image: ImageStyle = js.native
  
  var innerContainer: ViewStyle = js.native
  
  var innerWrap: ViewStyle = js.native
  
  var textToast: ViewStyle = js.native
}
object IToastStyle {
  
  @scala.inline
  def apply(
    centering: ViewStyle,
    container: ViewStyle,
    content: TextStyle,
    iconToast: ViewStyle,
    image: ImageStyle,
    innerContainer: ViewStyle,
    innerWrap: ViewStyle,
    textToast: ViewStyle
  ): IToastStyle = {
    val __obj = js.Dynamic.literal(centering = centering.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], iconToast = iconToast.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], innerWrap = innerWrap.asInstanceOf[js.Any], textToast = textToast.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastStyle]
  }
  
  @scala.inline
  implicit class IToastStyleOps[Self <: IToastStyle] (val x: Self) extends AnyVal {
    
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
    def setCentering(value: ViewStyle): Self = this.set("centering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: TextStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconToast(value: ViewStyle): Self = this.set("iconToast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageStyle): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerContainer(value: ViewStyle): Self = this.set("innerContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerWrap(value: ViewStyle): Self = this.set("innerWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToast(value: ViewStyle): Self = this.set("textToast", value.asInstanceOf[js.Any])
  }
}
