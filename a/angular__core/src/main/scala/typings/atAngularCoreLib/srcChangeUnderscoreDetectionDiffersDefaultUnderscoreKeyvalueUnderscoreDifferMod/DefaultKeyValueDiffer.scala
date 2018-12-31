package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionDiffersDefaultUnderscoreKeyvalueUnderscoreDifferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/change_detection/differs/default_keyvalue_differ", "DefaultKeyValueDiffer")
@js.native
class DefaultKeyValueDiffer[K, V] ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueDiffer[K, V]
     with atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueChanges[K, V] {
  var _addToAdditions: js.Any = js.native
  var _addToChanges: js.Any = js.native
  var _additionsHead: js.Any = js.native
  var _additionsTail: js.Any = js.native
  var _appendAfter: js.Any = js.native
  var _changesHead: js.Any = js.native
  var _changesTail: js.Any = js.native
  var _getOrCreateRecordForKey: js.Any = js.native
  /**
    * Inserts a record before `before` or append at the end of the list when `before` is null.
    *
    * Notes:
    * - This method appends at `this._appendAfter`,
    * - This method updates `this._appendAfter`,
    * - The return value is the new value for the insertion pointer.
    */
  var _insertBeforeOrAppend: js.Any = js.native
  var _mapHead: js.Any = js.native
  var _maybeAddToChanges: js.Any = js.native
  var _previousMapHead: js.Any = js.native
  var _records: js.Any = js.native
  var _removalsHead: js.Any = js.native
  var _removalsTail: js.Any = js.native
  val isDirty: scala.Boolean = js.native
  def check(map: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Boolean = js.native
  /**
    * Check the current state of the map vs the previous.
    * The algorithm is optimised for when the keys do no change.
    */
  def check(map: stdLib.Map[_, _]): scala.Boolean = js.native
  def diff(): js.Any = js.native
  /**
    * Iterate over all added items.
    */
  /* CompleteClass */
  override def forEachAddedItem(
    fn: js.Function1[
      /* r */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueChangeRecord[K, V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Iterate over all keys for which values have changed.
    */
  /* CompleteClass */
  override def forEachChangedItem(
    fn: js.Function1[
      /* r */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueChangeRecord[K, V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Iterate over all changes. `KeyValueChangeRecord` will contain information about changes
    * to each item.
    */
  /* CompleteClass */
  override def forEachItem(
    fn: js.Function1[
      /* r */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueChangeRecord[K, V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Iterate over changes in the order of original Map showing where the original items
    * have moved.
    */
  /* CompleteClass */
  override def forEachPreviousItem(
    fn: js.Function1[
      /* r */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueChangeRecord[K, V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Iterate over all removed items.
    */
  /* CompleteClass */
  override def forEachRemovedItem(
    fn: js.Function1[
      /* r */ atAngularCoreLib.srcChangeUnderscoreDetectionDiffersKeyvalueUnderscoreDiffersMod.KeyValueChangeRecord[K, V], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onDestroy(): scala.Unit = js.native
}

