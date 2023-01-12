package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegArcAbs extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegArcAbs_typekey")
  var MSHTMLDotISVGPathSegArcAbs_typekey: ISVGPathSegArcAbs
  
  var angle: Double
  
  var largeArcFlag: Boolean
  
  var r1: Double
  
  var r2: Double
  
  var sweepFlag: Boolean
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegArcAbs {
  
  inline def apply(
    MSHTMLDotISVGPathSegArcAbs_typekey: ISVGPathSegArcAbs,
    angle: Double,
    largeArcFlag: Boolean,
    r1: Double,
    r2: Double,
    sweepFlag: Boolean,
    x: Double,
    y: Double
  ): ISVGPathSegArcAbs = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegArcAbs_typekey")(MSHTMLDotISVGPathSegArcAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegArcAbs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGPathSegArcAbs] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setLargeArcFlag(value: Boolean): Self = StObject.set(x, "largeArcFlag", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotISVGPathSegArcAbs_typekey(value: ISVGPathSegArcAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegArcAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    inline def setSweepFlag(value: Boolean): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
