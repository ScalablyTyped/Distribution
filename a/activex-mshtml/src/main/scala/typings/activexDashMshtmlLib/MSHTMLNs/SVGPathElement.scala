package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGPathElement")
@js.native
class SVGPathElement protected () extends js.Object {
  var `MSHTML.SVGPathElement_typekey`: SVGPathElement = js.native
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
  var xmlbase: java.lang.String = js.native
  def createSVGPathSegArcAbs(
    x: scala.Double,
    y: scala.Double,
    r1: scala.Double,
    r2: scala.Double,
    angle: scala.Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): ISVGPathSegArcAbs = js.native
  def createSVGPathSegArcRel(
    x: scala.Double,
    y: scala.Double,
    r1: scala.Double,
    r2: scala.Double,
    angle: scala.Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): ISVGPathSegArcRel = js.native
  def createSVGPathSegClosePath(): ISVGPathSegClosePath = js.native
  def createSVGPathSegCurvetoCubicAbs(
    x: scala.Double,
    y: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): ISVGPathSegCurvetoCubicAbs = js.native
  def createSVGPathSegCurvetoCubicRel(
    x: scala.Double,
    y: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): ISVGPathSegCurvetoCubicRel = js.native
  def createSVGPathSegCurvetoCubicSmoothAbs(x: scala.Double, y: scala.Double, x2: scala.Double, y2: scala.Double): ISVGPathSegCurvetoCubicSmoothAbs = js.native
  def createSVGPathSegCurvetoCubicSmoothRel(x: scala.Double, y: scala.Double, x2: scala.Double, y2: scala.Double): ISVGPathSegCurvetoCubicSmoothRel = js.native
  def createSVGPathSegCurvetoQuadraticAbs(x: scala.Double, y: scala.Double, x1: scala.Double, y1: scala.Double): ISVGPathSegCurvetoQuadraticAbs = js.native
  def createSVGPathSegCurvetoQuadraticRel(x: scala.Double, y: scala.Double, x1: scala.Double, y1: scala.Double): ISVGPathSegCurvetoQuadraticRel = js.native
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: scala.Double, y: scala.Double): ISVGPathSegCurvetoQuadraticSmoothAbs = js.native
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: scala.Double, y: scala.Double): ISVGPathSegCurvetoQuadraticSmoothRel = js.native
  def createSVGPathSegLinetoAbs(x: scala.Double, y: scala.Double): ISVGPathSegLinetoAbs = js.native
  def createSVGPathSegLinetoHorizontalAbs(x: scala.Double): ISVGPathSegLinetoHorizontalAbs = js.native
  def createSVGPathSegLinetoHorizontalRel(x: scala.Double): ISVGPathSegLinetoHorizontalRel = js.native
  def createSVGPathSegLinetoRel(x: scala.Double, y: scala.Double): ISVGPathSegLinetoRel = js.native
  def createSVGPathSegLinetoVerticalAbs(y: scala.Double): ISVGPathSegLinetoVerticalAbs = js.native
  def createSVGPathSegLinetoVerticalRel(y: scala.Double): ISVGPathSegLinetoVerticalRel = js.native
  def createSVGPathSegMovetoAbs(x: scala.Double, y: scala.Double): ISVGPathSegMovetoAbs = js.native
  def createSVGPathSegMovetoRel(x: scala.Double, y: scala.Double): ISVGPathSegMovetoRel = js.native
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getPathSegAtLength(fltdistance: scala.Double): scala.Double = js.native
  def getPointAtLength(fltdistance: scala.Double): SVGPoint = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTotalLength(): scala.Double = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: java.lang.String): scala.Boolean = js.native
}

