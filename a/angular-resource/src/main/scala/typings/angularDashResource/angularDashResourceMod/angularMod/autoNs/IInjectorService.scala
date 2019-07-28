package typings.angularDashResource.angularDashResourceMod.angularMod.autoNs

import typings.angularDashResource.angularDashResourceMod.angularMod.resourceNs.IResourceService
import typings.angularDashResource.angularDashResourceStrings.DOLLARresource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInjectorService extends js.Object {
  @JSName("get")
  def get_resource(name: DOLLARresource): IResourceService
}

object IInjectorService {
  @scala.inline
  def apply(get_resource: DOLLARresource => IResourceService): IInjectorService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1(get_resource))
    __obj.asInstanceOf[IInjectorService]
  }
}

