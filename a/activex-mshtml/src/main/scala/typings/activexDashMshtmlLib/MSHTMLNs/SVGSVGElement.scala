package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGSVGElement")
@js.native
class SVGSVGElement protected () extends js.Object {
  var `MSHTML.SVGSVGElement_typekey`: SVGSVGElement = js.native
  val className: SVGAnimatedString = js.native
  var contentScriptType: java.lang.String = js.native
  var contentStyleType: java.lang.String = js.native
  var currentScale: scala.Double = js.native
  var currentTranslate: SVGPoint = js.native
  var currentView: ISVGViewSpec = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var height: SVGAnimatedLength = js.native
  val nearestViewportElement: ISVGElement = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var pixelUnitToMillimeterX: scala.Double = js.native
  var pixelUnitToMillimeterY: scala.Double = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  var screenPixelToMillimeterX: scala.Double = js.native
  var screenPixelToMillimeterY: scala.Double = js.native
  val systemLanguage: SVGStringList = js.native
  var useCurrentView: scala.Boolean = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewport: SVGRect = js.native
  var viewportElement: ISVGElement = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var xmlbase: java.lang.String = js.native
  var xmllang: java.lang.String = js.native
  var xmlspace: java.lang.String = js.native
  var y: SVGAnimatedLength = js.native
  val zoomAndPan: scala.Double = js.native
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
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getCurrentTime(): scala.Double = js.native
  def getElementById(elementId: java.lang.String): IHTMLElement = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: java.lang.String): scala.Boolean = js.native
  def pauseAnimations(): scala.Unit = js.native
  def setCurrentTime(seconds: scala.Double): scala.Unit = js.native
  def suspendRedraw(maxWaitMilliseconds: scala.Double): scala.Double = js.native
  def unpauseAnimations(): scala.Unit = js.native
  def unsuspendRedraw(suspendHandeID: scala.Double): scala.Unit = js.native
  def unsuspendRedrawAll(): scala.Unit = js.native
}

