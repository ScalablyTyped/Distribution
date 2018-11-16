package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartPicturePlacement extends js.Object

@JSGlobal("Excel.XlChartPicturePlacement")
@js.native
object XlChartPicturePlacement extends js.Object {
  @js.native
  sealed trait xlAllFaces
    extends activexDashExcelLib.ExcelNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlEnd
    extends activexDashExcelLib.ExcelNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlEndSides
    extends activexDashExcelLib.ExcelNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlFront
    extends activexDashExcelLib.ExcelNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlFrontEnd
    extends activexDashExcelLib.ExcelNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlFrontSides
    extends activexDashExcelLib.ExcelNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlSides
    extends activexDashExcelLib.ExcelNs.XlChartPicturePlacement
  
  /* 7 */ val xlAllFaces: xlAllFaces with scala.Double = js.native
  /* 2 */ val xlEnd: xlEnd with scala.Double = js.native
  /* 3 */ val xlEndSides: xlEndSides with scala.Double = js.native
  /* 4 */ val xlFront: xlFront with scala.Double = js.native
  /* 6 */ val xlFrontEnd: xlFrontEnd with scala.Double = js.native
  /* 5 */ val xlFrontSides: xlFrontSides with scala.Double = js.native
  /* 1 */ val xlSides: xlSides with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlChartPicturePlacement with scala.Double] = js.native
}

