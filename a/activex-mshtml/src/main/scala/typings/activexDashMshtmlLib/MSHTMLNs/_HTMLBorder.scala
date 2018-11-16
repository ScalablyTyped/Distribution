package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLBorder extends js.Object

@JSGlobal("MSHTML._HTMLBorder")
@js.native
object _HTMLBorder extends js.Object {
  @js.native
  sealed trait HTMLBorderDialog
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorder
  
  @js.native
  sealed trait HTMLBorderNone
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorder
  
  @js.native
  sealed trait HTMLBorderThick
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorder
  
  @js.native
  sealed trait HTMLBorderThin
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorder
  
  @js.native
  sealed trait HTMLBorder_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorder
  
  /* 4194304 */ val HTMLBorderDialog: HTMLBorderDialog with scala.Double = js.native
  /* 0 */ val HTMLBorderNone: HTMLBorderNone with scala.Double = js.native
  /* 262144 */ val HTMLBorderThick: HTMLBorderThick with scala.Double = js.native
  /* 8388608 */ val HTMLBorderThin: HTMLBorderThin with scala.Double = js.native
  /* 2147483647 */ val HTMLBorder_Max: HTMLBorder_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLBorder with scala.Double] = js.native
}

