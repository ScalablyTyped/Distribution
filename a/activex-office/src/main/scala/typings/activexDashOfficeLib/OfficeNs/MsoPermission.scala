package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoPermission extends js.Object

@JSGlobal("Office.MsoPermission")
@js.native
object MsoPermission extends js.Object {
  @js.native
  sealed trait msoPermissionAllCommon
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionChange
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionEdit
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionExtract
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionFullControl
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionObjModel
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionPrint
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionRead
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionSave
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  @js.native
  sealed trait msoPermissionView
    extends activexDashOfficeLib.OfficeNs.MsoPermission
  
  /* 127 */ val msoPermissionAllCommon: msoPermissionAllCommon with scala.Double = js.native
  /* 15 */ val msoPermissionChange: msoPermissionChange with scala.Double = js.native
  /* 2 */ val msoPermissionEdit: msoPermissionEdit with scala.Double = js.native
  /* 8 */ val msoPermissionExtract: msoPermissionExtract with scala.Double = js.native
  /* 64 */ val msoPermissionFullControl: msoPermissionFullControl with scala.Double = js.native
  /* 32 */ val msoPermissionObjModel: msoPermissionObjModel with scala.Double = js.native
  /* 16 */ val msoPermissionPrint: msoPermissionPrint with scala.Double = js.native
  /* 1 */ val msoPermissionRead: msoPermissionRead with scala.Double = js.native
  /* 4 */ val msoPermissionSave: msoPermissionSave with scala.Double = js.native
  /* 1 */ val msoPermissionView: msoPermissionView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoPermission with scala.Double] = js.native
}

