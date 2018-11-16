package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.ISVGSVGElement")
@js.native
class ISVGSVGElement protected () extends js.Object {
  var `MSHTML.ISVGSVGElement_typekey`: ISVGSVGElement = js.native
  var contentScriptType: java.lang.String = js.native
  var contentStyleType: java.lang.String = js.native
  var currentScale: scala.Double = js.native
  var currentTranslate: SVGPoint = js.native
  var currentView: ISVGViewSpec = js.native
  var height: SVGAnimatedLength = js.native
  var pixelUnitToMillimeterX: scala.Double = js.native
  var pixelUnitToMillimeterY: scala.Double = js.native
  var screenPixelToMillimeterX: scala.Double = js.native
  var screenPixelToMillimeterY: scala.Double = js.native
  var useCurrentView: scala.Boolean = js.native
  var viewport: SVGRect = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var y: SVGAnimatedLength = js.native
  def animationsPaused(): scala.Boolean = js.native
  def checkEnclosure(element: ISVGElement, rect: SVGRect): scala.Boolean = js.native
  def checkIntersection(element: ISVGElement, rect: SVGRect): scala.Boolean = js.native
  def createSVGAngle(): SVGAngle = js.native
  def createSVGLength(): SVGLength = js.native
  def createSVGMatrix(): SVGMatrix = js.native
  def createSVGNumber(): SVGNumber = js.native
  def createSVGPoint(): SVGPoint = js.native
  def createSVGRect(): SVGRect = js.native
  def createSVGTransform(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  def deselectAll(): scala.Unit = js.native
  def forceRedraw(): scala.Unit = js.native
  def getCurrentTime(): scala.Double = js.native
  def getElementById(elementId: java.lang.String): IHTMLElement = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def pauseAnimations(): scala.Unit = js.native
  def setCurrentTime(seconds: scala.Double): scala.Unit = js.native
  def suspendRedraw(maxWaitMilliseconds: scala.Double): scala.Double = js.native
  def unpauseAnimations(): scala.Unit = js.native
  def unsuspendRedraw(suspendHandeID: scala.Double): scala.Unit = js.native
  def unsuspendRedrawAll(): scala.Unit = js.native
}

