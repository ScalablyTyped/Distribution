package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCubeFieldSubType extends js.Object

@JSGlobal("Excel.XlCubeFieldSubType")
@js.native
object XlCubeFieldSubType extends js.Object {
  @js.native
  sealed trait xlCubeAttribute
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeCalculatedMeasure
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeHierarchy
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeKPIGoal
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeKPIStatus
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeKPITrend
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeKPIValue
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeKPIWeight
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeMeasure
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  @js.native
  sealed trait xlCubeSet
    extends activexDashExcelLib.ExcelNs.XlCubeFieldSubType
  
  /* 4 */ val xlCubeAttribute: xlCubeAttribute with scala.Double = js.native
  /* 5 */ val xlCubeCalculatedMeasure: xlCubeCalculatedMeasure with scala.Double = js.native
  /* 1 */ val xlCubeHierarchy: xlCubeHierarchy with scala.Double = js.native
  /* 7 */ val xlCubeKPIGoal: xlCubeKPIGoal with scala.Double = js.native
  /* 8 */ val xlCubeKPIStatus: xlCubeKPIStatus with scala.Double = js.native
  /* 9 */ val xlCubeKPITrend: xlCubeKPITrend with scala.Double = js.native
  /* 6 */ val xlCubeKPIValue: xlCubeKPIValue with scala.Double = js.native
  /* 10 */ val xlCubeKPIWeight: xlCubeKPIWeight with scala.Double = js.native
  /* 2 */ val xlCubeMeasure: xlCubeMeasure with scala.Double = js.native
  /* 3 */ val xlCubeSet: xlCubeSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCubeFieldSubType with scala.Double] = js.native
}

