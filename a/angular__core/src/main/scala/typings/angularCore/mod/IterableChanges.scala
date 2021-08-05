package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterableChanges[V] extends StObject {
  
  /** Iterate over all added items. */
  def forEachAddedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /**
    * Iterate over all items which had their identity (as computed by the `TrackByFunction`)
    * changed.
    */
  def forEachIdentityChange(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /**
    * Iterate over all changes. `IterableChangeRecord` will contain information about changes
    * to each item.
    */
  def forEachItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /** Iterate over all moved items. */
  def forEachMovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
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
  ): Unit
  
  /**
    * Iterate over changes in the order of original `Iterable` showing where the original items
    * have moved.
    */
  def forEachPreviousItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
  
  /** Iterate over all removed items. */
  def forEachRemovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit
}
object IterableChanges {
  
  inline def apply[V](
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
  
  extension [Self <: IterableChanges[?], V](x: Self & IterableChanges[V]) {
    
    inline def setForEachAddedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = StObject.set(x, "forEachAddedItem", js.Any.fromFunction1(value))
    
    inline def setForEachIdentityChange(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = StObject.set(x, "forEachIdentityChange", js.Any.fromFunction1(value))
    
    inline def setForEachItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = StObject.set(x, "forEachItem", js.Any.fromFunction1(value))
    
    inline def setForEachMovedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = StObject.set(x, "forEachMovedItem", js.Any.fromFunction1(value))
    
    inline def setForEachOperation(
      value: js.Function3[
          /* record */ IterableChangeRecord[V], 
          /* previousIndex */ Double | Null, 
          /* currentIndex */ Double | Null, 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "forEachOperation", js.Any.fromFunction1(value))
    
    inline def setForEachPreviousItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = StObject.set(x, "forEachPreviousItem", js.Any.fromFunction1(value))
    
    inline def setForEachRemovedItem(value: js.Function1[/* record */ IterableChangeRecord[V], Unit] => Unit): Self = StObject.set(x, "forEachRemovedItem", js.Any.fromFunction1(value))
  }
}
