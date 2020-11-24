package typings.angularResource.mod.angularAugmentingMod.auto

import typings.angularResource.angularResourceStrings.$resource
import typings.angularResource.mod.angularAugmentingMod.resource.IResourceService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInjectorService extends js.Object {
  
  @JSName("get")
  def get_resource(name: $resource): IResourceService = js.native
}
object IInjectorService {
  
  @scala.inline
  def apply(get: $resource => IResourceService): IInjectorService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[IInjectorService]
  }
  
  @scala.inline
  implicit class IInjectorServiceOps[Self <: IInjectorService] (val x: Self) extends AnyVal {
    
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
    def setGet(value: $resource => IResourceService): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
