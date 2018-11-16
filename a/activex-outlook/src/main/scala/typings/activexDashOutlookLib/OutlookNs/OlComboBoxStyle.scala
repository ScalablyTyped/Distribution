package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlComboBoxStyle extends js.Object

@JSGlobal("Outlook.OlComboBoxStyle")
@js.native
object OlComboBoxStyle extends js.Object {
  @js.native
  sealed trait olComboBoxStyleCombo
    extends activexDashOutlookLib.OutlookNs.OlComboBoxStyle
  
  @js.native
  sealed trait olComboBoxStyleList
    extends activexDashOutlookLib.OutlookNs.OlComboBoxStyle
  
  /* 0 */ val olComboBoxStyleCombo: olComboBoxStyleCombo with scala.Double = js.native
  /* 2 */ val olComboBoxStyleList: olComboBoxStyleList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlComboBoxStyle with scala.Double] = js.native
}

