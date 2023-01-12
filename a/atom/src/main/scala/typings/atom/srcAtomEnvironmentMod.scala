package typings.atom

import typings.atom.anon.Buttons
import typings.atom.anon.DetailedMessage
import typings.atom.anon.DevMode
import typings.atom.anon.Height
import typings.atom.anon.Width
import typings.atom.anon.X
import typings.atom.anon.Y
import typings.atom.atomStrings.beta
import typings.atom.atomStrings.dev
import typings.atom.atomStrings.error
import typings.atom.atomStrings.info
import typings.atom.atomStrings.nightly
import typings.atom.atomStrings.none
import typings.atom.atomStrings.question
import typings.atom.atomStrings.stable
import typings.atom.atomStrings.warning
import typings.atom.mod.Disposable
import typings.atom.srcClipboardMod.Clipboard
import typings.atom.srcCommandRegistryMod.CommandRegistry
import typings.atom.srcConfigMod.Config
import typings.atom.srcContextMenuManagerMod.ContextMenuManager
import typings.atom.srcDeserializerManagerMod.DeserializerManager
import typings.atom.srcGetWindowLoadSettingsMod.WindowLoadSettings
import typings.atom.srcGrammarRegistryMod.GrammarRegistry
import typings.atom.srcHistoryManagerMod.HistoryManager
import typings.atom.srcKeymapExtensionsMod.KeymapManager
import typings.atom.srcMenuManagerMod.MenuManager
import typings.atom.srcNotificationManagerMod.NotificationManager
import typings.atom.srcPackageManagerMod.PackageManager
import typings.atom.srcProjectMod.Project
import typings.atom.srcStyleManagerMod.StyleManager
import typings.atom.srcTextEditorRegistryMod.TextEditorRegistry
import typings.atom.srcThemeManagerMod.ThemeManager
import typings.atom.srcTooltipManagerMod.TooltipManager
import typings.atom.srcViewRegistryMod.ViewRegistry
import typings.atom.srcWorkspaceMod.Workspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAtomEnvironmentMod {
  
  @js.native
  trait AtomEnvironment extends StObject {
    
    // Messaging the User
    /** Visually and audibly trigger a beep. */
    def beep(): Unit = js.native
    
    /** Move current window to the center of the screen. */
    def center(): Unit = js.native
    
    /** A Clipboard instance. */
    val clipboard: Clipboard = js.native
    
    /** Close the current window. */
    def close(): Unit = js.native
    
    // Properties
    /** A CommandRegistry instance. */
    val commands: CommandRegistry = js.native
    
    /** A Config instance. */
    val config: Config = js.native
    
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
    def confirm(options: Buttons): Unit = js.native
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
    def confirm(options: DetailedMessage): Double = js.native
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
    
    /** A ContextMenuManager instance. */
    val contextMenu: ContextMenuManager = js.native
    
    /** A DeserializerManager instance. */
    val deserializers: DeserializerManager = js.native
    
    /**
      * Restores the full screen and maximized state after the window has resized to prevent resize
      * glitches.
      */
    def displayWindow(): js.Promise[Unit] = js.native
    
    /** Execute code in dev tools. */
    def executeJavaScriptInDevTools(code: String): Unit = js.native
    
    /** Focus the current window. */
    def focus(): Unit = js.native
    
    /** Get the full name of this Atom release (e.g. "Atom", "Atom Beta") */
    def getAppName(): String = js.native
    
    /** Undocumented: get Atom config directory path */
    def getConfigDirPath(): String = js.native
    
    /** Get the current window. */
    def getCurrentWindow(): js.Object = js.native
    
    /** Get the load settings for the current window. */
    def getLoadSettings(): WindowLoadSettings = js.native
    
    /** Get the position of current window. */
    def getPosition(): X = js.native
    
    /**
      *  Gets the release channel of the Atom application.
      *  Returns the release channel, which can be 'dev', 'nightly', 'beta', or 'stable'.
      */
    def getReleaseChannel(): dev | nightly | beta | stable = js.native
    
    /** Get the size of current window. */
    def getSize(): Height = js.native
    
    /** Get the all the markers with the information about startup time. */
    def getStartupMarkers(): js.Array[TimingMarker] = js.native
    
    /** Get the version of the Atom application. */
    def getVersion(): String = js.native
    
    /** Get the dimensions of this window. */
    def getWindowDimensions(): Width = js.native
    
    /** Get the time taken to completely load the current window. */
    def getWindowLoadTime(): Double = js.native
    
    /** A GrammarRegistry instance. */
    val grammars: GrammarRegistry = js.native
    
    /** Hide the current window. */
    def hide(): Unit = js.native
    
    /** A HistoryManager instance. */
    val history: HistoryManager = js.native
    
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
    
    /** A KeymapManager instance. */
    val keymaps: KeymapManager = js.native
    
    /** A MenuManager instance. */
    val menu: MenuManager = js.native
    
    /** A NotificationManager instance. */
    val notifications: NotificationManager = js.native
    
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
    def open(params: DevMode): Unit = js.native
    
    // Managing the Dev Tools
    /** Open the dev tools for the current window. */
    def openDevTools(): js.Promise[Null] = js.native
    
    /** A PackageManager instance. */
    val packages: PackageManager = js.native
    
    /** Prompt the user to select one or more folders. */
    def pickFolder(callback: js.Function1[/* paths */ js.Array[String] | Null, Unit]): Unit = js.native
    
    /** A Project instance. */
    val project: Project = js.native
    
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
    
    /** Set the dimensions of the window. */
    def setWindowDimensions(dimensions: Y): js.Promise[js.Object] = js.native
    
    /** Show the current window. */
    def show(): Unit = js.native
    
    /** A StyleManager instance. */
    val styles: StyleManager = js.native
    
    /** A TextEditorRegistry instance. */
    val textEditors: TextEditorRegistry = js.native
    
    /** A ThemeManager instance. */
    val themes: ThemeManager = js.native
    
    /** Toggle the visibility of the dev tools for the current window. */
    def toggleDevTools(): js.Promise[Null] = js.native
    
    /** Toggle the full screen state of the current window. */
    def toggleFullScreen(): Unit = js.native
    
    /** A TooltipManager instance. */
    val tooltips: TooltipManager = js.native
    
    /** A ViewRegistry instance. */
    val views: ViewRegistry = js.native
    
    /**
      *  Invoke the given callback as soon as the shell environment is loaded (or
      *  immediately if it was already loaded).
      */
    def whenShellEnvironmentLoaded(callback: js.Function0[Unit]): Disposable = js.native
    
    /** A Workspace instance. */
    val workspace: Workspace = js.native
  }
  
  trait ConfirmationOptions extends StObject {
    
    /** The text for the buttons. */
    var buttons: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  The index of the button to be used to cancel the dialog, via the `Esc` key.
      *  By default this is assigned to the first button with "cancel" or "no" as the
      *  label. If no such labeled buttons exist and this option is not set, 0 will be
      *  used as the return value or callback response.
      *
      *  This option is ignored on Windows.
      */
    var cancelId: js.UndefOr[Double] = js.undefined
    
    /** Initial checked state of the checkbox. false by default. */
    var checkboxChecked: js.UndefOr[Boolean] = js.undefined
    
    /** If provided, the message box will include a checkbox with the given label. */
    var checkboxLabel: js.UndefOr[String] = js.undefined
    
    /** The index for the button to be selected by default in the prompt. */
    var defaultId: js.UndefOr[Double] = js.undefined
    
    /** Additional information regarding the message. */
    var detail: js.UndefOr[String] = js.undefined
    
    /** An Electron NativeImage to use as the prompt's icon. */
    var icon: js.UndefOr[js.Object] = js.undefined
    
    /** The content of the message box. */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      *  On Windows, Electron will try to figure out which one of the buttons are
      *  common buttons (like `Cancel` or `Yes`), and show the others as command links
      *  in the dialog. This can make the dialog appear in the style of modern Windows
      *  apps. If you don't like this behavior, you can set noLink to true.
      */
    var noLink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Normalize the keyboard access keys across platforms.
      * Atom defaults this to true.
      */
    var normalizeAccessKeys: js.UndefOr[Boolean] = js.undefined
    
    /** The title for the prompt. */
    var title: js.UndefOr[String] = js.undefined
    
    /** The type of the confirmation prompt. */
    var `type`: js.UndefOr[none | info | error | question | warning] = js.undefined
  }
  object ConfirmationOptions {
    
    inline def apply(): ConfirmationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfirmationOptions] (val x: Self) extends AnyVal {
      
      inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setCancelId(value: Double): Self = StObject.set(x, "cancelId", value.asInstanceOf[js.Any])
      
      inline def setCancelIdUndefined: Self = StObject.set(x, "cancelId", js.undefined)
      
      inline def setCheckboxChecked(value: Boolean): Self = StObject.set(x, "checkboxChecked", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCheckedUndefined: Self = StObject.set(x, "checkboxChecked", js.undefined)
      
      inline def setCheckboxLabel(value: String): Self = StObject.set(x, "checkboxLabel", value.asInstanceOf[js.Any])
      
      inline def setCheckboxLabelUndefined: Self = StObject.set(x, "checkboxLabel", js.undefined)
      
      inline def setDefaultId(value: Double): Self = StObject.set(x, "defaultId", value.asInstanceOf[js.Any])
      
      inline def setDefaultIdUndefined: Self = StObject.set(x, "defaultId", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setIcon(value: js.Object): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setNoLink(value: Boolean): Self = StObject.set(x, "noLink", value.asInstanceOf[js.Any])
      
      inline def setNoLinkUndefined: Self = StObject.set(x, "noLink", js.undefined)
      
      inline def setNormalizeAccessKeys(value: Boolean): Self = StObject.set(x, "normalizeAccessKeys", value.asInstanceOf[js.Any])
      
      inline def setNormalizeAccessKeysUndefined: Self = StObject.set(x, "normalizeAccessKeys", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: none | info | error | question | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExceptionThrownEvent extends StObject {
    
    var column: Double
    
    var line: Double
    
    var message: String
    
    var originalError: js.Error
    
    var url: String
  }
  object ExceptionThrownEvent {
    
    inline def apply(column: Double, line: Double, message: String, originalError: js.Error, url: String): ExceptionThrownEvent = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionThrownEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionThrownEvent] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOriginalError(value: js.Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreventableExceptionThrownEvent
    extends StObject
       with ExceptionThrownEvent {
    
    def preventDefault(): Unit
  }
  object PreventableExceptionThrownEvent {
    
    inline def apply(
      column: Double,
      line: Double,
      message: String,
      originalError: js.Error,
      preventDefault: () => Unit,
      url: String
    ): PreventableExceptionThrownEvent = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreventableExceptionThrownEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreventableExceptionThrownEvent] (val x: Self) extends AnyVal {
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  trait TimingMarker extends StObject {
    
    var label: String
    
    var time: Double
  }
  object TimingMarker {
    
    inline def apply(label: String, time: Double): TimingMarker = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingMarker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimingMarker] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
