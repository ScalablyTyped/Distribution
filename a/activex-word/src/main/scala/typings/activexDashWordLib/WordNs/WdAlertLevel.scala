package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdAlertLevel extends js.Object

@JSGlobal("Word.WdAlertLevel")
@js.native
object WdAlertLevel extends js.Object {
  @js.native
  sealed trait wdAlertsAll
    extends activexDashWordLib.WordNs.WdAlertLevel
  
  @js.native
  sealed trait wdAlertsMessageBox
    extends activexDashWordLib.WordNs.WdAlertLevel
  
  @js.native
  sealed trait wdAlertsNone
    extends activexDashWordLib.WordNs.WdAlertLevel
  
  /* -1 */ val wdAlertsAll: wdAlertsAll with scala.Double = js.native
  /* -2 */ val wdAlertsMessageBox: wdAlertsMessageBox with scala.Double = js.native
  /* 0 */ val wdAlertsNone: wdAlertsNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdAlertLevel with scala.Double] = js.native
}

