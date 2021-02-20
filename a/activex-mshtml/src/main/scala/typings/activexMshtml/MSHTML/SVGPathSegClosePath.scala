package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegClosePath extends StObject {
  
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
  implicit class SVGPathSegClosePathMutableBuilder[Self <: SVGPathSegClosePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegClosePath_typekey(value: SVGPathSegClosePath): Self = StObject.set(x, "MSHTML.SVGPathSegClosePath_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
  }
}
