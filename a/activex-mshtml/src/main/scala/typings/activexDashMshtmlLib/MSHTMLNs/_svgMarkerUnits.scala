package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgMarkerUnits extends js.Object

@JSGlobal("MSHTML._svgMarkerUnits")
@js.native
object _svgMarkerUnits extends js.Object {
  @js.native
  sealed trait SVG_MARKERUNITS_STROKEWIDTH
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerUnits
  
  @js.native
  sealed trait SVG_MARKERUNITS_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerUnits
  
  @js.native
  sealed trait SVG_MARKERUNITS_USERSPACEONUSE
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerUnits
  
  @js.native
  sealed trait svgMarkerUnits_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerUnits
  
  /* 2 */ val SVG_MARKERUNITS_STROKEWIDTH: SVG_MARKERUNITS_STROKEWIDTH with scala.Double = js.native
  /* 0 */ val SVG_MARKERUNITS_UNKNOWN: SVG_MARKERUNITS_UNKNOWN with scala.Double = js.native
  /* 1 */ val SVG_MARKERUNITS_USERSPACEONUSE: SVG_MARKERUNITS_USERSPACEONUSE with scala.Double = js.native
  /* 2147483647 */ val svgMarkerUnits_Max: svgMarkerUnits_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgMarkerUnits with scala.Double] = js.native
}

