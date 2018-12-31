package typings
package angularfireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates and maintains a synchronized list of data. This is a pseudo-read-only array. One should
  * not call splice(), push(), pop(), et al directly on this array, but should instead use the
  * $remove and $add methods.
  *
  * It is acceptable to .sort() this array, but it is important to use this in conjunction with
  * $watch(), so that it will be re-sorted any time the server data changes. Examples of this are
  * included in the $watch documentation.
  */
@js.native
trait AngularFireArray
  extends coreDashJsLib.Array[AngularFireSimpleObject] {
  /**
  	 * Create a new record with a unique ID and add it to the end of the array.
  	 * This should be used instead of Array.prototype.push, since those changes will not be
  	 * synchronized with the server.
  	 *
  	 * Any value, including a primitive, can be added in this way. Note that when the record
  	 * is created, the primitive value would be stored in $value (records are always objects
  	 * by default).
  	 *
  	 * Returns a future which is resolved when the data has successfully saved to the server.
  	 * The resolve callback will be passed a Firebase ref representing the new data element.
  	 *
  	 * @param data
  	 * @returns a promise resolved after data is added
  	 */
  @JSName("$add")
  def $add(newData: js.Any): angularLib.angularMod.angularNs.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Firebase */ _
  ] = js.native
  /**
  	 * Informs $firebase to stop sending events and clears memory being used
  	 * by this array (delete's its local content).
  	 */
  @JSName("$destroy")
  def $destroy(): scala.Unit = js.native
  /**
  	 * Returns the record for a given Firebase key (record.$id). If the record is not found
  	 * then returns null.
  	 *
  	 * @param {string} key
  	 * @returns {Object|null} a record in this array
  	 */
  @JSName("$getRecord")
  def $getRecord(key: java.lang.String): AngularFireSimpleObject = js.native
  /**
  	 * The inverse of $keyAt, this method takes a Firebase key (record.$id) and returns the
  	 * index in the array where that record is stored. If the record is not in the array,
  	 * this method returns -1.
  	 *
  	 * @param {String} key
  	 * @returns {int} -1 if not found
  	 */
  @JSName("$indexFor")
  def $indexFor(key: java.lang.String): scala.Double = js.native
  /**
  	 * Given an item in this array or the index of an item in the array, this returns the
  	 * Firebase key (record.$id) for that record. If passed an invalid key or an item which
  	 * does not exist in this array, it will return null.
  	 *
  	 * @param {int|object} indexOrItem
  	 * @returns {null|string}
  	 */
  @JSName("$keyAt")
  def $keyAt(recordOrIndex: js.Any): java.lang.String = js.native
  /**
  	 * The loaded method is invoked after the initial batch of data arrives from the server.
  	 * When this resolves, all data which existed prior to calling $asArray() is now cached
  	 * locally in the array.
  	 *
  	 * As a shortcut is also possible to pass resolve/reject methods directly into this
  	 * method just as they would be passed to .then()
  	 *
  	 * @param {Function} [resolve]
  	 * @param {Function} [reject]
  	 * @returns a promise
  	 */
  @JSName("$loaded")
  def $loaded(): angularLib.angularMod.angularNs.IPromise[AngularFireArray] = js.native
  @JSName("$loaded")
  def $loaded(
    resolve: js.Function1[
      /* x */ this.type, 
      angularLib.angularMod.angularNs.IHttpPromise[js.Object] | angularLib.angularMod.angularNs.IPromise[js.Object] | scala.Unit
    ]
  ): angularLib.angularMod.angularNs.IPromise[AngularFireArray] = js.native
  @JSName("$loaded")
  def $loaded(
    resolve: js.Function1[
      /* x */ this.type, 
      angularLib.angularMod.angularNs.IHttpPromise[js.Object] | angularLib.angularMod.angularNs.IPromise[js.Object] | scala.Unit
    ],
    reject: js.Function1[/* err */ js.Any, _]
  ): angularLib.angularMod.angularNs.IPromise[AngularFireArray] = js.native
  /**
  	 * @returns {Firebase} the original Firebase ref used to create this object.
  	 */
  @JSName("$ref")
  def $ref(): js.Any = js.native
  /**
  	 * Pass either an existing item in this array or the index of that item and it will
  	 * be removed both locally and in Firebase. This should be used in place of
  	 * Array.prototype.splice for removing items out of the array, as calling splice
  	 * will not update the value on the server.
  	 *
  	 * Returns a future which is resolved when the data has successfully removed from the
  	 * server. The resolve callback will be passed a Firebase ref representing the deleted
  	 * element. If passed an invalid index or an object which is not a record in this array,
  	 * the promise will be rejected.
  	 *
  	 * @param {int|object} indexOrItem
  	 * @returns a promise which resolves after data is removed
  	 */
  @JSName("$remove")
  def $remove(recordOrIndex: js.Any): angularLib.angularMod.angularNs.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Firebase */ _
  ] = js.native
  /**
  	 * Pass either an item in the array or the index of an item and it will be saved back
  	 * to Firebase. While the array is read-only and its structure should not be changed,
  	 * it is okay to modify properties on the objects it contains and then save those back
  	 * individually.
  	 *
  	 * Returns a future which is resolved when the data has successfully saved to the server.
  	 * The resolve callback will be passed a Firebase ref representing the saved element.
  	 * If passed an invalid index or an object which is not a record in this array,
  	 * the promise will be rejected.
  	 *
  	 * @param {int|object} indexOrItem
  	 * @returns a promise resolved after data is saved
  	 */
  @JSName("$save")
  def $save(recordOrIndex: js.Any): angularLib.angularMod.angularNs.IPromise[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Firebase */ _
  ] = js.native
  /**
  	 * Listeners passed into this method are notified whenever a new change (add, updated,
  	 * move, remove) is received from the server. Each invocation is sent an object
  	 * containing <code>{ type: 'child_added|child_updated|child_moved|child_removed',
  	 * key: 'key_of_item_affected'}</code>
  	 *
  	 * Additionally, added and moved events receive a prevChild parameter, containing the
  	 * key of the item before this one in the array.
  	 *
  	 * This method returns a function which can be invoked to stop observing events.
  	 *
  	 * @param {Function} cb
  	 * @param {Object} [context]
  	 * @returns {Function} used to stop observing
  	 */
  @JSName("$watch")
  def $watch(
    cb: js.Function3[
      /* event */ java.lang.String, 
      /* key */ java.lang.String, 
      /* prevChild */ java.lang.String, 
      scala.Unit
    ]
  ): angularLib.angularMod.Global.Function = js.native
  @JSName("$watch")
  def $watch(
    cb: js.Function3[
      /* event */ java.lang.String, 
      /* key */ java.lang.String, 
      /* prevChild */ java.lang.String, 
      scala.Unit
    ],
    context: js.Any
  ): angularLib.angularMod.Global.Function = js.native
}

