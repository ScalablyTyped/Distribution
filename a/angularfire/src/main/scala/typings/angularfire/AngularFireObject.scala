package typings.angularfire

import typings.angular.mod.IHttpPromise
import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates and maintains a synchronized object, with 2-way bindings between Angular and Firebase.
  */
@js.native
trait AngularFireObject
  extends StObject
     with AngularFireSimpleObject {
  
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
  def $bindTo(scope: IScope, varName: String): IPromise[Any] = js.native
  
  /**
    * Informs $firebase to stop sending events and clears memory being used
    * by this object (delete's its local content).
    */
  @JSName("$destroy")
  def $destroy(): Unit = js.native
  
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
  def $loaded(): IPromise[AngularFireObject] = js.native
  @JSName("$loaded")
  def $loaded(resolve: js.Function1[/* x */ this.type, IHttpPromise[js.Object] | IPromise[js.Object] | Unit]): IPromise[AngularFireObject] = js.native
  @JSName("$loaded")
  def $loaded(
    resolve: js.Function1[/* x */ this.type, IHttpPromise[js.Object] | IPromise[js.Object] | Unit],
    reject: js.Function1[/* err */ Any, Any]
  ): IPromise[AngularFireObject] = js.native
  @JSName("$loaded")
  def $loaded(resolve: Unit, reject: js.Function1[/* err */ Any, Any]): IPromise[AngularFireObject] = js.native
  
  /**
    * @returns {Firebase} the original Firebase instance used to create this object.
    */
  @JSName("$ref")
  def $ref(): Any = js.native
  
  /**
    * Removes all keys from the FirebaseObject and also removes
    * the remote data from the server.
    *
    * @returns a promise which will resolve after the op completes
    */
  @JSName("$remove")
  def $remove(): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ Any
  ] = js.native
  
  /**
    * Saves all data on the FirebaseObject back to Firebase.
    * @returns a promise which will resolve after the save is completed.
    */
  @JSName("$save")
  def $save(): IPromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Firebase */ Any
  ] = js.native
  
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
  def $watch(callback: js.Function): js.Function = js.native
  @JSName("$watch")
  def $watch(callback: js.Function, context: Any): js.Function = js.native
}
