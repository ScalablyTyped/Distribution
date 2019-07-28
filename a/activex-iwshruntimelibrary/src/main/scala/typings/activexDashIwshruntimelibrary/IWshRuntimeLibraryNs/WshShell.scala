package typings.activexDashIwshruntimelibrary.IWshRuntimeLibraryNs

import typings.activexDashIwshruntimelibrary.activexDashIwshruntimelibraryStrings.Process
import typings.activexDashIwshruntimelibrary.activexDashIwshruntimelibraryStrings.REG_BINARY
import typings.activexDashIwshruntimelibrary.activexDashIwshruntimelibraryStrings.REG_DWORD
import typings.activexDashIwshruntimelibrary.activexDashIwshruntimelibraryStrings.REG_EXPAND_SZ
import typings.activexDashIwshruntimelibrary.activexDashIwshruntimelibraryStrings.REG_SZ
import typings.activexDashIwshruntimelibrary.activexDashIwshruntimelibraryStrings.System
import typings.activexDashIwshruntimelibrary.activexDashIwshruntimelibraryStrings.User
import typings.activexDashIwshruntimelibrary.activexDashIwshruntimelibraryStrings.Volatile
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shell Object */
@JSGlobal("IWshRuntimeLibrary.WshShell")
@js.native
class WshShell protected () extends js.Object {
  var CurrentDirectory: String = js.native
  /**
    * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
    *
    *     let env = new ActiveXObject('WScript.Shell').Environment;
    *     WScript.Echo(env('System'));
    *
    * will return an empty string, unless there is an environment variable named `System`
    */
  @JSName("Environment")
  var Environment_Original: WshEnvironment with (js.Function1[/* Type */ System | User | Process | Volatile, WshEnvironment]) = js.native
  var `IWshRuntimeLibrary.WshShell_typekey`: WshShell = js.native
  @JSName("SpecialFolders")
  val SpecialFolders_Original: WshCollection = js.native
  /**
    * Activates an application window
    * @param App Title of application as it appears in the title bar, or the process ID
    * @param Wait
    *
    * This method changes the focus to the named application or window. The window must be attached to the calling thread's message queue. It does not affect whether it is maximized or
    * minimized. Focus moves from the activated application window when the user takes action to change the focus (or closes the window).
    *
    * In determining which application to activate, the specified title is compared to the title string of each running application. If no exact match exists, any application whose title
    * string begins with title is activated. If an application still cannot be found, any application whose title string ends with title is activated. If more than one instance of the
    * application named by title exists, one instance is arbitrarily activated.
    *
    * The method might return `false` under the following conditions:
    *
    * * The window is not brought to the foreground.
    * * The window is brought to the foreground but is not given keyboard focus.
    * * A Command Prompt window (`cmd.exe`) is brought to the foreground and is given keyboard focus.
    */
  def AppActivate(App: String): Boolean = js.native
  def AppActivate(App: String, Wait: js.Any): Boolean = js.native
  def AppActivate(App: Double): Boolean = js.native
  def AppActivate(App: Double, Wait: js.Any): Boolean = js.native
  /**
    * Creates a shortcut
    * @param PathLink Path where the shortcut should be created
    *
    * The shortcut object exists in memory until you save it to disk with the **Save** method.
    */
  def CreateShortcut(PathLink: String): WshShortcut | WshURLShortcut = js.native
  /**
    * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
    *
    *     let env = new ActiveXObject('WScript.Shell').Environment;
    *     WScript.Echo(env('System'));
    *
    * will return an empty string, unless there is an environment variable named `System`
    */
  def Environment(Name: String): String = js.native
  @JSName("Environment")
  def Environment_Process(Type: Process): WshEnvironment = js.native
  /**
    * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
    *
    *     let env = new ActiveXObject('WScript.Shell').Environment;
    *     WScript.Echo(env('System'));
    *
    * will return an empty string, unless there is an environment variable named `System`
    */
  @JSName("Environment")
  def Environment_System(Type: System): WshEnvironment = js.native
  @JSName("Environment")
  def Environment_User(Type: User): WshEnvironment = js.native
  @JSName("Environment")
  def Environment_Volatile(Type: Volatile): WshEnvironment = js.native
  def Exec(Command: String): WshExec = js.native
  def ExpandEnvironmentStrings(Src: String): String = js.native
  /** @param string [Target=''] Name of the computer system where the event should be logged; default is the local computer system */
  def LogEvent(Type: EventType, Message: String): Boolean = js.native
  def LogEvent(Type: EventType, Message: String, Target: String): Boolean = js.native
  def Popup(Text: String): PopupSelection = js.native
  def Popup(Text: String, SecondsToWait: Double): PopupSelection = js.native
  def Popup(Text: String, SecondsToWait: Double, Title: String): PopupSelection = js.native
  def Popup(Text: String, SecondsToWait: Double, Title: String, Type: ButtonType): PopupSelection = js.native
  def Popup(Text: String, SecondsToWait: Double, Title: String, Type: IconType): PopupSelection = js.native
  def Popup(Text: String, SecondsToWait: Double, Title: String, Type: PopupType): PopupSelection = js.native
  def RegDelete(Name: String): Unit = js.native
  /**
    * Returns the value of a key or value-name from the registry
    * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
    *
    * Returns one of the following, based on the registry value type:
    *
    * * **REG_SZ** -- a string
    * * **REG_DWORD** -- a number
    * * **REG_SBINARY** -- a binary value, as a COM SafeArray containing integers
    * * **REG_EXPAND_SZ** -- an expandable string
    * * **REG_MULTI_SZ** -- an array of srings, as a COM SafeArray
    */
  def RegRead(Name: String): String | Double | (SafeArray[Double | String]) = js.native
  /**
    * Creates a new key, adds another value-name to an existing key and assigns it a value, or changes the value of an existing value-name
    * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
    * @param Value Will be coerced to `string` or `integer` based on the value-name type:
    * `REG_SZ | REG_EXPAND_SZ` will be converted to `string`;
    * `REG_DWORD | REG_BINARY` will be converted to `integer`
    * @param Type
    */
  def RegWrite(Name: String, Value: js.Any): Unit = js.native
  @JSName("RegWrite")
  def RegWrite_REGBINARY(Name: String, Value: js.Any, Type: REG_BINARY): Unit = js.native
  @JSName("RegWrite")
  def RegWrite_REGDWORD(Name: String, Value: js.Any, Type: REG_DWORD): Unit = js.native
  @JSName("RegWrite")
  def RegWrite_REGEXPANDSZ(Name: String, Value: js.Any, Type: REG_EXPAND_SZ): Unit = js.native
  @JSName("RegWrite")
  def RegWrite_REGSZ(Name: String, Value: js.Any, Type: REG_SZ): Unit = js.native
  /**
    * Runs a program in a new process.
    * @param Command Command-line, including any parameters you want to pass to the executable file.
    * @param WindowStyle Appearance of the program window. Not all programs make use of this information.
    * @param WaitOnReturn Block script until program finishes executing.
    *
    * If `false` is passed into **WaitOnReturn**, the **Run** method will return 0 immediately. If `true` is passed in, **Run** will return the program's error code, if any.
    *
    * Environment variables will be expanded within the command line.
    *
    * Passing a registered file type will automatically open the program registered to the file type.
    *
    * Possible values for **WindowStyle**:
    *
    * * **0** -- Hides the window and activates another window.
    * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
    * when displaying the window for the first time.
    * * **2** -- Activates the window and displays it as a minimized window.
    * * **3** -- Activates the window and displays it as a maximized window.
    * * **4** -- Displays a window in its most recent size and position. The active window remains active.
    * * **5** -- Activates the window and displays it in its current size and position.
    * * **6** -- Minimizes the specified window and activates the next top-level window in the Z order.
    * * **7** -- Displays the window as a minimized window. The active window remains active.
    * * **8** -- Displays the window in its current state. The active window remains active.
    * * **9** -- Activates and displays the window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
    * when restoring a minimized window.
    * * **10** -- Sets the show-state based on the state of the program that started the application.
    */
  def Run(Command: String): Double = js.native
  def Run(Command: String, WindowStyle: WindowStyle): Double = js.native
  def Run(Command: String, WindowStyle: WindowStyle, WaitOnReturn: Boolean): Double = js.native
  def SendKeys(Keys: String): Unit = js.native
  def SendKeys(Keys: String, Wait: Boolean): Unit = js.native
  def SpecialFolders(Index: js.Any): js.Any = js.native
}

