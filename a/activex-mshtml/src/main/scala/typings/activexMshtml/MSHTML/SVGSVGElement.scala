package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGSVGElement extends StObject {
  
  @JSName("MSHTML.SVGSVGElement_typekey")
  var MSHTMLDotSVGSVGElement_typekey: SVGSVGElement
  
  def animationsPaused(): Boolean
  
  def checkEnclosure(element: ISVGElement, rect: SVGRect): Boolean
  
  def checkIntersection(element: ISVGElement, rect: SVGRect): Boolean
  
  val className: SVGAnimatedString
  
  var contentScriptType: String
  
  var contentStyleType: String
  
  def createSVGAngle(): SVGAngle
  
  def createSVGLength(): SVGLength
  
  def createSVGMatrix(): SVGMatrix
  
  def createSVGNumber(): SVGNumber
  
  def createSVGPoint(): SVGPoint
  
  def createSVGRect(): SVGRect
  
  def createSVGTransform(): SVGTransform
  
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform
  
  var currentScale: Double
  
  var currentTranslate: SVGPoint
  
  var currentView: ISVGViewSpec
  
  def deselectAll(): Unit
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  val farthestViewportElement: ISVGElement
  
  var focusable: SVGAnimatedEnumeration
  
  def forceRedraw(): Unit
  
  def getBBox(): SVGRect
  
  def getCTM(): SVGMatrix
  
  def getCurrentTime(): Double
  
  def getElementById(elementId: String): IHTMLElement
  
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): js.Any
  
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): js.Any
  
  def getScreenCTM(): SVGMatrix
  
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  
  def hasExtension(`extension`: String): Boolean
  
  var height: SVGAnimatedLength
  
  val nearestViewportElement: ISVGElement
  
  var ownerSVGElement: ISVGSVGElement
  
  def pauseAnimations(): Unit
  
  var pixelUnitToMillimeterX: Double
  
  var pixelUnitToMillimeterY: Double
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  
  val requiredExtensions: SVGStringList
  
  val requiredFeatures: SVGStringList
  
  var screenPixelToMillimeterX: Double
  
  var screenPixelToMillimeterY: Double
  
  def setCurrentTime(seconds: Double): Unit
  
  def suspendRedraw(maxWaitMilliseconds: Double): Double
  
  val systemLanguage: SVGStringList
  
  def unpauseAnimations(): Unit
  
  def unsuspendRedraw(suspendHandeID: Double): Unit
  
  def unsuspendRedrawAll(): Unit
  
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
  implicit class SVGSVGElementMutableBuilder[Self <: SVGSVGElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationsPaused(value: () => Boolean): Self = StObject.set(x, "animationsPaused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckEnclosure(value: (ISVGElement, SVGRect) => Boolean): Self = StObject.set(x, "checkEnclosure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckIntersection(value: (ISVGElement, SVGRect) => Boolean): Self = StObject.set(x, "checkIntersection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptType(value: String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleType(value: String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSVGAngle(value: () => SVGAngle): Self = StObject.set(x, "createSVGAngle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGLength(value: () => SVGLength): Self = StObject.set(x, "createSVGLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGMatrix(value: () => SVGMatrix): Self = StObject.set(x, "createSVGMatrix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGNumber(value: () => SVGNumber): Self = StObject.set(x, "createSVGNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGPoint(value: () => SVGPoint): Self = StObject.set(x, "createSVGPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGRect(value: () => SVGRect): Self = StObject.set(x, "createSVGRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGTransform(value: () => SVGTransform): Self = StObject.set(x, "createSVGTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = StObject.set(x, "createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentScale(value: Double): Self = StObject.set(x, "currentScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTranslate(value: SVGPoint): Self = StObject.set(x, "currentTranslate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentView(value: ISVGViewSpec): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectAll(value: () => Unit): Self = StObject.set(x, "deselectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarthestViewportElement(value: ISVGElement): Self = StObject.set(x, "farthestViewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRedraw(value: () => Unit): Self = StObject.set(x, "forceRedraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBBox(value: () => SVGRect): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCTM(value: () => SVGMatrix): Self = StObject.set(x, "getCTM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentTime(value: () => Double): Self = StObject.set(x, "getCurrentTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementById(value: String => IHTMLElement): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEnclosureList(value: (SVGRect, ISVGElement) => js.Any): Self = StObject.set(x, "getEnclosureList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIntersectionList(value: (SVGRect, ISVGElement) => js.Any): Self = StObject.set(x, "getIntersectionList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetScreenCTM(value: () => SVGMatrix): Self = StObject.set(x, "getScreenCTM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = StObject.set(x, "getTransformToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGSVGElement_typekey(value: SVGSVGElement): Self = StObject.set(x, "MSHTML.SVGSVGElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestViewportElement(value: ISVGElement): Self = StObject.set(x, "nearestViewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseAnimations(value: () => Unit): Self = StObject.set(x, "pauseAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPixelUnitToMillimeterX(value: Double): Self = StObject.set(x, "pixelUnitToMillimeterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelUnitToMillimeterY(value: Double): Self = StObject.set(x, "pixelUnitToMillimeterY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPixelToMillimeterX(value: Double): Self = StObject.set(x, "screenPixelToMillimeterX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPixelToMillimeterY(value: Double): Self = StObject.set(x, "screenPixelToMillimeterY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCurrentTime(value: Double => Unit): Self = StObject.set(x, "setCurrentTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspendRedraw(value: Double => Double): Self = StObject.set(x, "suspendRedraw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpauseAnimations(value: () => Unit): Self = StObject.set(x, "unpauseAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsuspendRedraw(value: Double => Unit): Self = StObject.set(x, "unsuspendRedraw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnsuspendRedrawAll(value: () => Unit): Self = StObject.set(x, "unsuspendRedrawAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseCurrentView(value: Boolean): Self = StObject.set(x, "useCurrentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: SVGRect): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndPan(value: Double): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
  }
}
