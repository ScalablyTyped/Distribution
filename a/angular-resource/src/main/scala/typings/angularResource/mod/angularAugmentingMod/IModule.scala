package typings.angularResource.mod.angularAugmentingMod

import typings.angularResource.mod.angularAugmentingMod.resource.IResourceServiceFactoryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extensions to base ng based on using angular-resource */
@js.native
trait IModule extends js.Object {
  
  /** creating a resource service factory */
  def factory(name: String, resourceServiceFactoryFunction: IResourceServiceFactoryFunction[_]): IModule = js.native
}
object IModule {
  
  @scala.inline
  def apply(factory: (String, IResourceServiceFactoryFunction[_]) => IModule): IModule = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction2(factory))
    __obj.asInstanceOf[IModule]
  }
  
  @scala.inline
  implicit class IModuleOps[Self <: IModule] (val x: Self) extends AnyVal {
    
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
    def setFactory(value: (String, IResourceServiceFactoryFunction[_]) => IModule): Self = this.set("factory", js.Any.fromFunction2(value))
  }
}
