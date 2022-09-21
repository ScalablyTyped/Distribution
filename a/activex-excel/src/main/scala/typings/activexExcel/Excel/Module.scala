package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Module extends StObject {
  
  def Activate(): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val CodeName: String = js.native
  
  def Copy(): Unit = js.native
  def Copy(Before: Any): Unit = js.native
  def Copy(Before: Any, After: Any): Unit = js.native
  def Copy(Before: Unit, After: Any): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  /* private */ @JSName("Excel.Module_typekey")
  var ExcelDotModule_typekey: Module = js.native
  
  val Index: Double = js.native
  
  def InsertFile(Filename: Any): Any = js.native
  def InsertFile(Filename: Any, Merge: Any): Any = js.native
  
  def Move(): Unit = js.native
  def Move(Before: Any): Unit = js.native
  def Move(Before: Any, After: Any): Unit = js.native
  def Move(Before: Unit, After: Any): Unit = js.native
  
  var Name: String = js.native
  
  val Next: Any = js.native
  
  var OnDoubleClick: String = js.native
  
  var OnSheetActivate: String = js.native
  
  var OnSheetDeactivate: String = js.native
  
  val PageSetup: typings.activexExcel.Excel.PageSetup = js.native
  
  val Parent: Any = js.native
  
  val Previous: Any = js.native
  
  def PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any]
  ): Unit = js.native
  
  def Protect(): Unit = js.native
  def Protect(Password: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Any, Contents: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Unit, Contents: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Any, Contents: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  
  val ProtectContents: Boolean = js.native
  
  val ProtectionMode: Boolean = js.native
  
  def SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    WriteResPassword: js.UndefOr[Any],
    ReadOnlyRecommended: js.UndefOr[Any],
    CreateBackup: js.UndefOr[Any],
    AddToMru: js.UndefOr[Any],
    TextCodepage: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any]
  ): Unit = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: Any): Unit = js.native
  
  def Shapes(Index: String): Shape = js.native
  def Shapes(Index: Double): Shape = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  
  def Unprotect(): Unit = js.native
  def Unprotect(Password: Any): Unit = js.native
  
  var Visible: XlSheetVisibility = js.native
  
  var _CodeName: String = js.native
  
  def _PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any]
  ): Unit = js.native
  
  def _Protect(): Unit = js.native
  def _Protect(Password: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  
  def _SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    WriteResPassword: js.UndefOr[Any],
    ReadOnlyRecommended: js.UndefOr[Any],
    CreateBackup: js.UndefOr[Any],
    AddToMru: js.UndefOr[Any],
    TextCodepage: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any]
  ): Unit = js.native
  
  def __PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any]
  ): Unit = js.native
}
