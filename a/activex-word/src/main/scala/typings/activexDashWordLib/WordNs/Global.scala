package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Global")
@js.native
class Global protected () extends js.Object {
  val ActiveDocument: Document = js.native
  var ActivePrinter: java.lang.String = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: Window = js.native
  val AddIns: AddIns = js.native
  val AnswerWizard: activexDashOfficeLib.OfficeNs.AnswerWizard = js.native
  val Application: Application = js.native
  val Assistant: activexDashOfficeLib.OfficeNs.Assistant = js.native
  val AutoCaptions: AutoCaptions = js.native
  val AutoCorrect: AutoCorrect = js.native
  val AutoCorrectEmail: AutoCorrect = js.native
  val CaptionLabels: CaptionLabels = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  val Creator: scala.Double = js.native
  val CustomDictionaries: Dictionaries = js.native
  var CustomizationContext: js.Any = js.native
  val Dialogs: Dialogs = js.native
  val Documents: Documents = js.native
  val FileConverters: FileConverters = js.native
  val FontNames: FontNames = js.native
  val HangulHanjaDictionaries: HangulHanjaConversionDictionaries = js.native
  val IsSandboxed: scala.Boolean = js.native
  val KeyBindings: KeyBindings = js.native
  val LandscapeFontNames: FontNames = js.native
  val LanguageSettings: activexDashOfficeLib.OfficeNs.LanguageSettings = js.native
  val Languages: Languages = js.native
  val ListGalleries: ListGalleries = js.native
  val MacroContainer: js.Any = js.native
  val Name: java.lang.String = js.native
  val NormalTemplate: Template = js.native
  val Options: Options = js.native
  val Parent: js.Any = js.native
  val PortraitFontNames: FontNames = js.native
  var PrintPreview: scala.Boolean = js.native
  val ProtectedViewWindows: ProtectedViewWindows = js.native
  val RecentFiles: RecentFiles = js.native
  val Selection: Selection = js.native
  var ShowVisualBasicEditor: scala.Boolean = js.native
  val StatusBar: java.lang.String = js.native
  val System: System = js.native
  val Tasks: Tasks = js.native
  val Templates: Templates = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  val Windows: Windows = js.native
  var `Word.Global_typekey`: Global = js.native
  val WordBasic: js.Any = js.native
  def BuildKeyCode(Arg1: WdKey): scala.Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any): scala.Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.Any): scala.Double = js.native
  def BuildKeyCode(Arg1: WdKey, Arg2: js.Any, Arg3: js.Any, Arg4: js.Any): scala.Double = js.native
  def CentimetersToPoints(Centimeters: scala.Double): scala.Double = js.native
  def ChangeFileOpenDirectory(Path: java.lang.String): scala.Unit = js.native
  def CheckSpelling(
    Word: java.lang.String,
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
  ): scala.Boolean = js.native
  def CleanString(String: java.lang.String): java.lang.String = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def DDEExecute(Channel: scala.Double, Command: java.lang.String): scala.Unit = js.native
  def DDEInitiate(App: java.lang.String, Topic: java.lang.String): scala.Double = js.native
  def DDEPoke(Channel: scala.Double, Item: java.lang.String, Data: java.lang.String): scala.Unit = js.native
  def DDERequest(Channel: scala.Double, Item: java.lang.String): java.lang.String = js.native
  def DDETerminate(Channel: scala.Double): scala.Unit = js.native
  def DDETerminateAll(): scala.Unit = js.native
  def FindKey(KeyCode: scala.Double): KeyBinding = js.native
  def FindKey(KeyCode: scala.Double, KeyCode2: js.Any): KeyBinding = js.native
  def GetSpellingSuggestions(
    Word: java.lang.String,
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
  def Help(HelpType: js.Any): scala.Unit = js.native
  def InchesToPoints(Inches: scala.Double): scala.Double = js.native
  def IsObjectValid(Object: js.Any): scala.Boolean = js.native
  def KeyString(KeyCode: scala.Double): java.lang.String = js.native
  def KeyString(KeyCode: scala.Double, KeyCode2: js.Any): java.lang.String = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: java.lang.String): KeysBoundTo = js.native
  def KeysBoundTo(KeyCategory: WdKeyCategory, Command: java.lang.String, CommandParameter: js.Any): KeysBoundTo = js.native
  def LinesToPoints(Lines: scala.Double): scala.Double = js.native
  def MillimetersToPoints(Millimeters: scala.Double): scala.Double = js.native
  def NewWindow(): Window = js.native
  def PicasToPoints(Picas: scala.Double): scala.Double = js.native
  def PixelsToPoints(Pixels: scala.Double): scala.Double = js.native
  def PixelsToPoints(Pixels: scala.Double, fVertical: js.Any): scala.Double = js.native
  def PointsToCentimeters(Points: scala.Double): scala.Double = js.native
  def PointsToInches(Points: scala.Double): scala.Double = js.native
  def PointsToLines(Points: scala.Double): scala.Double = js.native
  def PointsToMillimeters(Points: scala.Double): scala.Double = js.native
  def PointsToPicas(Points: scala.Double): scala.Double = js.native
  def PointsToPixels(Points: scala.Double): scala.Double = js.native
  def PointsToPixels(Points: scala.Double, fVertical: js.Any): scala.Double = js.native
  def Repeat(): scala.Boolean = js.native
  def Repeat(Times: js.Any): scala.Boolean = js.native
  def SynonymInfo(Word: java.lang.String): SynonymInfo = js.native
  def SynonymInfo(Word: java.lang.String, LanguageID: js.Any): SynonymInfo = js.native
}

