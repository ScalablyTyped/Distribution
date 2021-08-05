package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPoint extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPoint_typekey")
  var MSHTMLDotSVGPoint_typekey: SVGPoint
  
  def matrixTransform(pMatrix: SVGMatrix): SVGPoint
  
  var x: Double
  
  var y: Double
}
object SVGPoint {
  
  inline def apply(MSHTMLDotSVGPoint_typekey: SVGPoint, matrixTransform: SVGMatrix => SVGPoint, x: Double, y: Double): SVGPoint = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPoint_typekey")(MSHTMLDotSVGPoint_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPoint]
  }
  
  extension [Self <: SVGPoint](x: Self) {
    
    inline def setMSHTMLDotSVGPoint_typekey(value: SVGPoint): Self = StObject.set(x, "MSHTML.SVGPoint_typekey", value.asInstanceOf[js.Any])
    
    inline def setMatrixTransform(value: SVGMatrix => SVGPoint): Self = StObject.set(x, "matrixTransform", js.Any.fromFunction1(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
