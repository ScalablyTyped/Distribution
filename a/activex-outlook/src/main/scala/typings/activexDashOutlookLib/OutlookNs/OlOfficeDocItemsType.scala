package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlOfficeDocItemsType extends js.Object

@JSGlobal("Outlook.OlOfficeDocItemsType")
@js.native
object OlOfficeDocItemsType extends js.Object {
  @js.native
  sealed trait olExcelWorkSheetItem
    extends activexDashOutlookLib.OutlookNs.OlOfficeDocItemsType
  
  @js.native
  sealed trait olPowerPointShowItem
    extends activexDashOutlookLib.OutlookNs.OlOfficeDocItemsType
  
  @js.native
  sealed trait olWordDocumentItem
    extends activexDashOutlookLib.OutlookNs.OlOfficeDocItemsType
  
  /* 8 */ val olExcelWorkSheetItem: olExcelWorkSheetItem with scala.Double = js.native
  /* 10 */ val olPowerPointShowItem: olPowerPointShowItem with scala.Double = js.native
  /* 9 */ val olWordDocumentItem: olWordDocumentItem with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlOfficeDocItemsType with scala.Double] = js.native
}

