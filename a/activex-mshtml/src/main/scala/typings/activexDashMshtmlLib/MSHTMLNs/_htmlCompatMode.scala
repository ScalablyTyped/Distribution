package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlCompatMode extends js.Object

@JSGlobal("MSHTML._htmlCompatMode")
@js.native
object _htmlCompatMode extends js.Object {
  @js.native
  sealed trait htmlCompatModeBackCompat
    extends activexDashMshtmlLib.MSHTMLNs._htmlCompatMode
  
  @js.native
  sealed trait htmlCompatModeCSS1Compat
    extends activexDashMshtmlLib.MSHTMLNs._htmlCompatMode
  
  @js.native
  sealed trait htmlCompatMode_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlCompatMode
  
  /* 0 */ val htmlCompatModeBackCompat: htmlCompatModeBackCompat with scala.Double = js.native
  /* 1 */ val htmlCompatModeCSS1Compat: htmlCompatModeCSS1Compat with scala.Double = js.native
  /* 2147483647 */ val htmlCompatMode_Max: htmlCompatMode_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlCompatMode with scala.Double] = js.native
}

