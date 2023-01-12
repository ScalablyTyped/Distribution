package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegMovetoAbs extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegMovetoAbs_typekey")
  var MSHTMLDotSVGPathSegMovetoAbs_typekey: SVGPathSegMovetoAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
  
  var y: Double
}
object SVGPathSegMovetoAbs {
  
  inline def apply(
    MSHTMLDotSVGPathSegMovetoAbs_typekey: SVGPathSegMovetoAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegMovetoAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegMovetoAbs_typekey")(MSHTMLDotSVGPathSegMovetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegMovetoAbs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathSegMovetoAbs] (val x: Self) extends AnyVal {
    
    inline def setMSHTMLDotSVGPathSegMovetoAbs_typekey(value: SVGPathSegMovetoAbs): Self = StObject.set(x, "MSHTML.SVGPathSegMovetoAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
