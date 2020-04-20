package typings.angularStorage.mod.angularAugmentingMod.a0.storage

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
  def get(name: String): js.Any
  /**
  			 * Deletes the saved value with the key name
  			 *
  			 * @param {String} name - The key name for the location of the value to remove
  			 */
  def remove(name: String): Unit
  /**
  			 * Sets a new value to the storage with the key name. It can be any object.
  			 *
  			 * @param {String} name - The key name for the location of the value
  			 * @param value - The value to store
  			 */
  def set(name: String, value: js.Any): Unit
}

object INamespacedStoreService {
  @scala.inline
  def apply(get: String => js.Any, remove: String => Unit, set: (String, js.Any) => Unit): INamespacedStoreService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[INamespacedStoreService]
  }
}

