package typings.activexMshtml.global.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.ISVGSVGElement")
@js.native
class ISVGSVGElement protected ()
  extends typings.activexMshtml.MSHTML.ISVGSVGElement {
  /* CompleteClass */
  @JSName("MSHTML.ISVGSVGElement_typekey")
  override var MSHTMLDotISVGSVGElement_typekey: typings.activexMshtml.MSHTML.ISVGSVGElement = js.native
  /* CompleteClass */
  override var contentScriptType: String = js.native
  /* CompleteClass */
  override var contentStyleType: String = js.native
  /* CompleteClass */
  override var currentScale: Double = js.native
  /* CompleteClass */
  override var currentTranslate: typings.activexMshtml.MSHTML.SVGPoint = js.native
  /* CompleteClass */
  override var currentView: typings.activexMshtml.MSHTML.ISVGViewSpec = js.native
  /* CompleteClass */
  override var height: typings.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  /* CompleteClass */
  override var pixelUnitToMillimeterX: Double = js.native
  /* CompleteClass */
  override var pixelUnitToMillimeterY: Double = js.native
  /* CompleteClass */
  override var screenPixelToMillimeterX: Double = js.native
  /* CompleteClass */
  override var screenPixelToMillimeterY: Double = js.native
  /* CompleteClass */
  override var useCurrentView: Boolean = js.native
  /* CompleteClass */
  override var viewport: typings.activexMshtml.MSHTML.SVGRect = js.native
  /* CompleteClass */
  override var width: typings.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  /* CompleteClass */
  override var x: typings.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  /* CompleteClass */
  override var y: typings.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  /* CompleteClass */
  override def animationsPaused(): Boolean = js.native
  /* CompleteClass */
  override def checkEnclosure(element: typings.activexMshtml.MSHTML.ISVGElement, rect: typings.activexMshtml.MSHTML.SVGRect): Boolean = js.native
  /* CompleteClass */
  override def checkIntersection(element: typings.activexMshtml.MSHTML.ISVGElement, rect: typings.activexMshtml.MSHTML.SVGRect): Boolean = js.native
  /* CompleteClass */
  override def createSVGAngle(): typings.activexMshtml.MSHTML.SVGAngle = js.native
  /* CompleteClass */
  override def createSVGLength(): typings.activexMshtml.MSHTML.SVGLength = js.native
  /* CompleteClass */
  override def createSVGMatrix(): typings.activexMshtml.MSHTML.SVGMatrix = js.native
  /* CompleteClass */
  override def createSVGNumber(): typings.activexMshtml.MSHTML.SVGNumber = js.native
  /* CompleteClass */
  override def createSVGPoint(): typings.activexMshtml.MSHTML.SVGPoint = js.native
  /* CompleteClass */
  override def createSVGRect(): typings.activexMshtml.MSHTML.SVGRect = js.native
  /* CompleteClass */
  override def createSVGTransform(): typings.activexMshtml.MSHTML.SVGTransform = js.native
  /* CompleteClass */
  override def createSVGTransformFromMatrix(matrix: typings.activexMshtml.MSHTML.SVGMatrix): typings.activexMshtml.MSHTML.SVGTransform = js.native
  /* CompleteClass */
  override def deselectAll(): Unit = js.native
  /* CompleteClass */
  override def forceRedraw(): Unit = js.native
  /* CompleteClass */
  override def getCurrentTime(): Double = js.native
  /* CompleteClass */
  override def getElementById(elementId: String): typings.activexMshtml.MSHTML.IHTMLElement = js.native
  /* CompleteClass */
  override def getEnclosureList(
    rect: typings.activexMshtml.MSHTML.SVGRect,
    referenceElement: typings.activexMshtml.MSHTML.ISVGElement
  ): js.Any = js.native
  /* CompleteClass */
  override def getIntersectionList(
    rect: typings.activexMshtml.MSHTML.SVGRect,
    referenceElement: typings.activexMshtml.MSHTML.ISVGElement
  ): js.Any = js.native
  /* CompleteClass */
  override def pauseAnimations(): Unit = js.native
  /* CompleteClass */
  override def setCurrentTime(seconds: Double): Unit = js.native
  /* CompleteClass */
  override def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  /* CompleteClass */
  override def unpauseAnimations(): Unit = js.native
  /* CompleteClass */
  override def unsuspendRedraw(suspendHandeID: Double): Unit = js.native
  /* CompleteClass */
  override def unsuspendRedrawAll(): Unit = js.native
}

