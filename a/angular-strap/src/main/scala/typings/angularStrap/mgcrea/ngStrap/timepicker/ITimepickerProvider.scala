package typings.angularStrap.mgcrea.ngStrap.timepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimepickerProvider extends js.Object {
  
  var defaults: ITimepickerOptions = js.native
}
object ITimepickerProvider {
  
  @scala.inline
  def apply(defaults: ITimepickerOptions): ITimepickerProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimepickerProvider]
  }
  
  @scala.inline
  implicit class ITimepickerProviderOps[Self <: ITimepickerProvider] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: ITimepickerOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
}
