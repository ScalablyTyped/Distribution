package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLFrameBase extends js.Object {
  
  @JSName("MSHTML.IHTMLFrameBase_typekey")
  var MSHTMLDotIHTMLFrameBase_typekey: IHTMLFrameBase = js.native
  
  var border: js.Any = js.native
  
  var frameBorder: String = js.native
  
  var frameSpacing: js.Any = js.native
  
  var marginHeight: js.Any = js.native
  
  var marginWidth: js.Any = js.native
  
  var name: String = js.native
  
  var noResize: Boolean = js.native
  
  var scrolling: String = js.native
  
  var src: String = js.native
}
object IHTMLFrameBase {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLFrameBase_typekey: IHTMLFrameBase,
    border: js.Any,
    frameBorder: String,
    frameSpacing: js.Any,
    marginHeight: js.Any,
    marginWidth: js.Any,
    name: String,
    noResize: Boolean,
    scrolling: String,
    src: String
  ): IHTMLFrameBase = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], frameBorder = frameBorder.asInstanceOf[js.Any], frameSpacing = frameSpacing.asInstanceOf[js.Any], marginHeight = marginHeight.asInstanceOf[js.Any], marginWidth = marginWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noResize = noResize.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLFrameBase_typekey")(MSHTMLDotIHTMLFrameBase_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLFrameBase]
  }
  
  @scala.inline
  implicit class IHTMLFrameBaseOps[Self <: IHTMLFrameBase] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotIHTMLFrameBase_typekey(value: IHTMLFrameBase): Self = this.set("MSHTML.IHTMLFrameBase_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: js.Any): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameBorder(value: String): Self = this.set("frameBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameSpacing(value: js.Any): Self = this.set("frameSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginHeight(value: js.Any): Self = this.set("marginHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginWidth(value: js.Any): Self = this.set("marginWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResize(value: Boolean): Self = this.set("noResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
}
