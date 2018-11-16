package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgStitchtype extends js.Object

@JSGlobal("MSHTML._svgStitchtype")
@js.native
object _svgStitchtype extends js.Object {
  @js.native
  sealed trait SVG_STITCHTYPE_NOSTITCH
    extends activexDashMshtmlLib.MSHTMLNs._svgStitchtype
  
  @js.native
  sealed trait SVG_STITCHTYPE_STITCH
    extends activexDashMshtmlLib.MSHTMLNs._svgStitchtype
  
  @js.native
  sealed trait SVG_STITCHTYPE_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgStitchtype
  
  @js.native
  sealed trait svgStitchtype_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgStitchtype
  
  /* 2 */ val SVG_STITCHTYPE_NOSTITCH: SVG_STITCHTYPE_NOSTITCH with scala.Double = js.native
  /* 1 */ val SVG_STITCHTYPE_STITCH: SVG_STITCHTYPE_STITCH with scala.Double = js.native
  /* 0 */ val SVG_STITCHTYPE_UNKNOWN: SVG_STITCHTYPE_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val svgStitchtype_Max: svgStitchtype_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgStitchtype with scala.Double] = js.native
}

