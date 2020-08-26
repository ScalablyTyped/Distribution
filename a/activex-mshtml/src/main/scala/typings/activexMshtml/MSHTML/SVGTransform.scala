package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTransform extends js.Object {
  @JSName("MSHTML.SVGTransform_typekey")
  var MSHTMLDotSVGTransform_typekey: SVGTransform = js.native
  var angle: Double = js.native
  var matrix: SVGMatrix = js.native
  var `type`: Double = js.native
  def setMatrix(matrix: SVGMatrix): Unit = js.native
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  def setScale(sx: Double, sy: Double): Unit = js.native
  def setSkewX(angle: Double): Unit = js.native
  def setSkewY(angle: Double): Unit = js.native
  def setTranslate(tx: Double, ty: Double): Unit = js.native
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
  implicit class SVGTransformOps[Self <: SVGTransform] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGTransform_typekey(value: SVGTransform): Self = this.set("MSHTML.SVGTransform_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrix(value: SVGMatrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetMatrix(value: SVGMatrix => Unit): Self = this.set("setMatrix", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRotate(value: (Double, Double, Double) => Unit): Self = this.set("setRotate", js.Any.fromFunction3(value))
    @scala.inline
    def setSetScale(value: (Double, Double) => Unit): Self = this.set("setScale", js.Any.fromFunction2(value))
    @scala.inline
    def setSetSkewX(value: Double => Unit): Self = this.set("setSkewX", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSkewY(value: Double => Unit): Self = this.set("setSkewY", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTranslate(value: (Double, Double) => Unit): Self = this.set("setTranslate", js.Any.fromFunction2(value))
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

