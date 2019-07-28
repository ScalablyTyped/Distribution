package typings.activexDashWord.WordNs

import typings.activexDashOffice.OfficeNs.CommandBar
import typings.activexDashOffice.OfficeNs.CommandBars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Global")
@js.native
class Global protected () extends js.Object {
  val ActiveDocument: Document = js.native
  var ActivePrinter: String = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: Window = js.native
  val AddIns: typings.activexDashWord.WordNs.AddIns = js.native
  val AnswerWizard: typings.activexDashOffice.OfficeNs.AnswerWizard = js.native
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Assistant: typings.activexDashOffice.OfficeNs.Assistant = js.native
  val AutoCaptions: typings.activexDashWord.WordNs.AutoCaptions = js.native
  val AutoCorrect: typings.activexDashWord.WordNs.AutoCorrect = js.native
  val AutoCorrectEmail: typings.activexDashWord.WordNs.AutoCorrect = js.native
  val CaptionLabels: typings.activexDashWord.WordNs.CaptionLabels = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  val Creator: Double = js.native
  val CustomDictionaries: Dictionaries = js.native
  var CustomizationContext: js.Any = js.native
  val Dialogs: typings.activexDashWord.WordNs.Dialogs = js.native
  val Documents: typings.activexDashWord.WordNs.Documents = js.native
  val FileConverters: typings.activexDashWord.WordNs.FileConverters = js.native
  val FontNames: typings.activexDashWord.WordNs.FontNames = js.native
  val HangulHanjaDictionaries: HangulHanjaConversionDictionaries = js.native
  val IsSandboxed: Boolean = js.native
  val KeyBindings: typings.activexDashWord.WordNs.KeyBindings = js.native
  val LandscapeFontNames: typings.activexDashWord.WordNs.FontNames = js.native
  val LanguageSettings: typings.activexDashOffice.OfficeNs.LanguageSettings = js.native
  val Languages: typings.activexDashWord.WordNs.Languages = js.native
  val ListGalleries: typings.activexDashWord.WordNs.ListGalleries = js.native
  val MacroContainer: js.Any = js.native
  val Name: String = js.native
  val NormalTemplate: Template = js.native
  val Options: typings.activexDashWord.WordNs.Options = js.native
  val Parent: js.Any = js.native
  val PortraitFontNames: typings.activexDashWord.WordNs.FontNames = js.native
  var PrintPreview: Boolean = js.native
  val ProtectedViewWindows: typings.activexDashWord.WordNs.ProtectedViewWindows = js.native
  val RecentFiles: typings.activexDashWord.WordNs.RecentFiles = js.native
  val Selection: typings.activexDashWord.WordNs.Selection = js.native
  var ShowVisualBasicEditor: Boolean = js.native
  val StatusBar: String = js.native
  val System: typings.activexDashWord.WordNs.System = js.native
  val Tasks: typings.activexDashWord.WordNs.Tasks = js.native
  val Templates: typings.activexDashWord.WordNs.Templates = js.native
  val VBE: typings.activexDashVbide.VBIDENs.VBE = js.native
  val Windows: typings.activexDashWord.WordNs.Windows = js.native
  var `Word.Global_typekey`: Global = js.native
  val WordBasic: js.Any = js.native
  def BuildKeyCode(Arg1: WdKey): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.Any, Arg4: js.Any): Double = js.native
  def CentimetersToPoints(Centimeters: Double): Double = js.native
  def ChangeFileOpenDirectory(Path: String): Unit = js.native
  def CheckSpelling(
    Word: String,
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    MainDictionary: js.UndefOr[js.Any],
    CustomDictionary2: js.UndefOr[js.Any],
    CustomDictionary3: js.UndefOr[js.Any],
    CustomDictionary4: js.UndefOr[js.Any],
    CustomDictionary5: js.UndefOr[js.Any],
    CustomDictionary6: js.UndefOr[js.Any],
    CustomDictionary7: js.UndefOr[js.Any],
    CustomDictionary8: js.UndefOr[js.Any],
    CustomDictionary9: js.UndefOr[js.Any],
    CustomDictionary10: js.UndefOr[js.Any]
  ): Boolean = js.native
  def CleanString(String: String): String = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  def DDEExecute(Channel: Double, Command: String): Unit = js.native
  def DDEInitiate(App: String, Topic: String): Double = js.native
  def DDEPoke(Channel: Double, Item: String, Data: String): Unit = js.native
  def DDERequest(Channel: Double, Item: String): String = js.native
  def DDETerminate(Channel: Double): Unit = js.native
  def DDETerminateAll(): Unit = js.native
  def FindKey(KeyCode: Double): KeyBinding = js.native
  def FindKey(KeyCode: Double, KeyCode2: js.Any): KeyBinding = js.native
  def GetSpellingSuggestions(
    Word: String,
    CustomDictionary: js.UndefOr[js.Any],
    IgnoreUppercase: js.UndefOr[js.Any],
    MainDictionary: js.UndefOr[js.Any],
    SuggestionMode: js.UndefOr[js.Any],
    CustomDictionary2: js.UndefOr[js.Any],
    CustomDictionary3: js.UndefOr[js.Any],
    CustomDictionary4: js.UndefOr[js.Any],
    CustomDictionary5: js.UndefOr[js.Any],
    CustomDictionary6: js.UndefOr[js.Any],
    CustomDictionary7: js.UndefOr[js.Any],
    CustomDictionary8: js.UndefOr[js.Any],
    CustomDictionary9: js.UndefOr[js.Any],
    CustomDictionary10: js.UndefOr[js.Any]
  ): SpellingSuggestions = js.native
  def Help(HelpType: js.Any): Unit = js.native
  def InchesToPoints(Inches: Double): Double = js.native
  def IsObjectValid(Object: js.Any): Boolean = js.native
  def KeyString(KeyCode: Double): String = js.native
  def KeyString(KeyCode: Double, KeyCode2: js.Any): String = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String): typings.activexDashWord.WordNs.KeysBoundTo = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String, CommandParameter: js.Any): typings.activexDashWord.WordNs.KeysBoundTo = js.native
  def LinesToPoints(Lines: Double): Double = js.native
  def MillimetersToPoints(Millimeters: Double): Double = js.native
  def NewWindow(): Window = js.native
  def PicasToPoints(Picas: Double): Double = js.native
  def PixelsToPoints(Pixels: Double): Double = js.native
  def PixelsToPoints(Pixels: Double, fVertical: js.Any): Double = js.native
  def PointsToCentimeters(Points: Double): Double = js.native
  def PointsToInches(Points: Double): Double = js.native
  def PointsToLines(Points: Double): Double = js.native
  def PointsToMillimeters(Points: Double): Double = js.native
  def PointsToPicas(Points: Double): Double = js.native
  def PointsToPixels(Points: Double): Double = js.native
  def PointsToPixels(Points: Double, fVertical: js.Any): Double = js.native
  def Repeat(): Boolean = js.native
  def Repeat(Times: js.Any): Boolean = js.native
  def SynonymInfo(Word: String): typings.activexDashWord.WordNs.SynonymInfo = js.native
  def SynonymInfo(Word: String, LanguageID: js.Any): typings.activexDashWord.WordNs.SynonymInfo = js.native
}

