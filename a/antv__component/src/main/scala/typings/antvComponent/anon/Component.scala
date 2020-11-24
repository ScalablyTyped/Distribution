package typings.antvComponent.anon

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.groupComponentMod.GroupComponentCtor
import typings.antvComponent.typesMod.GroupComponentCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[C /* <: GroupComponentCfg */, CT /* <: GroupComponent[GroupComponentCfg] */] extends js.Object {
  
  var component: GroupComponentCtor[C, CT] = js.native
}
object Component {
  
  @scala.inline
  def apply[C /* <: GroupComponentCfg */, CT /* <: GroupComponent[GroupComponentCfg] */](component: GroupComponentCtor[C, CT]): Component[C, CT] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[C, CT]]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component[_, _], C /* <: GroupComponentCfg */, CT /* <: GroupComponent[GroupComponentCfg] */] (val x: Self with (Component[C, CT])) extends AnyVal {
    
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
    def setComponent(value: GroupComponentCtor[C, CT]): Self = this.set("component", value.asInstanceOf[js.Any])
  }
}
