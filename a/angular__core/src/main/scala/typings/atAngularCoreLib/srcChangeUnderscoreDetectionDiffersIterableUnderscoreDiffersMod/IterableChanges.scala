package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersIterableUnderscoreDiffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterableChanges[V] extends js.Object {
  /** Iterate over all added items. */
  def forEachAddedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], scala.Unit]): scala.Unit
  /** Iterate over all items which had their identity (as computed by the `TrackByFunction`)
    * changed. */
  def forEachIdentityChange(fn: js.Function1[/* record */ IterableChangeRecord[V], scala.Unit]): scala.Unit
  /**
    * Iterate over all changes. `IterableChangeRecord` will contain information about changes
    * to each item.
    */
  def forEachItem(fn: js.Function1[/* record */ IterableChangeRecord[V], scala.Unit]): scala.Unit
  /** Iterate over all moved items. */
  def forEachMovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], scala.Unit]): scala.Unit
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
      /* previousIndex */ scala.Double | scala.Null, 
      /* currentIndex */ scala.Double | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit
  /**
    * Iterate over changes in the order of original `Iterable` showing where the original items
    * have moved.
    */
  def forEachPreviousItem(fn: js.Function1[/* record */ IterableChangeRecord[V], scala.Unit]): scala.Unit
  /** Iterate over all removed items. */
  def forEachRemovedItem(fn: js.Function1[/* record */ IterableChangeRecord[V], scala.Unit]): scala.Unit
}

