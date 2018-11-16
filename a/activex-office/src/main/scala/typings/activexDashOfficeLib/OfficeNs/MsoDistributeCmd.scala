package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoDistributeCmd extends js.Object

@JSGlobal("Office.MsoDistributeCmd")
@js.native
object MsoDistributeCmd extends js.Object {
  @js.native
  sealed trait msoDistributeHorizontally
    extends activexDashOfficeLib.OfficeNs.MsoDistributeCmd
  
  @js.native
  sealed trait msoDistributeVertically
    extends activexDashOfficeLib.OfficeNs.MsoDistributeCmd
  
  /* 0 */ val msoDistributeHorizontally: msoDistributeHorizontally with scala.Double = js.native
  /* 1 */ val msoDistributeVertically: msoDistributeVertically with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoDistributeCmd with scala.Double] = js.native
}

