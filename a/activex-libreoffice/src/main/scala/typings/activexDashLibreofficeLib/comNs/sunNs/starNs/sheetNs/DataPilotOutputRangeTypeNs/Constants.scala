package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotOutputRangeTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.DataPilotOutputRangeType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait RESULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotOutputRangeTypeNs.Constants
  
  @js.native
  sealed trait TABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotOutputRangeTypeNs.Constants
  
  @js.native
  sealed trait WHOLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotOutputRangeTypeNs.Constants
  
  /* 2 */ val RESULT: RESULT with scala.Double = js.native
  /* 1 */ val TABLE: TABLE with scala.Double = js.native
  /* 0 */ val WHOLE: WHOLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotOutputRangeTypeNs.Constants with scala.Double
  ] = js.native
}

