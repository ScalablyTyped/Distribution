package typings.agGrid.componentResolverMod

import typings.agGrid.anon.InstantiableB
import typings.agGrid.anon.`1`
import typings.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  var component: (`1`[A, B]) | InstantiableB[B]
  var dynamicParams: js.Any
  var source: ComponentSource
  var `type`: ComponentType
}

object ResolvedComponent {
  @scala.inline
  def apply[A, B](
    component: (`1`[A, B]) | InstantiableB[B],
    dynamicParams: js.Any,
    source: ComponentSource,
    `type`: ComponentType
  ): ResolvedComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dynamicParams = dynamicParams.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedComponent[A, B]]
  }
}

