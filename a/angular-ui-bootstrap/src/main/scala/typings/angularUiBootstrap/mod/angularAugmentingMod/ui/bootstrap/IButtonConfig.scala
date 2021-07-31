package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IButtonConfig extends StObject {
  
  /**
    * @default: 'active'
    */
  var activeClass: js.UndefOr[String] = js.undefined
  
  /**
    * @default: 'Click'
    */
  var toggleEvent: js.UndefOr[String] = js.undefined
}
object IButtonConfig {
  
  @scala.inline
  def apply(): IButtonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonConfig]
  }
  
  @scala.inline
  implicit class IButtonConfigMutableBuilder[Self <: IButtonConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
    
    @scala.inline
    def setToggleEvent(value: String): Self = StObject.set(x, "toggleEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleEventUndefined: Self = StObject.set(x, "toggleEvent", js.undefined)
  }
}
