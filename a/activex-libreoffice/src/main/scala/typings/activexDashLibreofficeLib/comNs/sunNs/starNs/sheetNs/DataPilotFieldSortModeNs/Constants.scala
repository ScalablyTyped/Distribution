package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldSortModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.DataPilotFieldSortMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DATA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldSortModeNs.Constants
  
  @js.native
  sealed trait MANUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldSortModeNs.Constants
  
  @js.native
  sealed trait NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldSortModeNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldSortModeNs.Constants
  
  /* 3 */ val DATA: DATA with scala.Double = js.native
  /* 1 */ val MANUAL: MANUAL with scala.Double = js.native
  /* 2 */ val NAME: NAME with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldSortModeNs.Constants with scala.Double
  ] = js.native
}

