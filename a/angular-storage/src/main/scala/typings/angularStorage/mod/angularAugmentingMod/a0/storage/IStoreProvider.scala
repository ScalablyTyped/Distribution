package typings.angularStorage.mod.angularAugmentingMod.a0.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStoreProvider extends js.Object {
  /**
  		     * Sets the storage.
  		     *
  		     * @param {String} storage - The storage name
  		     */
  def setStore(storage: String): Unit
}

object IStoreProvider {
  @scala.inline
  def apply(setStore: String => Unit): IStoreProvider = {
    val __obj = js.Dynamic.literal(setStore = js.Any.fromFunction1(setStore))
  
    __obj.asInstanceOf[IStoreProvider]
  }
}

