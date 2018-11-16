package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLocationInTable extends js.Object

@JSGlobal("Excel.XlLocationInTable")
@js.native
object XlLocationInTable extends js.Object {
  @js.native
  sealed trait xlColumnHeader
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  @js.native
  sealed trait xlColumnItem
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  @js.native
  sealed trait xlDataHeader
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  @js.native
  sealed trait xlDataItem
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  @js.native
  sealed trait xlPageHeader
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  @js.native
  sealed trait xlPageItem
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  @js.native
  sealed trait xlRowHeader
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  @js.native
  sealed trait xlRowItem
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  @js.native
  sealed trait xlTableBody
    extends activexDashExcelLib.ExcelNs.XlLocationInTable
  
  /* -4110 */ val xlColumnHeader: xlColumnHeader with scala.Double = js.native
  /* 5 */ val xlColumnItem: xlColumnItem with scala.Double = js.native
  /* 3 */ val xlDataHeader: xlDataHeader with scala.Double = js.native
  /* 7 */ val xlDataItem: xlDataItem with scala.Double = js.native
  /* 2 */ val xlPageHeader: xlPageHeader with scala.Double = js.native
  /* 6 */ val xlPageItem: xlPageItem with scala.Double = js.native
  /* -4153 */ val xlRowHeader: xlRowHeader with scala.Double = js.native
  /* 4 */ val xlRowItem: xlRowItem with scala.Double = js.native
  /* 8 */ val xlTableBody: xlTableBody with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLocationInTable with scala.Double] = js.native
}

