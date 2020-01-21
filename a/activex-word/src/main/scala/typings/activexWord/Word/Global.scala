package typings.activexWord.Word

import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
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
  val AddIns: typings.activexWord.Word.AddIns = js.native
  val AnswerWizard: typings.activexOffice.Office.AnswerWizard = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Assistant: typings.activexOffice.Office.Assistant = js.native
  val AutoCaptions: typings.activexWord.Word.AutoCaptions = js.native
  val AutoCorrect: typings.activexWord.Word.AutoCorrect = js.native
  val AutoCorrectEmail: typings.activexWord.Word.AutoCorrect = js.native
  val CaptionLabels: typings.activexWord.Word.CaptionLabels = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  val Creator: Double = js.native
  val CustomDictionaries: Dictionaries = js.native
  var CustomizationContext: js.Any = js.native
  val Dialogs: typings.activexWord.Word.Dialogs = js.native
  val Documents: typings.activexWord.Word.Documents = js.native
  val FileConverters: typings.activexWord.Word.FileConverters = js.native
  val FontNames: typings.activexWord.Word.FontNames = js.native
  val HangulHanjaDictionaries: HangulHanjaConversionDictionaries = js.native
  val IsSandboxed: Boolean = js.native
  val KeyBindings: typings.activexWord.Word.KeyBindings = js.native
  val LandscapeFontNames: typings.activexWord.Word.FontNames = js.native
  val LanguageSettings: typings.activexOffice.Office.LanguageSettings = js.native
  val Languages: typings.activexWord.Word.Languages = js.native
  val ListGalleries: typings.activexWord.Word.ListGalleries = js.native
  val MacroContainer: js.Any = js.native
  val Name: String = js.native
  val NormalTemplate: Template = js.native
  val Options: typings.activexWord.Word.Options = js.native
  val Parent: js.Any = js.native
  val PortraitFontNames: typings.activexWord.Word.FontNames = js.native
  var PrintPreview: Boolean = js.native
  val ProtectedViewWindows: typings.activexWord.Word.ProtectedViewWindows = js.native
  val RecentFiles: typings.activexWord.Word.RecentFiles = js.native
  val Selection: typings.activexWord.Word.Selection = js.native
  var ShowVisualBasicEditor: Boolean = js.native
  val StatusBar: String = js.native
  val System: typings.activexWord.Word.System = js.native
  val Tasks: typings.activexWord.Word.Tasks = js.native
  val Templates: typings.activexWord.Word.Templates = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  val Windows: typings.activexWord.Word.Windows = js.native
  val WordBasic: js.Any = js.native
  @JSName("Word.Global_typekey")
  var WordDotGlobal_typekey: Global = js.native
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
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String): typings.activexWord.Word.KeysBoundTo = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String, CommandParameter: js.Any): typings.activexWord.Word.KeysBoundTo = js.native
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
  def SynonymInfo(Word: String): typings.activexWord.Word.SynonymInfo = js.native
  def SynonymInfo(Word: String, LanguageID: js.Any): typings.activexWord.Word.SynonymInfo = js.native
}

