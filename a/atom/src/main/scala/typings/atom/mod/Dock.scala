package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dock extends js.Object {
  // Methods
  /** Show the dock and focus its active Pane. */
  def activate(): Unit = js.native
  /** Make the next pane active. */
  def activateNextPane(): Boolean = js.native
  /** Make the previous pane active. */
  def activatePreviousPane(): Boolean = js.native
  /** Get the active Pane. */
  def getActivePane(): Pane = js.native
  /** Get the active Pane's active item. */
  def getActivePaneItem(): js.Object = js.native
  // Pane Items
  /** Get all pane items in the dock. */
  def getPaneItems(): js.Array[js.Object] = js.native
  // Panes
  /** Returns an Array of Panes. */
  def getPanes(): js.Array[Pane] = js.native
  /**
    *  Hide the dock and activate the WorkspaceCenter if the dock was was previously
    *  focused.
    */
  def hide(): Unit = js.native
  /** Check if the dock is visible. */
  def isVisible(): Boolean = js.native
  /**
    *  Invoke the given callback with the current active pane and when the active
    *  pane changes.
    */
  def observeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback with the current active pane item and with all future
    *  active pane items in the dock.
    */
  def observeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  /** Invoke the given callback with all current and future panes items in the dock. */
  def observePaneItems(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  /** Invoke the given callback with all current and future panes in the dock. */
  def observePanes(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback with the current and all future visibilities of
    *  the dock.
    */
  def observeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable = js.native
  /** Invoke the given callback when a pane is added to the dock. */
  def onDidAddPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
  /** Invoke the given callback when a pane item is added to the dock. */
  def onDidAddPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable = js.native
  /** Invoke the given callback when the active pane changes. */
  def onDidChangeActivePane(callback: js.Function1[/* pane */ Pane, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when the active pane item changes.
    *
    *  Because observers are invoked synchronously, it's important not to perform any
    *  expensive operations via this method. Consider ::onDidStopChangingActivePaneItem
    *  to delay operations until after changes stop occurring.
    */
  def onDidChangeActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when the hovered state of the dock changes.
    *  @param hovered Is the dock now hovered?
    */
  def onDidChangeHovered(callback: js.Function1[/* hovered */ Boolean, Unit]): Disposable = js.native
  // Event Subscription
  /** Invoke the given callback when the visibility of the dock changes. */
  def onDidChangeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable = js.native
  /** Invoke the given callback when a pane is destroyed in the dock. */
  def onDidDestroyPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
  /** Invoke the given callback when a pane item is destroyed. */
  def onDidDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit]): Disposable = js.native
  /** Invoke the given callback when the active pane item stops changing. */
  def onDidStopChangingActivePaneItem(callback: js.Function1[/* item */ js.Object, Unit]): Disposable = js.native
  /** Invoke the given callback before a pane is destroyed in the dock. */
  def onWillDestroyPane(callback: js.Function1[/* event */ typings.atom.anon.Pane, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when a pane item is about to be destroyed, before the user is
    *  prompted to save it.
    *  @param callback The function to be called before pane items are destroyed.
    *      If this function returns a Promise, then the item will not be destroyed
    *      until the promise resolves.
    */
  def onWillDestroyPaneItem(callback: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]]): Disposable = js.native
  /** Show the dock without focusing it. */
  def show(): Unit = js.native
  /**
    *  Toggle the dock's visibility without changing the Workspace's active pane
    *  container.
    */
  def toggle(): Unit = js.native
}

object Dock {
  @scala.inline
  def apply(
    activate: () => Unit,
    activateNextPane: () => Boolean,
    activatePreviousPane: () => Boolean,
    getActivePane: () => Pane,
    getActivePaneItem: () => js.Object,
    getPaneItems: () => js.Array[js.Object],
    getPanes: () => js.Array[Pane],
    hide: () => Unit,
    isVisible: () => Boolean,
    observeActivePane: js.Function1[/* pane */ Pane, Unit] => Disposable,
    observeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
    observePaneItems: js.Function1[/* item */ js.Object, Unit] => Disposable,
    observePanes: js.Function1[/* pane */ Pane, Unit] => Disposable,
    observeVisible: js.Function1[/* visible */ Boolean, Unit] => Disposable,
    onDidAddPane: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable,
    onDidAddPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable,
    onDidChangeActivePane: js.Function1[/* pane */ Pane, Unit] => Disposable,
    onDidChangeActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
    onDidChangeHovered: js.Function1[/* hovered */ Boolean, Unit] => Disposable,
    onDidChangeVisible: js.Function1[/* visible */ Boolean, Unit] => Disposable,
    onDidDestroyPane: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable,
    onDidDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable,
    onDidStopChangingActivePaneItem: js.Function1[/* item */ js.Object, Unit] => Disposable,
    onWillDestroyPane: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable,
    onWillDestroyPaneItem: js.Function1[/* event */ PaneItemObservedEvent, Unit | js.Promise[Unit]] => Disposable,
    show: () => Unit,
    toggle: () => Unit
  ): Dock = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), activateNextPane = js.Any.fromFunction0(activateNextPane), activatePreviousPane = js.Any.fromFunction0(activatePreviousPane), getActivePane = js.Any.fromFunction0(getActivePane), getActivePaneItem = js.Any.fromFunction0(getActivePaneItem), getPaneItems = js.Any.fromFunction0(getPaneItems), getPanes = js.Any.fromFunction0(getPanes), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), observeActivePane = js.Any.fromFunction1(observeActivePane), observeActivePaneItem = js.Any.fromFunction1(observeActivePaneItem), observePaneItems = js.Any.fromFunction1(observePaneItems), observePanes = js.Any.fromFunction1(observePanes), observeVisible = js.Any.fromFunction1(observeVisible), onDidAddPane = js.Any.fromFunction1(onDidAddPane), onDidAddPaneItem = js.Any.fromFunction1(onDidAddPaneItem), onDidChangeActivePane = js.Any.fromFunction1(onDidChangeActivePane), onDidChangeActivePaneItem = js.Any.fromFunction1(onDidChangeActivePaneItem), onDidChangeHovered = js.Any.fromFunction1(onDidChangeHovered), onDidChangeVisible = js.Any.fromFunction1(onDidChangeVisible), onDidDestroyPane = js.Any.fromFunction1(onDidDestroyPane), onDidDestroyPaneItem = js.Any.fromFunction1(onDidDestroyPaneItem), onDidStopChangingActivePaneItem = js.Any.fromFunction1(onDidStopChangingActivePaneItem), onWillDestroyPane = js.Any.fromFunction1(onWillDestroyPane), onWillDestroyPaneItem = js.Any.fromFunction1(onWillDestroyPaneItem), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Dock]
  }
  @scala.inline
  implicit class DockOps[Self <: Dock] (val x: Self) extends AnyVal {
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
    def setActivate(value: () => Unit): Self = this.set("activate", js.Any.fromFunction0(value))
    @scala.inline
    def setActivateNextPane(value: () => Boolean): Self = this.set("activateNextPane", js.Any.fromFunction0(value))
    @scala.inline
    def setActivatePreviousPane(value: () => Boolean): Self = this.set("activatePreviousPane", js.Any.fromFunction0(value))
    @scala.inline
    def setGetActivePane(value: () => Pane): Self = this.set("getActivePane", js.Any.fromFunction0(value))
    @scala.inline
    def setGetActivePaneItem(value: () => js.Object): Self = this.set("getActivePaneItem", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPaneItems(value: () => js.Array[js.Object]): Self = this.set("getPaneItems", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPanes(value: () => js.Array[Pane]): Self = this.set("getPanes", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setObserveActivePane(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = this.set("observeActivePane", js.Any.fromFunction1(value))
    @scala.inline
    def setObserveActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = this.set("observeActivePaneItem", js.Any.fromFunction1(value))
    @scala.inline
    def setObservePaneItems(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = this.set("observePaneItems", js.Any.fromFunction1(value))
    @scala.inline
    def setObservePanes(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = this.set("observePanes", js.Any.fromFunction1(value))
    @scala.inline
    def setObserveVisible(value: js.Function1[/* visible */ Boolean, Unit] => Disposable): Self = this.set("observeVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidAddPane(value: js.Function1[/* event */ typings.atom.anon.Pane, Unit] => Disposable): Self = this.set("onDidAddPane", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidAddPaneItem(value: js.Function1[/* event */ PaneItemObservedEvent, Unit] => Disposable): Self = this.set("onDidAddPaneItem", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidChangeActivePane(value: js.Function1[/* pane */ Pane, Unit] => Disposable): Self = this.set("onDidChangeActivePane", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidChangeActivePaneItem(value: js.Function1[/* item */ js.Object, Unit] => Disposable): Self = this.set("onDidChangeActivePaneItem", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidChangeHovered(value: js.Function1[/* hovered */ Boolean, Unit] => Disposable): Self = this.set("onDidChangeHovered", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidChangeVisible(value: js.Function1[/* visible */ Boolean, Unit] => Disposable): Self = this.set("onDidChangeVisible", js.Any.fromFunction1(value))
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
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
  
}

