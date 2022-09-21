package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "DefaultIterableDiffer")
@js.native
open class DefaultIterableDiffer[V] ()
  extends StObject
     with IterableDiffer[V]
     with IterableChanges[V] {
  def this(trackByFn: TrackByFunction[V]) = this()
  
  /* private */ var _addToRemovals: Any = js.native
  
  /* private */ var _additionsHead: Any = js.native
  
  /* private */ var _additionsTail: Any = js.native
  
  /* private */ var _identityChangesHead: Any = js.native
  
  /* private */ var _identityChangesTail: Any = js.native
  
  /* private */ var _itHead: Any = js.native
  
  /* private */ var _itTail: Any = js.native
  
  /* private */ var _linkedRecords: Any = js.native
  
  /* private */ var _movesHead: Any = js.native
  
  /* private */ var _movesTail: Any = js.native
  
  /* private */ var _previousItHead: Any = js.native
  
  /* private */ var _removalsHead: Any = js.native
  
  /* private */ var _removalsTail: Any = js.native
  
  /* private */ var _trackByFn: Any = js.native
  
  /* private */ var _unlinkedRecords: Any = js.native
  
  def check(collection: NgIterable[V]): Boolean = js.native
  
  val collection: js.Array[V] | js.Iterable[V] | Null = js.native
  
  /** Iterate over all added items. */
  /* CompleteClass */
  override def forEachAddedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  
  /**
    * Iterate over all items which had their identity (as computed by the `TrackByFunction`)
    * changed.
    */
  /* CompleteClass */
  override def forEachIdentityChange(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  
  /**
    * Iterate over all changes. `IterableChangeRecord` will contain information about changes
    * to each item.
    */
  /* CompleteClass */
  override def forEachItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  
  /** Iterate over all moved items. */
  /* CompleteClass */
  override def forEachMovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  
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
  /* CompleteClass */
  override def forEachOperation(
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
  /* CompleteClass */
  override def forEachPreviousItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  
  /** Iterate over all removed items. */
  /* CompleteClass */
  override def forEachRemovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], Unit]): Unit = js.native
  
  def isDirty: Boolean = js.native
  
  val length: Double = js.native
  
  def onDestroy(): Unit = js.native
}
