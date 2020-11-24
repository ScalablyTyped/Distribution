package typings.angularDynamicLocale.mod.tmh

import typings.angular.mod.ILocaleService
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDynamicLocale extends js.Object {
  
  def get(): String = js.native
  
  def set(locale: String): IPromise[ILocaleService] = js.native
}
object IDynamicLocale {
  
  @scala.inline
  def apply(get: () => String, set: String => IPromise[ILocaleService]): IDynamicLocale = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IDynamicLocale]
  }
  
  @scala.inline
  implicit class IDynamicLocaleOps[Self <: IDynamicLocale] (val x: Self) extends AnyVal {
    
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
    def setGet(value: () => String): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: String => IPromise[ILocaleService]): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
