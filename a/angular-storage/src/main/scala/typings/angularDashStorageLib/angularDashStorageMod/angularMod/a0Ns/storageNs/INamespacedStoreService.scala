package typings
package angularDashStorageLib.angularDashStorageMod.angularMod.a0Ns.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamespacedStoreService extends js.Object {
  /**
  			 * Returns the saved value with they key name.
  			 *
  			 * @param {String} name - The key name for the location of the value
  			 * @returns The saved value; if you saved an object, you get an object
  			 */
  def get(name: java.lang.String): js.Any
  /**
  			 * Deletes the saved value with the key name
  			 *
  			 * @param {String} name - The key name for the location of the value to remove
  			 */
  def remove(name: java.lang.String): scala.Unit
  /**
  			 * Sets a new value to the storage with the key name. It can be any object.
  			 *
  			 * @param {String} name - The key name for the location of the value
  			 * @param value - The value to store
  			 */
  def set(name: java.lang.String, value: js.Any): scala.Unit
}

