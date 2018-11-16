package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgPreserveAspectMeetOrSliceType extends js.Object

@JSGlobal("MSHTML._svgPreserveAspectMeetOrSliceType")
@js.native
object _svgPreserveAspectMeetOrSliceType extends js.Object {
  @js.native
  sealed trait SVG_MEETORSLICE_MEET
    extends activexDashMshtmlLib.MSHTMLNs._svgPreserveAspectMeetOrSliceType
  
  @js.native
  sealed trait SVG_MEETORSLICE_SLICE
    extends activexDashMshtmlLib.MSHTMLNs._svgPreserveAspectMeetOrSliceType
  
  @js.native
  sealed trait SVG_MEETORSLICE_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgPreserveAspectMeetOrSliceType
  
  @js.native
  sealed trait svgPreserveAspectMeetOrSliceType_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgPreserveAspectMeetOrSliceType
  
  /* 1 */ val SVG_MEETORSLICE_MEET: SVG_MEETORSLICE_MEET with scala.Double = js.native
  /* 2 */ val SVG_MEETORSLICE_SLICE: SVG_MEETORSLICE_SLICE with scala.Double = js.native
  /* 0 */ val SVG_MEETORSLICE_UNKNOWN: SVG_MEETORSLICE_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val svgPreserveAspectMeetOrSliceType_Max: svgPreserveAspectMeetOrSliceType_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashMshtmlLib.MSHTMLNs._svgPreserveAspectMeetOrSliceType with scala.Double
  ] = js.native
}

