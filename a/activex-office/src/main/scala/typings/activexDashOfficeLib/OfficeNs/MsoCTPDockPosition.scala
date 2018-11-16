package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoCTPDockPosition extends js.Object

@JSGlobal("Office.MsoCTPDockPosition")
@js.native
object MsoCTPDockPosition extends js.Object {
  @js.native
  sealed trait msoCTPDockPositionBottom
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPosition
  
  @js.native
  sealed trait msoCTPDockPositionFloating
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPosition
  
  @js.native
  sealed trait msoCTPDockPositionLeft
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPosition
  
  @js.native
  sealed trait msoCTPDockPositionRight
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPosition
  
  @js.native
  sealed trait msoCTPDockPositionTop
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPosition
  
  /* 3 */ val msoCTPDockPositionBottom: msoCTPDockPositionBottom with scala.Double = js.native
  /* 4 */ val msoCTPDockPositionFloating: msoCTPDockPositionFloating with scala.Double = js.native
  /* 0 */ val msoCTPDockPositionLeft: msoCTPDockPositionLeft with scala.Double = js.native
  /* 2 */ val msoCTPDockPositionRight: msoCTPDockPositionRight with scala.Double = js.native
  /* 1 */ val msoCTPDockPositionTop: msoCTPDockPositionTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoCTPDockPosition with scala.Double] = js.native
}

