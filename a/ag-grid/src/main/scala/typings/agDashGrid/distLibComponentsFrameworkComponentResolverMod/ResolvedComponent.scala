package typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod

import typings.agDashGrid.Anon_A_304628252
import typings.agDashGrid.Anon_B
import typings.agDashGrid.distLibInterfacesIComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  var component: Anon_A_304628252[A] | Anon_B[B]
  var dynamicParams: js.Any
  var source: ComponentSource
  var `type`: ComponentType
}

object ResolvedComponent {
  @scala.inline
  def apply[A /* <: IComponent[_] with B */, B](
    component: Anon_A_304628252[A] | Anon_B[B],
    dynamicParams: js.Any,
    source: ComponentSource,
    `type`: ComponentType
  ): ResolvedComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dynamicParams = dynamicParams, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResolvedComponent[A, B]]
  }
}

