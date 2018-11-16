package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgPreserveAlpha extends js.Object

@JSGlobal("MSHTML._svgPreserveAlpha")
@js.native
object _svgPreserveAlpha extends js.Object {
  @js.native
  sealed trait SVG_PRESERVEALPHA_FALSE
    extends activexDashMshtmlLib.MSHTMLNs._svgPreserveAlpha
  
  @js.native
  sealed trait SVG_PRESERVEALPHA_TRUE
    extends activexDashMshtmlLib.MSHTMLNs._svgPreserveAlpha
  
  @js.native
  sealed trait svgPreserveAlpha_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgPreserveAlpha
  
  /* 0 */ val SVG_PRESERVEALPHA_FALSE: SVG_PRESERVEALPHA_FALSE with scala.Double = js.native
  /* 1 */ val SVG_PRESERVEALPHA_TRUE: SVG_PRESERVEALPHA_TRUE with scala.Double = js.native
  /* 2147483647 */ val svgPreserveAlpha_Max: svgPreserveAlpha_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgPreserveAlpha with scala.Double] = js.native
}

