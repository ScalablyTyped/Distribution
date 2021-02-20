package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathElement extends StObject {
  
  @JSName("MSHTML.SVGPathElement_typekey")
  var MSHTMLDotSVGPathElement_typekey: SVGPathElement = js.native
  
  var animatedNormalizedPathSegList: SVGPathSegList = js.native
  
  var animatedPathSegList: SVGPathSegList = js.native
  
  def createSVGPathSegArcAbs(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: Boolean,
    sweepFlag: Boolean
  ): ISVGPathSegArcAbs = js.native
  
  def createSVGPathSegArcRel(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: Boolean,
    sweepFlag: Boolean
  ): ISVGPathSegArcRel = js.native
  
  def createSVGPathSegClosePath(): ISVGPathSegClosePath = js.native
  
  def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicAbs = js.native
  
  def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicRel = js.native
  
  def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicSmoothAbs = js.native
  
  def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicSmoothRel = js.native
  
  def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double, y1: Double): ISVGPathSegCurvetoQuadraticAbs = js.native
  
  def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double, y1: Double): ISVGPathSegCurvetoQuadraticRel = js.native
  
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double, y: Double): ISVGPathSegCurvetoQuadraticSmoothAbs = js.native
  
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double, y: Double): ISVGPathSegCurvetoQuadraticSmoothRel = js.native
  
  def createSVGPathSegLinetoAbs(x: Double, y: Double): ISVGPathSegLinetoAbs = js.native
  
  def createSVGPathSegLinetoHorizontalAbs(x: Double): ISVGPathSegLinetoHorizontalAbs = js.native
  
  def createSVGPathSegLinetoHorizontalRel(x: Double): ISVGPathSegLinetoHorizontalRel = js.native
  
  def createSVGPathSegLinetoRel(x: Double, y: Double): ISVGPathSegLinetoRel = js.native
  
  def createSVGPathSegLinetoVerticalAbs(y: Double): ISVGPathSegLinetoVerticalAbs = js.native
  
  def createSVGPathSegLinetoVerticalRel(y: Double): ISVGPathSegLinetoVerticalRel = js.native
  
  def createSVGPathSegMovetoAbs(x: Double, y: Double): ISVGPathSegMovetoAbs = js.native
  
  def createSVGPathSegMovetoRel(x: Double, y: Double): ISVGPathSegMovetoRel = js.native
  
  val farthestViewportElement: ISVGElement = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  def getBBox(): SVGRect = js.native
  
  def getCTM(): SVGMatrix = js.native
  
  def getPathSegAtLength(fltdistance: Double): Double = js.native
  
  def getPointAtLength(fltdistance: Double): SVGPoint = js.native
  
  def getScreenCTM(): SVGMatrix = js.native
  
  def getTotalLength(): Double = js.native
  
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  
  def hasExtension(extension: String): Boolean = js.native
  
  val nearestViewportElement: ISVGElement = js.native
  
  var normalizedPathSegList: SVGPathSegList = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var pathLength: SVGAnimatedNumber = js.native
  
  var pathSegList: SVGPathSegList = js.native
  
  val requiredExtensions: SVGStringList = js.native
  
  val requiredFeatures: SVGStringList = js.native
  
  val systemLanguage: SVGStringList = js.native
  
  val transform: SVGAnimatedTransformList = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
}
object SVGPathElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathElement_typekey: SVGPathElement,
    animatedNormalizedPathSegList: SVGPathSegList,
    animatedPathSegList: SVGPathSegList,
    createSVGPathSegArcAbs: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcAbs,
    createSVGPathSegArcRel: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcRel,
    createSVGPathSegClosePath: () => ISVGPathSegClosePath,
    createSVGPathSegCurvetoCubicAbs: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicAbs,
    createSVGPathSegCurvetoCubicRel: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicRel,
    createSVGPathSegCurvetoCubicSmoothAbs: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothAbs,
    createSVGPathSegCurvetoCubicSmoothRel: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothRel,
    createSVGPathSegCurvetoQuadraticAbs: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticAbs,
    createSVGPathSegCurvetoQuadraticRel: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticRel,
    createSVGPathSegCurvetoQuadraticSmoothAbs: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothAbs,
    createSVGPathSegCurvetoQuadraticSmoothRel: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothRel,
    createSVGPathSegLinetoAbs: (Double, Double) => ISVGPathSegLinetoAbs,
    createSVGPathSegLinetoHorizontalAbs: Double => ISVGPathSegLinetoHorizontalAbs,
    createSVGPathSegLinetoHorizontalRel: Double => ISVGPathSegLinetoHorizontalRel,
    createSVGPathSegLinetoRel: (Double, Double) => ISVGPathSegLinetoRel,
    createSVGPathSegLinetoVerticalAbs: Double => ISVGPathSegLinetoVerticalAbs,
    createSVGPathSegLinetoVerticalRel: Double => ISVGPathSegLinetoVerticalRel,
    createSVGPathSegMovetoAbs: (Double, Double) => ISVGPathSegMovetoAbs,
    createSVGPathSegMovetoRel: (Double, Double) => ISVGPathSegMovetoRel,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getPathSegAtLength: Double => Double,
    getPointAtLength: Double => SVGPoint,
    getScreenCTM: () => SVGMatrix,
    getTotalLength: () => Double,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    nearestViewportElement: ISVGElement,
    normalizedPathSegList: SVGPathSegList,
    ownerSVGElement: ISVGSVGElement,
    pathLength: SVGAnimatedNumber,
    pathSegList: SVGPathSegList,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGPathElement = {
    val __obj = js.Dynamic.literal(animatedNormalizedPathSegList = animatedNormalizedPathSegList.asInstanceOf[js.Any], animatedPathSegList = animatedPathSegList.asInstanceOf[js.Any], createSVGPathSegArcAbs = js.Any.fromFunction7(createSVGPathSegArcAbs), createSVGPathSegArcRel = js.Any.fromFunction7(createSVGPathSegArcRel), createSVGPathSegClosePath = js.Any.fromFunction0(createSVGPathSegClosePath), createSVGPathSegCurvetoCubicAbs = js.Any.fromFunction6(createSVGPathSegCurvetoCubicAbs), createSVGPathSegCurvetoCubicRel = js.Any.fromFunction6(createSVGPathSegCurvetoCubicRel), createSVGPathSegCurvetoCubicSmoothAbs = js.Any.fromFunction4(createSVGPathSegCurvetoCubicSmoothAbs), createSVGPathSegCurvetoCubicSmoothRel = js.Any.fromFunction4(createSVGPathSegCurvetoCubicSmoothRel), createSVGPathSegCurvetoQuadraticAbs = js.Any.fromFunction4(createSVGPathSegCurvetoQuadraticAbs), createSVGPathSegCurvetoQuadraticRel = js.Any.fromFunction4(createSVGPathSegCurvetoQuadraticRel), createSVGPathSegCurvetoQuadraticSmoothAbs = js.Any.fromFunction2(createSVGPathSegCurvetoQuadraticSmoothAbs), createSVGPathSegCurvetoQuadraticSmoothRel = js.Any.fromFunction2(createSVGPathSegCurvetoQuadraticSmoothRel), createSVGPathSegLinetoAbs = js.Any.fromFunction2(createSVGPathSegLinetoAbs), createSVGPathSegLinetoHorizontalAbs = js.Any.fromFunction1(createSVGPathSegLinetoHorizontalAbs), createSVGPathSegLinetoHorizontalRel = js.Any.fromFunction1(createSVGPathSegLinetoHorizontalRel), createSVGPathSegLinetoRel = js.Any.fromFunction2(createSVGPathSegLinetoRel), createSVGPathSegLinetoVerticalAbs = js.Any.fromFunction1(createSVGPathSegLinetoVerticalAbs), createSVGPathSegLinetoVerticalRel = js.Any.fromFunction1(createSVGPathSegLinetoVerticalRel), createSVGPathSegMovetoAbs = js.Any.fromFunction2(createSVGPathSegMovetoAbs), createSVGPathSegMovetoRel = js.Any.fromFunction2(createSVGPathSegMovetoRel), farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getPathSegAtLength = js.Any.fromFunction1(getPathSegAtLength), getPointAtLength = js.Any.fromFunction1(getPointAtLength), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTotalLength = js.Any.fromFunction0(getTotalLength), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], normalizedPathSegList = normalizedPathSegList.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any], pathSegList = pathSegList.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathElement_typekey")(MSHTMLDotSVGPathElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathElement]
  }
  
  @scala.inline
  implicit class SVGPathElementMutableBuilder[Self <: SVGPathElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimatedNormalizedPathSegList(value: SVGPathSegList): Self = StObject.set(x, "animatedNormalizedPathSegList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedPathSegList(value: SVGPathSegList): Self = StObject.set(x, "animatedPathSegList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSVGPathSegArcAbs(value: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcAbs): Self = StObject.set(x, "createSVGPathSegArcAbs", js.Any.fromFunction7(value))
    
    @scala.inline
    def setCreateSVGPathSegArcRel(value: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcRel): Self = StObject.set(x, "createSVGPathSegArcRel", js.Any.fromFunction7(value))
    
    @scala.inline
    def setCreateSVGPathSegClosePath(value: () => ISVGPathSegClosePath): Self = StObject.set(x, "createSVGPathSegClosePath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGPathSegCurvetoCubicAbs(value: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicAbs): Self = StObject.set(x, "createSVGPathSegCurvetoCubicAbs", js.Any.fromFunction6(value))
    
    @scala.inline
    def setCreateSVGPathSegCurvetoCubicRel(value: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicRel): Self = StObject.set(x, "createSVGPathSegCurvetoCubicRel", js.Any.fromFunction6(value))
    
    @scala.inline
    def setCreateSVGPathSegCurvetoCubicSmoothAbs(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothAbs): Self = StObject.set(x, "createSVGPathSegCurvetoCubicSmoothAbs", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateSVGPathSegCurvetoCubicSmoothRel(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothRel): Self = StObject.set(x, "createSVGPathSegCurvetoCubicSmoothRel", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateSVGPathSegCurvetoQuadraticAbs(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticAbs): Self = StObject.set(x, "createSVGPathSegCurvetoQuadraticAbs", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateSVGPathSegCurvetoQuadraticRel(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticRel): Self = StObject.set(x, "createSVGPathSegCurvetoQuadraticRel", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateSVGPathSegCurvetoQuadraticSmoothAbs(value: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothAbs): Self = StObject.set(x, "createSVGPathSegCurvetoQuadraticSmoothAbs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateSVGPathSegCurvetoQuadraticSmoothRel(value: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothRel): Self = StObject.set(x, "createSVGPathSegCurvetoQuadraticSmoothRel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateSVGPathSegLinetoAbs(value: (Double, Double) => ISVGPathSegLinetoAbs): Self = StObject.set(x, "createSVGPathSegLinetoAbs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateSVGPathSegLinetoHorizontalAbs(value: Double => ISVGPathSegLinetoHorizontalAbs): Self = StObject.set(x, "createSVGPathSegLinetoHorizontalAbs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSVGPathSegLinetoHorizontalRel(value: Double => ISVGPathSegLinetoHorizontalRel): Self = StObject.set(x, "createSVGPathSegLinetoHorizontalRel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSVGPathSegLinetoRel(value: (Double, Double) => ISVGPathSegLinetoRel): Self = StObject.set(x, "createSVGPathSegLinetoRel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateSVGPathSegLinetoVerticalAbs(value: Double => ISVGPathSegLinetoVerticalAbs): Self = StObject.set(x, "createSVGPathSegLinetoVerticalAbs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSVGPathSegLinetoVerticalRel(value: Double => ISVGPathSegLinetoVerticalRel): Self = StObject.set(x, "createSVGPathSegLinetoVerticalRel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSVGPathSegMovetoAbs(value: (Double, Double) => ISVGPathSegMovetoAbs): Self = StObject.set(x, "createSVGPathSegMovetoAbs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateSVGPathSegMovetoRel(value: (Double, Double) => ISVGPathSegMovetoRel): Self = StObject.set(x, "createSVGPathSegMovetoRel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFarthestViewportElement(value: ISVGElement): Self = StObject.set(x, "farthestViewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBBox(value: () => SVGRect): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCTM(value: () => SVGMatrix): Self = StObject.set(x, "getCTM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPathSegAtLength(value: Double => Double): Self = StObject.set(x, "getPathSegAtLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPointAtLength(value: Double => SVGPoint): Self = StObject.set(x, "getPointAtLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScreenCTM(value: () => SVGMatrix): Self = StObject.set(x, "getScreenCTM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalLength(value: () => Double): Self = StObject.set(x, "getTotalLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = StObject.set(x, "getTransformToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMSHTMLDotSVGPathElement_typekey(value: SVGPathElement): Self = StObject.set(x, "MSHTML.SVGPathElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestViewportElement(value: ISVGElement): Self = StObject.set(x, "nearestViewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedPathSegList(value: SVGPathSegList): Self = StObject.set(x, "normalizedPathSegList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathLength(value: SVGAnimatedNumber): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegList(value: SVGPathSegList): Self = StObject.set(x, "pathSegList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
