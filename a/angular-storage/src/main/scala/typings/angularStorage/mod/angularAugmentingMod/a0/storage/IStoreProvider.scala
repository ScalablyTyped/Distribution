package typings.angularStorage.mod.angularAugmentingMod.a0.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStoreProvider extends js.Object {
  
  /**
    * Sets the storage.
    *
    * @param {String} storage - The storage name
    */
  def setStore(storage: String): Unit = js.native
}
object IStoreProvider {
  
  @scala.inline
  def apply(setStore: String => Unit): IStoreProvider = {
    val __obj = js.Dynamic.literal(setStore = js.Any.fromFunction1(setStore))
    __obj.asInstanceOf[IStoreProvider]
  }
  
  @scala.inline
  implicit class IStoreProviderOps[Self <: IStoreProvider] (val x: Self) extends AnyVal {
    
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
    def setSetStore(value: String => Unit): Self = this.set("setStore", js.Any.fromFunction1(value))
  }
}
