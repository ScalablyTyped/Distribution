package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathElement extends js.Object {
  @JSName("MSHTML.SVGPathElement_typekey")
  var MSHTMLDotSVGPathElement_typekey: SVGPathElement
  var animatedNormalizedPathSegList: SVGPathSegList
  var animatedPathSegList: SVGPathSegList
  val farthestViewportElement: ISVGElement
  var focusable: SVGAnimatedEnumeration
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
  def getBBox(): SVGRect
  def getCTM(): SVGMatrix
  def getPathSegAtLength(fltdistance: Double): Double
  def getPointAtLength(fltdistance: Double): SVGPoint
  def getScreenCTM(): SVGMatrix
  def getTotalLength(): Double
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  def hasExtension(extension: String): Boolean
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
}

