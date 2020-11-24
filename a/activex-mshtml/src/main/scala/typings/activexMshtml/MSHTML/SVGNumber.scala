package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGNumber extends js.Object {
  
  @JSName("MSHTML.SVGNumber_typekey")
  var MSHTMLDotSVGNumber_typekey: SVGNumber = js.native
  
  var value: Double = js.native
}
object SVGNumber {
  
  @scala.inline
  def apply(MSHTMLDotSVGNumber_typekey: SVGNumber, value: Double): SVGNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGNumber_typekey")(MSHTMLDotSVGNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumber]
  }
  
  @scala.inline
  implicit class SVGNumberOps[Self <: SVGNumber] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGNumber_typekey(value: SVGNumber): Self = this.set("MSHTML.SVGNumber_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
