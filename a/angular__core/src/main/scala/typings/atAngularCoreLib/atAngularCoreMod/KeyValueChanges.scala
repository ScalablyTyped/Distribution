package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueChanges[K, V] extends js.Object {
  /**
    * Iterate over all added items.
    */
  def forEachAddedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit]): scala.Unit
  /**
    * Iterate over all keys for which values have changed.
    */
  def forEachChangedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit]): scala.Unit
  /**
    * Iterate over all changes. `KeyValueChangeRecord` will contain information about changes
    * to each item.
    */
  def forEachItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit]): scala.Unit
  /**
    * Iterate over changes in the order of original Map showing where the original items
    * have moved.
    */
  def forEachPreviousItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit]): scala.Unit
  /**
    * Iterate over all removed items.
    */
  def forEachRemovedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit]): scala.Unit
}

object KeyValueChanges {
  @scala.inline
  def apply[K, V](
    forEachAddedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit] => scala.Unit,
    forEachChangedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit] => scala.Unit,
    forEachItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit] => scala.Unit,
    forEachPreviousItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit] => scala.Unit,
    forEachRemovedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], scala.Unit] => scala.Unit
  ): KeyValueChanges[K, V] = {
    val __obj = js.Dynamic.literal(forEachAddedItem = js.Any.fromFunction1(forEachAddedItem), forEachChangedItem = js.Any.fromFunction1(forEachChangedItem), forEachItem = js.Any.fromFunction1(forEachItem), forEachPreviousItem = js.Any.fromFunction1(forEachPreviousItem), forEachRemovedItem = js.Any.fromFunction1(forEachRemovedItem))
  
    __obj.asInstanceOf[KeyValueChanges[K, V]]
  }
}

