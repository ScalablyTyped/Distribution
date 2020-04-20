package typings.angularResource.mod.angularAugmentingMod

import typings.angularResource.mod.angularAugmentingMod.resource.IResourceServiceFactoryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extensions to base ng based on using angular-resource */
trait IModule extends js.Object {
  /** creating a resource service factory */
  def factory(name: String, resourceServiceFactoryFunction: IResourceServiceFactoryFunction[_]): IModule
}

object IModule {
  @scala.inline
  def apply(factory: (String, IResourceServiceFactoryFunction[_]) => IModule): IModule = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction2(factory))
    __obj.asInstanceOf[IModule]
  }
}

