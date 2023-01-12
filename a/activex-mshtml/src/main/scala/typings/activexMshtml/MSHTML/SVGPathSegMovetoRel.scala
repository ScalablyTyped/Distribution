package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegMovetoRel extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegMovetoRel_typekey")
  var MSHTMLDotSVGPathSegMovetoRel_typekey: SVGPathSegMovetoRel
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var y: Double
}
object SVGPathSegMovetoRel {
  
  inline def apply(
    MSHTMLDotSVGPathSegMovetoRel_typekey: SVGPathSegMovetoRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegMovetoRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegMovetoRel_typekey")(MSHTMLDotSVGPathSegMovetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegMovetoRel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathSegMovetoRel] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotSVGPathSegMovetoRel_typekey(value: SVGPathSegMovetoRel): Self = StObject.set(x, "MSHTML.SVGPathSegMovetoRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
