package typings.atom.mod

import typings.atom.AnonButtons
import typings.atom.AnonDetailedMessage
import typings.atom.AnonDevMode
import typings.atom.AnonHeight
import typings.atom.AnonX
import typings.atom.atomStrings.beta
import typings.atom.atomStrings.dev
import typings.atom.atomStrings.nightly
import typings.atom.atomStrings.stable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtomEnvironment extends js.Object {
  /** A Clipboard instance. */
  val clipboard: Clipboard = js.native
  // Properties
  /** A CommandRegistry instance. */
  val commands: CommandRegistry = js.native
  /** A Config instance. */
  val config: Config = js.native
  /** A ContextMenuManager instance. */
  val contextMenu: ContextMenuManager = js.native
  /** A DeserializerManager instance. */
  val deserializers: DeserializerManager = js.native
  /** A GrammarRegistry instance. */
  val grammars: GrammarRegistry = js.native
  /** A HistoryManager instance. */
  val history: HistoryManager = js.native
  /** A KeymapManager instance. */
  val keymaps: KeymapManager = js.native
  /** A MenuManager instance. */
  val menu: MenuManager = js.native
  /** A NotificationManager instance. */
  val notifications: NotificationManager = js.native
  /** A PackageManager instance. */
  val packages: PackageManager = js.native
  /** A Project instance. */
  val project: Project = js.native
  /** A StyleManager instance. */
  val styles: StyleManager = js.native
  /** A TextEditorRegistry instance. */
  val textEditors: TextEditorRegistry = js.native
  /** A ThemeManager instance. */
  val themes: ThemeManager = js.native
  /** A TooltipManager instance. */
  val tooltips: TooltipManager = js.native
  /** A ViewRegistry instance. */
  val views: ViewRegistry = js.native
  /** A Workspace instance. */
  val workspace: Workspace = js.native
  // Messaging the User
  /** Visually and audibly trigger a beep. */
  def beep(): Unit = js.native
  /** Move current window to the center of the screen. */
  def center(): Unit = js.native
  /** Close the current window. */
  def close(): Unit = js.native
  /**
    *  A flexible way to open a dialog akin to an alert dialog. If a callback
    *  is provided, then the confirmation will work asynchronously, which is
    *  recommended.
    *
    *  If the dialog is closed (via `Esc` key or `X` in the top corner) without
    *  selecting a button the first button will be clicked unless a "Cancel" or "No"
    *  button is provided.
    *
    *  Returns the chosen button index number if the buttons option was an array.
    */
  def confirm(options: AnonButtons): Unit = js.native
  /**
    *  A flexible way to open a dialog akin to an alert dialog. If a callback
    *  is provided, then the confirmation will work asynchronously, which is
    *  recommended.
    *
    *  If the dialog is closed (via `Esc` key or `X` in the top corner) without
    *  selecting a button the first button will be clicked unless a "Cancel" or "No"
    *  button is provided.
    *
    *  Returns the chosen button index number if the buttons option was an array.
    */
  def confirm(options: AnonDetailedMessage): Double = js.native
  /**
    *  A flexible way to open a dialog akin to an alert dialog. If a callback
    *  is provided, then the confirmation will work asynchronously, which is
    *  recommended.
    *
    *  If the dialog is closed (via `Esc` key or `X` in the top corner) without
    *  selecting a button the first button will be clicked unless a "Cancel" or "No"
    *  button is provided.
    *
    *  Returns the chosen button index number if the buttons option was an array.
    *  @param response The index of the button that was clicked.
    *  @param checkboxChecked The checked state of the checkbox if `checkboxLabel` was set.
    *  Otherwise false.
    */
  def confirm(
    options: ConfirmationOptions,
    callback: js.Function2[/* response */ Double, /* checkboxChecked */ Boolean, Unit]
  ): Unit = js.native
  /** Execute code in dev tools. */
  def executeJavaScriptInDevTools(code: String): Unit = js.native
  /** Focus the current window. */
  def focus(): Unit = js.native
  /** Undocumented: get Atom config directory path */
  def getConfigDirPath(): String = js.native
  /** Get the current window. */
  def getCurrentWindow(): js.Object = js.native
  /** Get the load settings for the current window. */
  def getLoadSettings(): WindowLoadSettings = js.native
  /** Get the position of current window. */
  def getPosition(): AnonX = js.native
  /**
    *  Gets the release channel of the Atom application.
    *  Returns the release channel, which can be 'dev', 'nightly', 'beta', or 'stable'.
    */
  def getReleaseChannel(): dev | nightly | beta | stable = js.native
  /** Get the size of current window. */
  def getSize(): AnonHeight = js.native
  /** Get the version of the Atom application. */
  def getVersion(): String = js.native
  /** Get the time taken to completely load the current window. */
  def getWindowLoadTime(): Double = js.native
  /** Hide the current window. */
  def hide(): Unit = js.native
  // Atom Details
  /** Returns a boolean that is true if the current window is in development mode. */
  def inDevMode(): Boolean = js.native
  /** Returns a boolean that is true if the current window is in safe mode. */
  def inSafeMode(): Boolean = js.native
  /** Returns a boolean that is true if the current window is running specs. */
  def inSpecMode(): Boolean = js.native
  /** Returns a boolean that is true if the current window is in full screen mode. */
  def isFullScreen(): Boolean = js.native
  /** Returns a boolean that is true if the current window is maximized. */
  def isMaximized(): Boolean = js.native
  /** Returns a boolean that is true if the current version is an official release. */
  def isReleasedVersion(): Boolean = js.native
  // Event Subscription
  /** Invoke the given callback whenever ::beep is called. */
  def onDidBeep(callback: js.Function0[Unit]): Disposable = js.native
  /** Invoke the given callback whenever there is an unhandled error. */
  def onDidThrowError(callback: js.Function1[/* event */ ExceptionThrownEvent, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when there is an unhandled error, but before
    *  the devtools pop open.
    */
  def onWillThrowError(callback: js.Function1[/* event */ PreventableExceptionThrownEvent, Unit]): Disposable = js.native
  // Managing the Atom Window
  /** Open a new Atom window using the given options. */
  def open(): Unit = js.native
  def open(params: AnonDevMode): Unit = js.native
  // Managing the Dev Tools
  /** Open the dev tools for the current window. */
  def openDevTools(): js.Promise[Null] = js.native
  /** Prompt the user to select one or more folders. */
  def pickFolder(callback: js.Function1[/* paths */ js.Array[String] | Null, Unit]): Unit = js.native
  /** Reload the current window. */
  def reload(): Unit = js.native
  /** Relaunch the entire application. */
  def restartApplication(): Unit = js.native
  /** Set the full screen state of the current window. */
  def setFullScreen(fullScreen: Boolean): Unit = js.native
  /** Set the position of current window. */
  def setPosition(x: Double, y: Double): Unit = js.native
  /** Set the size of current window. */
  def setSize(width: Double, height: Double): Unit = js.native
  /** Show the current window. */
  def show(): Unit = js.native
  /** Toggle the visibility of the dev tools for the current window. */
  def toggleDevTools(): js.Promise[Null] = js.native
  /** Toggle the full screen state of the current window. */
  def toggleFullScreen(): Unit = js.native
  /**
    *  Invoke the given callback as soon as the shell environment is loaded (or
    *  immediately if it was already loaded).
    */
  def whenShellEnvironmentLoaded(callback: js.Function0[Unit]): Disposable = js.native
}

