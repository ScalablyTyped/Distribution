package typings.activexMshtml.global.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGTransform")
@js.native
class SVGTransform protected ()
  extends typings.activexMshtml.MSHTML.SVGTransform {
  /* CompleteClass */
  @JSName("MSHTML.SVGTransform_typekey")
  override var MSHTMLDotSVGTransform_typekey: typings.activexMshtml.MSHTML.SVGTransform = js.native
  /* CompleteClass */
  override var angle: Double = js.native
  /* CompleteClass */
  override var matrix: typings.activexMshtml.MSHTML.SVGMatrix = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override def setMatrix(matrix: typings.activexMshtml.MSHTML.SVGMatrix): Unit = js.native
  /* CompleteClass */
  override def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  /* CompleteClass */
  override def setScale(sx: Double, sy: Double): Unit = js.native
  /* CompleteClass */
  override def setSkewX(angle: Double): Unit = js.native
  /* CompleteClass */
  override def setSkewY(angle: Double): Unit = js.native
  /* CompleteClass */
  override def setTranslate(tx: Double, ty: Double): Unit = js.native
}

