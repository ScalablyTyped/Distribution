package typings.angularDashResource.angularDashResourceMod.angularMod.auto

import typings.angularDashResource.angularDashResourceMod.angularMod.resource.IResourceService
import typings.angularDashResource.angularDashResourceStrings.$resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInjectorService extends js.Object {
  @JSName("get")
  def get_resource(name: $resource): IResourceService
}

object IInjectorService {
  @scala.inline
  def apply(get: $resource => IResourceService): IInjectorService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[IInjectorService]
  }
}

