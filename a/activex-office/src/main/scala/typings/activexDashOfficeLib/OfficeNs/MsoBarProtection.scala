package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBarProtection extends js.Object

@JSGlobal("Office.MsoBarProtection")
@js.native
object MsoBarProtection extends js.Object {
  @js.native
  sealed trait msoBarNoChangeDock
    extends activexDashOfficeLib.OfficeNs.MsoBarProtection
  
  @js.native
  sealed trait msoBarNoChangeVisible
    extends activexDashOfficeLib.OfficeNs.MsoBarProtection
  
  @js.native
  sealed trait msoBarNoCustomize
    extends activexDashOfficeLib.OfficeNs.MsoBarProtection
  
  @js.native
  sealed trait msoBarNoHorizontalDock
    extends activexDashOfficeLib.OfficeNs.MsoBarProtection
  
  @js.native
  sealed trait msoBarNoMove
    extends activexDashOfficeLib.OfficeNs.MsoBarProtection
  
  @js.native
  sealed trait msoBarNoProtection
    extends activexDashOfficeLib.OfficeNs.MsoBarProtection
  
  @js.native
  sealed trait msoBarNoResize
    extends activexDashOfficeLib.OfficeNs.MsoBarProtection
  
  @js.native
  sealed trait msoBarNoVerticalDock
    extends activexDashOfficeLib.OfficeNs.MsoBarProtection
  
  /* 16 */ val msoBarNoChangeDock: msoBarNoChangeDock with scala.Double = js.native
  /* 8 */ val msoBarNoChangeVisible: msoBarNoChangeVisible with scala.Double = js.native
  /* 1 */ val msoBarNoCustomize: msoBarNoCustomize with scala.Double = js.native
  /* 64 */ val msoBarNoHorizontalDock: msoBarNoHorizontalDock with scala.Double = js.native
  /* 4 */ val msoBarNoMove: msoBarNoMove with scala.Double = js.native
  /* 0 */ val msoBarNoProtection: msoBarNoProtection with scala.Double = js.native
  /* 2 */ val msoBarNoResize: msoBarNoResize with scala.Double = js.native
  /* 32 */ val msoBarNoVerticalDock: msoBarNoVerticalDock with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBarProtection with scala.Double] = js.native
}

