package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.COMAddIn
import typings.activexDashOffice.Office.COMAddIns
import typings.activexDashOffice.Office.CommandBar
import typings.activexDashOffice.Office.CommandBars
import typings.activexDashOffice.Office.IAssistance
import typings.activexDashOffice.Office.IFind
import typings.activexDashOffice.Office.MsoAutomationSecurity
import typings.activexDashOffice.Office.MsoFeatureInstall
import typings.activexDashOffice.Office.MsoFileDialogType
import typings.activexDashOffice.Office.MsoFileValidationMode
import typings.activexDashOffice.Office.MsoTriState
import typings.activexDashOffice.Office.NewFile
import typings.activexDashOffice.Office.SmartArtColor
import typings.activexDashOffice.Office.SmartArtColors
import typings.activexDashOffice.Office.SmartArtLayout
import typings.activexDashOffice.Office.SmartArtLayouts
import typings.activexDashOffice.Office.SmartArtQuickStyle
import typings.activexDashOffice.Office.SmartArtQuickStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Application")
@js.native
class Application protected () extends js.Object {
  val Active: MsoTriState = js.native
  val ActiveEncryptionSession: Double = js.native
  val ActivePresentation: Presentation = js.native
  val ActivePrinter: String = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: DocumentWindow = js.native
  val AddIns: typings.activexDashPowerpoint.PowerPoint.AddIns = js.native
  val AnswerWizard: typings.activexDashOffice.Office.AnswerWizard = js.native
  val Assistance: IAssistance = js.native
  val Assistant: typings.activexDashOffice.Office.Assistant = js.native
  val AutoCorrect: typings.activexDashPowerpoint.PowerPoint.AutoCorrect = js.native
  var AutomationSecurity: MsoAutomationSecurity = js.native
  val Build: String = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: COMAddIns = js.native
  var Caption: String = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  val Creator: Double = js.native
  val DefaultWebOptions: typings.activexDashPowerpoint.PowerPoint.DefaultWebOptions = js.native
  val Dialogs: js.Any = js.native
  var DisplayAlerts: PpAlertLevel = js.native
  var DisplayDocumentInformationPanel: Boolean = js.native
  var DisplayGridLines: MsoTriState = js.native
  var FeatureInstall: MsoFeatureInstall = js.native
  val FileConverters: typings.activexDashPowerpoint.PowerPoint.FileConverters = js.native
  val FileFind: IFind = js.native
  val FileSearch: typings.activexDashOffice.Office.FileSearch = js.native
  var FileValidation: MsoFileValidationMode = js.native
  var Height: Double = js.native
  val IsSandboxed: Boolean = js.native
  val LanguageSettings: typings.activexDashOffice.Office.LanguageSettings = js.native
  var Left: Double = js.native
  val Marker: js.Any = js.native
  val MsoDebugOptions: typings.activexDashOffice.Office.MsoDebugOptions = js.native
  val Name: String = js.native
  val NewPresentation: NewFile = js.native
  val OperatingSystem: String = js.native
  val Options: typings.activexDashPowerpoint.PowerPoint.Options = js.native
  val Path: String = js.native
  var `PowerPoint.Application_typekey`: Application = js.native
  val Presentations: typings.activexDashPowerpoint.PowerPoint.Presentations = js.native
  val ProductCode: String = js.native
  val ProtectedViewWindows: typings.activexDashPowerpoint.PowerPoint.ProtectedViewWindows = js.native
  val ResampleMediaTasks: typings.activexDashPowerpoint.PowerPoint.ResampleMediaTasks = js.native
  var ShowStartupDialog: MsoTriState = js.native
  var ShowWindowsInTaskbar: MsoTriState = js.native
  val SlideShowWindows: typings.activexDashPowerpoint.PowerPoint.SlideShowWindows = js.native
  @JSName("SmartArtColors")
  val SmartArtColors_Original: SmartArtColors = js.native
  @JSName("SmartArtLayouts")
  val SmartArtLayouts_Original: SmartArtLayouts = js.native
  @JSName("SmartArtQuickStyles")
  val SmartArtQuickStyles_Original: SmartArtQuickStyles = js.native
  var Top: Double = js.native
  val VBE: typings.activexDashVbide.VBIDE.VBE = js.native
  val Version: String = js.native
  var Visible: MsoTriState = js.native
  var Width: Double = js.native
  var WindowState: PpWindowState = js.native
  val Windows: DocumentWindows = js.native
  def Activate(): Unit = js.native
  def COMAddIns(Index: String): COMAddIn = js.native
  def COMAddIns(Index: Double): COMAddIn = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  def FileDialog(Type: MsoFileDialogType): typings.activexDashOffice.Office.FileDialog = js.native
  /** @param boolean [Persist=false] */
  def GetOptionFlag(Option: Double): Boolean = js.native
  def GetOptionFlag(Option: Double, Persist: Boolean): Boolean = js.native
  /**
    * @param string [HelpFile='vbapp10.chm']
    * @param number [ContextID=0]
    */
  def Help(): Unit = js.native
  def Help(HelpFile: String): Unit = js.native
  def Help(HelpFile: String, ContextID: Double): Unit = js.native
  def LaunchPublishSlidesDialog(SlideLibraryUrl: String): Unit = js.native
  def LaunchSendToPPTDialog(SlideUrls: js.Any): Unit = js.native
  def PPFileDialog(Type: PpFileDialogType): js.Any = js.native
  def Quit(): Unit = js.native
  def Run(MacroName: String, safeArrayOfParams: js.Any*): js.Any = js.native
  /** @param boolean [Persist=false] */
  def SetOptionFlag(Option: Double, State: Boolean): Unit = js.native
  def SetOptionFlag(Option: Double, State: Boolean, Persist: Boolean): Unit = js.native
  def SetPerfMarker(Marker: Double): Unit = js.native
  def SmartArtColors(Index: String): SmartArtColor = js.native
  def SmartArtColors(Index: Double): SmartArtColor = js.native
  def SmartArtLayouts(Index: String): SmartArtLayout = js.native
  def SmartArtLayouts(Index: Double): SmartArtLayout = js.native
  def SmartArtQuickStyles(Index: String): SmartArtQuickStyle = js.native
  def SmartArtQuickStyles(Index: Double): SmartArtQuickStyle = js.native
  def StartNewUndoEntry(): Unit = js.native
}

