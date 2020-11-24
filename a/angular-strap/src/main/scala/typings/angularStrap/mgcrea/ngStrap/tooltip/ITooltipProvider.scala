package typings.angularStrap.mgcrea.ngStrap.tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipProvider extends js.Object {
  
  var defaults: ITooltipOptions = js.native
}
object ITooltipProvider {
  
  @scala.inline
  def apply(defaults: ITooltipOptions): ITooltipProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
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
    def setDefaults(value: ITooltipOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
}
