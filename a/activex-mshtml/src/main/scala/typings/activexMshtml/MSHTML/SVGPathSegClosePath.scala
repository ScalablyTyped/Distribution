package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegClosePath extends js.Object {
  
  @JSName("MSHTML.SVGPathSegClosePath_typekey")
  var MSHTMLDotSVGPathSegClosePath_typekey: SVGPathSegClosePath = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
}
object SVGPathSegClosePath {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegClosePath_typekey: SVGPathSegClosePath,
    pathSegType: Double,
    pathSegTypeAsLetter: String
  ): SVGPathSegClosePath = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegClosePath_typekey")(MSHTMLDotSVGPathSegClosePath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegClosePath]
  }
  
  @scala.inline
  implicit class SVGPathSegClosePathOps[Self <: SVGPathSegClosePath] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGPathSegClosePath_typekey(value: SVGPathSegClosePath): Self = this.set("MSHTML.SVGPathSegClosePath_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = this.set("pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = this.set("pathSegTypeAsLetter", value.asInstanceOf[js.Any])
  }
}
