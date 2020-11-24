package typings.angularStrap.mgcrea.ngStrap.typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITypeaheadProvider extends js.Object {
  
  var defaults: ITypeaheadOptions = js.native
}
object ITypeaheadProvider {
  
  @scala.inline
  def apply(defaults: ITypeaheadOptions): ITypeaheadProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeaheadProvider]
  }
  
  @scala.inline
  implicit class ITypeaheadProviderOps[Self <: ITypeaheadProvider] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: ITypeaheadOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
}
