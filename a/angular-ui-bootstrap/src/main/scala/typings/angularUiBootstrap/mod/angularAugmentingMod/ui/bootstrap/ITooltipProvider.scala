package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IServiceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITooltipProvider
  extends StObject
     with IServiceProvider {
  
  /**
    * Provide a set of defaults for certain tooltip and popover attributes.
    */
  def options(value: ITooltipOptions): Unit
  
  /**
    * Extends the default trigger mappings with mappings of your own. E.g. `{ 'openTrigger': 'closeTrigger' }`.
    */
  def setTriggers(triggers: js.Object): Unit
}
object ITooltipProvider {
  
  inline def apply($get: Any, options: ITooltipOptions => Unit, setTriggers: js.Object => Unit): ITooltipProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], options = js.Any.fromFunction1(options), setTriggers = js.Any.fromFunction1(setTriggers))
    __obj.asInstanceOf[ITooltipProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITooltipProvider] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: ITooltipOptions => Unit): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    inline def setSetTriggers(value: js.Object => Unit): Self = StObject.set(x, "setTriggers", js.Any.fromFunction1(value))
  }
}
