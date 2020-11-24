package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPreserveAspectRatio extends js.Object {
  
  @JSName("MSHTML.SVGPreserveAspectRatio_typekey")
  var MSHTMLDotSVGPreserveAspectRatio_typekey: SVGPreserveAspectRatio = js.native
  
  var align: Double = js.native
  
  var meetOrSlice: Double = js.native
}
object SVGPreserveAspectRatio {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPreserveAspectRatio_typekey: SVGPreserveAspectRatio,
    align: Double,
    meetOrSlice: Double
  ): SVGPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], meetOrSlice = meetOrSlice.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPreserveAspectRatio_typekey")(MSHTMLDotSVGPreserveAspectRatio_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPreserveAspectRatio]
  }
  
  @scala.inline
  implicit class SVGPreserveAspectRatioOps[Self <: SVGPreserveAspectRatio] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGPreserveAspectRatio_typekey(value: SVGPreserveAspectRatio): Self = this.set("MSHTML.SVGPreserveAspectRatio_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: Double): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetOrSlice(value: Double): Self = this.set("meetOrSlice", value.asInstanceOf[js.Any])
  }
}
