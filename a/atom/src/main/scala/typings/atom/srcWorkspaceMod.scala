package typings.atom

import typings.atom.anon.AutoFocus
import typings.atom.anon.FilePath
import typings.atom.anon.LeadingContextLines
import typings.atom.anon.Visible
import typings.atom.atomStrings.bottom_
import typings.atom.atomStrings.center
import typings.atom.atomStrings.down
import typings.atom.atomStrings.left_
import typings.atom.atomStrings.right_
import typings.atom.atomStrings.up
import typings.atom.mod.Disposable
import typings.atom.mod.TextEditor
import typings.atom.srcDockMod.Dock
import typings.atom.srcOtherTypesMod.CancellablePromise
import typings.atom.srcOtherTypesMod.TextEditorObservedEvent
import typings.atom.srcPaneMod.Pane
import typings.atom.srcPaneMod.PaneItemObservedEvent
import typings.atom.srcPaneMod.PaneItemOpenedEvent
import typings.atom.srcPanelMod.Panel
import typings.atom.srcViewRegistryMod.ViewModel
import typings.atom.srcWorkspaceCenterMod.WorkspaceCenter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkspaceMod {
  
  type FocusableHTMLElement = HTMLElement | String | js.Function0[HTMLElement]
  
  trait ScandalResult extends StObject {
    
    var filePath: String
    
    var matches: js.Array[LeadingContextLines]
  }
  object ScandalResult {
    
    inline def apply(filePath: String, matches: js.Array[LeadingContextLines]): ScandalResult = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScandalResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScandalResult] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[LeadingContextLines]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: LeadingContextLines*): Self = StObject.set(x, "matches", js.Array(value*))
    }
  }
  
  @js.native
  trait Workspace extends StObject {
    
    /** Make the next pane active. */
    def activateNextPane(): Boolean = js.native
    
    /** Make the previous pane active. */
    def activatePreviousPane(): Boolean = js.native
    
    /** Adds a panel item to the bottom of the editor window. */
    def addBottomPanel[T](options: Visible[T]): Panel[T] = js.native
    
    /** Adds a panel item to the footer. */
    def addFooterPanel[T](options: Visible[T]): Panel[T] = js.native
    
    /** Adds a panel item to the header. */
    def addHeaderPanel[T](options: Visible[T]): Panel[T] = js.native
    
    /** Adds a panel item to the left of the editor window. */
    def addLeftPanel[T](options: Visible[T]): Panel[T] = js.native
    
    /** Adds a panel item as a modal dialog. */
    def addModalPanel[T](options: AutoFocus[T]): Panel[T] = js.native
    
    /** Register an opener for a URI. */
    def addOpener(
      opener: js.Function2[
          /* uri */ String, 
          /* options */ js.UndefOr[WorkspaceOpenOptions], 
          js.UndefOr[ViewModel]
        ]
    ): Disposable = js.native
    
    /** Adds a panel item to the right of the editor window. */
    def addRightPanel[T](options: Visible[T]): Panel[T] = js.native
    
    /** Adds a panel item to the top of the editor window above the tabs. */
    def addTopPanel[T](options: Visible[T]): Panel[T] = js.native
    
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
    def onDidAddPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
    
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
    def onDidDestroyPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
    
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
    def onWillDestroyPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
    
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
      regex: js.RegExp,
      replacementText: String,
      filePaths: js.Array[String],
      iterator: js.Function1[/* result */ FilePath, Unit]
    ): js.Promise[Unit] = js.native
    
    // Searching and Replacing
    /** Performs a search across all files in the workspace. */
    def scan(regex: js.RegExp, iterator: js.Function1[/* result */ ScandalResult, Unit]): CancellablePromise[String | Null] = js.native
    /** Performs a search across all files in the workspace. */
    def scan(
      regex: js.RegExp,
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
  
  trait WorkspaceOpenOptions extends StObject {
    
    /**
      *  A boolean indicating whether to call Pane::activateItem on containing pane.
      *  Defaults to true.
      */
    var activateItem: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  A boolean indicating whether to call Pane::activate on containing pane.
      *  Defaults to true.
      */
    var activatePane: js.UndefOr[Boolean] = js.undefined
    
    /** A number indicating which column to move the cursor to initially. Defaults to 0. */
    var initialColumn: js.UndefOr[Double] = js.undefined
    
    /** A number indicating which row to move the cursor to initially. Defaults to 0. */
    var initialLine: js.UndefOr[Double] = js.undefined
    
    /**
      *  A String containing the name of the location in which this item should be opened.
      *  If omitted, Atom will fall back to the last location in which a user has placed
      *  an item with the same URI or, if this is a new URI, the default location specified
      *  by the item.
      *  NOTE: This option should almost always be omitted to honor user preference.
      */
    var location: js.UndefOr[left_ | right_ | bottom_ | center] = js.undefined
    
    /**
      *  A Boolean indicating whether or not the item should be opened in a pending state.
      *  Existing pending items in a pane are replaced with new pending items when they
      *  are opened.
      */
    var pending: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  A boolean. If true, the workspace will attempt to activate an existing item for
      *  the given URI on any pane. If false, only the active pane will be searched for
      *  an existing item for the same URI. Defaults to false.
      */
    var searchAllPanes: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  Either 'left', 'right', 'up' or 'down'. If 'left', the item will be opened in
      *  leftmost pane of the current active pane's row. If 'right', the item will be
      *  opened in the rightmost pane of the current active pane's row. If only one pane
      *  exists in the row, a new pane will be created. If 'up', the item will be opened
      *  in topmost pane of the current active pane's column. If 'down', the item will be
      *  opened in the bottommost pane of the current active pane's column. If only one pane
      *  exists in the column, a new pane will be created.
      */
    var split: js.UndefOr[left_ | right_ | up | down] = js.undefined
  }
  object WorkspaceOpenOptions {
    
    inline def apply(): WorkspaceOpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceOpenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceOpenOptions] (val x: Self) extends AnyVal {
      
      inline def setActivateItem(value: Boolean): Self = StObject.set(x, "activateItem", value.asInstanceOf[js.Any])
      
      inline def setActivateItemUndefined: Self = StObject.set(x, "activateItem", js.undefined)
      
      inline def setActivatePane(value: Boolean): Self = StObject.set(x, "activatePane", value.asInstanceOf[js.Any])
      
      inline def setActivatePaneUndefined: Self = StObject.set(x, "activatePane", js.undefined)
      
      inline def setInitialColumn(value: Double): Self = StObject.set(x, "initialColumn", value.asInstanceOf[js.Any])
      
      inline def setInitialColumnUndefined: Self = StObject.set(x, "initialColumn", js.undefined)
      
      inline def setInitialLine(value: Double): Self = StObject.set(x, "initialLine", value.asInstanceOf[js.Any])
      
      inline def setInitialLineUndefined: Self = StObject.set(x, "initialLine", js.undefined)
      
      inline def setLocation(value: left_ | right_ | bottom_ | center): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setSearchAllPanes(value: Boolean): Self = StObject.set(x, "searchAllPanes", value.asInstanceOf[js.Any])
      
      inline def setSearchAllPanesUndefined: Self = StObject.set(x, "searchAllPanes", js.undefined)
      
      inline def setSplit(value: left_ | right_ | up | down): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  trait WorkspaceScanOptions extends StObject {
    
    /** The number of lines before the matched line to include in the results object. */
    var leadingContextLineCount: js.UndefOr[Double] = js.undefined
    
    /** A function to be periodically called with the number of paths searched. */
    var onPathsSearched: js.UndefOr[js.Function1[/* pathsSearched */ Double, Unit]] = js.undefined
    
    /** An array of glob patterns to search within. */
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The number of lines after the matched line to include in the results object. */
    var trailingContextLineCount: js.UndefOr[Double] = js.undefined
  }
  object WorkspaceScanOptions {
    
    inline def apply(): WorkspaceScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceScanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkspaceScanOptions] (val x: Self) extends AnyVal {
      
      inline def setLeadingContextLineCount(value: Double): Self = StObject.set(x, "leadingContextLineCount", value.asInstanceOf[js.Any])
      
      inline def setLeadingContextLineCountUndefined: Self = StObject.set(x, "leadingContextLineCount", js.undefined)
      
      inline def setOnPathsSearched(value: /* pathsSearched */ Double => Unit): Self = StObject.set(x, "onPathsSearched", js.Any.fromFunction1(value))
      
      inline def setOnPathsSearchedUndefined: Self = StObject.set(x, "onPathsSearched", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setTrailingContextLineCount(value: Double): Self = StObject.set(x, "trailingContextLineCount", value.asInstanceOf[js.Any])
      
      inline def setTrailingContextLineCountUndefined: Self = StObject.set(x, "trailingContextLineCount", js.undefined)
    }
  }
}
