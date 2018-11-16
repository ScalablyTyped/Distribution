package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlActionType extends js.Object

@JSGlobal("Excel.XlActionType")
@js.native
object XlActionType extends js.Object {
  @js.native
  sealed trait xlActionTypeDrillthrough
    extends activexDashExcelLib.ExcelNs.XlActionType
  
  @js.native
  sealed trait xlActionTypeReport
    extends activexDashExcelLib.ExcelNs.XlActionType
  
  @js.native
  sealed trait xlActionTypeRowset
    extends activexDashExcelLib.ExcelNs.XlActionType
  
  @js.native
  sealed trait xlActionTypeUrl
    extends activexDashExcelLib.ExcelNs.XlActionType
  
  /* 256 */ val xlActionTypeDrillthrough: xlActionTypeDrillthrough with scala.Double = js.native
  /* 128 */ val xlActionTypeReport: xlActionTypeReport with scala.Double = js.native
  /* 16 */ val xlActionTypeRowset: xlActionTypeRowset with scala.Double = js.native
  /* 1 */ val xlActionTypeUrl: xlActionTypeUrl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlActionType with scala.Double] = js.native
}

