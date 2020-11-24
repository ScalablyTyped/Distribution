package typings.agGrid.componentProviderMod

import typings.agGrid.componentResolverMod.ComponentType
import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisteredComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  
  var component: RegisteredComponentInput[A, B] = js.native
  
  var source: RegisteredComponentSource = js.native
  
  var `type`: ComponentType = js.native
}
object RegisteredComponent {
  
  @scala.inline
  def apply[A /* <: IComponent[_] with B */, B](
    component: RegisteredComponentInput[A, B],
    source: RegisteredComponentSource,
    `type`: ComponentType
  ): RegisteredComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredComponent[A, B]]
  }
  
  @scala.inline
  implicit class RegisteredComponentOps[Self <: RegisteredComponent[_, _], A /* <: IComponent[_] with B */, B] (val x: Self with (RegisteredComponent[A, B])) extends AnyVal {
    
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
    def setComponentFunction1(value: /* params */ js.Any => String | HTMLElement): Self = this.set("component", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponent(value: RegisteredComponentInput[A, B]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: RegisteredComponentSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ComponentType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
