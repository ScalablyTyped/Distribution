package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLSysMenuFlag extends js.Object

@JSGlobal("MSHTML._HTMLSysMenuFlag")
@js.native
object _HTMLSysMenuFlag extends js.Object {
  @js.native
  sealed trait HTMLSysMenuFlagNo
    extends activexDashMshtmlLib.MSHTMLNs._HTMLSysMenuFlag
  
  @js.native
  sealed trait HTMLSysMenuFlagYes
    extends activexDashMshtmlLib.MSHTMLNs._HTMLSysMenuFlag
  
  @js.native
  sealed trait HTMLSysMenuFlag_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLSysMenuFlag
  
  /* 0 */ val HTMLSysMenuFlagNo: HTMLSysMenuFlagNo with scala.Double = js.native
  /* 524288 */ val HTMLSysMenuFlagYes: HTMLSysMenuFlagYes with scala.Double = js.native
  /* 2147483647 */ val HTMLSysMenuFlag_Max: HTMLSysMenuFlag_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLSysMenuFlag with scala.Double] = js.native
}

