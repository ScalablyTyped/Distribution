package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Application")
@js.native
class Application protected () extends js.Object {
  val Active: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ActiveEncryptionSession: scala.Double = js.native
  val ActivePresentation: Presentation = js.native
  val ActivePrinter: java.lang.String = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: DocumentWindow = js.native
  val AddIns: AddIns = js.native
  val AnswerWizard: activexDashOfficeLib.OfficeNs.AnswerWizard = js.native
  val Assistance: activexDashOfficeLib.OfficeNs.IAssistance = js.native
  val Assistant: activexDashOfficeLib.OfficeNs.Assistant = js.native
  val AutoCorrect: AutoCorrect = js.native
  var AutomationSecurity: activexDashOfficeLib.OfficeNs.MsoAutomationSecurity = js.native
  val Build: java.lang.String = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: activexDashOfficeLib.OfficeNs.COMAddIns = js.native
  var Caption: java.lang.String = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  val Creator: scala.Double = js.native
  val DefaultWebOptions: DefaultWebOptions = js.native
  val Dialogs: js.Any = js.native
  var DisplayAlerts: PpAlertLevel = js.native
  var DisplayDocumentInformationPanel: scala.Boolean = js.native
  var DisplayGridLines: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var FeatureInstall: activexDashOfficeLib.OfficeNs.MsoFeatureInstall = js.native
  val FileConverters: FileConverters = js.native
  val FileFind: activexDashOfficeLib.OfficeNs.IFind = js.native
  val FileSearch: activexDashOfficeLib.OfficeNs.FileSearch = js.native
  var FileValidation: activexDashOfficeLib.OfficeNs.MsoFileValidationMode = js.native
  var Height: scala.Double = js.native
  val IsSandboxed: scala.Boolean = js.native
  val LanguageSettings: activexDashOfficeLib.OfficeNs.LanguageSettings = js.native
  var Left: scala.Double = js.native
  val Marker: js.Any = js.native
  val MsoDebugOptions: activexDashOfficeLib.OfficeNs.MsoDebugOptions = js.native
  val Name: java.lang.String = js.native
  val NewPresentation: activexDashOfficeLib.OfficeNs.NewFile = js.native
  val OperatingSystem: java.lang.String = js.native
  val Options: Options = js.native
  val Path: java.lang.String = js.native
  var `PowerPoint.Application_typekey`: Application = js.native
  val Presentations: Presentations = js.native
  val ProductCode: java.lang.String = js.native
  val ProtectedViewWindows: ProtectedViewWindows = js.native
  val ResampleMediaTasks: ResampleMediaTasks = js.native
  var ShowStartupDialog: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var ShowWindowsInTaskbar: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val SlideShowWindows: SlideShowWindows = js.native
  @JSName("SmartArtColors")
  val SmartArtColors_Original: activexDashOfficeLib.OfficeNs.SmartArtColors = js.native
  @JSName("SmartArtLayouts")
  val SmartArtLayouts_Original: activexDashOfficeLib.OfficeNs.SmartArtLayouts = js.native
  @JSName("SmartArtQuickStyles")
  val SmartArtQuickStyles_Original: activexDashOfficeLib.OfficeNs.SmartArtQuickStyles = js.native
  var Top: scala.Double = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  val Version: java.lang.String = js.native
  var Visible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Width: scala.Double = js.native
  var WindowState: PpWindowState = js.native
  val Windows: DocumentWindows = js.native
  def Activate(): scala.Unit = js.native
  def COMAddIns(Index: java.lang.String): activexDashOfficeLib.OfficeNs.COMAddIn = js.native
  def COMAddIns(Index: scala.Double): activexDashOfficeLib.OfficeNs.COMAddIn = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def FileDialog(Type: activexDashOfficeLib.OfficeNs.MsoFileDialogType): activexDashOfficeLib.OfficeNs.FileDialog = js.native
  /** @param boolean [Persist=false] */
  def GetOptionFlag(Option: scala.Double): scala.Boolean = js.native
  def GetOptionFlag(Option: scala.Double, Persist: scala.Boolean): scala.Boolean = js.native
  /**
    * @param string [HelpFile='vbapp10.chm']
    * @param number [ContextID=0]
    */
  def Help(): scala.Unit = js.native
  def Help(HelpFile: java.lang.String): scala.Unit = js.native
  def Help(HelpFile: java.lang.String, ContextID: scala.Double): scala.Unit = js.native
  def LaunchPublishSlidesDialog(SlideLibraryUrl: java.lang.String): scala.Unit = js.native
  def LaunchSendToPPTDialog(SlideUrls: js.Any): scala.Unit = js.native
  def PPFileDialog(Type: PpFileDialogType): js.Any = js.native
  def Quit(): scala.Unit = js.native
  def Run(MacroName: java.lang.String, safeArrayOfParams: js.Any*): js.Any = js.native
  /** @param boolean [Persist=false] */
  def SetOptionFlag(Option: scala.Double, State: scala.Boolean): scala.Unit = js.native
  def SetOptionFlag(Option: scala.Double, State: scala.Boolean, Persist: scala.Boolean): scala.Unit = js.native
  def SetPerfMarker(Marker: scala.Double): scala.Unit = js.native
  def SmartArtColors(Index: java.lang.String): activexDashOfficeLib.OfficeNs.SmartArtColor = js.native
  def SmartArtColors(Index: scala.Double): activexDashOfficeLib.OfficeNs.SmartArtColor = js.native
  def SmartArtLayouts(Index: java.lang.String): activexDashOfficeLib.OfficeNs.SmartArtLayout = js.native
  def SmartArtLayouts(Index: scala.Double): activexDashOfficeLib.OfficeNs.SmartArtLayout = js.native
  def SmartArtQuickStyles(Index: java.lang.String): activexDashOfficeLib.OfficeNs.SmartArtQuickStyle = js.native
  def SmartArtQuickStyles(Index: scala.Double): activexDashOfficeLib.OfficeNs.SmartArtQuickStyle = js.native
  def StartNewUndoEntry(): scala.Unit = js.native
}

