package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValueChanges[K, V] extends js.Object {
  /**
    * Iterate over all added items.
    */
  def forEachAddedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit = js.native
  /**
    * Iterate over all keys for which values have changed.
    */
  def forEachChangedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit = js.native
  /**
    * Iterate over all changes. `KeyValueChangeRecord` will contain information about changes
    * to each item.
    */
  def forEachItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit = js.native
  /**
    * Iterate over changes in the order of original Map showing where the original items
    * have moved.
    */
  def forEachPreviousItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit = js.native
  /**
    * Iterate over all removed items.
    */
  def forEachRemovedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit = js.native
}

object KeyValueChanges {
  @scala.inline
  def apply[K, V](
    forEachAddedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit,
    forEachChangedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit,
    forEachItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit,
    forEachPreviousItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit,
    forEachRemovedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit
  ): KeyValueChanges[K, V] = {
    val __obj = js.Dynamic.literal(forEachAddedItem = js.Any.fromFunction1(forEachAddedItem), forEachChangedItem = js.Any.fromFunction1(forEachChangedItem), forEachItem = js.Any.fromFunction1(forEachItem), forEachPreviousItem = js.Any.fromFunction1(forEachPreviousItem), forEachRemovedItem = js.Any.fromFunction1(forEachRemovedItem))
    __obj.asInstanceOf[KeyValueChanges[K, V]]
  }
  @scala.inline
  implicit class KeyValueChangesOps[Self <: KeyValueChanges[_, _], K, V] (val x: Self with (KeyValueChanges[K, V])) extends AnyVal {
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
    def setForEachAddedItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = this.set("forEachAddedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachChangedItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = this.set("forEachChangedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = this.set("forEachItem", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachPreviousItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = this.set("forEachPreviousItem", js.Any.fromFunction1(value))
    @scala.inline
    def setForEachRemovedItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = this.set("forEachRemovedItem", js.Any.fromFunction1(value))
  }
  
}

