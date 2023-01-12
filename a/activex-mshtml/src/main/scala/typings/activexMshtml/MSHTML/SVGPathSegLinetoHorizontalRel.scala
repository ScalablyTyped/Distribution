package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegLinetoHorizontalRel extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")
  var MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey: SVGPathSegLinetoHorizontalRel
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
}
object SVGPathSegLinetoHorizontalRel {
  
  inline def apply(
    MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey: SVGPathSegLinetoHorizontalRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double
  ): SVGPathSegLinetoHorizontalRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")(MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoHorizontalRel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathSegLinetoHorizontalRel] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotSVGPathSegLinetoHorizontalRel_typekey(value: SVGPathSegLinetoHorizontalRel): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoHorizontalRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
