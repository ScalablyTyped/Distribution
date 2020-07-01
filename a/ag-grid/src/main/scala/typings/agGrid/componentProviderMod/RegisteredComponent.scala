package typings.agGrid.componentProviderMod

import typings.agGrid.componentResolverMod.ComponentType
import typings.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  var component: RegisteredComponentInput[A, B]
  var source: RegisteredComponentSource
  var `type`: ComponentType
}

object RegisteredComponent {
  @scala.inline
  def apply[/* <: typings.agGrid.iComponentMod.IComponent[_] with B */ A, B](
    component: RegisteredComponentInput[A, B],
    source: RegisteredComponentSource,
    `type`: ComponentType
  ): RegisteredComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredComponent[A, B]]
  }
}

