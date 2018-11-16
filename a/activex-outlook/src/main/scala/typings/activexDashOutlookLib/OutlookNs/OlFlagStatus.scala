package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFlagStatus extends js.Object

@JSGlobal("Outlook.OlFlagStatus")
@js.native
object OlFlagStatus extends js.Object {
  @js.native
  sealed trait olFlagComplete
    extends activexDashOutlookLib.OutlookNs.OlFlagStatus
  
  @js.native
  sealed trait olFlagMarked
    extends activexDashOutlookLib.OutlookNs.OlFlagStatus
  
  @js.native
  sealed trait olNoFlag
    extends activexDashOutlookLib.OutlookNs.OlFlagStatus
  
  /* 1 */ val olFlagComplete: olFlagComplete with scala.Double = js.native
  /* 2 */ val olFlagMarked: olFlagMarked with scala.Double = js.native
  /* 0 */ val olNoFlag: olNoFlag with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFlagStatus with scala.Double] = js.native
}

