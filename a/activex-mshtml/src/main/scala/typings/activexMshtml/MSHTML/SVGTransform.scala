package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTransform extends StObject {
  
  /* private */ @JSName("MSHTML.SVGTransform_typekey")
  var MSHTMLDotSVGTransform_typekey: SVGTransform
  
  var angle: Double
  
  var matrix: SVGMatrix
  
  def setMatrix(matrix: SVGMatrix): Unit
  
  def setRotate(angle: Double, cx: Double, cy: Double): Unit
  
  def setScale(sx: Double, sy: Double): Unit
  
  def setSkewX(angle: Double): Unit
  
  def setSkewY(angle: Double): Unit
  
  def setTranslate(tx: Double, ty: Double): Unit
  
  var `type`: Double
}
object SVGTransform {
  
  inline def apply(
    MSHTMLDotSVGTransform_typekey: SVGTransform,
    angle: Double,
    matrix: SVGMatrix,
    setMatrix: SVGMatrix => Unit,
    setRotate: (Double, Double, Double) => Unit,
    setScale: (Double, Double) => Unit,
    setSkewX: Double => Unit,
    setSkewY: Double => Unit,
    setTranslate: (Double, Double) => Unit,
    `type`: Double
  ): SVGTransform = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], setMatrix = js.Any.fromFunction1(setMatrix), setRotate = js.Any.fromFunction3(setRotate), setScale = js.Any.fromFunction2(setScale), setSkewX = js.Any.fromFunction1(setSkewX), setSkewY = js.Any.fromFunction1(setSkewY), setTranslate = js.Any.fromFunction2(setTranslate))
    __obj.updateDynamic("MSHTML.SVGTransform_typekey")(MSHTMLDotSVGTransform_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransform]
  }
  
  extension [Self <: SVGTransform](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGTransform_typekey(value: SVGTransform): Self = StObject.set(x, "MSHTML.SVGTransform_typekey", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: SVGMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setSetMatrix(value: SVGMatrix => Unit): Self = StObject.set(x, "setMatrix", js.Any.fromFunction1(value))
    
    inline def setSetRotate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setRotate", js.Any.fromFunction3(value))
    
    inline def setSetScale(value: (Double, Double) => Unit): Self = StObject.set(x, "setScale", js.Any.fromFunction2(value))
    
    inline def setSetSkewX(value: Double => Unit): Self = StObject.set(x, "setSkewX", js.Any.fromFunction1(value))
    
    inline def setSetSkewY(value: Double => Unit): Self = StObject.set(x, "setSkewY", js.Any.fromFunction1(value))
    
    inline def setSetTranslate(value: (Double, Double) => Unit): Self = StObject.set(x, "setTranslate", js.Any.fromFunction2(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
