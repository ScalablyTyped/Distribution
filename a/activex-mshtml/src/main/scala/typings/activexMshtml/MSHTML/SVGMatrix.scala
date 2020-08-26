package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGMatrix extends js.Object {
  @JSName("MSHTML.SVGMatrix_typekey")
  var MSHTMLDotSVGMatrix_typekey: SVGMatrix = js.native
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  def flipX(): SVGMatrix = js.native
  def flipY(): SVGMatrix = js.native
  def inverse(): SVGMatrix = js.native
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = js.native
  def rotate(angle: Double): SVGMatrix = js.native
  def rotateFromVector(x: Double, y: Double): SVGMatrix = js.native
  def scale(scaleFactor: Double): SVGMatrix = js.native
  def scaleNonUniform(scaleFactorX: Double, scaleFactorY: Double): SVGMatrix = js.native
  def skewX(angle: Double): SVGMatrix = js.native
  def skewY(angle: Double): SVGMatrix = js.native
  def translate(x: Double, y: Double): SVGMatrix = js.native
}

object SVGMatrix {
  @scala.inline
  def apply(
    MSHTMLDotSVGMatrix_typekey: SVGMatrix,
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    e: Double,
    f: Double,
    flipX: () => SVGMatrix,
    flipY: () => SVGMatrix,
    inverse: () => SVGMatrix,
    multiply: SVGMatrix => SVGMatrix,
    rotate: Double => SVGMatrix,
    rotateFromVector: (Double, Double) => SVGMatrix,
    scale: Double => SVGMatrix,
    scaleNonUniform: (Double, Double) => SVGMatrix,
    skewX: Double => SVGMatrix,
    skewY: Double => SVGMatrix,
    translate: (Double, Double) => SVGMatrix
  ): SVGMatrix = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], flipX = js.Any.fromFunction0(flipX), flipY = js.Any.fromFunction0(flipY), inverse = js.Any.fromFunction0(inverse), multiply = js.Any.fromFunction1(multiply), rotate = js.Any.fromFunction1(rotate), rotateFromVector = js.Any.fromFunction2(rotateFromVector), scale = js.Any.fromFunction1(scale), scaleNonUniform = js.Any.fromFunction2(scaleNonUniform), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY), translate = js.Any.fromFunction2(translate))
    __obj.updateDynamic("MSHTML.SVGMatrix_typekey")(MSHTMLDotSVGMatrix_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMatrix]
  }
  @scala.inline
  implicit class SVGMatrixOps[Self <: SVGMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSHTMLDotSVGMatrix_typekey(value: SVGMatrix): Self = this.set("MSHTML.SVGMatrix_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setC(value: Double): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(value: Double): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlipX(value: () => SVGMatrix): Self = this.set("flipX", js.Any.fromFunction0(value))
    @scala.inline
    def setFlipY(value: () => SVGMatrix): Self = this.set("flipY", js.Any.fromFunction0(value))
    @scala.inline
    def setInverse(value: () => SVGMatrix): Self = this.set("inverse", js.Any.fromFunction0(value))
    @scala.inline
    def setMultiply(value: SVGMatrix => SVGMatrix): Self = this.set("multiply", js.Any.fromFunction1(value))
    @scala.inline
    def setRotate(value: Double => SVGMatrix): Self = this.set("rotate", js.Any.fromFunction1(value))
    @scala.inline
    def setRotateFromVector(value: (Double, Double) => SVGMatrix): Self = this.set("rotateFromVector", js.Any.fromFunction2(value))
    @scala.inline
    def setScale(value: Double => SVGMatrix): Self = this.set("scale", js.Any.fromFunction1(value))
    @scala.inline
    def setScaleNonUniform(value: (Double, Double) => SVGMatrix): Self = this.set("scaleNonUniform", js.Any.fromFunction2(value))
    @scala.inline
    def setSkewX(value: Double => SVGMatrix): Self = this.set("skewX", js.Any.fromFunction1(value))
    @scala.inline
    def setSkewY(value: Double => SVGMatrix): Self = this.set("skewY", js.Any.fromFunction1(value))
    @scala.inline
    def setTranslate(value: (Double, Double) => SVGMatrix): Self = this.set("translate", js.Any.fromFunction2(value))
  }
  
}

