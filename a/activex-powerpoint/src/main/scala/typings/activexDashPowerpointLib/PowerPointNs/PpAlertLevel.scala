package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpAlertLevel extends js.Object

@JSGlobal("PowerPoint.PpAlertLevel")
@js.native
object PpAlertLevel extends js.Object {
  @js.native
  sealed trait ppAlertsAll
    extends activexDashPowerpointLib.PowerPointNs.PpAlertLevel
  
  @js.native
  sealed trait ppAlertsNone
    extends activexDashPowerpointLib.PowerPointNs.PpAlertLevel
  
  /* 2 */ val ppAlertsAll: ppAlertsAll with scala.Double = js.native
  /* 1 */ val ppAlertsNone: ppAlertsNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpAlertLevel with scala.Double] = js.native
}

