package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFormlyConfigExtras extends StObject {
  
  var apiCheckInstance: Any
  
  var defaultHideDirective: String
  
  var disableNgModelAttrsManipulator: Boolean
  
  var errorExistsAndShouldBeVisibleExpression: Any
  
  var explicitAsync: Boolean
  
  var fieldTransform: js.Function | js.Array[js.Function]
  
  var getFieldId: js.Function
  
  var ngModelAttrsManipulatorPreferUnbound: Boolean
  
  var removeChromeAutoComplete: Boolean
}
object IFormlyConfigExtras {
  
  inline def apply(
    apiCheckInstance: Any,
    defaultHideDirective: String,
    disableNgModelAttrsManipulator: Boolean,
    errorExistsAndShouldBeVisibleExpression: Any,
    explicitAsync: Boolean,
    fieldTransform: js.Function | js.Array[js.Function],
    getFieldId: js.Function,
    ngModelAttrsManipulatorPreferUnbound: Boolean,
    removeChromeAutoComplete: Boolean
  ): IFormlyConfigExtras = {
    val __obj = js.Dynamic.literal(apiCheckInstance = apiCheckInstance.asInstanceOf[js.Any], defaultHideDirective = defaultHideDirective.asInstanceOf[js.Any], disableNgModelAttrsManipulator = disableNgModelAttrsManipulator.asInstanceOf[js.Any], errorExistsAndShouldBeVisibleExpression = errorExistsAndShouldBeVisibleExpression.asInstanceOf[js.Any], explicitAsync = explicitAsync.asInstanceOf[js.Any], fieldTransform = fieldTransform.asInstanceOf[js.Any], getFieldId = getFieldId.asInstanceOf[js.Any], ngModelAttrsManipulatorPreferUnbound = ngModelAttrsManipulatorPreferUnbound.asInstanceOf[js.Any], removeChromeAutoComplete = removeChromeAutoComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormlyConfigExtras]
  }
  
  extension [Self <: IFormlyConfigExtras](x: Self) {
    
    inline def setApiCheckInstance(value: Any): Self = StObject.set(x, "apiCheckInstance", value.asInstanceOf[js.Any])
    
    inline def setDefaultHideDirective(value: String): Self = StObject.set(x, "defaultHideDirective", value.asInstanceOf[js.Any])
    
    inline def setDisableNgModelAttrsManipulator(value: Boolean): Self = StObject.set(x, "disableNgModelAttrsManipulator", value.asInstanceOf[js.Any])
    
    inline def setErrorExistsAndShouldBeVisibleExpression(value: Any): Self = StObject.set(x, "errorExistsAndShouldBeVisibleExpression", value.asInstanceOf[js.Any])
    
    inline def setExplicitAsync(value: Boolean): Self = StObject.set(x, "explicitAsync", value.asInstanceOf[js.Any])
    
    inline def setFieldTransform(value: js.Function | js.Array[js.Function]): Self = StObject.set(x, "fieldTransform", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformVarargs(value: js.Function*): Self = StObject.set(x, "fieldTransform", js.Array(value*))
    
    inline def setGetFieldId(value: js.Function): Self = StObject.set(x, "getFieldId", value.asInstanceOf[js.Any])
    
    inline def setNgModelAttrsManipulatorPreferUnbound(value: Boolean): Self = StObject.set(x, "ngModelAttrsManipulatorPreferUnbound", value.asInstanceOf[js.Any])
    
    inline def setRemoveChromeAutoComplete(value: Boolean): Self = StObject.set(x, "removeChromeAutoComplete", value.asInstanceOf[js.Any])
  }
}
