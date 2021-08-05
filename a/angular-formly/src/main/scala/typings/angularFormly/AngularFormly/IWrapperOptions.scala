package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWrapperOptions extends StObject {
  
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  
  var apiCheckFunction: js.UndefOr[String] = js.undefined
  
  //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.undefined
  
  var apiCheckOptions: js.UndefOr[js.Object] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var overwriteOk: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var templateUrl: js.UndefOr[String] = js.undefined
  
  var types: js.UndefOr[js.Array[String]] = js.undefined
  
  var validateOptions: js.UndefOr[js.Function] = js.undefined
}
object IWrapperOptions {
  
  inline def apply(): IWrapperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWrapperOptions]
  }
  
  extension [Self <: IWrapperOptions](x: Self) {
    
    inline def setApiCheck(value: StringDictionary[js.Function]): Self = StObject.set(x, "apiCheck", value.asInstanceOf[js.Any])
    
    inline def setApiCheckFunction(value: String): Self = StObject.set(x, "apiCheckFunction", value.asInstanceOf[js.Any])
    
    inline def setApiCheckFunctionUndefined: Self = StObject.set(x, "apiCheckFunction", js.undefined)
    
    inline def setApiCheckInstance(value: js.Any): Self = StObject.set(x, "apiCheckInstance", value.asInstanceOf[js.Any])
    
    inline def setApiCheckInstanceUndefined: Self = StObject.set(x, "apiCheckInstance", js.undefined)
    
    inline def setApiCheckOptions(value: js.Object): Self = StObject.set(x, "apiCheckOptions", value.asInstanceOf[js.Any])
    
    inline def setApiCheckOptionsUndefined: Self = StObject.set(x, "apiCheckOptions", js.undefined)
    
    inline def setApiCheckUndefined: Self = StObject.set(x, "apiCheck", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverwriteOk(value: Boolean): Self = StObject.set(x, "overwriteOk", value.asInstanceOf[js.Any])
    
    inline def setOverwriteOkUndefined: Self = StObject.set(x, "overwriteOk", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    inline def setValidateOptions(value: js.Function): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
    
    inline def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
  }
}
