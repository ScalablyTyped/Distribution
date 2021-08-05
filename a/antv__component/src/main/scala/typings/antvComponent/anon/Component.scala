package typings.antvComponent.anon

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.groupComponentMod.GroupComponentCtor
import typings.antvComponent.typesMod.GroupComponentCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[C /* <: GroupComponentCfg */, CT /* <: GroupComponent[GroupComponentCfg] */] extends StObject {
  
  var component: GroupComponentCtor[C, CT]
}
object Component {
  
  inline def apply[C /* <: GroupComponentCfg */, CT /* <: GroupComponent[GroupComponentCfg] */](component: GroupComponentCtor[C, CT]): Component[C, CT] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[C, CT]]
  }
  
  extension [Self <: Component[?, ?], C /* <: GroupComponentCfg */, CT /* <: GroupComponent[GroupComponentCfg] */](x: Self & (Component[C, CT])) {
    
    inline def setComponent(value: GroupComponentCtor[C, CT]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
