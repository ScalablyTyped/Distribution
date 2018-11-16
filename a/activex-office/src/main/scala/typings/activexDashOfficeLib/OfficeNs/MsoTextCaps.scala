package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextCaps extends js.Object

@JSGlobal("Office.MsoTextCaps")
@js.native
object MsoTextCaps extends js.Object {
  @js.native
  sealed trait msoAllCaps
    extends activexDashOfficeLib.OfficeNs.MsoTextCaps
  
  @js.native
  sealed trait msoCapsMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextCaps
  
  @js.native
  sealed trait msoNoCaps
    extends activexDashOfficeLib.OfficeNs.MsoTextCaps
  
  @js.native
  sealed trait msoSmallCaps
    extends activexDashOfficeLib.OfficeNs.MsoTextCaps
  
  /* 2 */ val msoAllCaps: msoAllCaps with scala.Double = js.native
  /* -2 */ val msoCapsMixed: msoCapsMixed with scala.Double = js.native
  /* 0 */ val msoNoCaps: msoNoCaps with scala.Double = js.native
  /* 1 */ val msoSmallCaps: msoSmallCaps with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextCaps with scala.Double] = js.native
}

