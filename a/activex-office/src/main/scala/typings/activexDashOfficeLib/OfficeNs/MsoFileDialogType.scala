package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFileDialogType extends js.Object

@JSGlobal("Office.MsoFileDialogType")
@js.native
object MsoFileDialogType extends js.Object {
  @js.native
  sealed trait msoFileDialogFilePicker
    extends activexDashOfficeLib.OfficeNs.MsoFileDialogType
  
  @js.native
  sealed trait msoFileDialogFolderPicker
    extends activexDashOfficeLib.OfficeNs.MsoFileDialogType
  
  @js.native
  sealed trait msoFileDialogOpen
    extends activexDashOfficeLib.OfficeNs.MsoFileDialogType
  
  @js.native
  sealed trait msoFileDialogSaveAs
    extends activexDashOfficeLib.OfficeNs.MsoFileDialogType
  
  /* 3 */ val msoFileDialogFilePicker: msoFileDialogFilePicker with scala.Double = js.native
  /* 4 */ val msoFileDialogFolderPicker: msoFileDialogFolderPicker with scala.Double = js.native
  /* 1 */ val msoFileDialogOpen: msoFileDialogOpen with scala.Double = js.native
  /* 2 */ val msoFileDialogSaveAs: msoFileDialogSaveAs with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFileDialogType with scala.Double] = js.native
}

