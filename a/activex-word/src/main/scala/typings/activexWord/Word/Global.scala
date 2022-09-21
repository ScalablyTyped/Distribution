package typings.activexWord.Word

import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends StObject {
  
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
  
  def BuildKeyCode(Arg1: WdKey): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Any, Arg3: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Any, Arg3: Any, Arg4: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Any, Arg3: Unit, Arg4: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Unit, Arg3: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Unit, Arg3: Any, Arg4: Any): Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: Unit, Arg3: Unit, Arg4: Any): Double = js.native
  
  val CaptionLabels: typings.activexWord.Word.CaptionLabels = js.native
  
  def CentimetersToPoints(Centimeters: Double): Double = js.native
  
  def ChangeFileOpenDirectory(Path: String): Unit = js.native
  
  def CheckSpelling(
    Word: String,
    CustomDictionary: js.UndefOr[Any],
    IgnoreUppercase: js.UndefOr[Any],
    MainDictionary: js.UndefOr[Any],
    CustomDictionary2: js.UndefOr[Any],
    CustomDictionary3: js.UndefOr[Any],
    CustomDictionary4: js.UndefOr[Any],
    CustomDictionary5: js.UndefOr[Any],
    CustomDictionary6: js.UndefOr[Any],
    CustomDictionary7: js.UndefOr[Any],
    CustomDictionary8: js.UndefOr[Any],
    CustomDictionary9: js.UndefOr[Any],
    CustomDictionary10: js.UndefOr[Any]
  ): Boolean = js.native
  
  def CleanString(String: String): String = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Creator: Double = js.native
  
  val CustomDictionaries: Dictionaries = js.native
  
  var CustomizationContext: Any = js.native
  
  def DDEExecute(Channel: Double, Command: String): Unit = js.native
  
  def DDEInitiate(App: String, Topic: String): Double = js.native
  
  def DDEPoke(Channel: Double, Item: String, Data: String): Unit = js.native
  
  def DDERequest(Channel: Double, Item: String): String = js.native
  
  def DDETerminate(Channel: Double): Unit = js.native
  
  def DDETerminateAll(): Unit = js.native
  
  val Dialogs: typings.activexWord.Word.Dialogs = js.native
  
  val Documents: typings.activexWord.Word.Documents = js.native
  
  val FileConverters: typings.activexWord.Word.FileConverters = js.native
  
  def FindKey(KeyCode: Double): KeyBinding = js.native
  def FindKey(KeyCode: Double, KeyCode2: Any): KeyBinding = js.native
  
  val FontNames: typings.activexWord.Word.FontNames = js.native
  
  def GetSpellingSuggestions(
    Word: String,
    CustomDictionary: js.UndefOr[Any],
    IgnoreUppercase: js.UndefOr[Any],
    MainDictionary: js.UndefOr[Any],
    SuggestionMode: js.UndefOr[Any],
    CustomDictionary2: js.UndefOr[Any],
    CustomDictionary3: js.UndefOr[Any],
    CustomDictionary4: js.UndefOr[Any],
    CustomDictionary5: js.UndefOr[Any],
    CustomDictionary6: js.UndefOr[Any],
    CustomDictionary7: js.UndefOr[Any],
    CustomDictionary8: js.UndefOr[Any],
    CustomDictionary9: js.UndefOr[Any],
    CustomDictionary10: js.UndefOr[Any]
  ): SpellingSuggestions = js.native
  
  val HangulHanjaDictionaries: HangulHanjaConversionDictionaries = js.native
  
  def Help(HelpType: Any): Unit = js.native
  
  def InchesToPoints(Inches: Double): Double = js.native
  
  def IsObjectValid(Object: Any): Boolean = js.native
  
  val IsSandboxed: Boolean = js.native
  
  val KeyBindings: typings.activexWord.Word.KeyBindings = js.native
  
  def KeyString(KeyCode: Double): String = js.native
  def KeyString(KeyCode: Double, KeyCode2: Any): String = js.native
  
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String): typings.activexWord.Word.KeysBoundTo = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: String, CommandParameter: Any): typings.activexWord.Word.KeysBoundTo = js.native
  
  val LandscapeFontNames: typings.activexWord.Word.FontNames = js.native
  
  val LanguageSettings: typings.activexOffice.Office.LanguageSettings = js.native
  
  val Languages: typings.activexWord.Word.Languages = js.native
  
  def LinesToPoints(Lines: Double): Double = js.native
  
  val ListGalleries: typings.activexWord.Word.ListGalleries = js.native
  
  val MacroContainer: Any = js.native
  
  def MillimetersToPoints(Millimeters: Double): Double = js.native
  
  val Name: String = js.native
  
  def NewWindow(): Window = js.native
  
  val NormalTemplate: Template = js.native
  
  val Options: typings.activexWord.Word.Options = js.native
  
  val Parent: Any = js.native
  
  def PicasToPoints(Picas: Double): Double = js.native
  
  def PixelsToPoints(Pixels: Double): Double = js.native
  def PixelsToPoints(Pixels: Double, fVertical: Any): Double = js.native
  
  def PointsToCentimeters(Points: Double): Double = js.native
  
  def PointsToInches(Points: Double): Double = js.native
  
  def PointsToLines(Points: Double): Double = js.native
  
  def PointsToMillimeters(Points: Double): Double = js.native
  
  def PointsToPicas(Points: Double): Double = js.native
  
  def PointsToPixels(Points: Double): Double = js.native
  def PointsToPixels(Points: Double, fVertical: Any): Double = js.native
  
  val PortraitFontNames: typings.activexWord.Word.FontNames = js.native
  
  var PrintPreview: Boolean = js.native
  
  val ProtectedViewWindows: typings.activexWord.Word.ProtectedViewWindows = js.native
  
  val RecentFiles: typings.activexWord.Word.RecentFiles = js.native
  
  def Repeat(): Boolean = js.native
  def Repeat(Times: Any): Boolean = js.native
  
  val Selection: typings.activexWord.Word.Selection = js.native
  
  var ShowVisualBasicEditor: Boolean = js.native
  
  val StatusBar: String = js.native
  
  def SynonymInfo(Word: String): typings.activexWord.Word.SynonymInfo = js.native
  def SynonymInfo(Word: String, LanguageID: Any): typings.activexWord.Word.SynonymInfo = js.native
  
  val System: typings.activexWord.Word.System = js.native
  
  val Tasks: typings.activexWord.Word.Tasks = js.native
  
  val Templates: typings.activexWord.Word.Templates = js.native
  
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  
  val Windows: typings.activexWord.Word.Windows = js.native
  
  val WordBasic: Any = js.native
  
  /* private */ @JSName("Word.Global_typekey")
  var WordDotGlobal_typekey: Global = js.native
}
