package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlActionShowOn extends js.Object

@JSGlobal("Outlook.OlActionShowOn")
@js.native
object OlActionShowOn extends js.Object {
  @js.native
  sealed trait olDontShow
    extends activexDashOutlookLib.OutlookNs.OlActionShowOn
  
  @js.native
  sealed trait olMenu
    extends activexDashOutlookLib.OutlookNs.OlActionShowOn
  
  @js.native
  sealed trait olMenuAndToolbar
    extends activexDashOutlookLib.OutlookNs.OlActionShowOn
  
  /* 0 */ val olDontShow: olDontShow with scala.Double = js.native
  /* 1 */ val olMenu: olMenu with scala.Double = js.native
  /* 2 */ val olMenuAndToolbar: olMenuAndToolbar with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlActionShowOn with scala.Double] = js.native
}

