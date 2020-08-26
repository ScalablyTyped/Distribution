package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableChanges[V] extends js.Object {
  /** Iterate over all added items. */
  def forEachAddedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  /**
    * Iterate over all items which had their identity (as computed by the `TrackByFunction`)
    * changed.
    */
  def forEachIdentityChange(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  /**
    * Iterate over all changes. `IterableChangeRecord` will contain information about changes
    * to each item.
    */
  def forEachItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  /** Iterate over all moved items. */
  def forEachMovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  /**
    * Iterate over a set of operations which when applied to the original `Iterable` will produce the
    * new `Iterable`.
    *
    * NOTE: These are not necessarily the actual operations which were applied to the original
    * `Iterable`, rather these are a set of computed operations which may not be the same as the
    * ones applied.
    *
    * @param record A change which needs to be applied
    * @param previousIndex The `IterableChangeRecord#previousIndex` of the `record` refers to the
    *        original `Iterable` location, where as `previousIndex` refers to the transient location
    *        of the item, after applying the operations up to this point.
    * @param currentIndex The `IterableChangeRecord#currentIndex` of the `record` refers to the
    *        original `Iterable` location, where as `currentIndex` refers to the transient location
    *        of the item, after applying the operations up to this point.
    */
  def forEachOperation(
    fn: js.Function3[
      /* record */ IterableChangeRecord[V], 
      /* previousIndex */ Double | Null, 
      /* currentIndex */ Double | Null, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Iterate over changes in the order of original `Iterable` showing where the original items
    * have moved.
    */
  def forEachPreviousItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  /** Iterate over all removed items. */
  def forEachRemovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
}

object IterableChanges {
  @scala.inline
  def apply[V](
    forEachAddedItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit,
    forEachIdentityChange: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit,
    forEachItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit,
    forEachMovedItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit,
    forEachOperation: js.Function3[
      /* record */ IterableChangeRecord[V], 
      /* previousIndex */ Double | Null, 
      /* currentIndex */ Double | Null, 
      Unit
    ] => Unit,
    forEachPreviousItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit,
    forEachRemovedItem: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit
  ): IterableChanges[V] = {
    val __obj = js.Dynamic.literal(forEachAddedItem = js.Any.fromFunction1(forEachAddedItem), forEachIdentityChange = js.Any.fromFunction1(forEachIdentityChange), forEachItem = js.Any.fromFunction1(forEachItem), forEachMovedItem = js.Any.fromFunction1(forEachMovedItem), forEachOperation = js.Any.fromFunction1(forEachOperation), forEachPreviousItem = js.Any.fromFunction1(forEachPreviousItem), forEachRemovedItem = js.Any.fromFunction1(forEachRemovedItem))
    __obj.asInstanceOf[IterableChanges[V]]
  }
  @scala.inline
  implicit class IterableChangesOps[Self <: IterableChanges[_], V] (val x: Self with IterableChanges[V]) extends AnyVal {
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
    def setForEachAddedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = this.set("forEachAddedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachIdentityChange(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = this.set("forEachIdentityChange", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = this.set("forEachItem", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachMovedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = this.set("forEachMovedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachOperation(
      value: js.Function3[
          /* record */ IterableChangeRecord[V], 
          /* previousIndex */ Double | Null, 
          /* currentIndex */ Double | Null, 
          Unit
        ] => Unit
    ): Self = this.set("forEachOperation", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachPreviousItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = this.set("forEachPreviousItem", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachRemovedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = this.set("forEachRemovedItem", js.Any.fromFunction1(value))
  }
  
}

