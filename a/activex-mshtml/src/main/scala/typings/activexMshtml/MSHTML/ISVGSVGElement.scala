package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGSVGElement extends js.Object {
  
  @JSName("MSHTML.ISVGSVGElement_typekey")
  var MSHTMLDotISVGSVGElement_typekey: ISVGSVGElement = js.native
  
  def animationsPaused(): Boolean = js.native
  
  def checkEnclosure(element: ISVGElement, rect: SVGRect): Boolean = js.native
  
  def checkIntersection(element: ISVGElement, rect: SVGRect): Boolean = js.native
  
  var contentScriptType: String = js.native
  
  var contentStyleType: String = js.native
  
  def createSVGAngle(): SVGAngle = js.native
  
  def createSVGLength(): SVGLength = js.native
  
  def createSVGMatrix(): SVGMatrix = js.native
  
  def createSVGNumber(): SVGNumber = js.native
  
  def createSVGPoint(): SVGPoint = js.native
  
  def createSVGRect(): SVGRect = js.native
  
  def createSVGTransform(): SVGTransform = js.native
  
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  
  var currentScale: Double = js.native
  
  var currentTranslate: SVGPoint = js.native
  
  var currentView: ISVGViewSpec = js.native
  
  def deselectAll(): Unit = js.native
  
  def forceRedraw(): Unit = js.native
  
  def getCurrentTime(): Double = js.native
  
  def getElementById(elementId: String): IHTMLElement = js.native
  
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any = js.native
  
  var height: SVGAnimatedLength = js.native
  
  def pauseAnimations(): Unit = js.native
  
  var pixelUnitToMillimeterX: Double = js.native
  
  var pixelUnitToMillimeterY: Double = js.native
  
  var screenPixelToMillimeterX: Double = js.native
  
  var screenPixelToMillimeterY: Double = js.native
  
  def setCurrentTime(seconds: Double): Unit = js.native
  
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  
  def unpauseAnimations(): Unit = js.native
  
  def unsuspendRedraw(suspendHandeID: Double): Unit = js.native
  
  def unsuspendRedrawAll(): Unit = js.native
  
  var useCurrentView: Boolean = js.native
  
  var viewport: SVGRect = js.native
  
  var width: SVGAnimatedLength = js.native
  
  var x: SVGAnimatedLength = js.native
  
  var y: SVGAnimatedLength = js.native
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
  
  @scala.inline
  implicit class ISVGSVGElementOps[Self <: ISVGSVGElement] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotISVGSVGElement_typekey(value: ISVGSVGElement): Self = this.set("MSHTML.ISVGSVGElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsPaused(value: () => Boolean): Self = this.set("animationsPaused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckEnclosure(value: (ISVGElement, SVGRect) => Boolean): Self = this.set("checkEnclosure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckIntersection(value: (ISVGElement, SVGRect) => Boolean): Self = this.set("checkIntersection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContentScriptType(value: String): Self = this.set("contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleType(value: String): Self = this.set("contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSVGAngle(value: () => SVGAngle): Self = this.set("createSVGAngle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGLength(value: () => SVGLength): Self = this.set("createSVGLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGMatrix(value: () => SVGMatrix): Self = this.set("createSVGMatrix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGNumber(value: () => SVGNumber): Self = this.set("createSVGNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGPoint(value: () => SVGPoint): Self = this.set("createSVGPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGRect(value: () => SVGRect): Self = this.set("createSVGRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGTransform(value: () => SVGTransform): Self = this.set("createSVGTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = this.set("createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentScale(value: Double): Self = this.set("currentScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTranslate(value: SVGPoint): Self = this.set("currentTranslate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentView(value: ISVGViewSpec): Self = this.set("currentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectAll(value: () => Unit): Self = this.set("deselectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceRedraw(value: () => Unit): Self = this.set("forceRedraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTime(value: () => Double): Self = this.set("getCurrentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementById(value: String => IHTMLElement): Self = this.set("getElementById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEnclosureList(value: (SVGRect, ISVGElement) => js.Any): Self = this.set("getEnclosureList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIntersectionList(value: (SVGRect, ISVGElement) => js.Any): Self = this.set("getIntersectionList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeight(value: SVGAnimatedLength): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseAnimations(value: () => Unit): Self = this.set("pauseAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPixelUnitToMillimeterX(value: Double): Self = this.set("pixelUnitToMillimeterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelUnitToMillimeterY(value: Double): Self = this.set("pixelUnitToMillimeterY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPixelToMillimeterX(value: Double): Self = this.set("screenPixelToMillimeterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPixelToMillimeterY(value: Double): Self = this.set("screenPixelToMillimeterY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCurrentTime(value: Double => Unit): Self = this.set("setCurrentTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspendRedraw(value: Double => Double): Self = this.set("suspendRedraw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnpauseAnimations(value: () => Unit): Self = this.set("unpauseAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsuspendRedraw(value: Double => Unit): Self = this.set("unsuspendRedraw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnsuspendRedrawAll(value: () => Unit): Self = this.set("unsuspendRedrawAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseCurrentView(value: Boolean): Self = this.set("useCurrentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: SVGRect): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SVGAnimatedLength): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLength): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLength): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
