package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgSpreadMethod extends js.Object

@JSGlobal("MSHTML._svgSpreadMethod")
@js.native
object _svgSpreadMethod extends js.Object {
  @js.native
  sealed trait SVG_SPREADMETHOD_PAD
    extends activexDashMshtmlLib.MSHTMLNs._svgSpreadMethod
  
  @js.native
  sealed trait SVG_SPREADMETHOD_REFLECT
    extends activexDashMshtmlLib.MSHTMLNs._svgSpreadMethod
  
  @js.native
  sealed trait SVG_SPREADMETHOD_REPEAT
    extends activexDashMshtmlLib.MSHTMLNs._svgSpreadMethod
  
  @js.native
  sealed trait SVG_SPREADMETHOD_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgSpreadMethod
  
  @js.native
  sealed trait svgSpreadMethod_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgSpreadMethod
  
  /* 1 */ val SVG_SPREADMETHOD_PAD: SVG_SPREADMETHOD_PAD with scala.Double = js.native
  /* 2 */ val SVG_SPREADMETHOD_REFLECT: SVG_SPREADMETHOD_REFLECT with scala.Double = js.native
  /* 3 */ val SVG_SPREADMETHOD_REPEAT: SVG_SPREADMETHOD_REPEAT with scala.Double = js.native
  /* 0 */ val SVG_SPREADMETHOD_UNKNOWN: SVG_SPREADMETHOD_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val svgSpreadMethod_Max: svgSpreadMethod_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgSpreadMethod with scala.Double] = js.native
}

