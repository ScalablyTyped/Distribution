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
  def onWillDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit | stdLib.Promise[scala.Unit]]): Disposable
  /** Retrieve the Pane associated with the given item. */
  def paneForItem(item: js.Object): js.UndefOr[Pane]
  /** Retrieve the Pane associated with the given URI. */
  def paneForURI(uri: java.lang.String): js.UndefOr[Pane]
  /** Save all pane items. */
  def saveAll(): scala.Unit
}

