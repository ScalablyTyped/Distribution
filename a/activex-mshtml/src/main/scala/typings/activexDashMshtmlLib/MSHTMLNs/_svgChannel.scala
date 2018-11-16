package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgChannel extends js.Object

@JSGlobal("MSHTML._svgChannel")
@js.native
object _svgChannel extends js.Object {
  @js.native
  sealed trait SVG_CHANNEL_A
    extends activexDashMshtmlLib.MSHTMLNs._svgChannel
  
  @js.native
  sealed trait SVG_CHANNEL_B
    extends activexDashMshtmlLib.MSHTMLNs._svgChannel
  
  @js.native
  sealed trait SVG_CHANNEL_G
    extends activexDashMshtmlLib.MSHTMLNs._svgChannel
  
  @js.native
  sealed trait SVG_CHANNEL_R
    extends activexDashMshtmlLib.MSHTMLNs._svgChannel
  
  @js.native
  sealed trait SVG_CHANNEL_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgChannel
  
  @js.native
  sealed trait svgChannel_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgChannel
  
  /* 4 */ val SVG_CHANNEL_A: SVG_CHANNEL_A with scala.Double = js.native
  /* 3 */ val SVG_CHANNEL_B: SVG_CHANNEL_B with scala.Double = js.native
  /* 2 */ val SVG_CHANNEL_G: SVG_CHANNEL_G with scala.Double = js.native
  /* 1 */ val SVG_CHANNEL_R: SVG_CHANNEL_R with scala.Double = js.native
  /* 0 */ val SVG_CHANNEL_UNKNOWN: SVG_CHANNEL_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val svgChannel_Max: svgChannel_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgChannel with scala.Double] = js.native
}

