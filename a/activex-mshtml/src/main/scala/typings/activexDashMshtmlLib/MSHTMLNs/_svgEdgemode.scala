package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgEdgemode extends js.Object

@JSGlobal("MSHTML._svgEdgemode")
@js.native
object _svgEdgemode extends js.Object {
  @js.native
  sealed trait SVG_EDGEMODE_DUPLICATE
    extends activexDashMshtmlLib.MSHTMLNs._svgEdgemode
  
  @js.native
  sealed trait SVG_EDGEMODE_NONE
    extends activexDashMshtmlLib.MSHTMLNs._svgEdgemode
  
  @js.native
  sealed trait SVG_EDGEMODE_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgEdgemode
  
  @js.native
  sealed trait SVG_EDGEMODE_WRAP
    extends activexDashMshtmlLib.MSHTMLNs._svgEdgemode
  
  @js.native
  sealed trait svgEdgemode_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgEdgemode
  
  /* 1 */ val SVG_EDGEMODE_DUPLICATE: SVG_EDGEMODE_DUPLICATE with scala.Double = js.native
  /* 3 */ val SVG_EDGEMODE_NONE: SVG_EDGEMODE_NONE with scala.Double = js.native
  /* 0 */ val SVG_EDGEMODE_UNKNOWN: SVG_EDGEMODE_UNKNOWN with scala.Double = js.native
  /* 2 */ val SVG_EDGEMODE_WRAP: SVG_EDGEMODE_WRAP with scala.Double = js.native
  /* 2147483647 */ val svgEdgemode_Max: svgEdgemode_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgEdgemode with scala.Double] = js.native
}

