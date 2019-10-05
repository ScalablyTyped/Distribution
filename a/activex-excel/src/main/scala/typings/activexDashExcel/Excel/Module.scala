package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Module")
@js.native
class Module protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val CodeName: String = js.native
  val Creator: XlCreator = js.native
  var `Excel.Module_typekey`: Module = js.native
  val Index: Double = js.native
  var Name: String = js.native
  val Next: js.Any = js.native
  var OnDoubleClick: String = js.native
  var OnSheetActivate: String = js.native
  var OnSheetDeactivate: String = js.native
  val PageSetup: typings.activexDashExcel.Excel.PageSetup = js.native
  val Parent: js.Any = js.native
  val Previous: js.Any = js.native
  val ProtectContents: Boolean = js.native
  val ProtectionMode: Boolean = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  var Visible: XlSheetVisibility = js.native
  var _CodeName: String = js.native
  def Activate(): Unit = js.native
  def Copy(): Unit = js.native
  def Copy(Before: js.Any): Unit = js.native
  def Copy(Before: js.Any, After: js.Any): Unit = js.native
  def Delete(): Unit = js.native
  def InsertFile(Filename: js.Any): js.Any = js.native
  def InsertFile(Filename: js.Any, Merge: js.Any): js.Any = js.native
  def Move(): Unit = js.native
  def Move(Before: js.Any): Unit = js.native
  def Move(Before: js.Any, After: js.Any): Unit = js.native
  def PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): Unit = js.native
  def Protect(): Unit = js.native
  def Protect(Password: js.Any): Unit = js.native
  def Protect(Password: js.Any, DrawingObjects: js.Any): Unit = js.native
  def Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any): Unit = js.native
  def Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): Unit = js.native
  def Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): Unit = js.native
  def Select(): Unit = js.native
  def Select(Replace: js.Any): Unit = js.native
  def Shapes(Index: String): Shape = js.native
  def Shapes(Index: Double): Shape = js.native
  def Unprotect(): Unit = js.native
  def Unprotect(Password: js.Any): Unit = js.native
  def _PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): Unit = js.native
  def _Protect(): Unit = js.native
  def _Protect(Password: js.Any): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any): Unit = js.native
  def _Protect(Password: js.Any, DrawingObjects: js.Any, Contents: js.Any, Scenarios: js.Any): Unit = js.native
  def _Protect(
    Password: js.Any,
    DrawingObjects: js.Any,
    Contents: js.Any,
    Scenarios: js.Any,
    UserInterfaceOnly: js.Any
  ): Unit = js.native
  def _SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    ReadOnlyRecommended: js.UndefOr[js.Any],
    CreateBackup: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any],
    TextCodepage: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): Unit = js.native
  def __PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): Unit = js.native
}

