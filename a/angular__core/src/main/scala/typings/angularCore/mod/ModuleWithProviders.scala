package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleWithProviders[T] extends js.Object {
  
  var ngModule: Type[T] = js.native
  
  var providers: js.UndefOr[js.Array[Provider]] = js.native
}
object ModuleWithProviders {
  
  @scala.inline
  def apply[T](ngModule: Type[T]): ModuleWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders[T]]
  }
  
  @scala.inline
  implicit class ModuleWithProvidersOps[Self <: ModuleWithProviders[_], T] (val x: Self with ModuleWithProviders[T]) extends AnyVal {
    
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
    def setNgModule(value: Type[T]): Self = this.set("ngModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
  }
}
