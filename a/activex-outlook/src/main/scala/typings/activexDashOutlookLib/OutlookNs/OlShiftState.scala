package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlShiftState extends js.Object

@JSGlobal("Outlook.OlShiftState")
@js.native
object OlShiftState extends js.Object {
  @js.native
  sealed trait olShiftStateAltMask
    extends activexDashOutlookLib.OutlookNs.OlShiftState
  
  @js.native
  sealed trait olShiftStateCtrlMask
    extends activexDashOutlookLib.OutlookNs.OlShiftState
  
  @js.native
  sealed trait olShiftStateShiftMask
    extends activexDashOutlookLib.OutlookNs.OlShiftState
  
  /* 4 */ val olShiftStateAltMask: olShiftStateAltMask with scala.Double = js.native
  /* 2 */ val olShiftStateCtrlMask: olShiftStateCtrlMask with scala.Double = js.native
  /* 1 */ val olShiftStateShiftMask: olShiftStateShiftMask with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlShiftState with scala.Double] = js.native
}

