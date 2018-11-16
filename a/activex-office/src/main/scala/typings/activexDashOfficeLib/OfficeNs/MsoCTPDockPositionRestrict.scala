package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoCTPDockPositionRestrict extends js.Object

@JSGlobal("Office.MsoCTPDockPositionRestrict")
@js.native
object MsoCTPDockPositionRestrict extends js.Object {
  @js.native
  sealed trait msoCTPDockPositionRestrictNoChange
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPositionRestrict
  
  @js.native
  sealed trait msoCTPDockPositionRestrictNoHorizontal
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPositionRestrict
  
  @js.native
  sealed trait msoCTPDockPositionRestrictNoVertical
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPositionRestrict
  
  @js.native
  sealed trait msoCTPDockPositionRestrictNone
    extends activexDashOfficeLib.OfficeNs.MsoCTPDockPositionRestrict
  
  /* 1 */ val msoCTPDockPositionRestrictNoChange: msoCTPDockPositionRestrictNoChange with scala.Double = js.native
  /* 2 */ val msoCTPDockPositionRestrictNoHorizontal: msoCTPDockPositionRestrictNoHorizontal with scala.Double = js.native
  /* 3 */ val msoCTPDockPositionRestrictNoVertical: msoCTPDockPositionRestrictNoVertical with scala.Double = js.native
  /* 0 */ val msoCTPDockPositionRestrictNone: msoCTPDockPositionRestrictNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoCTPDockPositionRestrict with scala.Double] = js.native
}

