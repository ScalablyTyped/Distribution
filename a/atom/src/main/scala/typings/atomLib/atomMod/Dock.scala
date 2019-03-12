package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dock extends js.Object {
  // Methods
  /** Show the dock and focus its active Pane. */
  def activate(): scala.Unit
  /** Make the next pane active. */
  def activateNextPane(): scala.Boolean
  /** Make the previous pane active. */
  def activatePreviousPane(): scala.Boolean
  /** Get the active Pane. */
  def getActivePane(): Pane
  /** Get the active Pane's active item. */
  def getActivePaneItem(): js.Object
  // Pane Items
  /** Get all pane items in the dock. */
  def getPaneItems(): js.Array[js.Object]
  // Panes
  /** Returns an Array of Panes. */
  def getPanes(): js.Array[Pane]
  /**
    *  Hide the dock and activate the WorkspaceCenter if the dock was was previously
    *  focused.
    */
  def hide(): scala.Unit
  /** Check if the dock is visible. */
  def isVisible(): scala.Boolean
  /**
    *  Invoke the given callback with the current active pane and when the active
    *  pane changes.
    */
  def observeActivePane(callback: js.Function1[/* pane */ Pane, scala.Unit]): Disposable
  /**
    *  Invoke the given callback with the current active pane item and with all future
    *  active pane items in the dock.
    */
  def observeActivePaneItem(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable
  /** Invoke the given callback with all current and future panes items in the dock. */
  def observePaneItems(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable
  /** Invoke the given callback with all current and future panes in the dock. */
  def observePanes(callback: js.Function1[/* pane */ Pane, scala.Unit]): Disposable
  /**
    *  Invoke the given callback with the current and all future visibilities of
    *  the dock.
    */
  def observeVisible(callback: js.Function1[/* visible */ scala.Boolean, scala.Unit]): Disposable
  /** Invoke the given callback when a pane is added to the dock. */
  def onDidAddPane(callback: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit]): Disposable
  /** Invoke the given callback when a pane item is added to the dock. */
  def onDidAddPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit]): Disposable
  /** Invoke the given callback when the active pane changes. */
  def onDidChangeActivePane(callback: js.Function1[/* pane */ Pane, scala.Unit]): Disposable
  /**
    *  Invoke the given callback when the active pane item changes.
    *
    *  Because observers are invoked synchronously, it's important not to perform any
    *  expensive operations via this method. Consider ::onDidStopChangingActivePaneItem
    *  to delay operations until after changes stop occurring.
    */
  def onDidChangeActivePaneItem(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable
  /**
    *  Invoke the given callback when the hovered state of the dock changes.
    *  @param hovered Is the dock now hovered?
    */
  def onDidChangeHovered(callback: js.Function1[/* hovered */ scala.Boolean, scala.Unit]): Disposable
  // Event Subscription
  /** Invoke the given callback when the visibility of the dock changes. */
  def onDidChangeVisible(callback: js.Function1[/* visible */ scala.Boolean, scala.Unit]): Disposable
  /** Invoke the given callback when a pane is destroyed in the dock. */
  def onDidDestroyPane(callback: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit]): Disposable
  /** Invoke the given callback when a pane item is destroyed. */
  def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit]): Disposable
  /** Invoke the given callback when the active pane item stops changing. */
  def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable
  /** Invoke the given callback before a pane is destroyed in the dock. */
  def onWillDestroyPane(callback: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit]): Disposable
  /**
    *  Invoke the given callback when a pane item is about to be destroyed, before the user is
    *  prompted to save it.
    *  @param callback The function to be called before pane items are destroyed.
    *      If this function returns a Promise, then the item will not be destroyed
    *      until the promise resolves.
    */
  def onWillDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit | js.Promise[scala.Unit]]): Disposable
  /** Show the dock without focusing it. */
  def show(): scala.Unit
  /**
    *  Toggle the dock's visibility without changing the Workspace's active pane
    *  container.
    */
  def toggle(): scala.Unit
}

object Dock {
  @scala.inline
  def apply(
    activate: () => scala.Unit,
    activateNextPane: () => scala.Boolean,
    activatePreviousPane: () => scala.Boolean,
    getActivePane: () => Pane,
    getActivePaneItem: () => js.Object,
    getPaneItems: () => js.Array[js.Object],
    getPanes: () => js.Array[Pane],
    hide: () => scala.Unit,
    isVisible: () => scala.Boolean,
    observeActivePane: js.Function1[/* pane */ Pane, scala.Unit] => Disposable,
    observeActivePaneItem: js.Function1[/* item */ js.Object, scala.Unit] => Disposable,
    observePaneItems: js.Function1[/* item */ js.Object, scala.Unit] => Disposable,
    observePanes: js.Function1[/* pane */ Pane, scala.Unit] => Disposable,
    observeVisible: js.Function1[/* visible */ scala.Boolean, scala.Unit] => Disposable,
    onDidAddPane: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit] => Disposable,
    onDidAddPaneItem: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit] => Disposable,
    onDidChangeActivePane: js.Function1[/* pane */ Pane, scala.Unit] => Disposable,
    onDidChangeActivePaneItem: js.Function1[/* item */ js.Object, scala.Unit] => Disposable,
    onDidChangeHovered: js.Function1[/* hovered */ scala.Boolean, scala.Unit] => Disposable,
    onDidChangeVisible: js.Function1[/* visible */ scala.Boolean, scala.Unit] => Disposable,
    onDidDestroyPane: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit] => Disposable,
    onDidDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit] => Disposable,
    onDidStopChangingActivePaneItem: js.Function1[/* item */ js.Object, scala.Unit] => Disposable,
    onWillDestroyPane: js.Function1[/* event */ atomLib.Anon_Pane, scala.Unit] => Disposable,
    onWillDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, scala.Unit | js.Promise[scala.Unit]] => Disposable,
    show: () => scala.Unit,
    toggle: () => scala.Unit
  ): Dock = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), activateNextPane = js.Any.fromFunction0(activateNextPane), activatePreviousPane = js.Any.fromFunction0(activatePreviousPane), getActivePane = js.Any.fromFunction0(getActivePane), getActivePaneItem = js.Any.fromFunction0(getActivePaneItem), getPaneItems = js.Any.fromFunction0(getPaneItems), getPanes = js.Any.fromFunction0(getPanes), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), observeActivePane = js.Any.fromFunction1(observeActivePane), observeActivePaneItem = js.Any.fromFunction1(observeActivePaneItem), observePaneItems = js.Any.fromFunction1(observePaneItems), observePanes = js.Any.fromFunction1(observePanes), observeVisible = js.Any.fromFunction1(observeVisible), onDidAddPane = js.Any.fromFunction1(onDidAddPane), onDidAddPaneItem = js.Any.fromFunction1(onDidAddPaneItem), onDidChangeActivePane = js.Any.fromFunction1(onDidChangeActivePane), onDidChangeActivePaneItem = js.Any.fromFunction1(onDidChangeActivePaneItem), onDidChangeHovered = js.Any.fromFunction1(onDidChangeHovered), onDidChangeVisible = js.Any.fromFunction1(onDidChangeVisible), onDidDestroyPane = js.Any.fromFunction1(onDidDestroyPane), onDidDestroyPaneItem = js.Any.fromFunction1(onDidDestroyPaneItem), onDidStopChangingActivePaneItem = js.Any.fromFunction1(onDidStopChangingActivePaneItem), onWillDestroyPane = js.Any.fromFunction1(onWillDestroyPane), onWillDestroyPaneItem = js.Any.fromFunction1(onWillDestroyPaneItem), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Dock]
  }
}

