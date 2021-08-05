package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathElement_typekey")
  var MSHTMLDotSVGPathElement_typekey: SVGPathElement
  
  var animatedNormalizedPathSegList: SVGPathSegList
  
  var animatedPathSegList: SVGPathSegList
  
  def createSVGPathSegArcAbs(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: Boolean,
    sweepFlag: Boolean
  ): ISVGPathSegArcAbs
  
  def createSVGPathSegArcRel(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: Boolean,
    sweepFlag: Boolean
  ): ISVGPathSegArcRel
  
  def createSVGPathSegClosePath(): ISVGPathSegClosePath
  
  def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicAbs
  
  def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicRel
  
  def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicSmoothAbs
  
  def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double, y2: Double): ISVGPathSegCurvetoCubicSmoothRel
  
  def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double, y1: Double): ISVGPathSegCurvetoQuadraticAbs
  
  def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double, y1: Double): ISVGPathSegCurvetoQuadraticRel
  
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double, y: Double): ISVGPathSegCurvetoQuadraticSmoothAbs
  
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double, y: Double): ISVGPathSegCurvetoQuadraticSmoothRel
  
  def createSVGPathSegLinetoAbs(x: Double, y: Double): ISVGPathSegLinetoAbs
  
  def createSVGPathSegLinetoHorizontalAbs(x: Double): ISVGPathSegLinetoHorizontalAbs
  
  def createSVGPathSegLinetoHorizontalRel(x: Double): ISVGPathSegLinetoHorizontalRel
  
  def createSVGPathSegLinetoRel(x: Double, y: Double): ISVGPathSegLinetoRel
  
  def createSVGPathSegLinetoVerticalAbs(y: Double): ISVGPathSegLinetoVerticalAbs
  
  def createSVGPathSegLinetoVerticalRel(y: Double): ISVGPathSegLinetoVerticalRel
  
  def createSVGPathSegMovetoAbs(x: Double, y: Double): ISVGPathSegMovetoAbs
  
  def createSVGPathSegMovetoRel(x: Double, y: Double): ISVGPathSegMovetoRel
  
  val farthestViewportElement: ISVGElement
  
  var focusable: SVGAnimatedEnumeration
  
  def getBBox(): SVGRect
  
  def getCTM(): SVGMatrix
  
  def getPathSegAtLength(fltdistance: Double): Double
  
  def getPointAtLength(fltdistance: Double): SVGPoint
  
  def getScreenCTM(): SVGMatrix
  
  def getTotalLength(): Double
  
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  
  def hasExtension(`extension`: String): Boolean
  
  val nearestViewportElement: ISVGElement
  
  var normalizedPathSegList: SVGPathSegList
  
  var ownerSVGElement: ISVGSVGElement
  
  var pathLength: SVGAnimatedNumber
  
  var pathSegList: SVGPathSegList
  
  val requiredExtensions: SVGStringList
  
  val requiredFeatures: SVGStringList
  
  val systemLanguage: SVGStringList
  
  val transform: SVGAnimatedTransformList
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
}
object SVGPathElement {
  
