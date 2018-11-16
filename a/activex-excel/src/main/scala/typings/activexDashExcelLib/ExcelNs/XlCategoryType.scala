package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCategoryType extends js.Object

@JSGlobal("Excel.XlCategoryType")
@js.native
object XlCategoryType extends js.Object {
  @js.native
  sealed trait xlAutomaticScale
    extends activexDashExcelLib.ExcelNs.XlCategoryType
  
  @js.native
  sealed trait xlCategoryScale
    extends activexDashExcelLib.ExcelNs.XlCategoryType
  
  @js.native
  sealed trait xlTimeScale
    extends activexDashExcelLib.ExcelNs.XlCategoryType
  
  /* -4105 */ val xlAutomaticScale: xlAutomaticScale with scala.Double = js.native
  /* 2 */ val xlCategoryScale: xlCategoryScale with scala.Double = js.native
  /* 3 */ val xlTimeScale: xlTimeScale with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCategoryType with scala.Double] = js.native
}

