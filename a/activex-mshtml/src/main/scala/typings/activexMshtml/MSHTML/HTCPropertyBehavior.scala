package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTCPropertyBehavior extends js.Object {
  
  @JSName("MSHTML.HTCPropertyBehavior_typekey")
  var MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior = js.native
  
  def fireChange(): Unit = js.native
  
  var value: js.Any = js.native
}
object HTCPropertyBehavior {
  
  @scala.inline
  def apply(MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior, fireChange: () => Unit, value: js.Any): HTCPropertyBehavior = {
    val __obj = js.Dynamic.literal(fireChange = js.Any.fromFunction0(fireChange), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCPropertyBehavior_typekey")(MSHTMLDotHTCPropertyBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCPropertyBehavior]
  }
  
  @scala.inline
  implicit class HTCPropertyBehaviorOps[Self <: HTCPropertyBehavior] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTCPropertyBehavior_typekey(value: HTCPropertyBehavior): Self = this.set("MSHTML.HTCPropertyBehavior_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFireChange(value: () => Unit): Self = this.set("fireChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
