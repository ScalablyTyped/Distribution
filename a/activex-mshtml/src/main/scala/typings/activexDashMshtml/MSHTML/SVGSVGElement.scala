package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGSVGElement")
@js.native
class SVGSVGElement protected () extends js.Object {
  @JSName("MSHTML.SVGSVGElement_typekey")
  var MSHTMLDotSVGSVGElement_typekey: SVGSVGElement = js.native
  val className: SVGAnimatedString = js.native
  var contentScriptType: String = js.native
  var contentStyleType: String = js.native
  var currentScale: Double = js.native
  var currentTranslate: SVGPoint = js.native
  var currentView: ISVGViewSpec = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var height: SVGAnimatedLength = js.native
  val nearestViewportElement: ISVGElement = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var pixelUnitToMillimeterX: Double = js.native
  var pixelUnitToMillimeterY: Double = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  var screenPixelToMillimeterX: Double = js.native
  var screenPixelToMillimeterY: Double = js.native
  val systemLanguage: SVGStringList = js.native
  var useCurrentView: Boolean = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewport: SVGRect = js.native
  var viewportElement: ISVGElement = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
  var y: SVGAnimatedLength = js.native
  val zoomAndPan: Double = js.native
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
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getCurrentTime(): Double = js.native
  def getElementById(elementId: String): IHTMLElement = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: String): Boolean = js.native
  def pauseAnimations(): Unit = js.native
  def setCurrentTime(seconds: Double): Unit = js.native
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  def unpauseAnimations(): Unit = js.native
  def unsuspendRedraw(suspendHandeID: Double): Unit = js.native
  def unsuspendRedrawAll(): Unit = js.native
}

