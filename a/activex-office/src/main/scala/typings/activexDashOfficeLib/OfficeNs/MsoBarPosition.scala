package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBarPosition extends js.Object

@JSGlobal("Office.MsoBarPosition")
@js.native
object MsoBarPosition extends js.Object {
  @js.native
  sealed trait msoBarBottom
    extends activexDashOfficeLib.OfficeNs.MsoBarPosition
  
  @js.native
  sealed trait msoBarFloating
    extends activexDashOfficeLib.OfficeNs.MsoBarPosition
  
  @js.native
  sealed trait msoBarLeft
    extends activexDashOfficeLib.OfficeNs.MsoBarPosition
  
  @js.native
  sealed trait msoBarMenuBar
    extends activexDashOfficeLib.OfficeNs.MsoBarPosition
  
  @js.native
  sealed trait msoBarPopup
    extends activexDashOfficeLib.OfficeNs.MsoBarPosition
  
  @js.native
  sealed trait msoBarRight
    extends activexDashOfficeLib.OfficeNs.MsoBarPosition
  
  @js.native
  sealed trait msoBarTop
    extends activexDashOfficeLib.OfficeNs.MsoBarPosition
  
  /* 3 */ val msoBarBottom: msoBarBottom with scala.Double = js.native
  /* 4 */ val msoBarFloating: msoBarFloating with scala.Double = js.native
  /* 0 */ val msoBarLeft: msoBarLeft with scala.Double = js.native
  /* 6 */ val msoBarMenuBar: msoBarMenuBar with scala.Double = js.native
  /* 5 */ val msoBarPopup: msoBarPopup with scala.Double = js.native
  /* 2 */ val msoBarRight: msoBarRight with scala.Double = js.native
  /* 1 */ val msoBarTop: msoBarTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBarPosition with scala.Double] = js.native
}

