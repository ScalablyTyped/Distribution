package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelOptions extends StObject {
  
  var allowInvalid: js.UndefOr[Boolean] = js.native
  
  var debounce: js.UndefOr[Double] = js.native
  
  var getterSetter: js.UndefOr[String] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var updateOn: js.UndefOr[String] = js.native
}
object IModelOptions {
  
  @scala.inline
  def apply(): IModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelOptions]
  }
  
  @scala.inline
  implicit class IModelOptionsMutableBuilder[Self <: IModelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowInvalid(value: Boolean): Self = StObject.set(x, "allowInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInvalidUndefined: Self = StObject.set(x, "allowInvalid", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    @scala.inline
    def setGetterSetter(value: String): Self = StObject.set(x, "getterSetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetterSetterUndefined: Self = StObject.set(x, "getterSetter", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setUpdateOn(value: String): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
  }
}
