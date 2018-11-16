package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _sandboxAllow extends js.Object

@JSGlobal("MSHTML._sandboxAllow")
@js.native
object _sandboxAllow extends js.Object {
  @js.native
  sealed trait sandboxAllowForms
    extends activexDashMshtmlLib.MSHTMLNs._sandboxAllow
  
  @js.native
  sealed trait sandboxAllowPopups
    extends activexDashMshtmlLib.MSHTMLNs._sandboxAllow
  
  @js.native
  sealed trait sandboxAllowSameOrigin
    extends activexDashMshtmlLib.MSHTMLNs._sandboxAllow
  
  @js.native
  sealed trait sandboxAllowScripts
    extends activexDashMshtmlLib.MSHTMLNs._sandboxAllow
  
  @js.native
  sealed trait sandboxAllowTopNavigation
    extends activexDashMshtmlLib.MSHTMLNs._sandboxAllow
  
  @js.native
  sealed trait sandboxAllow_Max
    extends activexDashMshtmlLib.MSHTMLNs._sandboxAllow
  
  /* 3 */ val sandboxAllowForms: sandboxAllowForms with scala.Double = js.native
  /* 4 */ val sandboxAllowPopups: sandboxAllowPopups with scala.Double = js.native
  /* 1 */ val sandboxAllowSameOrigin: sandboxAllowSameOrigin with scala.Double = js.native
  /* 0 */ val sandboxAllowScripts: sandboxAllowScripts with scala.Double = js.native
  /* 2 */ val sandboxAllowTopNavigation: sandboxAllowTopNavigation with scala.Double = js.native
  /* 2147483647 */ val sandboxAllow_Max: sandboxAllow_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._sandboxAllow with scala.Double] = js.native
}

