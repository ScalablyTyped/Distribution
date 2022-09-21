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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBindablePropertyConfig
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var attribute: js.UndefOr[String] = js.undefined
  
  /**
  	 * The name of a view model method to invoke when the property is updated.
  	 */
  var changeHandler: js.UndefOr[String] = js.undefined
  
  /**
  	 * The default binding mode of the property. If given string, will use to lookup
  	 */
  var defaultBindingMode: js.UndefOr[bindingMode | oneTime | oneWay | twoWay | fromView | toView] = js.undefined
  
  /**
  	 * A default value for the property.
  	 */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  /**
  	* The name of the property.
  	*/
  var name: js.UndefOr[String] = js.undefined
  
  /**
  	 * Designates the property as the default bindable property among all the other bindable properties when used in a custom attribute with multiple bindable properties.
  	 */
  var primaryProperty: js.UndefOr[Boolean] = js.undefined
}
object IBindablePropertyConfig {
  
  inline def apply(): IBindablePropertyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBindablePropertyConfig]
  }
  
  extension [Self <: IBindablePropertyConfig](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setChangeHandler(value: String): Self = StObject.set(x, "changeHandler", value.asInstanceOf[js.Any])
    
    inline def setChangeHandlerUndefined: Self = StObject.set(x, "changeHandler", js.undefined)
    
    inline def setDefaultBindingMode(value: bindingMode | oneTime | oneWay | twoWay | fromView | toView): Self = StObject.set(x, "defaultBindingMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultBindingModeUndefined: Self = StObject.set(x, "defaultBindingMode", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryProperty(value: Boolean): Self = StObject.set(x, "primaryProperty", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPropertyUndefined: Self = StObject.set(x, "primaryProperty", js.undefined)
  }
}
