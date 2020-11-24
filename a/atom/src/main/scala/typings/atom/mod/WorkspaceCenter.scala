package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceCenter extends js.Object {
  
  /** Make the next pane active. */
  def activateNextPane(): Unit = js.native
  
  /** Make the previous pane active. */
  def activatePreviousPane(): Unit = js.native
  
  /** Destroy (close) the active pane. */
  def destroyActivePane(): Unit = js.native
  
  /** Get the active Pane. */
  def getActivePane(): Pane = js.native
  
  /** Get the active Pane's active item. */
  def getActivePaneItem(): js.UndefOr[js.Object] = js.native
  
  /** Get the active item if it is an TextEditor. */
  def getActiveTextEditor(): js.UndefOr[TextEditor] = js.native
  
  // Pane Items
  /** Get all pane items in the workspace center. */
  def getPaneItems(): js.Array[js.Object] = js.native
  
  // Panes
  /** Get all panes in the workspace center. */
  def getPanes(): js.Array[Pane] = js.native
  
  /** Get all text editors in the workspace center. */
  def getTextEditors(): js.Array[TextEditor] = js.native
  
  /**
    *  Invoke the given callback with the current active pane and when the active pane
    *  changes.
    */
  def observeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  
  /**
    *  Invoke the given callback with the current active pane item and with all future
    *  active pane items in the workspace center.
    */
  def observeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  
  /**
    *  Invoke the given callback with all current and future panes items in the
    *  workspace center.
    */
  def observePaneItems(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  
  /** Invoke the given callback with all current and future panes in the workspace center. */
  def observePanes(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  
  // Event Subscription
  /**
    *  Invoke the given callback with all current and future text editors in the
    *  workspace center.
    */
  def observeTextEditors(callback: js.Function1[/* editor */ TextEditor, Unit]): Disposable = js.native
  
  /** Invoke the given callback when a pane is added to the workspace center. */
  def onDidAddPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
  
  /** Invoke the given callback when a pane item is added to the workspace center. */
  def onDidAddPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable = js.native
  
  /** Invoke the given callback when a text editor is added to the workspace center. */
  def onDidAddTextEditor(callback: js.Function1[/* event */ TextEditorObservedEvent, Unit]): Disposable = js.native
  
  /** Invoke the given callback when the active pane changes. */
  def onDidChangeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  
  /** Invoke the given callback when the active pane item changes. */
  def onDidChangeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  
  /** Invoke the given callback when a pane is destroyed in the workspace center. */
  def onDidDestroyPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
  
  /** Invoke the given callback when a pane item is destroyed. */
  def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable = js.native
  
  /** Invoke the given callback when the active pane item stops changing. */
  def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  
  /** Invoke the given callback before a pane is destroyed in the workspace center. */
  def onWillDestroyPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
  
  /**
    *  Invoke the given callback when a pane item is about to be destroyed, before the user
    *  is prompted to save it.
    *  @param callback The function to be called before pane items are destroyed.
    *      If this function returns a Promise, then the item will not be destroyed
    *      until the promise resolves.
    */
  def onWillDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]]): Disposable = js.native
  
  /** Retrieve the Pane associated with the given item. */
  def paneForItem(item: js.Object): js.UndefOr[Pane] = js.native
  
  /** Retrieve the Pane associated with the given URI. */
  def paneForURI(uri: String): js.UndefOr[Pane] = js.native
  
  /** Save all pane items. */
  def saveAll(): Unit = js.native
}
object WorkspaceCenter {
  
