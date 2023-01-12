package typings.antvG2.libInterfaceMod

import typings.antvComponent.libTypesMod.GroupComponentCfg
import typings.antvComponent.libTypesMod.HtmlComponentCfg
import typings.antvG2.libConstantMod.COMPONENT_TYPE
import typings.antvG2.libConstantMod.DIRECTION
import typings.antvG2.libConstantMod.LAYER
import typings.antvG2.libDependentsMod.GroupComponent
import typings.antvG2.libDependentsMod.HtmlComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOption extends StObject {
  
  val component: GroupComponent[GroupComponentCfg] | HtmlComponent[HtmlComponentCfg]
  
  var direction: DIRECTION
  
  val extra: js.UndefOr[Any] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val layer: LAYER
  
  val `type`: COMPONENT_TYPE
}
object ComponentOption {
  
  inline def apply(
    component: GroupComponent[GroupComponentCfg] | HtmlComponent[HtmlComponentCfg],
    direction: DIRECTION,
    layer: LAYER,
    `type`: COMPONENT_TYPE
  ): ComponentOption = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentOption] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: GroupComponent[GroupComponentCfg] | HtmlComponent[HtmlComponentCfg]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: DIRECTION): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLayer(value: LAYER): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setType(value: COMPONENT_TYPE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
