package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelOptions extends StObject {
  
  var allowInvalid: js.UndefOr[Boolean] = js.undefined
  
  var debounce: js.UndefOr[Double] = js.undefined
  
  var getterSetter: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var updateOn: js.UndefOr[String] = js.undefined
}
object IModelOptions {
  
  inline def apply(): IModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelOptions]
  }
  
  extension [Self <: IModelOptions](x: Self) {
    
    inline def setAllowInvalid(value: Boolean): Self = StObject.set(x, "allowInvalid", value.asInstanceOf[js.Any])
    
    inline def setAllowInvalidUndefined: Self = StObject.set(x, "allowInvalid", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setGetterSetter(value: String): Self = StObject.set(x, "getterSetter", value.asInstanceOf[js.Any])
    
    inline def setGetterSetterUndefined: Self = StObject.set(x, "getterSetter", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setUpdateOn(value: String): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
  }
}
