package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgMorphologyOperator extends js.Object

@JSGlobal("MSHTML._svgMorphologyOperator")
@js.native
object _svgMorphologyOperator extends js.Object {
  @js.native
  sealed trait SVG_MORPHOLOGY_OPERATOR_DILATE
    extends activexDashMshtmlLib.MSHTMLNs._svgMorphologyOperator
  
  @js.native
  sealed trait SVG_MORPHOLOGY_OPERATOR_ERODE
    extends activexDashMshtmlLib.MSHTMLNs._svgMorphologyOperator
  
  @js.native
  sealed trait SVG_MORPHOLOGY_OPERATOR_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgMorphologyOperator
  
  @js.native
  sealed trait svgMorphologyOperator_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgMorphologyOperator
  
  /* 2 */ val SVG_MORPHOLOGY_OPERATOR_DILATE: SVG_MORPHOLOGY_OPERATOR_DILATE with scala.Double = js.native
  /* 1 */ val SVG_MORPHOLOGY_OPERATOR_ERODE: SVG_MORPHOLOGY_OPERATOR_ERODE with scala.Double = js.native
  /* 0 */ val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: SVG_MORPHOLOGY_OPERATOR_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val svgMorphologyOperator_Max: svgMorphologyOperator_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgMorphologyOperator with scala.Double] = js.native
}

