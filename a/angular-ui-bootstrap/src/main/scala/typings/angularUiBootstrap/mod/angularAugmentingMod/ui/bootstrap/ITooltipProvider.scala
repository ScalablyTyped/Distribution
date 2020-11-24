package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipProvider extends IServiceProvider {
  
  /**
    * Provide a set of defaults for certain tooltip and popover attributes.
    */
  def options(value: ITooltipOptions): Unit = js.native
  
  /**
    * Extends the default trigger mappings with mappings of your own. E.g. `{ 'openTrigger': 'closeTrigger' }`.
    */
  def setTriggers(triggers: js.Object): Unit = js.native
}
object ITooltipProvider {
  
  @scala.inline
  def apply($get: js.Any, options: ITooltipOptions => Unit, setTriggers: js.Object => Unit): ITooltipProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], options = js.Any.fromFunction1(options), setTriggers = js.Any.fromFunction1(setTriggers))
    __obj.asInstanceOf[ITooltipProvider]
  }
  
  @scala.inline
  implicit class ITooltipProviderOps[Self <: ITooltipProvider] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: ITooltipOptions => Unit): Self = this.set("options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTriggers(value: js.Object => Unit): Self = this.set("setTriggers", js.Any.fromFunction1(value))
  }
}
