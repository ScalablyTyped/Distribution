package typings.angularStorage.mod.angularAugmentingMod.a0.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INamespacedStoreService extends js.Object {
  
  /**
    * Returns the saved value with they key name.
    *
    * @param {String} name - The key name for the location of the value
    * @returns The saved value; if you saved an object, you get an object
    */
  def get(name: String): js.Any = js.native
  
  /**
    * Deletes the saved value with the key name
    *
    * @param {String} name - The key name for the location of the value to remove
    */
  def remove(name: String): Unit = js.native
  
  /**
    * Sets a new value to the storage with the key name. It can be any object.
    *
    * @param {String} name - The key name for the location of the value
    * @param value - The value to store
    */
  def set(name: String, value: js.Any): Unit = js.native
}
object INamespacedStoreService {
  
  @scala.inline
  def apply(get: String => js.Any, remove: String => Unit, set: (String, js.Any) => Unit): INamespacedStoreService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[INamespacedStoreService]
  }
  
  @scala.inline
  implicit class INamespacedStoreServiceOps[Self <: INamespacedStoreService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
