package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgMarkerOrient extends js.Object

@JSGlobal("MSHTML._svgMarkerOrient")
@js.native
object _svgMarkerOrient extends js.Object {
  @js.native
  sealed trait SVG_MARKER_ORIENT_ANGLE
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerOrient
  
  @js.native
  sealed trait SVG_MARKER_ORIENT_AUTO
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerOrient
  
  @js.native
  sealed trait SVG_MARKER_ORIENT_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerOrient
  
  @js.native
  sealed trait svgMarkerOrient_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerOrient
  
  /* 2 */ val SVG_MARKER_ORIENT_ANGLE: SVG_MARKER_ORIENT_ANGLE with scala.Double = js.native
  /* 1 */ val SVG_MARKER_ORIENT_AUTO: SVG_MARKER_ORIENT_AUTO with scala.Double = js.native
  /* 0 */ val SVG_MARKER_ORIENT_UNKNOWN: SVG_MARKER_ORIENT_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val svgMarkerOrient_Max: svgMarkerOrient_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgMarkerOrient with scala.Double] = js.native
}

