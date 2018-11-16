package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDisplayDrawingObjects extends js.Object

@JSGlobal("Excel.XlDisplayDrawingObjects")
@js.native
object XlDisplayDrawingObjects extends js.Object {
  @js.native
  sealed trait xlDisplayShapes
    extends activexDashExcelLib.ExcelNs.XlDisplayDrawingObjects
  
  @js.native
  sealed trait xlHide
    extends activexDashExcelLib.ExcelNs.XlDisplayDrawingObjects
  
  @js.native
  sealed trait xlPlaceholders
    extends activexDashExcelLib.ExcelNs.XlDisplayDrawingObjects
  
  /* -4104 */ val xlDisplayShapes: xlDisplayShapes with scala.Double = js.native
  /* 3 */ val xlHide: xlHide with scala.Double = js.native
  /* 2 */ val xlPlaceholders: xlPlaceholders with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDisplayDrawingObjects with scala.Double] = js.native
}

