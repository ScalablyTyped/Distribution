package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceCenter extends js.Object {
  /** Make the next pane active. */
  def activateNextPane(): scala.Unit
  /** Make the previous pane active. */
  def activatePreviousPane(): scala.Unit
  /** Destroy (close) the active pane. */
  def destroyActivePane(): scala.Unit
  /** Get the active Pane. */
  def getActivePane(): Pane
  /** Get the active Pane's active item. */
  def getActivePaneItem(): js.UndefOr[js.Object]
  /** Get the active item if it is an TextEditor. */
  def getActiveTextEditor(): js.UndefOr[TextEditor]
  // Pane Items
  /** Get all pane items in the workspace center. */
  def getPaneItems(): js.Array[js.Object]
  // Panes
  /** Get all panes in the workspace center. */
  def getPanes(): js.Array[Pane]
  /** Get all text editors in the workspace center. */
  def getTextEditors(): js.Array[TextEditor]
  /**
    *  Invoke the given callback with the current active pane and when the active pane
    *  changes.
    */
  def observeActivePane(callback: js.Function1[/* pane */ Pane, scala.Unit]): Disposable
  /**
    *  Invoke the given callback with the current active pane item and with all future
    *  active pane items in the workspace center.
    */
  def observeActivePaneItem(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable
  /**
    *  Invoke the given callback with all current and future panes items in the
    *  workspace center.
    */
  def observePaneItems(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable
  /** Invoke the given callback with all current and future panes in the workspace center. */
  def observePanes(callback: js.Function1[/* pane */ Pane, scala.Unit]): Disposable
  // Event Subscription
  /**
    *  Invoke the given callback with all current and future text editors in the
    *  workspace center.
    */
  def observeTextEditors(callback: js.Function1[/* editor */ TextEditor, scala.Unit]): Disposable
  /** Invoke the given callback when a pane is added to the workspace center. */
  def onDidAddPane(callback: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit]): Disposable
  /** Invoke the given callback when a pane item is added to the workspace center. */
  def onDidAddPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit]): Disposable
  /** Invoke the given callback when a text editor is added to the workspace center. */
  def onDidAddTextEditor(callback: js.Function1[/* event */ TextEditorObservedEvent, scala.Unit]): Disposable
  /** Invoke the given callback when the active pane changes. */
  def onDidChangeActivePane(callback: js.Function1[/* pane */ Pane, scala.Unit]): Disposable
  /** Invoke the given callback when the active pane item changes. */
  def onDidChangeActivePaneItem(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable
  /** Invoke the given callback when a pane is destroyed in the workspace center. */
  def onDidDestroyPane(callback: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit]): Disposable
  /** Invoke the given callback when a pane item is destroyed. */
  def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit]): Disposable
  /** Invoke the given callback when the active pane item stops changing. */
  def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable
  /** Invoke the given callback before a pane is destroyed in the workspace center. */
  def onWillDestroyPane(callback: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit]): Disposable
  /**
    *  Invoke the given callback when a pane item is about to be destroyed, before the user
    *  is prompted to save it.
    *  @param callback The function to be called before pane items are destroyed.
    *      If this function returns a Promise, then the item will not be destroyed
    *      until the promise resolves.
    */
  def onWillDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit | js.Promise[scala.Unit]]): Disposable
  /** Retrieve the Pane associated with the given item. */
  def paneForItem(item: js.Object): js.UndefOr[Pane]
  /** Retrieve the Pane associated with the given URI. */
  def paneForURI(uri: java.lang.String): js.UndefOr[Pane]
  /** Save all pane items. */
  def saveAll(): scala.Unit
}

object WorkspaceCenter {
  @scala.inline
  def apply(
    activateNextPane: js.Function0[scala.Unit],
    activatePreviousPane: js.Function0[scala.Unit],
    destroyActivePane: js.Function0[scala.Unit],
    getActivePane: js.Function0[Pane],
    getActivePaneItem: js.Function0[js.UndefOr[js.Object]],
    getActiveTextEditor: js.Function0[js.UndefOr[TextEditor]],
    getPaneItems: js.Function0[js.Array[js.Object]],
    getPanes: js.Function0[js.Array[Pane]],
    getTextEditors: js.Function0[js.Array[TextEditor]],
    observeActivePane: js.Function1[js.Function1[/* pane */ Pane, scala.Unit], Disposable],
    observeActivePaneItem: js.Function1[js.Function1[/* item */ js.Object, scala.Unit], Disposable],
    observePaneItems: js.Function1[js.Function1[/* item */ js.Object, scala.Unit], Disposable],
    observePanes: js.Function1[js.Function1[/* pane */ Pane, scala.Unit], Disposable],
    observeTextEditors: js.Function1[js.Function1[/* editor */ TextEditor, scala.Unit], Disposable],
    onDidAddPane: js.Function1[js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit], Disposable],
    onDidAddPaneItem: js.Function1[js.Function1[/* event */ PaneItemObservedEvent, scala.Unit], Disposable],
    onDidAddTextEditor: js.Function1[js.Function1[/* event */ TextEditorObservedEvent, scala.Unit], Disposable],
    onDidChangeActivePane: js.Function1[js.Function1[/* pane */ Pane, scala.Unit], Disposable],
    onDidChangeActivePaneItem: js.Function1[js.Function1[/* item */ js.Object, scala.Unit], Disposable],
    onDidDestroyPane: js.Function1[js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit], Disposable],
    onDidDestroyPaneItem: js.Function1[js.Function1[/* event */ PaneItemObservedEvent, scala.Unit], Disposable],
    onDidStopChangingActivePaneItem: js.Function1[js.Function1[/* item */ js.Object, scala.Unit], Disposable],
    onWillDestroyPane: js.Function1[js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit], Disposable],
    onWillDestroyPaneItem: js.Function1[
      js.Function1[/* event */ PaneItemObservedEvent, scala.Unit | js.Promise[scala.Unit]], 
      Disposable
    ],
    paneForItem: js.Function1[js.Object, js.UndefOr[Pane]],
    paneForURI: js.Function1[java.lang.String, js.UndefOr[Pane]],
    saveAll: js.Function0[scala.Unit]
  ): WorkspaceCenter = {
    val __obj = js.Dynamic.literal(activateNextPane = activateNextPane, activatePreviousPane = activatePreviousPane, destroyActivePane = destroyActivePane, getActivePane = getActivePane, getActivePaneItem = getActivePaneItem, getActiveTextEditor = getActiveTextEditor, getPaneItems = getPaneItems, getPanes = getPanes, getTextEditors = getTextEditors, observeActivePane = observeActivePane, observeActivePaneItem = observeActivePaneItem, observePaneItems = observePaneItems, observePanes = observePanes, observeTextEditors = observeTextEditors, onDidAddPane = onDidAddPane, onDidAddPaneItem = onDidAddPaneItem, onDidAddTextEditor = onDidAddTextEditor, onDidChangeActivePane = onDidChangeActivePane, onDidChangeActivePaneItem = onDidChangeActivePaneItem, onDidDestroyPane = onDidDestroyPane, onDidDestroyPaneItem = onDidDestroyPaneItem, onDidStopChangingActivePaneItem = onDidStopChangingActivePaneItem, onWillDestroyPane = onWillDestroyPane, onWillDestroyPaneItem = onWillDestroyPaneItem, paneForItem = paneForItem, paneForURI = paneForURI, saveAll = saveAll)
  
    __obj.asInstanceOf[WorkspaceCenter]
  }
}

