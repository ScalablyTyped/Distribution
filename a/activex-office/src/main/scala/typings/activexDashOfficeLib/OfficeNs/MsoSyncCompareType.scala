package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSyncCompareType extends js.Object

@JSGlobal("Office.MsoSyncCompareType")
@js.native
object MsoSyncCompareType extends js.Object {
  @js.native
  sealed trait msoSyncCompareAndMerge
    extends activexDashOfficeLib.OfficeNs.MsoSyncCompareType
  
  @js.native
  sealed trait msoSyncCompareSideBySide
    extends activexDashOfficeLib.OfficeNs.MsoSyncCompareType
  
  /* 0 */ val msoSyncCompareAndMerge: msoSyncCompareAndMerge with scala.Double = js.native
  /* 1 */ val msoSyncCompareSideBySide: msoSyncCompareSideBySide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSyncCompareType with scala.Double] = js.native
}

