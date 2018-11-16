package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoOLEMenuGroup extends js.Object

@JSGlobal("Office.MsoOLEMenuGroup")
@js.native
object MsoOLEMenuGroup extends js.Object {
  @js.native
  sealed trait msoOLEMenuGroupContainer
    extends activexDashOfficeLib.OfficeNs.MsoOLEMenuGroup
  
  @js.native
  sealed trait msoOLEMenuGroupEdit
    extends activexDashOfficeLib.OfficeNs.MsoOLEMenuGroup
  
  @js.native
  sealed trait msoOLEMenuGroupFile
    extends activexDashOfficeLib.OfficeNs.MsoOLEMenuGroup
  
  @js.native
  sealed trait msoOLEMenuGroupHelp
    extends activexDashOfficeLib.OfficeNs.MsoOLEMenuGroup
  
  @js.native
  sealed trait msoOLEMenuGroupNone
    extends activexDashOfficeLib.OfficeNs.MsoOLEMenuGroup
  
  @js.native
  sealed trait msoOLEMenuGroupObject
    extends activexDashOfficeLib.OfficeNs.MsoOLEMenuGroup
  
  @js.native
  sealed trait msoOLEMenuGroupWindow
    extends activexDashOfficeLib.OfficeNs.MsoOLEMenuGroup
  
  /* 2 */ val msoOLEMenuGroupContainer: msoOLEMenuGroupContainer with scala.Double = js.native
  /* 1 */ val msoOLEMenuGroupEdit: msoOLEMenuGroupEdit with scala.Double = js.native
  /* 0 */ val msoOLEMenuGroupFile: msoOLEMenuGroupFile with scala.Double = js.native
  /* 5 */ val msoOLEMenuGroupHelp: msoOLEMenuGroupHelp with scala.Double = js.native
  /* -1 */ val msoOLEMenuGroupNone: msoOLEMenuGroupNone with scala.Double = js.native
  /* 3 */ val msoOLEMenuGroupObject: msoOLEMenuGroupObject with scala.Double = js.native
  /* 4 */ val msoOLEMenuGroupWindow: msoOLEMenuGroupWindow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoOLEMenuGroup with scala.Double] = js.native
}

