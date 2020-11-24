package typings.activexShell.Shell32

import typings.activexShell.activexShellStrings.DirectoryServiceAvailable
import typings.activexShell.activexShellStrings.DoubleClickTime
import typings.activexShell.activexShellStrings.IsOS_DomainMember
import typings.activexShell.activexShellStrings.IsOS_Personal
import typings.activexShell.activexShellStrings.IsOS_Professional
import typings.activexShell.activexShellStrings.PhysicalMemoryInstalled
import typings.activexShell.activexShellStrings.ProcessorArchitecture
import typings.activexShell.activexShellStrings.ProcessorLevel
import typings.activexShell.activexShellStrings.ProcessorSpeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Shell Object Type Information */
@js.native
trait Shell extends js.Object {
  
  /** Add an object to the Recent Docuements */
  def AddToRecent(): Unit = js.native
  def AddToRecent(varFile: String): Unit = js.native
  def AddToRecent(varFile: String, bstrCategory: String): Unit = js.native
  def AddToRecent(varFile: Null, bstrCategory: String): Unit = js.native
  
  /** Get Application object */
  val Application: js.Any = js.native
  
  /** Browse the name space for a Folder */
  def BrowseForFolder(Hwnd: Double, Title: String, Options: Double): Folder3 = js.native
  def BrowseForFolder(Hwnd: Double, Title: String, Options: Double, RootFolder: String): Folder3 = js.native
  def BrowseForFolder(Hwnd: Double, Title: String, Options: Double, RootFolder: ShellSpecialFolderConstants): Folder3 = js.native
  def BrowseForFolder(Hwnd: Double, Title: String, Options: BrowseInfoFlags): Folder3 = js.native
  def BrowseForFolder(Hwnd: Double, Title: String, Options: BrowseInfoFlags, RootFolder: String): Folder3 = js.native
  def BrowseForFolder(Hwnd: Double, Title: String, Options: BrowseInfoFlags, RootFolder: ShellSpecialFolderConstants): Folder3 = js.native
  
  /** Determine if the current user can start/stop the named service. */
  def CanStartStopService(ServiceName: String): Boolean = js.native
  
  /** Cascade Windows */
  def CascadeWindows(): Unit = js.native
  
  /*
    * Runs the specified Control Panel (*.cpl) application. If the application is already open, it will activate the running instance.
    *
    * **Note** As of Windows Vista, most Control Panel applications are Shell items and cannot be opened with this function. To open those Control Panel applications, pass the canonical name to
    * `control.exe`. For example:
    *
    *     `control.exe /name Microsoft.Personalization`
    */
  def ControlPanelItem(bstrDir: String): Unit = js.native
  
  /** Eject the pc */
  def EjectPC(): Unit = js.native
  
  /** Explore a folder */
  def Explore(vDir: String): Unit = js.native
  def Explore(vDir: ShellSpecialFolderConstants): Unit = js.native
  
  /**
    * Return explorer policy value
    *
    * The specified value name must be within the **HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Policies\Explorer** subkey.
    * If the value name does not exist then the method returns null.
    */
  def ExplorerPolicy(bstrPolicyName: String): js.Any = js.native
  
  /** Bring up the file run dialog box */
  def FileRun(): Unit = js.native
  
  /** Find a computer */
  def FindComputer(): Unit = js.native
  
  /** Find Files */
  def FindFiles(): Unit = js.native
  
  /** Find a Printer in the Directory Service */
  def FindPrinter(): Unit = js.native
  def FindPrinter(Name: js.UndefOr[scala.Nothing], location: js.UndefOr[scala.Nothing], model: String): Unit = js.native
  def FindPrinter(Name: js.UndefOr[scala.Nothing], location: String): Unit = js.native
  def FindPrinter(Name: js.UndefOr[scala.Nothing], location: String, model: String): Unit = js.native
  def FindPrinter(Name: String): Unit = js.native
  def FindPrinter(Name: String, location: js.UndefOr[scala.Nothing], model: String): Unit = js.native
  def FindPrinter(Name: String, location: String): Unit = js.native
  def FindPrinter(Name: String, location: String, model: String): Unit = js.native
  
  /** Return shell global setting */
  def GetSetting(lSetting: Double): Boolean = js.native
  def GetSetting(lSetting: SettingKey): Boolean = js.native
  
