package typings
package angularfireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Creates and maintains a synchronized object, with 2-way bindings between Angular and Firebase.
 */
@js.native
trait AngularFireObject extends AngularFireSimpleObject {
  /**
  	 * Creates a 3-way data sync between this object, the Firebase server, and a
  	 * scope variable. This means that any changes made to the scope variable are
  	 * pushed to Firebase, and vice versa.
  	 *
  	 * If scope emits a $destroy event, the binding is automatically severed. Otherwise,
  	 * it is possible to unbind the scope variable by using the `unbind` function
  	 * passed into the resolve method.
  	 *
  	 * Can only be bound to one scope variable at a time. If a second is attempted,
  	 * the promise will be rejected with an error.
  	 *
  	 * @param {object} scope
  	 * @param {string} varName
  	 * @returns a promise which resolves to an unbind method after data is set in scope
  	 */
  @JSName("$bindTo")
  def $bindTo(scope: angularLib.angularMod.angularNs.IScope, varName: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Informs $firebase to stop sending events and clears memory being used
  	 * by this object (delete's its local content).
  	 */
  @JSName("$destroy")
  def $destroy(): scala.Unit = js.native
  /**
  	 * The loaded method is invoked after the initial batch of data arrives from the server.
  	 * When this resolves, all data which existed prior to calling $asObject() is now cached
  	 * locally in the object.
  	 *
  	 * As a shortcut is also possible to pass resolve/reject methods directly into this
  	 * method just as they would be passed to .then()
  	 *
  	 * @param {Function} resolve
  	 * @param {Function} reject
  	 * @returns a promise which resolves after initial data is downloaded from Firebase
  	 */
  @JSName("$loaded")
  def $loaded(): angularLib.angularMod.angularNs.IPromise[AngularFireObject] = js.native
  /**
  	 * The loaded method is invoked after the initial batch of data arrives from the server.
  	 * When this resolves, all data which existed prior to calling $asObject() is now cached
  	 * locally in the object.
  	 *
  	 * As a shortcut is also possible to pass resolve/reject methods directly into this
  	 * method just as they would be passed to .then()
  	 *
  	 * @param {Function} resolve
  	 * @param {Function} reject
  	 * @returns a promise which resolves after initial data is downloaded from Firebase
  	 */
  @JSName("$loaded")
  def $loaded(
    resolve: js.Function1[
      /* x */ this.type, 
      angularLib.angularMod.angularNs.IHttpPromise[js.Object] | angularLib.angularMod.angularNs.IPromise[js.Object] | scala.Unit
    ]
  ): angularLib.angularMod.angularNs.IPromise[AngularFireObject] = js.native
  /**
  	 * The loaded method is invoked after the initial batch of data arrives from the server.
  	 * When this resolves, all data which existed prior to calling $asObject() is now cached
  	 * locally in the object.
  	 *
  	 * As a shortcut is also possible to pass resolve/reject methods directly into this
  	 * method just as they would be passed to .then()
  	 *
  	 * @param {Function} resolve
  	 * @param {Function} reject
  	 * @returns a promise which resolves after initial data is downloaded from Firebase
  	 */
  @JSName("$loaded")
  def $loaded(
    resolve: js.Function1[
      /* x */ this.type, 
      angularLib.angularMod.angularNs.IHttpPromise[js.Object] | angularLib.angularMod.angularNs.IPromise[js.Object] | scala.Unit
    ],
    reject: js.Function1[/* err */ js.Any, _]
  ): angularLib.angularMod.angularNs.IPromise[AngularFireObject] = js.native
  /**
  	 * @returns {Firebase} the original Firebase instance used to create this object.
  	 */
  @JSName("$ref")
  def $ref(): js.Any = js.native
  /**
  	 * Removes all keys from the FirebaseObject and also removes
  	 * the remote data from the server.
  	 *
  	 * @returns a promise which will resolve after the op completes
  	 */
  
  @JSName("$remove")
  def $remove(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Saves all data on the FirebaseObject back to Firebase.
  	 * @returns a promise which will resolve after the save is completed.
  	 */
  @JSName("$save")
  def $save(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
  	 * Listeners passed into this method are notified whenever a new change is received
  	 * from the server. Each invocation is sent an object containing
  	 * <code>{ type: 'value', key: 'my_firebase_id' }</code>
  	 *
  	 * This method returns an unbind function that can be used to detach the listener.
  	 *
  	 * @param {Function} cb
  	 * @param {Object} [context]
  	 * @returns {Function} invoke to stop observing events
  	 */
  @JSName("$watch")
  def $watch(callback: angularLib.angularMod.Global.Function): angularLib.angularMod.Global.Function = js.native
  /**
  	 * Listeners passed into this method are notified whenever a new change is received
  	 * from the server. Each invocation is sent an object containing
  	 * <code>{ type: 'value', key: 'my_firebase_id' }</code>
  	 *
  	 * This method returns an unbind function that can be used to detach the listener.
  	 *
  	 * @param {Function} cb
  	 * @param {Object} [context]
  	 * @returns {Function} invoke to stop observing events
  	 */
  @JSName("$watch")
  def $watch(callback: angularLib.angularMod.Global.Function, context: js.Any): angularLib.angularMod.Global.Function = js.native
}

