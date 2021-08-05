package typings.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.SVGTransform")
@js.native
/* private */ class SVGTransform ()
  extends StObject
     with typings.activexMshtml.MSHTML.SVGTransform {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.SVGTransform_typekey")
  var MSHTMLDotSVGTransform_typekey: typings.activexMshtml.MSHTML.SVGTransform = js.native
  
  /* CompleteClass */
  var angle: Double = js.native
  
  /* CompleteClass */
  var matrix: typings.activexMshtml.MSHTML.SVGMatrix = js.native
  
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
  
  /* CompleteClass */
  var `type`: Double = js.native
}
