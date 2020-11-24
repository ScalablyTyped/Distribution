package typings.angularAria.mod.aria

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in angular-aria.angular.aria.IAriaAttribute ]:? boolean} */
@js.native
trait IAriaProviderOptions extends js.Object {
  
  var ariaChecked: js.UndefOr[Boolean] = js.native
  
  var ariaDisabled: js.UndefOr[Boolean] = js.native
  
  var ariaHidden: js.UndefOr[Boolean] = js.native
  
  var ariaInvalid: js.UndefOr[Boolean] = js.native
  
  var ariaReadonly: js.UndefOr[Boolean] = js.native
  
  var ariaRequired: js.UndefOr[Boolean] = js.native
  
  var ariaValue: js.UndefOr[Boolean] = js.native
  
  var bindKeydown: js.UndefOr[Boolean] = js.native
  
  var bindRoleForClick: js.UndefOr[Boolean] = js.native
  
  var tabindex: js.UndefOr[Boolean] = js.native
}
object IAriaProviderOptions {
  
  @scala.inline
  def apply(): IAriaProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAriaProviderOptions]
  }
  
  @scala.inline
  implicit class IAriaProviderOptionsOps[Self <: IAriaProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setAriaChecked(value: Boolean): Self = this.set("ariaChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaChecked: Self = this.set("ariaChecked", js.undefined)
    
    @scala.inline
    def setAriaDisabled(value: Boolean): Self = this.set("ariaDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDisabled: Self = this.set("ariaDisabled", js.undefined)
    
    @scala.inline
    def setAriaHidden(value: Boolean): Self = this.set("ariaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaHidden: Self = this.set("ariaHidden", js.undefined)
    
    @scala.inline
    def setAriaInvalid(value: Boolean): Self = this.set("ariaInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaInvalid: Self = this.set("ariaInvalid", js.undefined)
    
    @scala.inline
    def setAriaReadonly(value: Boolean): Self = this.set("ariaReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaReadonly: Self = this.set("ariaReadonly", js.undefined)
    
    @scala.inline
    def setAriaRequired(value: Boolean): Self = this.set("ariaRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaRequired: Self = this.set("ariaRequired", js.undefined)
    
    @scala.inline
    def setAriaValue(value: Boolean): Self = this.set("ariaValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaValue: Self = this.set("ariaValue", js.undefined)
    
    @scala.inline
    def setBindKeydown(value: Boolean): Self = this.set("bindKeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindKeydown: Self = this.set("bindKeydown", js.undefined)
    
    @scala.inline
    def setBindRoleForClick(value: Boolean): Self = this.set("bindRoleForClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindRoleForClick: Self = this.set("bindRoleForClick", js.undefined)
    
    @scala.inline
    def setTabindex(value: Boolean): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
  }
}
