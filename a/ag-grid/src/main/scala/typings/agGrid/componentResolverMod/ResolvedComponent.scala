package typings.agGrid.componentResolverMod

import typings.agGrid.anon.InstantiableB
import typings.agGrid.anon.`1`
import typings.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  var component: (`1`[A, B]) | InstantiableB[B] = js.native
  var dynamicParams: js.Any = js.native
  var source: ComponentSource = js.native
  var `type`: ComponentType = js.native
}

object ResolvedComponent {
  @scala.inline
  def apply[/* <: typings.agGrid.iComponentMod.IComponent[_] with B */ A, B](
    component: (`1`[A, B]) | InstantiableB[B],
    dynamicParams: js.Any,
    source: ComponentSource,
    `type`: ComponentType
  ): ResolvedComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dynamicParams = dynamicParams.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedComponent[A, B]]
  }
  @scala.inline
  implicit class ResolvedComponentOps[Self <: ResolvedComponent[_, _], /* <: typings.agGrid.iComponentMod.IComponent[_] with B */ A, B] (val x: Self with (ResolvedComponent[A, B])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponent(value: (`1`[A, B]) | InstantiableB[B]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicParams(value: js.Any): Self = this.set("dynamicParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: ComponentSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ComponentType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

