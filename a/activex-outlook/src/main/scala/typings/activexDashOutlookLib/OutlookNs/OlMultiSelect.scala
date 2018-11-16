package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMultiSelect extends js.Object

@JSGlobal("Outlook.OlMultiSelect")
@js.native
object OlMultiSelect extends js.Object {
  @js.native
  sealed trait olMultiSelectExtended
    extends activexDashOutlookLib.OutlookNs.OlMultiSelect
  
  @js.native
  sealed trait olMultiSelectMulti
    extends activexDashOutlookLib.OutlookNs.OlMultiSelect
  
  @js.native
  sealed trait olMultiSelectSingle
    extends activexDashOutlookLib.OutlookNs.OlMultiSelect
  
  /* 2 */ val olMultiSelectExtended: olMultiSelectExtended with scala.Double = js.native
  /* 1 */ val olMultiSelectMulti: olMultiSelectMulti with scala.Double = js.native
  /* 0 */ val olMultiSelectSingle: olMultiSelectSingle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMultiSelect with scala.Double] = js.native
}

