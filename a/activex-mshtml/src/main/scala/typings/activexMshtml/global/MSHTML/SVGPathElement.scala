package typings.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.SVGPathElement")
@js.native
class SVGPathElement protected ()
  extends StObject
     with typings.activexMshtml.MSHTML.SVGPathElement {
  
  /* CompleteClass */
  @JSName("MSHTML.SVGPathElement_typekey")
  var MSHTMLDotSVGPathElement_typekey: typings.activexMshtml.MSHTML.SVGPathElement = js.native
  
  /* CompleteClass */
  var animatedNormalizedPathSegList: typings.activexMshtml.MSHTML.SVGPathSegList = js.native
  
  /* CompleteClass */
  var animatedPathSegList: typings.activexMshtml.MSHTML.SVGPathSegList = js.native
  
  /* CompleteClass */
  override def createSVGPathSegArcAbs(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: Boolean,
    sweepFlag: Boolean
  ): typings.activexMshtml.MSHTML.ISVGPathSegArcAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegArcRel(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: Boolean,
    sweepFlag: Boolean
  ): typings.activexMshtml.MSHTML.ISVGPathSegArcRel = js.native
  
  /* CompleteClass */
  override def createSVGPathSegClosePath(): typings.activexMshtml.MSHTML.ISVGPathSegClosePath = js.native
  
  /* CompleteClass */
  override def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): typings.activexMshtml.MSHTML.ISVGPathSegCurvetoCubicAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): typings.activexMshtml.MSHTML.ISVGPathSegCurvetoCubicRel = js.native
  
  /* CompleteClass */
  override def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double, y2: Double): typings.activexMshtml.MSHTML.ISVGPathSegCurvetoCubicSmoothAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double, y2: Double): typings.activexMshtml.MSHTML.ISVGPathSegCurvetoCubicSmoothRel = js.native
  
  /* CompleteClass */
  override def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double, y1: Double): typings.activexMshtml.MSHTML.ISVGPathSegCurvetoQuadraticAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double, y1: Double): typings.activexMshtml.MSHTML.ISVGPathSegCurvetoQuadraticRel = js.native
  
  /* CompleteClass */
  override def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double, y: Double): typings.activexMshtml.MSHTML.ISVGPathSegCurvetoQuadraticSmoothAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double, y: Double): typings.activexMshtml.MSHTML.ISVGPathSegCurvetoQuadraticSmoothRel = js.native
  
  /* CompleteClass */
  override def createSVGPathSegLinetoAbs(x: Double, y: Double): typings.activexMshtml.MSHTML.ISVGPathSegLinetoAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegLinetoHorizontalAbs(x: Double): typings.activexMshtml.MSHTML.ISVGPathSegLinetoHorizontalAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegLinetoHorizontalRel(x: Double): typings.activexMshtml.MSHTML.ISVGPathSegLinetoHorizontalRel = js.native
  
  /* CompleteClass */
  override def createSVGPathSegLinetoRel(x: Double, y: Double): typings.activexMshtml.MSHTML.ISVGPathSegLinetoRel = js.native
  
  /* CompleteClass */
  override def createSVGPathSegLinetoVerticalAbs(y: Double): typings.activexMshtml.MSHTML.ISVGPathSegLinetoVerticalAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegLinetoVerticalRel(y: Double): typings.activexMshtml.MSHTML.ISVGPathSegLinetoVerticalRel = js.native
  
  /* CompleteClass */
  override def createSVGPathSegMovetoAbs(x: Double, y: Double): typings.activexMshtml.MSHTML.ISVGPathSegMovetoAbs = js.native
  
  /* CompleteClass */
  override def createSVGPathSegMovetoRel(x: Double, y: Double): typings.activexMshtml.MSHTML.ISVGPathSegMovetoRel = js.native
  
  /* CompleteClass */
  override val farthestViewportElement: typings.activexMshtml.MSHTML.ISVGElement = js.native
  
  /* CompleteClass */
  var focusable: typings.activexMshtml.MSHTML.SVGAnimatedEnumeration = js.native
  
  /* CompleteClass */
  override def getBBox(): typings.activexMshtml.MSHTML.SVGRect = js.native
  
  /* CompleteClass */
  override def getCTM(): typings.activexMshtml.MSHTML.SVGMatrix = js.native
  
  /* CompleteClass */
  override def getPathSegAtLength(fltdistance: Double): Double = js.native
  
  /* CompleteClass */
  override def getPointAtLength(fltdistance: Double): typings.activexMshtml.MSHTML.SVGPoint = js.native
  
  /* CompleteClass */
  override def getScreenCTM(): typings.activexMshtml.MSHTML.SVGMatrix = js.native
  
  /* CompleteClass */
  override def getTotalLength(): Double = js.native
  
  /* CompleteClass */
  override def getTransformToElement(pElement: typings.activexMshtml.MSHTML.ISVGElement): typings.activexMshtml.MSHTML.SVGMatrix = js.native
  
  /* CompleteClass */
  override def hasExtension(`extension`: String): Boolean = js.native
  
  /* CompleteClass */
  override val nearestViewportElement: typings.activexMshtml.MSHTML.ISVGElement = js.native
  
  /* CompleteClass */
  var normalizedPathSegList: typings.activexMshtml.MSHTML.SVGPathSegList = js.native
  
  /* CompleteClass */
  var ownerSVGElement: typings.activexMshtml.MSHTML.ISVGSVGElement = js.native
  
  /* CompleteClass */
  var pathLength: typings.activexMshtml.MSHTML.SVGAnimatedNumber = js.native
  
  /* CompleteClass */
  var pathSegList: typings.activexMshtml.MSHTML.SVGPathSegList = js.native
  
  /* CompleteClass */
  override val requiredExtensions: typings.activexMshtml.MSHTML.SVGStringList = js.native
  
  /* CompleteClass */
  override val requiredFeatures: typings.activexMshtml.MSHTML.SVGStringList = js.native
  
  /* CompleteClass */
  override val systemLanguage: typings.activexMshtml.MSHTML.SVGStringList = js.native
  
  /* CompleteClass */
  override val transform: typings.activexMshtml.MSHTML.SVGAnimatedTransformList = js.native
  
  /* CompleteClass */
  var viewportElement: typings.activexMshtml.MSHTML.ISVGElement = js.native
  
  /* CompleteClass */
  var xmlbase: String = js.native
}
