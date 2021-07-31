package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegClosePath extends StObject {
  
  @JSName("MSHTML.ISVGPathSegClosePath_typekey")
  var MSHTMLDotISVGPathSegClosePath_typekey: ISVGPathSegClosePath
}
object ISVGPathSegClosePath {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegClosePath_typekey: ISVGPathSegClosePath): ISVGPathSegClosePath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.ISVGPathSegClosePath_typekey")(MSHTMLDotISVGPathSegClosePath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegClosePath]
  }
  
  @scala.inline
  implicit class ISVGPathSegClosePathMutableBuilder[Self <: ISVGPathSegClosePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegClosePath_typekey(value: ISVGPathSegClosePath): Self = StObject.set(x, "MSHTML.ISVGPathSegClosePath_typekey", value.asInstanceOf[js.Any])
  }
}
