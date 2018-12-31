package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersDefaultUnderscoreIterableUnderscoreDifferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/change_detection/differs/default_iterable_differ", "DefaultIterableDiffer")
@js.native
class DefaultIterableDiffer[V] ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableDiffer[V]
     with atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChanges[V] {
  def this(trackByFn: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.TrackByFunction[V]) = this()
  var _addToRemovals: js.Any = js.native
  var _additionsHead: js.Any = js.native
  var _additionsTail: js.Any = js.native
  var _identityChangesHead: js.Any = js.native
  var _identityChangesTail: js.Any = js.native
  var _itHead: js.Any = js.native
  var _itTail: js.Any = js.native
  var _linkedRecords: js.Any = js.native
  var _movesHead: js.Any = js.native
  var _movesTail: js.Any = js.native
  var _previousItHead: js.Any = js.native
  var _removalsHead: js.Any = js.native
  var _removalsTail: js.Any = js.native
  var _trackByFn: js.Any = js.native
  var _unlinkedRecords: js.Any = js.native
  val collection: js.Array[V] | nodeLib.Iterable[V] | scala.Null = js.native
  val isDirty: scala.Boolean = js.native
  val length: scala.Double = js.native
  def check(
    collection: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.NgIterable[V]
  ): scala.Boolean = js.native
  /**
    * Compute a difference between the previous state and the new `object` state.
    *
    * @param object containing the new value.
    * @returns an object describing the difference. The return value is only valid until the next
    * `diff()` invocation.
    */
  /* CompleteClass */
  override def diff(
    `object`: atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.NgIterable[V]
  ): atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChanges[V] | scala.Null = js.native
  /** Iterate over all added items. */
  /* CompleteClass */
  override def forEachAddedItem(
    fn: js.Function1[
      /* record */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChangeRecord[V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Iterate over all items which had their identity (as computed by the `TrackByFunction`)
    * changed. */
  /* CompleteClass */
  override def forEachIdentityChange(
    fn: js.Function1[
      /* record */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChangeRecord[V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Iterate over all changes. `IterableChangeRecord` will contain information about changes
    * to each item.
    */
  /* CompleteClass */
  override def forEachItem(
    fn: js.Function1[
      /* record */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChangeRecord[V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Iterate over all moved items. */
  /* CompleteClass */
  override def forEachMovedItem(
    fn: js.Function1[
      /* record */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChangeRecord[V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
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
      /* record */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChangeRecord[V], 
      /* previousIndex */ scala.Double | scala.Null, 
      /* currentIndex */ scala.Double | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Iterate over changes in the order of original `Iterable` showing where the original items
    * have moved.
    */
  /* CompleteClass */
  override def forEachPreviousItem(
    fn: js.Function1[
      /* record */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChangeRecord[V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Iterate over all removed items. */
  /* CompleteClass */
  override def forEachRemovedItem(
    fn: js.Function1[
      /* record */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod.IterableChangeRecord[V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onDestroy(): scala.Unit = js.native
}

