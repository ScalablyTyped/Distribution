package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegArcAbs extends StObject {
  
  @JSName("MSHTML.SVGPathSegArcAbs_typekey")
  var MSHTMLDotSVGPathSegArcAbs_typekey: SVGPathSegArcAbs = js.native
  
  var angle: Double = js.native
  
  var largeArcFlag: Boolean = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
  
  var r1: Double = js.native
  
  var r2: Double = js.native
  
  var sweepFlag: Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SVGPathSegArcAbs {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegArcAbs_typekey: SVGPathSegArcAbs,
    angle: Double,
    largeArcFlag: Boolean,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    r1: Double,
    r2: Double,
    sweepFlag: Boolean,
    x: Double,
    y: Double
  ): SVGPathSegArcAbs = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegArcAbs_typekey")(MSHTMLDotSVGPathSegArcAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegArcAbs]
  }
  
  @scala.inline
  implicit class SVGPathSegArcAbsMutableBuilder[Self <: SVGPathSegArcAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeArcFlag(value: Boolean): Self = StObject.set(x, "largeArcFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGPathSegArcAbs_typekey(value: SVGPathSegArcAbs): Self = StObject.set(x, "MSHTML.SVGPathSegArcAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
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
