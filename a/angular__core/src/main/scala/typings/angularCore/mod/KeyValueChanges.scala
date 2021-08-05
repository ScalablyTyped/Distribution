package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueChanges[K, V] extends StObject {
  
  /**
    * Iterate over all added items.
    */
  def forEachAddedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
  
  /**
    * Iterate over all keys for which values have changed.
    */
  def forEachChangedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
  
  /**
    * Iterate over all changes. `KeyValueChangeRecord` will contain information about changes
    * to each item.
    */
  def forEachItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
  
  /**
    * Iterate over changes in the order of original Map showing where the original items
    * have moved.
    */
  def forEachPreviousItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
  
  /**
    * Iterate over all removed items.
    */
  def forEachRemovedItem(fn: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit]): Unit
}
object KeyValueChanges {
  
  inline def apply[K, V](
    forEachAddedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit,
    forEachChangedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit,
    forEachItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit,
    forEachPreviousItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit,
    forEachRemovedItem: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit
  ): KeyValueChanges[K, V] = {
    val __obj = js.Dynamic.literal(forEachAddedItem = js.Any.fromFunction1(forEachAddedItem), forEachChangedItem = js.Any.fromFunction1(forEachChangedItem), forEachItem = js.Any.fromFunction1(forEachItem), forEachPreviousItem = js.Any.fromFunction1(forEachPreviousItem), forEachRemovedItem = js.Any.fromFunction1(forEachRemovedItem))
    __obj.asInstanceOf[KeyValueChanges[K, V]]
  }
  
  extension [Self <: KeyValueChanges[?, ?], K, V](x: Self & (KeyValueChanges[K, V])) {
    
    inline def setForEachAddedItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = StObject.set(x, "forEachAddedItem", js.Any.fromFunction1(value))
    
    inline def setForEachChangedItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = StObject.set(x, "forEachChangedItem", js.Any.fromFunction1(value))
    
    inline def setForEachItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = StObject.set(x, "forEachItem", js.Any.fromFunction1(value))
    
    inline def setForEachPreviousItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = StObject.set(x, "forEachPreviousItem", js.Any.fromFunction1(value))
    
    inline def setForEachRemovedItem(value: js.Function1[/* r */ KeyValueChangeRecord[K, V], Unit] => Unit): Self = StObject.set(x, "forEachRemovedItem", js.Any.fromFunction1(value))
  }
}
