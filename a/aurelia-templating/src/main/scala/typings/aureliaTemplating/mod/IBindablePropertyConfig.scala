package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StringDictionary
import typings.aureliaBinding.mod.bindingMode
import typings.aureliaTemplating.aureliaTemplatingStrings.fromView
import typings.aureliaTemplating.aureliaTemplatingStrings.oneTime
import typings.aureliaTemplating.aureliaTemplatingStrings.oneWay
import typings.aureliaTemplating.aureliaTemplatingStrings.toView
import typings.aureliaTemplating.aureliaTemplatingStrings.twoWay
import org.scalablytyped.runtime.StObject
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
  implicit class IBindablePropertyConfigMutableBuilder[Self <: IBindablePropertyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setChangeHandler(value: String): Self = StObject.set(x, "changeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeHandlerUndefined: Self = StObject.set(x, "changeHandler", js.undefined)
    
    @scala.inline
    def setDefaultBindingMode(value: bindingMode | oneTime | oneWay | twoWay | fromView | toView): Self = StObject.set(x, "defaultBindingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBindingModeUndefined: Self = StObject.set(x, "defaultBindingMode", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrimaryProperty(value: Boolean): Self = StObject.set(x, "primaryProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryPropertyUndefined: Self = StObject.set(x, "primaryProperty", js.undefined)
  }
}