  /**
    * `DirectoryServiceAvailable` -- Returns **true** if the directory service is available
    *
    * `IsOS_DomainMember` -- Returns **true** if the computer is a member of a domain (_Windows XP and later_)
    *
    * `IsOS_Personal` -- Returns **true** if the operating system is Windows XP Home Edition (_Windows XP only_)
    *
    * `IsOS_Professional` -- Returns **true** if the operating system is Windows XP Professional Edition (_Windows XP only_)
    */
  @JSName("GetSystemInformation")
  def GetSystemInformation_DirectoryServiceAvailable(Name: DirectoryServiceAvailable): Boolean = js.native
  /**
    * `DoubleClickTime` -- The double-click time, in milliseconds
    *
    * `PhysicalMemoryInstalled` -- The amount of physical memory installed, in bytes
    *
    * `ProcessorArchitecture` -- The processor architecture. For details, see the discussion of the **wProcessorArchitecture** member of the
    * [`SYSTEM_INFO`](https://msdn.microsoft.com/en-us/library/windows/desktop/ms724958.aspx) structure
    *
    * `ProcessorLevel` -- The processor level. Returns 3, 4, or 5, for x386, x486, and Pentium-level processors, respectively (_Windows Vista and later_)
    *
    * `ProcessorSpeed` -- The processor speed, in megahertz (MHz)
    */
  @JSName("GetSystemInformation")
  def GetSystemInformation_DoubleClickTime(Name: DoubleClickTime): Double = js.native
  @JSName("GetSystemInformation")
  def GetSystemInformation_IsOSDomainMember(Name: IsOS_DomainMember): Boolean = js.native
  @JSName("GetSystemInformation")
  def GetSystemInformation_IsOSPersonal(Name: IsOS_Personal): Boolean = js.native
  @JSName("GetSystemInformation")
  def GetSystemInformation_IsOSProfessional(Name: IsOS_Professional): Boolean = js.native
  @JSName("GetSystemInformation")
  def GetSystemInformation_PhysicalMemoryInstalled(Name: PhysicalMemoryInstalled): Double = js.native
  @JSName("GetSystemInformation")
  def GetSystemInformation_ProcessorArchitecture(Name: ProcessorArchitecture): Double = js.native
  @JSName("GetSystemInformation")
  def GetSystemInformation_ProcessorLevel(Name: ProcessorLevel): Double = js.native
  @JSName("GetSystemInformation")
  def GetSystemInformation_ProcessorSpeed(Name: ProcessorSpeed): Double = js.native
  
  /** Display shell help */
  def Help(): Unit = js.native
  
  /** get restriction settings */
  def IsRestricted(Group: String, Restriction: String): Double = js.native
  
  /** Determine if a service is running by name. */
  def IsServiceRunning(ServiceName: String): js.Any = js.native
  
  /** Minimize all windows */
  def MinimizeAll(): Unit = js.native
  
  /** Get special folder from ShellSpecialFolderConstants */
  def NameSpace(vDir: String): Folder3 | Null = js.native
  def NameSpace(vDir: ShellSpecialFolderConstants): Folder3 | Null = js.native
  
  /** Open a folder */
  def Open(vDir: String): Unit = js.native
  def Open(vDir: ShellSpecialFolderConstants): Unit = js.native
  
  /** Get Parent object */
  val Parent: js.Any = js.native
  
  /** Refresh the menu */
  def RefreshMenu(): Unit = js.native
  
  /** Immersive Search */
  def SearchCommand(): Unit = js.native
  
  /**
    * Start a service by name, and optionally set it to autostart.
    *
    * The method returns `false` if the service has already been started. Before calling this method, you can call
    * [Shell.IsServiceRunning](https://msdn.microsoft.com/en-us/library/windows/desktop/gg537742.aspx) to ascertain the status of the service.
    */
  def ServiceStart(ServiceName: String): Boolean = js.native
  def ServiceStart(ServiceName: String, Persistent: Boolean): Boolean = js.native
  
  /**
    * Stop a service by name, and optionally disable autostart.
    *
    * The method returns `false` if the service has already been stopped. Before calling this method, you can call
    * [Shell.IsServiceRunning](https://msdn.microsoft.com/en-us/library/windows/desktop/gg537742.aspx) to ascertain the status of the service.
    */
  def ServiceStop(ServiceName: String): Boolean = js.native
  def ServiceStop(ServiceName: String, Persistent: Boolean): Boolean = js.native
  
  /** Displays the **Date and Time Properties** dialog box. */
  def SetTime(): Unit = js.native
  
