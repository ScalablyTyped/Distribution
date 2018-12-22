package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shell Object */
@JSGlobal("IWshRuntimeLibrary.WshShell")
@js.native
class WshShell protected () extends js.Object {
  var CurrentDirectory: java.lang.String = js.native
  /**
           * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
           *
           *     let env = new ActiveXObject('WScript.Shell').Environment;
           *     WScript.Echo(env('System'));
           *
           * will return an empty string, unless there is an environment variable named `System`
           */
  @JSName("Environment")
  var Environment_Original: WshEnvironment with (js.Function1[
    /* Type */ activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.System | activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.User | activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.Process | activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.Volatile, 
    WshEnvironment
  ]) = js.native
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
  def AppActivate(App: java.lang.String): scala.Boolean = js.native
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
  def AppActivate(App: java.lang.String, Wait: js.Any): scala.Boolean = js.native
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
  def AppActivate(App: scala.Double): scala.Boolean = js.native
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
  def AppActivate(App: scala.Double, Wait: js.Any): scala.Boolean = js.native
  /**
           * Creates a shortcut
           * @param PathLink Path where the shortcut should be created
           *
           * The shortcut object exists in memory until you save it to disk with the **Save** method.
           */
  def CreateShortcut(PathLink: java.lang.String): WshShortcut | WshURLShortcut = js.native
  /**
           * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
           *
           *     let env = new ActiveXObject('WScript.Shell').Environment;
           *     WScript.Echo(env('System'));
           *
           * will return an empty string, unless there is an environment variable named `System`
           */
  def Environment(Name: java.lang.String): java.lang.String = js.native
  /**
           * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
           *
           *     let env = new ActiveXObject('WScript.Shell').Environment;
           *     WScript.Echo(env('System'));
           *
           * will return an empty string, unless there is an environment variable named `System`
           */
  @JSName("Environment")
  def Environment_Process(Type: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.Process): WshEnvironment = js.native
  /**
           * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
           *
           *     let env = new ActiveXObject('WScript.Shell').Environment;
           *     WScript.Echo(env('System'));
           *
           * will return an empty string, unless there is an environment variable named `System`
           */
  @JSName("Environment")
  def Environment_System(Type: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.System): WshEnvironment = js.native
  /**
           * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
           *
           *     let env = new ActiveXObject('WScript.Shell').Environment;
           *     WScript.Echo(env('System'));
           *
           * will return an empty string, unless there is an environment variable named `System`
           */
  @JSName("Environment")
  def Environment_User(Type: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.User): WshEnvironment = js.native
  /**
           * Note that **Environment** doesn't actually return a callable object; the call is only usable in the context of the **Environment** property. The following:
           *
           *     let env = new ActiveXObject('WScript.Shell').Environment;
           *     WScript.Echo(env('System'));
           *
           * will return an empty string, unless there is an environment variable named `System`
           */
  @JSName("Environment")
  def Environment_Volatile(Type: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.Volatile): WshEnvironment = js.native
  def Exec(Command: java.lang.String): WshExec = js.native
  def ExpandEnvironmentStrings(Src: java.lang.String): java.lang.String = js.native
  /** @param string [Target=''] Name of the computer system where the event should be logged; default is the local computer system */
  def LogEvent(Type: EventType, Message: java.lang.String): scala.Boolean = js.native
  /** @param string [Target=''] Name of the computer system where the event should be logged; default is the local computer system */
  def LogEvent(Type: EventType, Message: java.lang.String, Target: java.lang.String): scala.Boolean = js.native
  def Popup(Text: java.lang.String): PopupSelection = js.native
  def Popup(Text: java.lang.String, SecondsToWait: scala.Double): PopupSelection = js.native
  def Popup(Text: java.lang.String, SecondsToWait: scala.Double, Title: java.lang.String): PopupSelection = js.native
  def Popup(Text: java.lang.String, SecondsToWait: scala.Double, Title: java.lang.String, Type: ButtonType): PopupSelection = js.native
  def Popup(Text: java.lang.String, SecondsToWait: scala.Double, Title: java.lang.String, Type: IconType): PopupSelection = js.native
  def Popup(Text: java.lang.String, SecondsToWait: scala.Double, Title: java.lang.String, Type: PopupType): PopupSelection = js.native
  def RegDelete(Name: java.lang.String): scala.Unit = js.native
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
  def RegRead(Name: java.lang.String): java.lang.String | scala.Double | activexDashInteropLib.SafeArray[java.lang.String] | activexDashInteropLib.SafeArray[scala.Double] = js.native
  /**
           * Creates a new key, adds another value-name to an existing key and assigns it a value, or changes the value of an existing value-name
           * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
           * @param Value Will be coerced to `string` or `integer` based on the value-name type:
           * `REG_SZ | REG_EXPAND_SZ` will be converted to `string`;
           * `REG_DWORD | REG_BINARY` will be converted to `integer`
           * @param Type
           */
  def RegWrite(Name: java.lang.String, Value: js.Any): scala.Unit = js.native
  /**
           * Creates a new key, adds another value-name to an existing key and assigns it a value, or changes the value of an existing value-name
           * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
           * @param Value Will be coerced to `string` or `integer` based on the value-name type:
           * `REG_SZ | REG_EXPAND_SZ` will be converted to `string`;
           * `REG_DWORD | REG_BINARY` will be converted to `integer`
           * @param Type
           */
  @JSName("RegWrite")
  def RegWrite_REG_BINARY(
    Name: java.lang.String,
    Value: js.Any,
    Type: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.REG_BINARY
  ): scala.Unit = js.native
  /**
           * Creates a new key, adds another value-name to an existing key and assigns it a value, or changes the value of an existing value-name
           * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
           * @param Value Will be coerced to `string` or `integer` based on the value-name type:
           * `REG_SZ | REG_EXPAND_SZ` will be converted to `string`;
           * `REG_DWORD | REG_BINARY` will be converted to `integer`
           * @param Type
           */
  @JSName("RegWrite")
  def RegWrite_REG_DWORD(
    Name: java.lang.String,
    Value: js.Any,
    Type: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.REG_DWORD
  ): scala.Unit = js.native
  /**
           * Creates a new key, adds another value-name to an existing key and assigns it a value, or changes the value of an existing value-name
           * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
           * @param Value Will be coerced to `string` or `integer` based on the value-name type:
           * `REG_SZ | REG_EXPAND_SZ` will be converted to `string`;
           * `REG_DWORD | REG_BINARY` will be converted to `integer`
           * @param Type
           */
  @JSName("RegWrite")
  def RegWrite_REG_EXPAND_SZ(
    Name: java.lang.String,
    Value: js.Any,
    Type: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.REG_EXPAND_SZ
  ): scala.Unit = js.native
  /**
           * Creates a new key, adds another value-name to an existing key and assigns it a value, or changes the value of an existing value-name
           * @param Name Key (ends with a final `\`) or value-name (doesn't end with a final `\`)
           * @param Value Will be coerced to `string` or `integer` based on the value-name type:
           * `REG_SZ | REG_EXPAND_SZ` will be converted to `string`;
           * `REG_DWORD | REG_BINARY` will be converted to `integer`
           * @param Type
           */
  @JSName("RegWrite")
  def RegWrite_REG_SZ(
    Name: java.lang.String,
    Value: js.Any,
    Type: activexDashIwshruntimelibraryLib.activexDashIwshruntimelibraryLibStrings.REG_SZ
  ): scala.Unit = js.native
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
  def Run(Command: java.lang.String): scala.Double = js.native
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
  def Run(Command: java.lang.String, WindowStyle: WindowStyle): scala.Double = js.native
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
  def Run(Command: java.lang.String, WindowStyle: WindowStyle, WaitOnReturn: scala.Boolean): scala.Double = js.native
  def SendKeys(Keys: java.lang.String): scala.Unit = js.native
  def SendKeys(Keys: java.lang.String, Wait: scala.Boolean): scala.Unit = js.native
  def SpecialFolders(Index: js.Any): js.Any = js.native
}

