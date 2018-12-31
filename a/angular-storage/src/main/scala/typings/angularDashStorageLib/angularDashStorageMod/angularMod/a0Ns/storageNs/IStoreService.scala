package typings
package angularDashStorageLib.angularDashStorageMod.angularMod.a0Ns.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def getNamespacedStore(namespace: java.lang.String): INamespacedStoreService = js.native
  def getNamespacedStore(namespace: java.lang.String, storage: java.lang.String): INamespacedStoreService = js.native
  def getNamespacedStore(namespace: java.lang.String, storage: java.lang.String, delimiter: java.lang.String): INamespacedStoreService = js.native
}

