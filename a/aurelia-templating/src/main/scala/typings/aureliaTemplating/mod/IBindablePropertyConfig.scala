package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StringDictionary
import typings.aureliaBinding.mod.bindingMode
import typings.aureliaTemplating.aureliaTemplatingStrings.fromView
import typings.aureliaTemplating.aureliaTemplatingStrings.oneTime
import typings.aureliaTemplating.aureliaTemplatingStrings.oneWay
import typings.aureliaTemplating.aureliaTemplatingStrings.toView
import typings.aureliaTemplating.aureliaTemplatingStrings.twoWay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBindablePropertyConfig
  extends // For compatibility and future extension
/* key */ StringDictionary[js.Any] {
  
  var attribute: js.UndefOr[String] = js.native
  
  /**
    * The name of a view model method to invoke when the property is updated.
    */
  var changeHandler: js.UndefOr[String] = js.native
  
  /**
    * The default binding mode of the property. If given string, will use to lookup
    */
  var defaultBindingMode: js.UndefOr[bindingMode | oneTime | oneWay | twoWay | fromView | toView] = js.native
  
  /**
    * A default value for the property.
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  /**
    * The name of the property.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Designates the property as the default bindable property among all the other bindable properties when used in a custom attribute with multiple bindable properties.
    */
  var primaryProperty: js.UndefOr[Boolean] = js.native
}
object IBindablePropertyConfig {
  
  @scala.inline
  def apply(): IBindablePropertyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBindablePropertyConfig]
  }
  
  @scala.inline
  implicit class IBindablePropertyConfigOps[Self <: IBindablePropertyConfig] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setChangeHandler(value: String): Self = this.set("changeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeHandler: Self = this.set("changeHandler", js.undefined)
    
    @scala.inline
    def setDefaultBindingMode(value: bindingMode | oneTime | oneWay | twoWay | fromView | toView): Self = this.set("defaultBindingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBindingMode: Self = this.set("defaultBindingMode", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrimaryProperty(value: Boolean): Self = this.set("primaryProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryProperty: Self = this.set("primaryProperty", js.undefined)
  }
}