  @JSName("Shell32.Shell_typekey")
  var Shell32DotShell_typekey: Shell = js.native
  
  /**
    * Execute generic command
    * @param sFile A string that contains the name of the file on which `ShellExecute` will perform the action specified by `vOperation`.
    * @param [vArgs] A string that contains parameter values for the operation.
    * @param [vDir] The fully qualified path of the directory that contains the file specified by `sFile`. If this parameter is not specified, the current working directory is used.
    * @param [vOperation] The operation to be performed. This value is set to one of the verb strings that is supported by the file. If this parameter is not specified, the default operation is
    * performed.
    * @param [vShow] A recommendation as to how the application window should be displayed initially. The application can ignore this recommendation.
    */
  def ShellExecute(File: String): Unit = js.native
  def ShellExecute(
    File: String,
    vArgs: js.UndefOr[scala.Nothing],
    vDir: js.UndefOr[scala.Nothing],
    vOperation: js.UndefOr[scala.Nothing],
    vShow: ShellExecuteShow
  ): Unit = js.native
  def ShellExecute(
    File: String,
    vArgs: js.UndefOr[scala.Nothing],
    vDir: js.UndefOr[scala.Nothing],
    vOperation: String
  ): Unit = js.native
  def ShellExecute(
    File: String,
    vArgs: js.UndefOr[scala.Nothing],
    vDir: js.UndefOr[scala.Nothing],
    vOperation: String,
    vShow: ShellExecuteShow
  ): Unit = js.native
  def ShellExecute(File: String, vArgs: js.UndefOr[scala.Nothing], vDir: String): Unit = js.native
  def ShellExecute(
    File: String,
    vArgs: js.UndefOr[scala.Nothing],
    vDir: String,
    vOperation: js.UndefOr[scala.Nothing],
    vShow: ShellExecuteShow
  ): Unit = js.native
  def ShellExecute(File: String, vArgs: js.UndefOr[scala.Nothing], vDir: String, vOperation: String): Unit = js.native
  def ShellExecute(
    File: String,
    vArgs: js.UndefOr[scala.Nothing],
    vDir: String,
    vOperation: String,
    vShow: ShellExecuteShow
  ): Unit = js.native
  def ShellExecute(File: String, vArgs: String): Unit = js.native
  def ShellExecute(
    File: String,
    vArgs: String,
    vDir: js.UndefOr[scala.Nothing],
    vOperation: js.UndefOr[scala.Nothing],
    vShow: ShellExecuteShow
  ): Unit = js.native
  def ShellExecute(File: String, vArgs: String, vDir: js.UndefOr[scala.Nothing], vOperation: String): Unit = js.native
  def ShellExecute(
    File: String,
    vArgs: String,
    vDir: js.UndefOr[scala.Nothing],
    vOperation: String,
    vShow: ShellExecuteShow
  ): Unit = js.native
  def ShellExecute(File: String, vArgs: String, vDir: String): Unit = js.native
  def ShellExecute(
    File: String,
    vArgs: String,
    vDir: String,
    vOperation: js.UndefOr[scala.Nothing],
    vShow: ShellExecuteShow
  ): Unit = js.native
  def ShellExecute(File: String, vArgs: String, vDir: String, vOperation: String): Unit = js.native
  def ShellExecute(File: String, vArgs: String, vDir: String, vOperation: String, vShow: ShellExecuteShow): Unit = js.native
  
  /** Show/Hide browser bar. */
  def ShowBrowserBar(bstrClsid: ExplorerBarCLSID, bShow: Boolean): js.Any = js.native
  
  /** Exit Windows */
  def ShutdownWindows(): Unit = js.native
  
  /** Tile windows horizontally */
  def TileHorizontally(): Unit = js.native
  
  /** Tile windows vertically */
  def TileVertically(): Unit = js.native
  
  /** Raise/lower the desktop */
  def ToggleDesktop(): Unit = js.native
  
  /** Displays the **Taskbar and Start Menu Properties** dialog box. */
  def TrayProperties(): Unit = js.native
  
  /** Undo Minimize All */
  def UndoMinimizeALL(): Unit = js.native
  
  /** Displays your open windows in a 3D stack that you can flip through. */
  def WindowSwitcher(): Unit = js.native
  
  /** The collection of open folder windows */
  def Windows(): ShellWindows = js.native
  
  /** Displays the **Windows Security** dialog box. */
  def WindowsSecurity(): Unit = js.native
}
