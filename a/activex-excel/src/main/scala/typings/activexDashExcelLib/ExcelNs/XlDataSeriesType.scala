package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataSeriesType extends js.Object

@JSGlobal("Excel.XlDataSeriesType")
@js.native
object XlDataSeriesType extends js.Object {
  @js.native
  sealed trait xlAutoFill
    extends activexDashExcelLib.ExcelNs.XlDataSeriesType
  
  @js.native
  sealed trait xlChronological
    extends activexDashExcelLib.ExcelNs.XlDataSeriesType
  
  @js.native
  sealed trait xlDataSeriesLinear
    extends activexDashExcelLib.ExcelNs.XlDataSeriesType
  
  @js.native
  sealed trait xlGrowth
    extends activexDashExcelLib.ExcelNs.XlDataSeriesType
  
  /* 4 */ val xlAutoFill: xlAutoFill with scala.Double = js.native
  /* 3 */ val xlChronological: xlChronological with scala.Double = js.native
  /* -4132 */ val xlDataSeriesLinear: xlDataSeriesLinear with scala.Double = js.native
  /* 2 */ val xlGrowth: xlGrowth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDataSeriesType with scala.Double] = js.native
}

