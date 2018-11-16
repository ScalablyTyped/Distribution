package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlDragBehavior extends js.Object

@JSGlobal("Outlook.OlDragBehavior")
@js.native
object OlDragBehavior extends js.Object {
  @js.native
  sealed trait olDragBehaviorDisabled
    extends activexDashOutlookLib.OutlookNs.OlDragBehavior
  
  @js.native
  sealed trait olDragBehaviorEnabled
    extends activexDashOutlookLib.OutlookNs.OlDragBehavior
  
  /* 0 */ val olDragBehaviorDisabled: olDragBehaviorDisabled with scala.Double = js.native
  /* 1 */ val olDragBehaviorEnabled: olDragBehaviorEnabled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlDragBehavior with scala.Double] = js.native
}

