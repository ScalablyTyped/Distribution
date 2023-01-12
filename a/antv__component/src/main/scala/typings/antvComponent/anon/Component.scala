package typings.antvComponent.anon

import typings.antvComponent.libAbstractGroupComponentMod.GroupComponent
import typings.antvComponent.libAbstractGroupComponentMod.GroupComponentCtor
import typings.antvComponent.libTypesMod.GroupComponentCfg
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component[?, ?], C /* <: GroupComponentCfg */, CT /* <: GroupComponent[GroupComponentCfg] */] (val x: Self & (Component[C, CT])) extends AnyVal {
    
    inline def setComponent(value: GroupComponentCtor[C, CT]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
