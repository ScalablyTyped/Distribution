package typings.angularStorage.mod.angularAugmentingMod.a0.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStoreService extends INamespacedStoreService {
  
  /**
    * Returns a namespaced store
    *
    * @param {String} namespace - The namespace
    * @param {String} storage - The name of the storage service. Defaults to local storage.
    * @param {String} delimiter - The delimiter to use to separate the namespace and the keys.
    * @returns {INamespacedStoreService}
    */
  def getNamespacedStore(namespace: String): INamespacedStoreService = js.native
  def getNamespacedStore(namespace: String, storage: js.UndefOr[scala.Nothing], delimiter: String): INamespacedStoreService = js.native
  def getNamespacedStore(namespace: String, storage: String): INamespacedStoreService = js.native
  def getNamespacedStore(namespace: String, storage: String, delimiter: String): INamespacedStoreService = js.native
}
