package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGPathElement")
@js.native
class SVGPathElement protected () extends js.Object {
  @JSName("MSHTML.SVGPathElement_typekey")
  var MSHTMLDotSVGPathElement_typekey: SVGPathElement = js.native
  var animatedNormalizedPathSegList: SVGPathSegList = js.native
  var animatedPathSegList: SVGPathSegList = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
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
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getPathSegAtLength(fltdistance: Double): Double = js.native
  def getPointAtLength(fltdistance: Double): SVGPoint = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTotalLength(): Double = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: String): Boolean = js.native
}

