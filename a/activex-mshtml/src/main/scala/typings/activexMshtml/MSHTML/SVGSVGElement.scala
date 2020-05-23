package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGSVGElement extends js.Object {
  @JSName("MSHTML.SVGSVGElement_typekey")
  var MSHTMLDotSVGSVGElement_typekey: SVGSVGElement
  val className: SVGAnimatedString
  var contentScriptType: String
  var contentStyleType: String
  var currentScale: Double
  var currentTranslate: SVGPoint
  var currentView: ISVGViewSpec
  val externalResourcesRequired: SVGAnimatedBoolean
  val farthestViewportElement: ISVGElement
  var focusable: SVGAnimatedEnumeration
  var height: SVGAnimatedLength
  val nearestViewportElement: ISVGElement
  var ownerSVGElement: ISVGSVGElement
  var pixelUnitToMillimeterX: Double
  var pixelUnitToMillimeterY: Double
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  var screenPixelToMillimeterX: Double
  var screenPixelToMillimeterY: Double
  val systemLanguage: SVGStringList
  var useCurrentView: Boolean
  val viewBox: SVGAnimatedRect
  var viewport: SVGRect
  var viewportElement: ISVGElement
  var width: SVGAnimatedLength
  var x: SVGAnimatedLength
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  var y: SVGAnimatedLength
  val zoomAndPan: Double
  def animationsPaused(): Boolean
  def checkEnclosure(element: ISVGElement, rect: SVGRect): Boolean
  def checkIntersection(element: ISVGElement, rect: SVGRect): Boolean
  def createSVGAngle(): SVGAngle
  def createSVGLength(): SVGLength
  def createSVGMatrix(): SVGMatrix
  def createSVGNumber(): SVGNumber
  def createSVGPoint(): SVGPoint
  def createSVGRect(): SVGRect
  def createSVGTransform(): SVGTransform
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform
  def deselectAll(): Unit
  def forceRedraw(): Unit
  def getBBox(): SVGRect
  def getCTM(): SVGMatrix
  def getCurrentTime(): Double
  def getElementById(elementId: String): IHTMLElement
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any
  def getScreenCTM(): SVGMatrix
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  def hasExtension(extension: String): Boolean
  def pauseAnimations(): Unit
  def setCurrentTime(seconds: Double): Unit
  def suspendRedraw(maxWaitMilliseconds: Double): Double
  def unpauseAnimations(): Unit
  def unsuspendRedraw(suspendHandeID: Double): Unit
  def unsuspendRedrawAll(): Unit
}

object SVGSVGElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGSVGElement_typekey: SVGSVGElement,
    animationsPaused: () => Boolean,
    checkEnclosure: (ISVGElement, SVGRect) => Boolean,
    checkIntersection: (ISVGElement, SVGRect) => Boolean,
    className: SVGAnimatedString,
    contentScriptType: String,
    contentStyleType: String,
    createSVGAngle: () => SVGAngle,
    createSVGLength: () => SVGLength,
    createSVGMatrix: () => SVGMatrix,
    createSVGNumber: () => SVGNumber,
    createSVGPoint: () => SVGPoint,
    createSVGRect: () => SVGRect,
    createSVGTransform: () => SVGTransform,
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    currentScale: Double,
    currentTranslate: SVGPoint,
    currentView: ISVGViewSpec,
    deselectAll: () => Unit,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    forceRedraw: () => Unit,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getCurrentTime: () => Double,
    getElementById: String => IHTMLElement,
    getEnclosureList: (SVGRect, ISVGElement) => js.Any,
    getIntersectionList: (SVGRect, ISVGElement) => js.Any,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    pauseAnimations: () => Unit,
    pixelUnitToMillimeterX: Double,
    pixelUnitToMillimeterY: Double,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    screenPixelToMillimeterX: Double,
    screenPixelToMillimeterY: Double,
    setCurrentTime: Double => Unit,
    suspendRedraw: Double => Double,
    systemLanguage: SVGStringList,
    unpauseAnimations: () => Unit,
    unsuspendRedraw: Double => Unit,
    unsuspendRedrawAll: () => Unit,
    useCurrentView: Boolean,
    viewBox: SVGAnimatedRect,
    viewport: SVGRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength,
    zoomAndPan: Double
  ): SVGSVGElement = {
    val __obj = js.Dynamic.literal(animationsPaused = js.Any.fromFunction0(animationsPaused), checkEnclosure = js.Any.fromFunction2(checkEnclosure), checkIntersection = js.Any.fromFunction2(checkIntersection), className = className.asInstanceOf[js.Any], contentScriptType = contentScriptType.asInstanceOf[js.Any], contentStyleType = contentStyleType.asInstanceOf[js.Any], createSVGAngle = js.Any.fromFunction0(createSVGAngle), createSVGLength = js.Any.fromFunction0(createSVGLength), createSVGMatrix = js.Any.fromFunction0(createSVGMatrix), createSVGNumber = js.Any.fromFunction0(createSVGNumber), createSVGPoint = js.Any.fromFunction0(createSVGPoint), createSVGRect = js.Any.fromFunction0(createSVGRect), createSVGTransform = js.Any.fromFunction0(createSVGTransform), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), currentScale = currentScale.asInstanceOf[js.Any], currentTranslate = currentTranslate.asInstanceOf[js.Any], currentView = currentView.asInstanceOf[js.Any], deselectAll = js.Any.fromFunction0(deselectAll), externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], forceRedraw = js.Any.fromFunction0(forceRedraw), getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getCurrentTime = js.Any.fromFunction0(getCurrentTime), getElementById = js.Any.fromFunction1(getElementById), getEnclosureList = js.Any.fromFunction2(getEnclosureList), getIntersectionList = js.Any.fromFunction2(getIntersectionList), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], pauseAnimations = js.Any.fromFunction0(pauseAnimations), pixelUnitToMillimeterX = pixelUnitToMillimeterX.asInstanceOf[js.Any], pixelUnitToMillimeterY = pixelUnitToMillimeterY.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], screenPixelToMillimeterX = screenPixelToMillimeterX.asInstanceOf[js.Any], screenPixelToMillimeterY = screenPixelToMillimeterY.asInstanceOf[js.Any], setCurrentTime = js.Any.fromFunction1(setCurrentTime), suspendRedraw = js.Any.fromFunction1(suspendRedraw), systemLanguage = systemLanguage.asInstanceOf[js.Any], unpauseAnimations = js.Any.fromFunction0(unpauseAnimations), unsuspendRedraw = js.Any.fromFunction1(unsuspendRedraw), unsuspendRedrawAll = js.Any.fromFunction0(unsuspendRedrawAll), useCurrentView = useCurrentView.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGSVGElement_typekey")(MSHTMLDotSVGSVGElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGSVGElement]
  }
}

