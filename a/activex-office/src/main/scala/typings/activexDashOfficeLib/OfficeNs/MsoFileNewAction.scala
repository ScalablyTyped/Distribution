package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFileNewAction extends js.Object

@JSGlobal("Office.MsoFileNewAction")
@js.native
object MsoFileNewAction extends js.Object {
  @js.native
  sealed trait msoCreateNewFile
    extends activexDashOfficeLib.OfficeNs.MsoFileNewAction
  
  @js.native
  sealed trait msoEditFile
    extends activexDashOfficeLib.OfficeNs.MsoFileNewAction
  
  @js.native
  sealed trait msoOpenFile
    extends activexDashOfficeLib.OfficeNs.MsoFileNewAction
  
  /* 1 */ val msoCreateNewFile: msoCreateNewFile with scala.Double = js.native
  /* 0 */ val msoEditFile: msoEditFile with scala.Double = js.native
  /* 2 */ val msoOpenFile: msoOpenFile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFileNewAction with scala.Double] = js.native
}

