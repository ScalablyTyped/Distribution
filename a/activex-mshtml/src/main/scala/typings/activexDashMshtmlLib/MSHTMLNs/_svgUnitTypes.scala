package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgUnitTypes extends js.Object

@JSGlobal("MSHTML._svgUnitTypes")
@js.native
object _svgUnitTypes extends js.Object {
  @js.native
  sealed trait SVG_UNITTYPE_OBJECTBOUNDINGBOX
    extends activexDashMshtmlLib.MSHTMLNs._svgUnitTypes
  
  @js.native
  sealed trait SVG_UNITTYPE_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgUnitTypes
  
  @js.native
  sealed trait SVG_UNITTYPE_USERSPACEONUSE
    extends activexDashMshtmlLib.MSHTMLNs._svgUnitTypes
  
  @js.native
  sealed trait svgUnitTypes_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgUnitTypes
  
  /* 2 */ val SVG_UNITTYPE_OBJECTBOUNDINGBOX: SVG_UNITTYPE_OBJECTBOUNDINGBOX with scala.Double = js.native
  /* 0 */ val SVG_UNITTYPE_UNKNOWN: SVG_UNITTYPE_UNKNOWN with scala.Double = js.native
  /* 1 */ val SVG_UNITTYPE_USERSPACEONUSE: SVG_UNITTYPE_USERSPACEONUSE with scala.Double = js.native
  /* 2147483647 */ val svgUnitTypes_Max: svgUnitTypes_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgUnitTypes with scala.Double] = js.native
}

