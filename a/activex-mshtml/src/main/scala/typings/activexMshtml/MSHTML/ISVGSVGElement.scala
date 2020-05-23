package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGSVGElement extends js.Object {
  @JSName("MSHTML.ISVGSVGElement_typekey")
  var MSHTMLDotISVGSVGElement_typekey: ISVGSVGElement
  var contentScriptType: String
  var contentStyleType: String
  var currentScale: Double
  var currentTranslate: SVGPoint
  var currentView: ISVGViewSpec
  var height: SVGAnimatedLength
  var pixelUnitToMillimeterX: Double
  var pixelUnitToMillimeterY: Double
  var screenPixelToMillimeterX: Double
  var screenPixelToMillimeterY: Double
  var useCurrentView: Boolean
  var viewport: SVGRect
  var width: SVGAnimatedLength
  var x: SVGAnimatedLength
  var y: SVGAnimatedLength
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
  def getCurrentTime(): Double
  def getElementById(elementId: String): IHTMLElement
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any
  def pauseAnimations(): Unit
  def setCurrentTime(seconds: Double): Unit
  def suspendRedraw(maxWaitMilliseconds: Double): Double
  def unpauseAnimations(): Unit
  def unsuspendRedraw(suspendHandeID: Double): Unit
  def unsuspendRedrawAll(): Unit
}

object ISVGSVGElement {
  @scala.inline
  def apply(
    MSHTMLDotISVGSVGElement_typekey: ISVGSVGElement,
    animationsPaused: () => Boolean,
    checkEnclosure: (ISVGElement, SVGRect) => Boolean,
    checkIntersection: (ISVGElement, SVGRect) => Boolean,
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
    forceRedraw: () => Unit,
    getCurrentTime: () => Double,
    getElementById: String => IHTMLElement,
    getEnclosureList: (SVGRect, ISVGElement) => js.Any,
    getIntersectionList: (SVGRect, ISVGElement) => js.Any,
    height: SVGAnimatedLength,
    pauseAnimations: () => Unit,
    pixelUnitToMillimeterX: Double,
    pixelUnitToMillimeterY: Double,
    screenPixelToMillimeterX: Double,
    screenPixelToMillimeterY: Double,
    setCurrentTime: Double => Unit,
    suspendRedraw: Double => Double,
    unpauseAnimations: () => Unit,
    unsuspendRedraw: Double => Unit,
    unsuspendRedrawAll: () => Unit,
    useCurrentView: Boolean,
    viewport: SVGRect,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    y: SVGAnimatedLength
  ): ISVGSVGElement = {
    val __obj = js.Dynamic.literal(animationsPaused = js.Any.fromFunction0(animationsPaused), checkEnclosure = js.Any.fromFunction2(checkEnclosure), checkIntersection = js.Any.fromFunction2(checkIntersection), contentScriptType = contentScriptType.asInstanceOf[js.Any], contentStyleType = contentStyleType.asInstanceOf[js.Any], createSVGAngle = js.Any.fromFunction0(createSVGAngle), createSVGLength = js.Any.fromFunction0(createSVGLength), createSVGMatrix = js.Any.fromFunction0(createSVGMatrix), createSVGNumber = js.Any.fromFunction0(createSVGNumber), createSVGPoint = js.Any.fromFunction0(createSVGPoint), createSVGRect = js.Any.fromFunction0(createSVGRect), createSVGTransform = js.Any.fromFunction0(createSVGTransform), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), currentScale = currentScale.asInstanceOf[js.Any], currentTranslate = currentTranslate.asInstanceOf[js.Any], currentView = currentView.asInstanceOf[js.Any], deselectAll = js.Any.fromFunction0(deselectAll), forceRedraw = js.Any.fromFunction0(forceRedraw), getCurrentTime = js.Any.fromFunction0(getCurrentTime), getElementById = js.Any.fromFunction1(getElementById), getEnclosureList = js.Any.fromFunction2(getEnclosureList), getIntersectionList = js.Any.fromFunction2(getIntersectionList), height = height.asInstanceOf[js.Any], pauseAnimations = js.Any.fromFunction0(pauseAnimations), pixelUnitToMillimeterX = pixelUnitToMillimeterX.asInstanceOf[js.Any], pixelUnitToMillimeterY = pixelUnitToMillimeterY.asInstanceOf[js.Any], screenPixelToMillimeterX = screenPixelToMillimeterX.asInstanceOf[js.Any], screenPixelToMillimeterY = screenPixelToMillimeterY.asInstanceOf[js.Any], setCurrentTime = js.Any.fromFunction1(setCurrentTime), suspendRedraw = js.Any.fromFunction1(suspendRedraw), unpauseAnimations = js.Any.fromFunction0(unpauseAnimations), unsuspendRedraw = js.Any.fromFunction1(unsuspendRedraw), unsuspendRedrawAll = js.Any.fromFunction0(unsuspendRedrawAll), useCurrentView = useCurrentView.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGSVGElement_typekey")(MSHTMLDotISVGSVGElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGSVGElement]
  }
}

