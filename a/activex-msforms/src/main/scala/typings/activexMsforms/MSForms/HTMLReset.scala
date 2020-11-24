package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLReset extends js.Object {
  
  var Caption: String = js.native
  
  var HTMLName: String = js.native
  
  var HTMLType: String = js.native
  
  @JSName("MSForms.HTMLReset_typekey")
  var MSFormsDotHTMLReset_typekey: HTMLReset = js.native
}
object HTMLReset {
  
  @scala.inline
  def apply(Caption: String, HTMLName: String, HTMLType: String, MSFormsDotHTMLReset_typekey: HTMLReset): HTMLReset = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLReset_typekey")(MSFormsDotHTMLReset_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLReset]
  }
  
  @scala.inline
  implicit class HTMLResetOps[Self <: HTMLReset] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLName(value: String): Self = this.set("HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLType(value: String): Self = this.set("HTMLType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLReset_typekey(value: HTMLReset): Self = this.set("MSForms.HTMLReset_typekey", value.asInstanceOf[js.Any])
  }
}
