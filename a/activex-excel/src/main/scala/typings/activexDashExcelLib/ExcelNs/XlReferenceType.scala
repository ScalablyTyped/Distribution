package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlReferenceType extends js.Object

@JSGlobal("Excel.XlReferenceType")
@js.native
object XlReferenceType extends js.Object {
  @js.native
  sealed trait xlAbsRowRelColumn
    extends activexDashExcelLib.ExcelNs.XlReferenceType
  
  @js.native
  sealed trait xlAbsolute
    extends activexDashExcelLib.ExcelNs.XlReferenceType
  
  @js.native
  sealed trait xlRelRowAbsColumn
    extends activexDashExcelLib.ExcelNs.XlReferenceType
  
  @js.native
  sealed trait xlRelative
    extends activexDashExcelLib.ExcelNs.XlReferenceType
  
  /* 2 */ val xlAbsRowRelColumn: xlAbsRowRelColumn with scala.Double = js.native
  /* 1 */ val xlAbsolute: xlAbsolute with scala.Double = js.native
  /* 3 */ val xlRelRowAbsColumn: xlRelRowAbsColumn with scala.Double = js.native
  /* 4 */ val xlRelative: xlRelative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlReferenceType with scala.Double] = js.native
}

