package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.autoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInjectorService extends js.Object {
  def get(name: angularDashResourceLib.angularDashResourceLibStrings.DOLLARresource): angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs.IResourceService
}

object IInjectorService {
  @scala.inline
  def apply(
    get: angularDashResourceLib.angularDashResourceLibStrings.DOLLARresource => angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs.IResourceService
  ): IInjectorService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[IInjectorService]
  }
}

