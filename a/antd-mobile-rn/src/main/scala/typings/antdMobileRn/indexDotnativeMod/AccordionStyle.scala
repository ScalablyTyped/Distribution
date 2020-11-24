package typings.antdMobileRn.indexDotnativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccordionStyle extends js.Object {
  
  var arrow: ViewStyle = js.native
  
  var container: ViewStyle = js.native
  
  var content: ViewStyle = js.native
  
  var contentText: TextStyle = js.native
  
  var header: ViewStyle = js.native
  
  var headerText: TextStyle = js.native
  
  var headerWrap: ViewStyle = js.native
}
object AccordionStyle {
  
  @scala.inline
  def apply(
    arrow: ViewStyle,
    container: ViewStyle,
    content: ViewStyle,
    contentText: TextStyle,
    header: ViewStyle,
    headerText: TextStyle,
    headerWrap: ViewStyle
  ): AccordionStyle = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentText = contentText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerText = headerText.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionStyle]
  }
  
  @scala.inline
  implicit class AccordionStyleOps[Self <: AccordionStyle] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: ViewStyle): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ViewStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentText(value: TextStyle): Self = this.set("contentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: ViewStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderText(value: TextStyle): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderWrap(value: ViewStyle): Self = this.set("headerWrap", value.asInstanceOf[js.Any])
  }
}
