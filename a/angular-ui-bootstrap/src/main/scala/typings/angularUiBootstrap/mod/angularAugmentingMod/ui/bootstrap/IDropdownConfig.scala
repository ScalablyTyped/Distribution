package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDropdownConfig extends StObject {
  
  /**
    * @default: 'uib-dropdown-open'
    */
  var appendToOpenClass: js.UndefOr[String] = js.undefined
  
  /**
    * @default: 'open'
    */
  var openClass: js.UndefOr[String] = js.undefined
}
object IDropdownConfig {
  
  inline def apply(): IDropdownConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownConfig]
  }
  
  extension [Self <: IDropdownConfig](x: Self) {
    
    inline def setAppendToOpenClass(value: String): Self = StObject.set(x, "appendToOpenClass", value.asInstanceOf[js.Any])
    
    inline def setAppendToOpenClassUndefined: Self = StObject.set(x, "appendToOpenClass", js.undefined)
    
    inline def setOpenClass(value: String): Self = StObject.set(x, "openClass", value.asInstanceOf[js.Any])
    
    inline def setOpenClassUndefined: Self = StObject.set(x, "openClass", js.undefined)
  }
}
