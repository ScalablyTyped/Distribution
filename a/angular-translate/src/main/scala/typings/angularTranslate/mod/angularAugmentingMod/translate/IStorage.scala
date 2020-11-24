package typings.angularTranslate.mod.angularAugmentingMod.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorage extends js.Object {
  
  def get(name: String): String = js.native
  
  def put(name: String, value: String): Unit = js.native
}
object IStorage {
  
  @scala.inline
  def apply(get: String => String, put: (String, String) => Unit): IStorage = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[IStorage]
  }
  
  @scala.inline
  implicit class IStorageOps[Self <: IStorage] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => String): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: (String, String) => Unit): Self = this.set("put", js.Any.fromFunction2(value))
  }
}
