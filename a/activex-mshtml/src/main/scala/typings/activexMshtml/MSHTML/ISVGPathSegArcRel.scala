package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegArcRel extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegArcRel_typekey")
  var MSHTMLDotISVGPathSegArcRel_typekey: ISVGPathSegArcRel
  
  var angle: Double
  
  var largeArcFlag: Boolean
  
  var r1: Double
  
  var r2: Double
  
  var sweepFlag: Boolean
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegArcRel {
  
  inline def apply(
    MSHTMLDotISVGPathSegArcRel_typekey: ISVGPathSegArcRel,
    angle: Double,
    largeArcFlag: Boolean,
    r1: Double,
    r2: Double,
    sweepFlag: Boolean,
    x: Double,
    y: Double
  ): ISVGPathSegArcRel = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegArcRel_typekey")(MSHTMLDotISVGPathSegArcRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegArcRel]
  }
  
  extension [Self <: ISVGPathSegArcRel](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setLargeArcFlag(value: Boolean): Self = StObject.set(x, "largeArcFlag", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotISVGPathSegArcRel_typekey(value: ISVGPathSegArcRel): Self = StObject.set(x, "MSHTML.ISVGPathSegArcRel_typekey", value.asInstanceOf[js.Any])
    
    inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    inline def setSweepFlag(value: Boolean): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
