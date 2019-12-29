package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.ISVGSVGElement")
@js.native
class ISVGSVGElement protected () extends js.Object {
  @JSName("MSHTML.ISVGSVGElement_typekey")
  var MSHTMLDotISVGSVGElement_typekey: ISVGSVGElement = js.native
  var contentScriptType: String = js.native
  var contentStyleType: String = js.native
  var currentScale: Double = js.native
  var currentTranslate: SVGPoint = js.native
  var currentView: ISVGViewSpec = js.native
  var height: SVGAnimatedLength = js.native
  var pixelUnitToMillimeterX: Double = js.native
  var pixelUnitToMillimeterY: Double = js.native
  var screenPixelToMillimeterX: Double = js.native
  var screenPixelToMillimeterY: Double = js.native
  var useCurrentView: Boolean = js.native
  var viewport: SVGRect = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var y: SVGAnimatedLength = js.native
  def animationsPaused(): Boolean = js.native
  def checkEnclosure(element: ISVGElement, rect: SVGRect): Boolean = js.native
  def checkIntersection(element: ISVGElement, rect: SVGRect): Boolean = js.native
  def createSVGAngle(): SVGAngle = js.native
  def createSVGLength(): SVGLength = js.native
  def createSVGMatrix(): SVGMatrix = js.native
  def createSVGNumber(): SVGNumber = js.native
  def createSVGPoint(): SVGPoint = js.native
  def createSVGRect(): SVGRect = js.native
  def createSVGTransform(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  def deselectAll(): Unit = js.native
  def forceRedraw(): Unit = js.native
  def getCurrentTime(): Double = js.native
  def getElementById(elementId: String): IHTMLElement = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def pauseAnimations(): Unit = js.native
  def setCurrentTime(seconds: Double): Unit = js.native
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  def unpauseAnimations(): Unit = js.native
  def unsuspendRedraw(suspendHandeID: Double): Unit = js.native
  def unsuspendRedrawAll(): Unit = js.native
}

