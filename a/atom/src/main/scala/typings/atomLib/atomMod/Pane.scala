package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pane extends js.Object {
  /** Makes this pane the active pane, causing it to gain focus. */
  def activate(): scala.Unit = js.native
  /** Make the given item active, causing it to be displayed by the pane's view. */
  def activateItem(item: js.Object): scala.Unit = js.native
  def activateItem(item: js.Object, options: atomLib.Anon_Pending): scala.Unit = js.native
  /** Activate the item at the given index. */
  def activateItemAtIndex(index: scala.Double): scala.Unit = js.native
  /** Activate the first item that matches the given URI. */
  def activateItemForURI(uri: java.lang.String): scala.Boolean = js.native
  /** Makes the next item active. */
  def activateNextItem(): scala.Unit = js.native
  /** Makes the previous item active. */
  def activatePreviousItem(): scala.Unit = js.native
  /** Add the given item to the pane. */
  def addItem(item: js.Object): js.Object = js.native
  def addItem(item: js.Object, options: atomLib.Anon_Index): js.Object = js.native
  /** Add the given items to the pane. */
  def addItems(items: js.Array[js.Object]): js.Array[js.Object] = js.native
  def addItems(items: js.Array[js.Object], index: scala.Double): js.Array[js.Object] = js.native
  /** Close the pane and destroy all its items. */
  def destroy(): scala.Unit = js.native
  /** Destroy the active item and activate the next item. */
  def destroyActiveItem(): js.Promise[scala.Boolean] = js.native
  /** Destroy all items except for the active item. */
  def destroyInactiveItems(): js.Promise[js.Array[scala.Boolean]] = js.native
  /** Destroy the given item. */
  def destroyItem(item: js.Object): js.Promise[scala.Boolean] = js.native
  def destroyItem(item: js.Object, force: scala.Boolean): js.Promise[scala.Boolean] = js.native
  /** Destroy all items. */
  def destroyItems(): js.Promise[js.Array[scala.Boolean]] = js.native
  /** Get the active pane item in this pane. */
  def getActiveItem(): js.Object = js.native
  /** Get the index of the active item. */
  def getActiveItemIndex(): scala.Double = js.native
  // Items
  /** Get the items in this pane. */
  def getItems(): js.Array[js.Object] = js.native
  // Lifecycle
  /** Determine whether the pane is active. */
  def isActive(): scala.Boolean = js.native
  /** Determine whether this pane has been destroyed. */
  def isDestroyed(): scala.Boolean = js.native
  /** Return the item at the given index. */
  def itemAtIndex(index: scala.Double): js.UndefOr[js.Object] = js.native
  /** Return the first item that matches the given URI or undefined if none exists. */
  def itemForURI(uri: java.lang.String): js.UndefOr[js.Object] = js.native
  /** Move the given item to the given index. */
  def moveItem(item: js.Object, index: scala.Double): scala.Unit = js.native
  /** Move the active tab to the left. */
  def moveItemLeft(): scala.Unit = js.native
  /** Move the active tab to the right. */
  def moveItemRight(): scala.Unit = js.native
  /** Move the given item to the given index on another pane. */
  def moveItemToPane(item: js.Object, pane: Pane, index: scala.Double): scala.Unit = js.native
  /**
    *  Invoke the given callback with the current and future values of the ::isActive
    *  property.
    */
  def observeActive(callback: js.Function1[/* active */ scala.Boolean, scala.Unit]): Disposable = js.native
  /** Invoke the given callback with the current and future values of ::getActiveItem. */
  def observeActiveItem(callback: js.Function1[/* activeItem */ js.Object, scala.Unit]): Disposable = js.native
  /** Invoke the given callback with the current and future values of ::getFlexScale. */
  def observeFlexScale(callback: js.Function1[/* flexScale */ scala.Double, scala.Unit]): Disposable = js.native
  /** Invoke the given callback with all current and future items. */
  def observeItems(callback: js.Function1[/* item */ js.Object, scala.Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when ::activatePreviousRecentlyUsedItem has been called,
    *  either initiating or continuing a reverse MRU traversal of pane items.
    */
  def onChooseLastMRUItem(callback: js.Function1[/* previousRecentlyUsedItem */ js.Object, scala.Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when ::activateNextRecentlyUsedItem has been called,
    *  either initiating or continuing a forward MRU traversal of pane items.
    */
  def onChooseNextMRUItem(callback: js.Function1[/* nextRecentlyUsedItem */ js.Object, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when the pane is activated. */
  def onDidActivate(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Invoke the given callback when an item is added to the pane. */
  def onDidAddItem(callback: js.Function1[/* event */ PaneListItemShiftedEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when the value of the ::isActive property changes. */
  def onDidChangeActive(callback: js.Function1[/* active */ scala.Boolean, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when the value of ::getActiveItem changes. */
  def onDidChangeActiveItem(callback: js.Function1[/* activeItem */ js.Object, scala.Unit]): Disposable = js.native
  // Event Subscription
  /** Invoke the given callback when the pane resizes. */
  def onDidChangeFlexScale(callback: js.Function1[/* flexScale */ scala.Double, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when the pane is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Invoke the given callback when an item is moved within the pane. */
  def onDidMoveItem(callback: js.Function1[/* event */ PaneItemMovedEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback when an item is removed from the pane. */
  def onDidRemoveItem(callback: js.Function1[/* event */ PaneListItemShiftedEvent, scala.Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when ::moveActiveItemToTopOfStack has been called,
    *  terminating an MRU traversal of pane items and moving the current active item
    *  to the top of the stack. Typically bound to a modifier (e.g. CTRL) key up event.
    */
  def onDoneChoosingMRUItem(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Invoke the given callback before the pane is destroyed. */
  def onWillDestroy(callback: js.Function0[scala.Unit]): Disposable = js.native
  /** Invoke the given callback before items are destroyed. */
  def onWillDestroyItem(callback: js.Function1[/* event */ PaneListItemShiftedEvent, scala.Unit]): Disposable = js.native
  /** Invoke the given callback before an item is removed from the pane. */
  def onWillRemoveItem(callback: js.Function1[/* event */ PaneListItemShiftedEvent, scala.Unit]): Disposable = js.native
  /** Save the active item. */
  def saveActiveItem[T](): js.UndefOr[js.Promise[T]] = js.native
  def saveActiveItem[T](nextAction: js.Function1[/* error */ js.UndefOr[nodeLib.Error], T]): js.UndefOr[js.Promise[T]] = js.native
  /**
    *  Prompt the user for a location and save the active item with the path
    *  they select.
    */
  def saveActiveItemAs[T](): js.UndefOr[js.Promise[T]] = js.native
  def saveActiveItemAs[T](nextAction: js.Function1[/* error */ js.UndefOr[nodeLib.Error], T]): js.UndefOr[js.Promise[T]] = js.native
  /** Save the given item. */
  def saveItem[T](item: js.Object): js.UndefOr[js.Promise[T]] = js.native
  def saveItem[T](item: js.Object, nextAction: js.Function1[/* error */ js.UndefOr[nodeLib.Error], T]): js.UndefOr[js.Promise[T]] = js.native
  /**
    *  Prompt the user for a location and save the active item with the path
    *  they select.
    */
  def saveItemAs[T](item: js.Object): js.UndefOr[js.Promise[T]] = js.native
  def saveItemAs[T](item: js.Object, nextAction: js.Function1[/* error */ js.UndefOr[nodeLib.Error], T]): js.UndefOr[js.Promise[T]] = js.native
  /** Save all items. */
  def saveItems(): scala.Unit = js.native
  /** Creates a new pane below the receiver. */
  def splitDown(): Pane = js.native
  def splitDown(params: atomLib.Anon_CopyActiveItem): Pane = js.native
  // Splitting
  /** Create a new pane to the left of this pane. */
  def splitLeft(): Pane = js.native
  def splitLeft(params: atomLib.Anon_CopyActiveItem): Pane = js.native
  /** Create a new pane to the right of this pane. */
  def splitRight(): Pane = js.native
  def splitRight(params: atomLib.Anon_CopyActiveItem): Pane = js.native
  /** Creates a new pane above the receiver. */
  def splitUp(): Pane = js.native
  def splitUp(params: atomLib.Anon_CopyActiveItem): Pane = js.native
}

