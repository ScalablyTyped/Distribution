package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateOption extends StObject {
  
  /**
    * @title 默认状态样式。
    */
  var default: js.UndefOr[StateCfg] = js.undefined
  
  /**
    * @title active 状态配置。
    */
  var active: js.UndefOr[StateCfg] = js.undefined
  
  /**
    * @title inactive 状态配置。
    */
  var inactive: js.UndefOr[StateCfg] = js.undefined
  
  /**
    * @title selected 状态配置。
    */
  var selected: js.UndefOr[StateCfg] = js.undefined
}
object StateOption {
  
  inline def apply(): StateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateOption] (val x: Self) extends AnyVal {
    
    inline def setActive(value: StateCfg): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDefault(value: StateCfg): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setInactive(value: StateCfg): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setSelected(value: StateCfg): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
