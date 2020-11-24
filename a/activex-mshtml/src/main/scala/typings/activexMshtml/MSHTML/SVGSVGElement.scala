package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGSVGElement extends js.Object {
  
  @JSName("MSHTML.SVGSVGElement_typekey")
  var MSHTMLDotSVGSVGElement_typekey: SVGSVGElement = js.native
  
  def animationsPaused(): Boolean = js.native
  
  def checkEnclosure(element: ISVGElement, rect: SVGRect): Boolean = js.native
  
  def checkIntersection(element: ISVGElement, rect: SVGRect): Boolean = js.native
  
  val className: SVGAnimatedString = js.native
  
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
  
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  
  val farthestViewportElement: ISVGElement = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
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
  
  var height: SVGAnimatedLength = js.native
  
  val nearestViewportElement: ISVGElement = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  def pauseAnimations(): Unit = js.native
  
  var pixelUnitToMillimeterX: Double = js.native
  
  var pixelUnitToMillimeterY: Double = js.native
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  
  val requiredExtensions: SVGStringList = js.native
  
  val requiredFeatures: SVGStringList = js.native
  
  var screenPixelToMillimeterX: Double = js.native
  
  var screenPixelToMillimeterY: Double = js.native
  
  def setCurrentTime(seconds: Double): Unit = js.native
  
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  
  val systemLanguage: SVGStringList = js.native
  
  def unpauseAnimations(): Unit = js.native
  
  def unsuspendRedraw(suspendHandeID: Double): Unit = js.native
  
  def unsuspendRedrawAll(): Unit = js.native
  
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
  
  @scala.inline
  implicit class SVGSVGElementOps[Self <: SVGSVGElement] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGSVGElement_typekey(value: SVGSVGElement): Self = this.set("MSHTML.SVGSVGElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsPaused(value: () => Boolean): Self = this.set("animationsPaused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckEnclosure(value: (ISVGElement, SVGRect) => Boolean): Self = this.set("checkEnclosure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckIntersection(value: (ISVGElement, SVGRect) => Boolean): Self = this.set("checkIntersection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = this.set("className", value.asInstanceOf[js.Any])
    
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
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarthestViewportElement(value: ISVGElement): Self = this.set("farthestViewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRedraw(value: () => Unit): Self = this.set("forceRedraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBBox(value: () => SVGRect): Self = this.set("getBBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCTM(value: () => SVGMatrix): Self = this.set("getCTM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTime(value: () => Double): Self = this.set("getCurrentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementById(value: String => IHTMLElement): Self = this.set("getElementById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEnclosureList(value: (SVGRect, ISVGElement) => js.Any): Self = this.set("getEnclosureList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIntersectionList(value: (SVGRect, ISVGElement) => js.Any): Self = this.set("getIntersectionList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetScreenCTM(value: () => SVGMatrix): Self = this.set("getScreenCTM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = this.set("getTransformToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = this.set("hasExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: SVGAnimatedLength): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestViewportElement(value: ISVGElement): Self = this.set("nearestViewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = this.set("ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseAnimations(value: () => Unit): Self = this.set("pauseAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPixelUnitToMillimeterX(value: Double): Self = this.set("pixelUnitToMillimeterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelUnitToMillimeterY(value: Double): Self = this.set("pixelUnitToMillimeterY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPixelToMillimeterX(value: Double): Self = this.set("screenPixelToMillimeterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPixelToMillimeterY(value: Double): Self = this.set("screenPixelToMillimeterY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCurrentTime(value: Double => Unit): Self = this.set("setCurrentTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspendRedraw(value: Double => Double): Self = this.set("suspendRedraw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpauseAnimations(value: () => Unit): Self = this.set("unpauseAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsuspendRedraw(value: Double => Unit): Self = this.set("unsuspendRedraw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnsuspendRedrawAll(value: () => Unit): Self = this.set("unsuspendRedrawAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseCurrentView(value: Boolean): Self = this.set("useCurrentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: SVGAnimatedRect): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: SVGRect): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = this.set("viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SVGAnimatedLength): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLength): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = this.set("xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmllang(value: String): Self = this.set("xmllang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlspace(value: String): Self = this.set("xmlspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLength): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndPan(value: Double): Self = this.set("zoomAndPan", value.asInstanceOf[js.Any])
  }
}
