package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartPictureType extends js.Object

@JSGlobal("Excel.XlChartPictureType")
@js.native
object XlChartPictureType extends js.Object {
  @js.native
  sealed trait xlStack
    extends activexDashExcelLib.ExcelNs.XlChartPictureType
  
  @js.native
  sealed trait xlStackScale
    extends activexDashExcelLib.ExcelNs.XlChartPictureType
  
  @js.native
  sealed trait xlStretch
    extends activexDashExcelLib.ExcelNs.XlChartPictureType
  
  /* 2 */ val xlStack: xlStack with scala.Double = js.native
  /* 3 */ val xlStackScale: xlStackScale with scala.Double = js.native
  /* 1 */ val xlStretch: xlStretch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlChartPictureType with scala.Double] = js.native
}

