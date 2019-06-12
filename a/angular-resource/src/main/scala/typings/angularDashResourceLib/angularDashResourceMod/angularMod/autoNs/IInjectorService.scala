package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.autoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInjectorService extends js.Object {
  @JSName("get")
  def get_resource(name: angularDashResourceLib.angularDashResourceLibStrings.DOLLARresource): angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs.IResourceService
}

object IInjectorService {
  @scala.inline
  def apply(
    get_resource: angularDashResourceLib.angularDashResourceLibStrings.DOLLARresource => angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs.IResourceService
  ): IInjectorService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1(get_resource))
    __obj.asInstanceOf[IInjectorService]
  }
}

