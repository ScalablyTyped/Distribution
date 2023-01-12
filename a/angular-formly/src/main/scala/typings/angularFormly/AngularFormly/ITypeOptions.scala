package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirectiveLinkFn
import typings.angular.mod.IScope
import typings.angular.mod.ITranscludeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  *
  * see http://docs.angular-formly.com/docs/custom-templates#section-formlyconfig-settype-options
  */
trait ITypeOptions extends StObject {
  
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  
  var apiCheckFunction: js.UndefOr[String] = js.undefined
  
  //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[Any] = js.undefined
  
  var apiCheckOptions: js.UndefOr[js.Object] = js.undefined
  
  var controller: js.UndefOr[js.Function | String | js.Array[Any]] = js.undefined
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var defaultOptions: js.UndefOr[IFieldConfigurationObject | js.Function] = js.undefined
  
  var `extends`: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[IDirectiveLinkFn[IScope, JQLite, IAttributes, IController]] = js.undefined
  
  var name: String
  
  var overwriteOk: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[js.Function | String] = js.undefined
  
  var templateUrl: js.UndefOr[js.Function | String] = js.undefined
  
  var validateOptions: js.UndefOr[js.Function] = js.undefined
  
  var wrapper: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ITypeOptions {
  
  inline def apply(name: String): ITypeOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITypeOptions] (val x: Self) extends AnyVal {
    
    inline def setApiCheck(value: StringDictionary[js.Function]): Self = StObject.set(x, "apiCheck", value.asInstanceOf[js.Any])
    
    inline def setApiCheckFunction(value: String): Self = StObject.set(x, "apiCheckFunction", value.asInstanceOf[js.Any])
    
    inline def setApiCheckFunctionUndefined: Self = StObject.set(x, "apiCheckFunction", js.undefined)
    
    inline def setApiCheckInstance(value: Any): Self = StObject.set(x, "apiCheckInstance", value.asInstanceOf[js.Any])
    
    inline def setApiCheckInstanceUndefined: Self = StObject.set(x, "apiCheckInstance", js.undefined)
    
    inline def setApiCheckOptions(value: js.Object): Self = StObject.set(x, "apiCheckOptions", value.asInstanceOf[js.Any])
    
    inline def setApiCheckOptionsUndefined: Self = StObject.set(x, "apiCheckOptions", js.undefined)
    
    inline def setApiCheckUndefined: Self = StObject.set(x, "apiCheck", js.undefined)
    
    inline def setController(value: js.Function | String | js.Array[Any]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setControllerVarargs(value: Any*): Self = StObject.set(x, "controller", js.Array(value*))
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDefaultOptions(value: IFieldConfigurationObject | js.Function): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    
    inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setLink(
      value: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = StObject.set(x, "link", js.Any.fromFunction5(value))
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOverwriteOk(value: Boolean): Self = StObject.set(x, "overwriteOk", value.asInstanceOf[js.Any])
    
    inline def setOverwriteOkUndefined: Self = StObject.set(x, "overwriteOk", js.undefined)
    
    inline def setTemplate(value: js.Function | String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: js.Function | String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setValidateOptions(value: js.Function): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
    
    inline def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
    
    inline def setWrapper(value: String | js.Array[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    
    inline def setWrapperVarargs(value: String*): Self = StObject.set(x, "wrapper", js.Array(value*))
  }
}
