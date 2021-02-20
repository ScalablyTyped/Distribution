package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDropdownConfig extends StObject {
  
  /**
    * @default: 'uib-dropdown-open'
    */
  var appendToOpenClass: js.UndefOr[String] = js.native
  
  /**
    * @default: 'open'
    */
  var openClass: js.UndefOr[String] = js.native
}
object IDropdownConfig {
  
  @scala.inline
  def apply(): IDropdownConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownConfig]
  }
  
  @scala.inline
  implicit class IDropdownConfigMutableBuilder[Self <: IDropdownConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendToOpenClass(value: String): Self = StObject.set(x, "appendToOpenClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToOpenClassUndefined: Self = StObject.set(x, "appendToOpenClass", js.undefined)
    
    @scala.inline
    def setOpenClass(value: String): Self = StObject.set(x, "openClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenClassUndefined: Self = StObject.set(x, "openClass", js.undefined)
  }
}
