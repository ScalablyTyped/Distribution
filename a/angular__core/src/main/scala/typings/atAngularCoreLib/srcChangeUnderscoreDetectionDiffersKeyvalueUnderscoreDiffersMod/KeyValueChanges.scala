package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod

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