  @scala.inline
  def apply(
    activateNextPane: () => Unit,
    activatePreviousPane: () => Unit,
    destroyActivePane: () => Unit,
    getActivePane: () => Pane,
    getActivePaneItem: () => js.UndefOr[js.Object],
    getActiveTextEditor: () => js.UndefOr[TextEditor],
    getPaneItems: () => js.Array[js.Object],
    getPanes: () => js.Array[Pane],
    getTextEditors: () => js.Array[TextEditor],
    observeActivePane: js.Function1[/* pane */ Pane, Unit] => Disposable,
    observeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
    observePaneItems: js.Function1[/* item */ js.Object, Unit] => Disposable,
    observePanes: js.Function1[/* pane */ Pane, Unit] => Disposable,
    observeTextEditors: js.Function1[/* editor */ TextEditor, Unit] => Disposable,
    onDidAddPane: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable,
    onDidAddPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable,
    onDidAddTextEditor: js.Function1[/* event */ TextEditorObservedEvent, Unit] => Disposable,
    onDidChangeActivePane: js.Function1[/* pane */ Pane, Unit] => Disposable,
    onDidChangeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
    onDidDestroyPane: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable,
    onDidDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable,
    onDidStopChangingActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
    onWillDestroyPane: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable,
    onWillDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => Disposable,
    paneForItem: js.Object => js.UndefOr[Pane],
    paneForURI: String => js.UndefOr[Pane],
    saveAll: () => Unit
  ): WorkspaceCenter = {
    val __obj = js.Dynamic.literal(activateNextPane = js.Any.fromFunction0(activateNextPane), activatePreviousPane = js.Any.fromFunction0(activatePreviousPane), destroyActivePane = js.Any.fromFunction0(destroyActivePane), getActivePane = js.Any.fromFunction0(getActivePane), getActivePaneItem = js.Any.fromFunction0(getActivePaneItem), getActiveTextEditor = js.Any.fromFunction0(getActiveTextEditor), getPaneItems = js.Any.fromFunction0(getPaneItems), getPanes = js.Any.fromFunction0(getPanes), getTextEditors = js.Any.fromFunction0(getTextEditors), observeActivePane = js.Any.fromFunction1(observeActivePane), observeActivePaneItem = js.Any.fromFunction1(observeActivePaneItem), observePaneItems = js.Any.fromFunction1(observePaneItems), observePanes = js.Any.fromFunction1(observePanes), observeTextEditors = js.Any.fromFunction1(observeTextEditors), onDidAddPane = js.Any.fromFunction1(onDidAddPane), onDidAddPaneItem = js.Any.fromFunction1(onDidAddPaneItem), onDidAddTextEditor = js.Any.fromFunction1(onDidAddTextEditor), onDidChangeActivePane = js.Any.fromFunction1(onDidChangeActivePane), onDidChangeActivePaneItem = js.Any.fromFunction1(onDidChangeActivePaneItem), onDidDestroyPane = js.Any.fromFunction1(onDidDestroyPane), onDidDestroyPaneItem = js.Any.fromFunction1(onDidDestroyPaneItem), onDidStopChangingActivePaneItem = js.Any.fromFunction1(onDidStopChangingActivePaneItem), onWillDestroyPane = js.Any.fromFunction1(onWillDestroyPane), onWillDestroyPaneItem = js.Any.fromFunction1(onWillDestroyPaneItem), paneForItem = js.Any.fromFunction1(paneForItem), paneForURI = js.Any.fromFunction1(paneForURI), saveAll = js.Any.fromFunction0(saveAll))
    __obj.asInstanceOf[WorkspaceCenter]
  }
  
  @scala.inline
  implicit class WorkspaceCenterOps[Self <: WorkspaceCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivateNextPane(value: () => Unit): Self = this.set("activateNextPane", js.Any.fromFunction0(value))
    
    @scala.inline
    def setActivatePreviousPane(value: () => Unit): Self = this.set("activatePreviousPane", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyActivePane(value: () => Unit): Self = this.set("destroyActivePane", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActivePane(value: () => Pane): Self = this.set("getActivePane", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActivePaneItem(value: () => js.UndefOr[js.Object]): Self = this.set("getActivePaneItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveTextEditor(value: () => js.UndefOr[TextEditor]): Self = this.set("getActiveTextEditor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPaneItems(value: () => js.Array[js.Object]): Self = this.set("getPaneItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanes(value: () => js.Array[Pane]): Self = this.set("getPanes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextEditors(value: () => js.Array[TextEditor]): Self = this.set("getTextEditors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObserveActivePane(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = this.set("observeActivePane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObserveActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = this.set("observeActivePaneItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObservePaneItems(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = this.set("observePaneItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObservePanes(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = this.set("observePanes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObserveTextEditors(value: js.Function1[/* editor */ TextEditor, Unit] => Disposable): Self = this.set("observeTextEditors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidAddPane(value: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable): Self = this.set("onDidAddPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidAddPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable): Self = this.set("onDidAddPaneItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidAddTextEditor(value: js.Function1[/* event */ TextEditorObservedEvent, Unit] => Disposable): Self = this.set("onDidAddTextEditor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidChangeActivePane(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = this.set("onDidChangeActivePane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidChangeActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = this.set("onDidChangeActivePaneItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidDestroyPane(value: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable): Self = this.set("onDidDestroyPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidDestroyPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable): Self = this.set("onDidDestroyPaneItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidStopChangingActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = this.set("onDidStopChangingActivePaneItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWillDestroyPane(value: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable): Self = this.set("onWillDestroyPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWillDestroyPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => Disposable): Self = this.set("onWillDestroyPaneItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPaneForItem(value: js.Object => js.UndefOr[Pane]): Self = this.set("paneForItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPaneForURI(value: String => js.UndefOr[Pane]): Self = this.set("paneForURI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveAll(value: () => Unit): Self = this.set("saveAll", js.Any.fromFunction0(value))
  }
}
