package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGTransform extends StObject {
  
  @JSName("MSHTML.SVGTransform_typekey")
  var MSHTMLDotSVGTransform_typekey: SVGTransform = js.native
  
  var angle: Double = js.native
  
  var matrix: SVGMatrix = js.native
  
  def setMatrix(matrix: SVGMatrix): Unit = js.native
  
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  
  def setScale(sx: Double, sy: Double): Unit = js.native
  
  def setSkewX(angle: Double): Unit = js.native
  
  def setSkewY(angle: Double): Unit = js.native
  
  def setTranslate(tx: Double, ty: Double): Unit = js.native
  
  var `type`: Double = js.native
}
object SVGTransform {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SVGTransformMutableBuilder[Self <: SVGTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGTransform_typekey(value: SVGTransform): Self = StObject.set(x, "MSHTML.SVGTransform_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: SVGMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetMatrix(value: SVGMatrix => Unit): Self = StObject.set(x, "setMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRotate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setRotate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetScale(value: (Double, Double) => Unit): Self = StObject.set(x, "setScale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSkewX(value: Double => Unit): Self = StObject.set(x, "setSkewX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSkewY(value: Double => Unit): Self = StObject.set(x, "setSkewY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTranslate(value: (Double, Double) => Unit): Self = StObject.set(x, "setTranslate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