  inline def apply(
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
  
  extension [Self <: SVGPathElement](x: Self) {
    
    inline def setAnimatedNormalizedPathSegList(value: SVGPathSegList): Self = StObject.set(x, "animatedNormalizedPathSegList", value.asInstanceOf[js.Any])
    
    inline def setAnimatedPathSegList(value: SVGPathSegList): Self = StObject.set(x, "animatedPathSegList", value.asInstanceOf[js.Any])
    
    inline def setCreateSVGPathSegArcAbs(value: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcAbs): Self = StObject.set(x, "createSVGPathSegArcAbs", js.Any.fromFunction7(value))
    
    inline def setCreateSVGPathSegArcRel(value: (Double, Double, Double, Double, Double, Boolean, Boolean) => ISVGPathSegArcRel): Self = StObject.set(x, "createSVGPathSegArcRel", js.Any.fromFunction7(value))
    
    inline def setCreateSVGPathSegClosePath(value: () => ISVGPathSegClosePath): Self = StObject.set(x, "createSVGPathSegClosePath", js.Any.fromFunction0(value))
    
    inline def setCreateSVGPathSegCurvetoCubicAbs(value: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicAbs): Self = StObject.set(x, "createSVGPathSegCurvetoCubicAbs", js.Any.fromFunction6(value))
    
    inline def setCreateSVGPathSegCurvetoCubicRel(value: (Double, Double, Double, Double, Double, Double) => ISVGPathSegCurvetoCubicRel): Self = StObject.set(x, "createSVGPathSegCurvetoCubicRel", js.Any.fromFunction6(value))
    
    inline def setCreateSVGPathSegCurvetoCubicSmoothAbs(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothAbs): Self = StObject.set(x, "createSVGPathSegCurvetoCubicSmoothAbs", js.Any.fromFunction4(value))
    
    inline def setCreateSVGPathSegCurvetoCubicSmoothRel(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoCubicSmoothRel): Self = StObject.set(x, "createSVGPathSegCurvetoCubicSmoothRel", js.Any.fromFunction4(value))
    
    inline def setCreateSVGPathSegCurvetoQuadraticAbs(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticAbs): Self = StObject.set(x, "createSVGPathSegCurvetoQuadraticAbs", js.Any.fromFunction4(value))
    
    inline def setCreateSVGPathSegCurvetoQuadraticRel(value: (Double, Double, Double, Double) => ISVGPathSegCurvetoQuadraticRel): Self = StObject.set(x, "createSVGPathSegCurvetoQuadraticRel", js.Any.fromFunction4(value))
    
    inline def setCreateSVGPathSegCurvetoQuadraticSmoothAbs(value: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothAbs): Self = StObject.set(x, "createSVGPathSegCurvetoQuadraticSmoothAbs", js.Any.fromFunction2(value))
    
    inline def setCreateSVGPathSegCurvetoQuadraticSmoothRel(value: (Double, Double) => ISVGPathSegCurvetoQuadraticSmoothRel): Self = StObject.set(x, "createSVGPathSegCurvetoQuadraticSmoothRel", js.Any.fromFunction2(value))
    
    inline def setCreateSVGPathSegLinetoAbs(value: (Double, Double) => ISVGPathSegLinetoAbs): Self = StObject.set(x, "createSVGPathSegLinetoAbs", js.Any.fromFunction2(value))
    
    inline def setCreateSVGPathSegLinetoHorizontalAbs(value: Double => ISVGPathSegLinetoHorizontalAbs): Self = StObject.set(x, "createSVGPathSegLinetoHorizontalAbs", js.Any.fromFunction1(value))
    
    inline def setCreateSVGPathSegLinetoHorizontalRel(value: Double => ISVGPathSegLinetoHorizontalRel): Self = StObject.set(x, "createSVGPathSegLinetoHorizontalRel", js.Any.fromFunction1(value))
    
    inline def setCreateSVGPathSegLinetoRel(value: (Double, Double) => ISVGPathSegLinetoRel): Self = StObject.set(x, "createSVGPathSegLinetoRel", js.Any.fromFunction2(value))
    
    inline def setCreateSVGPathSegLinetoVerticalAbs(value: Double => ISVGPathSegLinetoVerticalAbs): Self = StObject.set(x, "createSVGPathSegLinetoVerticalAbs", js.Any.fromFunction1(value))
    
    inline def setCreateSVGPathSegLinetoVerticalRel(value: Double => ISVGPathSegLinetoVerticalRel): Self = StObject.set(x, "createSVGPathSegLinetoVerticalRel", js.Any.fromFunction1(value))
    
    inline def setCreateSVGPathSegMovetoAbs(value: (Double, Double) => ISVGPathSegMovetoAbs): Self = StObject.set(x, "createSVGPathSegMovetoAbs", js.Any.fromFunction2(value))
    
    inline def setCreateSVGPathSegMovetoRel(value: (Double, Double) => ISVGPathSegMovetoRel): Self = StObject.set(x, "createSVGPathSegMovetoRel", js.Any.fromFunction2(value))
    
    inline def setFarthestViewportElement(value: ISVGElement): Self = StObject.set(x, "farthestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setGetBBox(value: () => SVGRect): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
    
    inline def setGetCTM(value: () => SVGMatrix): Self = StObject.set(x, "getCTM", js.Any.fromFunction0(value))
    
    inline def setGetPathSegAtLength(value: Double => Double): Self = StObject.set(x, "getPathSegAtLength", js.Any.fromFunction1(value))
    
    inline def setGetPointAtLength(value: Double => SVGPoint): Self = StObject.set(x, "getPointAtLength", js.Any.fromFunction1(value))
    
    inline def setGetScreenCTM(value: () => SVGMatrix): Self = StObject.set(x, "getScreenCTM", js.Any.fromFunction0(value))
    
    inline def setGetTotalLength(value: () => Double): Self = StObject.set(x, "getTotalLength", js.Any.fromFunction0(value))
    
    inline def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = StObject.set(x, "getTransformToElement", js.Any.fromFunction1(value))
    
    inline def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotSVGPathElement_typekey(value: SVGPathElement): Self = StObject.set(x, "MSHTML.SVGPathElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setNearestViewportElement(value: ISVGElement): Self = StObject.set(x, "nearestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setNormalizedPathSegList(value: SVGPathSegList): Self = StObject.set(x, "normalizedPathSegList", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setPathLength(value: SVGAnimatedNumber): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    inline def setPathSegList(value: SVGPathSegList): Self = StObject.set(x, "pathSegList", value.asInstanceOf[js.Any])
    
    inline def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
