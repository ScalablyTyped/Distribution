package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegLinetoHorizontalAbs extends StObject {
  
  @JSName("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey: SVGPathSegLinetoHorizontalAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
}
object SVGPathSegLinetoHorizontalAbs {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey: SVGPathSegLinetoHorizontalAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double
  ): SVGPathSegLinetoHorizontalAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")(MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoHorizontalAbs]
  }
  
  @scala.inline
  implicit class SVGPathSegLinetoHorizontalAbsMutableBuilder[Self <: SVGPathSegLinetoHorizontalAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey(value: SVGPathSegLinetoHorizontalAbs): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoHorizontalAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
