package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
@js.native
trait PartialAccordionStyle extends js.Object {
  
  var arrow: js.UndefOr[TextStyle] = js.native
  
  var container: js.UndefOr[ViewStyle] = js.native
  
  var content: js.UndefOr[ViewStyle] = js.native
  
  var contentText: js.UndefOr[TextStyle] = js.native
  
  var header: js.UndefOr[ViewStyle] = js.native
  
  var headerText: js.UndefOr[TextStyle] = js.native
  
  var headerWrap: js.UndefOr[ViewStyle] = js.native
}
object PartialAccordionStyle {
  
  @scala.inline
  def apply(): PartialAccordionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAccordionStyle]
  }
  
  @scala.inline
  implicit class PartialAccordionStyleOps[Self <: PartialAccordionStyle] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: TextStyle): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContent(value: ViewStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentText(value: TextStyle): Self = this.set("contentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentText: Self = this.set("contentText", js.undefined)
    
    @scala.inline
    def setHeader(value: ViewStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderText(value: TextStyle): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setHeaderWrap(value: ViewStyle): Self = this.set("headerWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderWrap: Self = this.set("headerWrap", js.undefined)
  }
}
