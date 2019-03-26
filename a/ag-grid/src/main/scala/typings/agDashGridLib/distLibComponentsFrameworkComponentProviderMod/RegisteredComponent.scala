package typings
package agDashGridLib.distLibComponentsFrameworkComponentProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredComponent[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] with B */, B] extends js.Object {
  var component: RegisteredComponentInput[A, B]
  var source: RegisteredComponentSource
  var `type`: agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentType
}

object RegisteredComponent {
  @scala.inline
  def apply[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] with B */, B](
    component: RegisteredComponentInput[A, B],
    source: RegisteredComponentSource,
    `type`: agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentType
  ): RegisteredComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegisteredComponent[A, B]]
  }
}

