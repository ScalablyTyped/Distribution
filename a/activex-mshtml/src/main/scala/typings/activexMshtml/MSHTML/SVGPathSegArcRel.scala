package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegArcRel extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegArcRel_typekey")
  var MSHTMLDotSVGPathSegArcRel_typekey: SVGPathSegArcRel
  
  var angle: Double
  
  var largeArcFlag: Boolean
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var r1: Double
  
  var r2: Double
  
  var sweepFlag: Boolean
  
  var x: Double
  
  var y: Double
}
object SVGPathSegArcRel {
  
  inline def apply(
    MSHTMLDotSVGPathSegArcRel_typekey: SVGPathSegArcRel,
    angle: Double,
    largeArcFlag: Boolean,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    r1: Double,
    r2: Double,
    sweepFlag: Boolean,
    x: Double,
    y: Double
  ): SVGPathSegArcRel = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegArcRel_typekey")(MSHTMLDotSVGPathSegArcRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegArcRel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathSegArcRel] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setLargeArcFlag(value: Boolean): Self = StObject.set(x, "largeArcFlag", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGPathSegArcRel_typekey(value: SVGPathSegArcRel): Self = StObject.set(x, "MSHTML.SVGPathSegArcRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    inline def setSweepFlag(value: Boolean): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
