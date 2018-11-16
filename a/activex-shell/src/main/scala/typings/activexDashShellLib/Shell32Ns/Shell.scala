package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shell Object Type Information */
@JSGlobal("Shell32.Shell")
@js.native
class Shell protected () extends js.Object {
  /** Get Application object */
  val Application: js.Any = js.native
  /** Get Parent object */
  val Parent: js.Any = js.native
  var `Shell32.Shell_typekey`: Shell = js.native
  /** Add an object to the Recent Docuements */
  def AddToRecent(): scala.Unit = js.native
  /** Add an object to the Recent Docuements */
  def AddToRecent(varFile: java.lang.String): scala.Unit = js.native
  /** Add an object to the Recent Docuements */
  def AddToRecent(varFile: java.lang.String, bstrCategory: java.lang.String): scala.Unit = js.native
  /** Add an object to the Recent Docuements */
  def AddToRecent(varFile: scala.Null, bstrCategory: java.lang.String): scala.Unit = js.native
  /** Browse the name space for a Folder */
  def BrowseForFolder(Hwnd: scala.Double, Title: java.lang.String, Options: BrowseInfoFlags): Folder3 = js.native
  /** Browse the name space for a Folder */
  def BrowseForFolder(
    Hwnd: scala.Double,
    Title: java.lang.String,
    Options: BrowseInfoFlags,
    RootFolder: ShellSpecialFolderConstants
  ): Folder3 = js.native
  /** Browse the name space for a Folder */
  def BrowseForFolder(
    Hwnd: scala.Double,
    Title: java.lang.String,
    Options: BrowseInfoFlags,
    RootFolder: java.lang.String
  ): Folder3 = js.native
  /** Browse the name space for a Folder */
  def BrowseForFolder(Hwnd: scala.Double, Title: java.lang.String, Options: scala.Double): Folder3 = js.native
  /** Browse the name space for a Folder */
  def BrowseForFolder(
    Hwnd: scala.Double,
    Title: java.lang.String,
    Options: scala.Double,
    RootFolder: ShellSpecialFolderConstants
  ): Folder3 = js.native
  /** Browse the name space for a Folder */
  def BrowseForFolder(Hwnd: scala.Double, Title: java.lang.String, Options: scala.Double, RootFolder: java.lang.String): Folder3 = js.native
  /** Determine if the current user can start/stop the named service. */
  def CanStartStopService(ServiceName: java.lang.String): scala.Boolean = js.native
  /** Cascade Windows */
  def CascadeWindows(): scala.Unit = js.native
  /*
           * Runs the specified Control Panel (*.cpl) application. If the application is already open, it will activate the running instance.
           *
           * **Note** As of Windows Vista, most Control Panel applications are Shell items and cannot be opened with this function. To open those Control Panel applications, pass the canonical name to
           * `control.exe`. For example:
           *
           *     `control.exe /name Microsoft.Personalization`
           */
  def ControlPanelItem(bstrDir: java.lang.String): scala.Unit = js.native
  /** Eject the pc */
  def EjectPC(): scala.Unit = js.native
  /** Explore a folder */
  def Explore(vDir: ShellSpecialFolderConstants): scala.Unit = js.native
  /** Explore a folder */
  def Explore(vDir: java.lang.String): scala.Unit = js.native
  /**
           * Return explorer policy value
           *
           * The specified value name must be within the **HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Policies\Explorer** subkey.
           * If the value name does not exist then the method returns null.
           */
  def ExplorerPolicy(bstrPolicyName: java.lang.String): js.Any = js.native
  /** Bring up the file run dialog box */
  def FileRun(): scala.Unit = js.native
  /** Find a computer */
  def FindComputer(): scala.Unit = js.native
  /** Find Files */
  def FindFiles(): scala.Unit = js.native
  /** Find a Printer in the Directory Service */
  def FindPrinter(): scala.Unit = js.native
  /** Find a Printer in the Directory Service */
  def FindPrinter(Name: java.lang.String): scala.Unit = js.native
  /** Find a Printer in the Directory Service */
  def FindPrinter(Name: java.lang.String, location: java.lang.String): scala.Unit = js.native
  /** Find a Printer in the Directory Service */
  def FindPrinter(Name: java.lang.String, location: java.lang.String, model: java.lang.String): scala.Unit = js.native
  /** Return shell global setting */
  def GetSetting(lSetting: SettingKey): scala.Boolean = js.native
  /** Return shell global setting */
  def GetSetting(lSetting: scala.Double): scala.Boolean = js.native
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
  def GetSystemInformation_DirectoryServiceAvailable(Name: activexDashShellLib.activexDashShellLibStrings.DirectoryServiceAvailable): scala.Boolean = js.native
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
  def GetSystemInformation_DoubleClickTime(Name: activexDashShellLib.activexDashShellLibStrings.DoubleClickTime): scala.Double = js.native
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
  def GetSystemInformation_IsOS_DomainMember(Name: activexDashShellLib.activexDashShellLibStrings.IsOS_DomainMember): scala.Boolean = js.native
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
  def GetSystemInformation_IsOS_Personal(Name: activexDashShellLib.activexDashShellLibStrings.IsOS_Personal): scala.Boolean = js.native
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
  def GetSystemInformation_IsOS_Professional(Name: activexDashShellLib.activexDashShellLibStrings.IsOS_Professional): scala.Boolean = js.native
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
  def GetSystemInformation_PhysicalMemoryInstalled(Name: activexDashShellLib.activexDashShellLibStrings.PhysicalMemoryInstalled): scala.Double = js.native
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
  def GetSystemInformation_ProcessorArchitecture(Name: activexDashShellLib.activexDashShellLibStrings.ProcessorArchitecture): scala.Double = js.native
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
  def GetSystemInformation_ProcessorLevel(Name: activexDashShellLib.activexDashShellLibStrings.ProcessorLevel): scala.Double = js.native
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
  def GetSystemInformation_ProcessorSpeed(Name: activexDashShellLib.activexDashShellLibStrings.ProcessorSpeed): scala.Double = js.native
  /** Display shell help */
  def Help(): scala.Unit = js.native
  /** get restriction settings */
  def IsRestricted(Group: java.lang.String, Restriction: java.lang.String): scala.Double = js.native
  /** Determine if a service is running by name. */
  def IsServiceRunning(ServiceName: java.lang.String): js.Any = js.native
  /** Minimize all windows */
  def MinimizeAll(): scala.Unit = js.native
  /** Get special folder from ShellSpecialFolderConstants */
  def NameSpace(vDir: ShellSpecialFolderConstants): Folder3 | scala.Null = js.native
  /** Get special folder from ShellSpecialFolderConstants */
  def NameSpace(vDir: java.lang.String): Folder3 | scala.Null = js.native
  /** Open a folder */
  def Open(vDir: ShellSpecialFolderConstants): scala.Unit = js.native
  /** Open a folder */
  def Open(vDir: java.lang.String): scala.Unit = js.native
  /** Refresh the menu */
  def RefreshMenu(): scala.Unit = js.native
  /** Immersive Search */
  def SearchCommand(): scala.Unit = js.native
  /**
           * Start a service by name, and optionally set it to autostart.
           *
           * The method returns `false` if the service has already been started. Before calling this method, you can call
           * [Shell.IsServiceRunning](https://msdn.microsoft.com/en-us/library/windows/desktop/gg537742.aspx) to ascertain the status of the service.
           */
  def ServiceStart(ServiceName: java.lang.String): scala.Boolean = js.native
  /**
           * Start a service by name, and optionally set it to autostart.
           *
           * The method returns `false` if the service has already been started. Before calling this method, you can call
           * [Shell.IsServiceRunning](https://msdn.microsoft.com/en-us/library/windows/desktop/gg537742.aspx) to ascertain the status of the service.
           */
  def ServiceStart(ServiceName: java.lang.String, Persistent: scala.Boolean): scala.Boolean = js.native
  /**
           * Stop a service by name, and optionally disable autostart.
           *
           * The method returns `false` if the service has already been stopped. Before calling this method, you can call
           * [Shell.IsServiceRunning](https://msdn.microsoft.com/en-us/library/windows/desktop/gg537742.aspx) to ascertain the status of the service.
           */
  def ServiceStop(ServiceName: java.lang.String): scala.Boolean = js.native
  /**
           * Stop a service by name, and optionally disable autostart.
           *
           * The method returns `false` if the service has already been stopped. Before calling this method, you can call
           * [Shell.IsServiceRunning](https://msdn.microsoft.com/en-us/library/windows/desktop/gg537742.aspx) to ascertain the status of the service.
           */
  def ServiceStop(ServiceName: java.lang.String, Persistent: scala.Boolean): scala.Boolean = js.native
  /** Displays the **Date and Time Properties** dialog box. */
  def SetTime(): scala.Unit = js.native
  /**
           * Execute generic command
           * @param sFile A string that contains the name of the file on which `ShellExecute` will perform the action specified by `vOperation`.
           * @param [vArgs] A string that contains parameter values for the operation.
           * @param [vDir] The fully qualified path of the directory that contains the file specified by `sFile`. If this parameter is not specified, the current working directory is used.
           * @param [vOperation] The operation to be performed. This value is set to one of the verb strings that is supported by the file. If this parameter is not specified, the default operation is
           * performed.
           * @param [vShow] A recommendation as to how the application window should be displayed initially. The application can ignore this recommendation.
           */
  def ShellExecute(File: java.lang.String): scala.Unit = js.native
  /**
           * Execute generic command
           * @param sFile A string that contains the name of the file on which `ShellExecute` will perform the action specified by `vOperation`.
           * @param [vArgs] A string that contains parameter values for the operation.
           * @param [vDir] The fully qualified path of the directory that contains the file specified by `sFile`. If this parameter is not specified, the current working directory is used.
           * @param [vOperation] The operation to be performed. This value is set to one of the verb strings that is supported by the file. If this parameter is not specified, the default operation is
           * performed.
           * @param [vShow] A recommendation as to how the application window should be displayed initially. The application can ignore this recommendation.
           */
  def ShellExecute(File: java.lang.String, vArgs: java.lang.String): scala.Unit = js.native
  /**
           * Execute generic command
           * @param sFile A string that contains the name of the file on which `ShellExecute` will perform the action specified by `vOperation`.
           * @param [vArgs] A string that contains parameter values for the operation.
           * @param [vDir] The fully qualified path of the directory that contains the file specified by `sFile`. If this parameter is not specified, the current working directory is used.
           * @param [vOperation] The operation to be performed. This value is set to one of the verb strings that is supported by the file. If this parameter is not specified, the default operation is
           * performed.
           * @param [vShow] A recommendation as to how the application window should be displayed initially. The application can ignore this recommendation.
           */
  def ShellExecute(File: java.lang.String, vArgs: java.lang.String, vDir: java.lang.String): scala.Unit = js.native
  /**
           * Execute generic command
           * @param sFile A string that contains the name of the file on which `ShellExecute` will perform the action specified by `vOperation`.
           * @param [vArgs] A string that contains parameter values for the operation.
           * @param [vDir] The fully qualified path of the directory that contains the file specified by `sFile`. If this parameter is not specified, the current working directory is used.
           * @param [vOperation] The operation to be performed. This value is set to one of the verb strings that is supported by the file. If this parameter is not specified, the default operation is
           * performed.
           * @param [vShow] A recommendation as to how the application window should be displayed initially. The application can ignore this recommendation.
           */
  def ShellExecute(
    File: java.lang.String,
    vArgs: java.lang.String,
    vDir: java.lang.String,
    vOperation: java.lang.String
  ): scala.Unit = js.native
  /**
           * Execute generic command
           * @param sFile A string that contains the name of the file on which `ShellExecute` will perform the action specified by `vOperation`.
           * @param [vArgs] A string that contains parameter values for the operation.
           * @param [vDir] The fully qualified path of the directory that contains the file specified by `sFile`. If this parameter is not specified, the current working directory is used.
           * @param [vOperation] The operation to be performed. This value is set to one of the verb strings that is supported by the file. If this parameter is not specified, the default operation is
           * performed.
           * @param [vShow] A recommendation as to how the application window should be displayed initially. The application can ignore this recommendation.
           */
  def ShellExecute(
    File: java.lang.String,
    vArgs: java.lang.String,
    vDir: java.lang.String,
    vOperation: java.lang.String,
    vShow: ShellExecuteShow
  ): scala.Unit = js.native
  /** Show/Hide browser bar. */
  def ShowBrowserBar(bstrClsid: ExplorerBarCLSID, bShow: scala.Boolean): js.Any = js.native
  /** Exit Windows */
  def ShutdownWindows(): scala.Unit = js.native
  /** Tile windows horizontally */
  def TileHorizontally(): scala.Unit = js.native
  /** Tile windows vertically */
  def TileVertically(): scala.Unit = js.native
  /** Raise/lower the desktop */
  def ToggleDesktop(): scala.Unit = js.native
  /** Displays the **Taskbar and Start Menu Properties** dialog box. */
  def TrayProperties(): scala.Unit = js.native
  /** Undo Minimize All */
  def UndoMinimizeALL(): scala.Unit = js.native
  /** Displays your open windows in a 3D stack that you can flip through. */
  def WindowSwitcher(): scala.Unit = js.native
  /** The collection of open folder windows */
  def Windows(): ShellWindows = js.native
  /** Displays the **Windows Security** dialog box. */
  def WindowsSecurity(): scala.Unit = js.native
}

