package typings.angularLocalforage.mod.localForage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocalForageProvider extends js.Object {
  
  def config(config: LocalForageConfig): Unit = js.native
  
  def setNotify(onItemSet: Boolean, onItemRemove: Boolean): Unit = js.native
}
object ILocalForageProvider {
  
  @scala.inline
  def apply(config: LocalForageConfig => Unit, setNotify: (Boolean, Boolean) => Unit): ILocalForageProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), setNotify = js.Any.fromFunction2(setNotify))
    __obj.asInstanceOf[ILocalForageProvider]
  }
  
  @scala.inline
  implicit class ILocalForageProviderOps[Self <: ILocalForageProvider] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: LocalForageConfig => Unit): Self = this.set("config", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNotify(value: (Boolean, Boolean) => Unit): Self = this.set("setNotify", js.Any.fromFunction2(value))
  }
}
