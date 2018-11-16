package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTickLabelOrientation extends js.Object

@JSGlobal("Excel.XlTickLabelOrientation")
@js.native
object XlTickLabelOrientation extends js.Object {
  @js.native
  sealed trait xlTickLabelOrientationAutomatic
    extends activexDashExcelLib.ExcelNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationDownward
    extends activexDashExcelLib.ExcelNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationHorizontal
    extends activexDashExcelLib.ExcelNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationUpward
    extends activexDashExcelLib.ExcelNs.XlTickLabelOrientation
  
  @js.native
  sealed trait xlTickLabelOrientationVertical
    extends activexDashExcelLib.ExcelNs.XlTickLabelOrientation
  
  /* -4105 */ val xlTickLabelOrientationAutomatic: xlTickLabelOrientationAutomatic with scala.Double = js.native
  /* -4170 */ val xlTickLabelOrientationDownward: xlTickLabelOrientationDownward with scala.Double = js.native
  /* -4128 */ val xlTickLabelOrientationHorizontal: xlTickLabelOrientationHorizontal with scala.Double = js.native
  /* -4171 */ val xlTickLabelOrientationUpward: xlTickLabelOrientationUpward with scala.Double = js.native
  /* -4166 */ val xlTickLabelOrientationVertical: xlTickLabelOrientationVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTickLabelOrientation with scala.Double] = js.native
}

