package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCmdType extends js.Object

@JSGlobal("Excel.XlCmdType")
@js.native
object XlCmdType extends js.Object {
  @js.native
  sealed trait xlCmdCube
    extends activexDashExcelLib.ExcelNs.XlCmdType
  
  @js.native
  sealed trait xlCmdDefault
    extends activexDashExcelLib.ExcelNs.XlCmdType
  
  @js.native
  sealed trait xlCmdList
    extends activexDashExcelLib.ExcelNs.XlCmdType
  
  @js.native
  sealed trait xlCmdSql
    extends activexDashExcelLib.ExcelNs.XlCmdType
  
  @js.native
  sealed trait xlCmdTable
    extends activexDashExcelLib.ExcelNs.XlCmdType
  
  /* 1 */ val xlCmdCube: xlCmdCube with scala.Double = js.native
  /* 4 */ val xlCmdDefault: xlCmdDefault with scala.Double = js.native
  /* 5 */ val xlCmdList: xlCmdList with scala.Double = js.native
  /* 2 */ val xlCmdSql: xlCmdSql with scala.Double = js.native
  /* 3 */ val xlCmdTable: xlCmdTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCmdType with scala.Double] = js.native
}

