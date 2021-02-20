package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegArcRel extends StObject {
  
  @JSName("MSHTML.ISVGPathSegArcRel_typekey")
  var MSHTMLDotISVGPathSegArcRel_typekey: ISVGPathSegArcRel = js.native
  
  var angle: Double = js.native
  
  var largeArcFlag: Boolean = js.native
  
  var r1: Double = js.native
  
  var r2: Double = js.native
  
  var sweepFlag: Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ISVGPathSegArcRel {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ISVGPathSegArcRelMutableBuilder[Self <: ISVGPathSegArcRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeArcFlag(value: Boolean): Self = StObject.set(x, "largeArcFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotISVGPathSegArcRel_typekey(value: ISVGPathSegArcRel): Self = StObject.set(x, "MSHTML.ISVGPathSegArcRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweepFlag(value: Boolean): Self = StObject.set(x, "sweepFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
