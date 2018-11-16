package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCubeFieldType extends js.Object

@JSGlobal("Excel.XlCubeFieldType")
@js.native
object XlCubeFieldType extends js.Object {
  @js.native
  sealed trait xlHierarchy
    extends activexDashExcelLib.ExcelNs.XlCubeFieldType
  
  @js.native
  sealed trait xlMeasure
    extends activexDashExcelLib.ExcelNs.XlCubeFieldType
  
  @js.native
  sealed trait xlSet
    extends activexDashExcelLib.ExcelNs.XlCubeFieldType
  
  /* 1 */ val xlHierarchy: xlHierarchy with scala.Double = js.native
  /* 2 */ val xlMeasure: xlMeasure with scala.Double = js.native
  /* 3 */ val xlSet: xlSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCubeFieldType with scala.Double] = js.native
}

