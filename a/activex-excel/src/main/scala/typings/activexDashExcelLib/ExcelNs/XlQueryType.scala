package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlQueryType extends js.Object

@JSGlobal("Excel.XlQueryType")
@js.native
object XlQueryType extends js.Object {
  @js.native
  sealed trait xlADORecordset
    extends activexDashExcelLib.ExcelNs.XlQueryType
  
  @js.native
  sealed trait xlDAORecordset
    extends activexDashExcelLib.ExcelNs.XlQueryType
  
  @js.native
  sealed trait xlODBCQuery
    extends activexDashExcelLib.ExcelNs.XlQueryType
  
  @js.native
  sealed trait xlOLEDBQuery
    extends activexDashExcelLib.ExcelNs.XlQueryType
  
  @js.native
  sealed trait xlTextImport
    extends activexDashExcelLib.ExcelNs.XlQueryType
  
  @js.native
  sealed trait xlWebQuery
    extends activexDashExcelLib.ExcelNs.XlQueryType
  
  /* 7 */ val xlADORecordset: xlADORecordset with scala.Double = js.native
  /* 2 */ val xlDAORecordset: xlDAORecordset with scala.Double = js.native
  /* 1 */ val xlODBCQuery: xlODBCQuery with scala.Double = js.native
  /* 5 */ val xlOLEDBQuery: xlOLEDBQuery with scala.Double = js.native
  /* 6 */ val xlTextImport: xlTextImport with scala.Double = js.native
  /* 4 */ val xlWebQuery: xlWebQuery with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlQueryType with scala.Double] = js.native
}

