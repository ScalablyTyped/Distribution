package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Module")
@js.native
class Module protected () extends js.Object {
  val Application: Application = js.native
  val CodeName: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var `Excel.Module_typekey`: Module = js.native
  val Index: scala.Double = js.native
  var Name: java.lang.String = js.native
  val Next: js.Any = js.native
  var OnDoubleClick: java.lang.String = js.native
  var OnSheetActivate: java.lang.String = js.native
  var OnSheetDeactivate: java.lang.String = js.native
  val PageSetup: PageSetup = js.native
  val Parent: js.Any = js.native
  val Previous: js.Any = js.native
  val ProtectContents: scala.Boolean = js.native
  val ProtectionMode: scala.Boolean = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  var Visible: XlSheetVisibility = js.native
  var _CodeName: java.lang.String = js.native
  def Activate(): scala.Unit = js.native
  def Copy(): scala.Unit = js.native
  def Copy(Before: js.Any): scala.Unit = js.native
  def Copy(Before: js.Any, After: js.Any): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def InsertFile(Filename: js.Any): js.Any = js.native
  def InsertFile(Filename: js.Any, Merge: js.Any): js.Any = js.native
  def Move(): scala.Unit = js.native
  def Move(Before: js.Any): scala.Unit = js.native
  def Move(Before: js.Any, After: js.Any): scala.Unit = js.native
  def PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Protect(): scala.Unit = js.native
  def Protect(Password: js.Any): scala.Unit = js.native
  def Protect(Password: js.Any, DrawingObjects: js.Any): scala.Unit = js.native
  def Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any): scala.Unit = js.native
  def Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): scala.Unit = js.native
  def Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): scala.Unit = js.native
  def SaveAs(
    Filename: java.lang.String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: js.Any): scala.Unit = js.native
  def Shapes(Index: java.lang.String): Shape = js.native
  def Shapes(Index: scala.Double): Shape = js.native
  def Unprotect(): scala.Unit = js.native
  def Unprotect(Password: js.Any): scala.Unit = js.native
  def _PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def _Protect(): scala.Unit = js.native
  def _Protect(Password: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any): scala.Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): scala.Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): scala.Unit = js.native
  def _SaveAs(
    Filename: java.lang.String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def __PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): scala.Unit = js.native
}

