package typings.atom.atomMod

import typings.atom.Anon_AutoFocus
import typings.atom.Anon_FilePath
import typings.atom.Anon_ItemPriority
import typings.atom.Anon_Pane
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workspace extends js.Object {
  /** Make the next pane active. */
  def activateNextPane(): Boolean = js.native
  /** Make the previous pane active. */
  def activatePreviousPane(): Boolean = js.native
  /** Adds a panel item to the bottom of the editor window. */
  def addBottomPanel[T](options: Anon_ItemPriority[T]): Panel[T] = js.native
  /** Adds a panel item to the footer. */
  def addFooterPanel[T](options: Anon_ItemPriority[T]): Panel[T] = js.native
  /** Adds a panel item to the header. */
  def addHeaderPanel[T](options: Anon_ItemPriority[T]): Panel[T] = js.native
  /** Adds a panel item to the left of the editor window. */
  def addLeftPanel[T](options: Anon_ItemPriority[T]): Panel[T] = js.native
  /** Adds a panel item as a modal dialog. */
  def addModalPanel[T](options: Anon_AutoFocus[T]): Panel[T] = js.native
  /** Register an opener for a URI. */
  def addOpener(
    opener: js.Function2[
      /* uri */ String, 
      /* options */ js.UndefOr[WorkspaceOpenOptions], 
      js.UndefOr[ViewModel]
    ]
  ): Disposable = js.native
  /** Adds a panel item to the right of the editor window. */
  def addRightPanel[T](options: Anon_ItemPriority[T]): Panel[T] = js.native
  /** Adds a panel item to the top of the editor window above the tabs. */
  def addTopPanel[T](options: Anon_ItemPriority[T]): Panel[T] = js.native
  /** Create a new text editor. */
  def buildTextEditor(params: js.Object): TextEditor = js.native
  /**
    *  Creates a new item that corresponds to the provided URI.
    *  If no URI is given, or no registered opener can open the URI, a new empty TextEditor
    *  will be created.
    */
  def createItemForURI(uri: String): js.Promise[js.Object | TextEditor] = js.native
  /** Get the active Pane. */
  def getActivePane(): Pane = js.native
  // Panes
  /** Get the most recently focused pane container. */
  def getActivePaneContainer(): Dock | WorkspaceCenter = js.native
  /** Get the active Pane's active item. */
  def getActivePaneItem(): js.Object = js.native
  /** Get the workspace center's active item if it is a TextEditor. */
  def getActiveTextEditor(): js.UndefOr[TextEditor] = js.native
  /** Get the Dock below the editor window. */
  def getBottomDock(): Dock = js.native
  // Panels
  /** Get an Array of all the panel items at the bottom of the editor window. */
  def getBottomPanels(): js.Array[Panel[js.Object]] = js.native
  // Pane Locations
  /** Get the WorkspaceCenter at the center of the editor window. */
  def getCenter(): WorkspaceCenter = js.native
  /** Get an Array of all the panel items in the footer. */
  def getFooterPanels(): js.Array[Panel[js.Object]] = js.native
  /** Get an Array of all the panel items in the header. */
  def getHeaderPanels(): js.Array[Panel[js.Object]] = js.native
  /** Get the Dock to the left of the editor window. */
  def getLeftDock(): Dock = js.native
  /** Get an Array of all the panel items to the left of the editor window. */
  def getLeftPanels(): js.Array[Panel[js.Object]] = js.native
  /** Get an Array of all the modal panel items. */
  def getModalPanels(): js.Array[Panel[js.Object]] = js.native
  /** Returns all Pane containers. */
  def getPaneContainers(): js.Tuple4[WorkspaceCenter, Dock, Dock, Dock] = js.native
  // Pane Items
  /** Get all pane items in the workspace. */
  def getPaneItems(): js.Array[js.Object] = js.native
  /** Get all panes in the workspace. */
  def getPanes(): js.Array[Pane] = js.native
  /** Get the Dock to the right of the editor window. */
  def getRightDock(): Dock = js.native
  /** Get an Array of all the panel items to the right of the editor window. */
  def getRightPanels(): js.Array[Panel[js.Object]] = js.native
  /** Get all text editors in the workspace. */
  def getTextEditors(): js.Array[TextEditor] = js.native
  /** Get an Array of all the panel items at the top of the editor window. */
  def getTopPanels(): js.Array[Panel[js.Object]] = js.native
  def hide(itemOrURI: String): Boolean = js.native
  /**
    *  Search the workspace for items matching the given URI and hide them.
    *  Returns a boolean indicating whether any items were found (and hidden).
    */
  def hide(itemOrURI: js.Object): Boolean = js.native
  /** Returns a boolean that is true if object is a TextEditor. */
  def isTextEditor(`object`: js.Object): /* is atom.atom.TextEditor */ Boolean = js.native
  /**
    *  Invoke the given callback with the current active pane and when the
    *  active pane changes.
    */
  def observeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback with the current active pane item and with all
    *  future active pane items in the workspace.
    */
  def observeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback with the current active text editor (if any), with all
    *  future active text editors, and when there is no longer an active text editor.
    */
  def observeActiveTextEditor(callback: js.Function1[/* editor */ js.UndefOr[TextEditor], Unit]): Disposable = js.native
  /**
    *  Invoke the given callback with all current and future panes items in the
    *  workspace.
    */
  def observePaneItems(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  /** Invoke the given callback with all current and future panes in the workspace. */
  def observePanes(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  // Event Subscription
  /**
    *  Invoke the given callback with all current and future text editors in
    *  the workspace.
    */
  def observeTextEditors(callback: js.Function1[/* editor */ TextEditor, Unit]): Disposable = js.native
  /** Invoke the given callback when a pane is added to the workspace. */
  def onDidAddPane(callback: js.Function1[/* event */ Anon_Pane, Unit]): Disposable = js.native
  /** Invoke the given callback when a pane item is added to the workspace. */
  def onDidAddPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable = js.native
  /** Invoke the given callback when a text editor is added to the workspace. */
  def onDidAddTextEditor(callback: js.Function1[/* event */ TextEditorObservedEvent, Unit]): Disposable = js.native
  /** Invoke the given callback when the active pane changes. */
  def onDidChangeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  /** Invoke the given callback when the active pane item changes. */
  def onDidChangeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when a text editor becomes the active text editor and
    *  when there is no longer an active text editor.
    */
  def onDidChangeActiveTextEditor(callback: js.Function1[/* editor */ js.UndefOr[TextEditor], Unit]): Disposable = js.native
  /** Invoke the given callback when a pane is destroyed in the workspace. */
  def onDidDestroyPane(callback: js.Function1[/* event */ Anon_Pane, Unit]): Disposable = js.native
  /** Invoke the given callback when a pane item is destroyed. */
  def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback whenever an item is opened. Unlike ::onDidAddPaneItem,
    *  observers will be notified for items that are already present in the workspace
    *  when they are reopened.
    */
  def onDidOpen(callback: js.Function1[/* event */ PaneItemOpenedEvent, Unit]): Disposable = js.native
  /** Invoke the given callback when the active pane item stops changing. */
  def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  /** Invoke the given callback before a pane is destroyed in the workspace. */
  def onWillDestroyPane(callback: js.Function1[/* event */ Anon_Pane, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when a pane item is about to be destroyed,
    *  before the user is prompted to save it.
    *  @param callback The function to be called before pane items are destroyed.
    *      If this function returns a Promise, then the item will not be destroyed
    *      until the promise resolves.
    */
  def onWillDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]]): Disposable = js.native
  /**
    *  Opens the given URI in Atom asynchronously. If the URI is already open,
    *  the existing item for that URI will be activated. If no URI is given, or
    *  no registered opener can open the URI, a new empty TextEditor will be created.
    */
  def open(): js.Promise[TextEditor] = js.native
  // Opening
  /**
    *  Opens the given URI in Atom asynchronously. If the URI is already open,
    *  the existing item for that URI will be activated. If no URI is given, or
    *  no registered opener can open the URI, a new empty TextEditor will be created.
    */
  def open(uri: String): js.Promise[js.Object] = js.native
  def open(uri: String, options: WorkspaceOpenOptions): js.Promise[js.Object] = js.native
  /**
    *  Opens the given item in Atom asynchronously. If the item is already open,
    *  the existing item will be activated. If no item is given, a new empty TextEditor
    *  will be created.
    */
  def open[T /* <: ViewModel */](item: T): js.Promise[T] = js.native
  def open[T /* <: ViewModel */](item: T, options: WorkspaceOpenOptions): js.Promise[T] = js.native
  /** Get the first pane container that contains the given item. */
  def paneContainerForItem(item: js.Object): js.UndefOr[Dock | WorkspaceCenter] = js.native
  /** Get the first pane container that contains an item with the given URI. */
  def paneContainerForURI(uri: String): js.UndefOr[Dock | WorkspaceCenter] = js.native
  /** Get the Pane containing the given item. */
  def paneForItem(item: js.Object): js.UndefOr[Pane] = js.native
  /** Get the first Pane with an item for the given URI. */
  def paneForURI(uri: String): js.UndefOr[Pane] = js.native
  /**
    *  Returns the Panel associated with the given item or null when the item
    *  has no panel.
    */
  def panelForItem[T](item: T): Panel[T] | Null = js.native
  /**
    *  Asynchronously reopens the last-closed item's URI if it hasn't already
    *  been reopened.
    */
  def reopenItem(): js.Promise[js.UndefOr[js.Object]] = js.native
  /** Performs a replace across all the specified files in the project. */
  def replace(
    regex: RegExp,
    replacementText: String,
    filePaths: js.Array[String],
    iterator: js.Function1[/* result */ Anon_FilePath, Unit]
  ): js.Promise[Unit] = js.native
  // Searching and Replacing
  /** Performs a search across all files in the workspace. */
  def scan(regex: RegExp, iterator: js.Function1[/* result */ ScandalResult, Unit]): CancellablePromise[String | Null] = js.native
  /** Performs a search across all files in the workspace. */
  def scan(
    regex: RegExp,
    options: WorkspaceScanOptions,
    iterator: js.Function1[/* result */ ScandalResult, Unit]
  ): CancellablePromise[String | Null] = js.native
  def toggle(itemOrURI: String): js.Promise[Unit] = js.native
  /**
    *  Search the workspace for items matching the given URI. If any are found,
    *  hide them. Otherwise, open the URL.
    *  Returns a Promise that resolves when the item is shown or hidden.
    */
  def toggle(itemOrURI: js.Object): js.Promise[Unit] = js.native
}

