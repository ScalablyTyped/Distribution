package typings
package agDashGridLib.distLibComponentsFrameworkComponentResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedComponent[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] with B */, B] extends js.Object {
  var component: agDashGridLib.Anon_A_304628252[A] | agDashGridLib.Anon_B[B]
  var dynamicParams: js.Any
  var source: ComponentSource
  var `type`: ComponentType
}

object ResolvedComponent {
  @scala.inline
  def apply[A /* <: agDashGridLib.distLibInterfacesIComponentMod.IComponent[_] with B */, B](
    component: agDashGridLib.Anon_A_304628252[A] | agDashGridLib.Anon_B[B],
    dynamicParams: js.Any,
    source: ComponentSource,
    `type`: ComponentType
  ): ResolvedComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dynamicParams = dynamicParams, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResolvedComponent[A, B]]
  }
}

