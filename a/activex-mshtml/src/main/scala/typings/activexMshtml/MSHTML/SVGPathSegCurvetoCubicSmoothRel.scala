package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegCurvetoCubicSmoothRel extends StObject {
  
  @JSName("MSHTML.SVGPathSegCurvetoCubicSmoothRel_typekey")
  var MSHTMLDotSVGPathSegCurvetoCubicSmoothRel_typekey: SVGPathSegCurvetoCubicSmoothRel = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
  
  var x: Double = js.native
  
  var x2: Double = js.native
  
  var y: Double = js.native
  
  var y2: Double = js.native
}
object SVGPathSegCurvetoCubicSmoothRel {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegCurvetoCubicSmoothRel_typekey: SVGPathSegCurvetoCubicSmoothRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): SVGPathSegCurvetoCubicSmoothRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegCurvetoCubicSmoothRel_typekey")(MSHTMLDotSVGPathSegCurvetoCubicSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegCurvetoCubicSmoothRel]
  }
  
  @scala.inline
  implicit class SVGPathSegCurvetoCubicSmoothRelMutableBuilder[Self <: SVGPathSegCurvetoCubicSmoothRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegCurvetoCubicSmoothRel_typekey(value: SVGPathSegCurvetoCubicSmoothRel): Self = StObject.set(x, "MSHTML.SVGPathSegCurvetoCubicSmoothRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
