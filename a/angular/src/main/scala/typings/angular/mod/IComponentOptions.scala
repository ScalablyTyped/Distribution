package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Component
// see http://angularjs.blogspot.com.br/2015/11/angularjs-15-beta2-and-14-releases.html
// and http://toddmotto.com/exploring-the-angular-1-5-component-method/
///////////////////////////////////////////////////////////////////////////
/**
  * Component definition object (a simplified directive definition object)
  */
trait IComponentOptions extends StObject {
  
  /**
    * Define DOM attribute binding to component properties. Component properties are always bound to the component
    * controller and not to the scope.
    */
  var bindings: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Controller constructor function that should be associated with newly created scope or the name of a registered
    * controller if passed as a string. Empty function by default.
    * Use the array form to define dependencies (necessary if strictDi is enabled and you require dependency injection)
    */
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  
  /**
    * An identifier name for a reference to the controller. If present, the controller will be published to its scope under
    * the specified name. If not present, this will default to '$ctrl'.
    */
  var controllerAs: js.UndefOr[String] = js.undefined
  
  /**
    * Requires the controllers of other directives and binds them to this component's controller.
    * The object keys specify the property names under which the required controllers (object values) will be bound.
    * Note that the required controllers will not be available during the instantiation of the controller,
    * but they are guaranteed to be available just before the $onInit method is executed!
    */
  var require: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * html template as a string or a function that returns an html template as a string which should be used as the
    * contents of this component. Empty string by default.
    * If template is a function, then it is injected with the following locals:
    * $element - Current element
    * $attrs - Current attributes object for the element
    * Use the array form to define dependencies (necessary if strictDi is enabled and you require dependency injection)
    */
  var template: js.UndefOr[String | (Injectable[js.Function1[/* repeated */ Any, String]])] = js.undefined
  
  /**
    * Path or function that returns a path to an html template that should be used as the contents of this component.
    * If templateUrl is a function, then it is injected with the following locals:
    * $element - Current element
    * $attrs - Current attributes object for the element
    * Use the array form to define dependencies (necessary if strictDi is enabled and you require dependency injection)
    */
  var templateUrl: js.UndefOr[String | (Injectable[js.Function1[/* repeated */ Any, String]])] = js.undefined
  
  /**
    * Whether transclusion is enabled. Disabled by default.
    */
  var transclude: js.UndefOr[Boolean | StringDictionary[String]] = js.undefined
}
object IComponentOptions {
  
  inline def apply(): IComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentOptions]
  }
  
  extension [Self <: IComponentOptions](x: Self) {
    
    inline def setBindings(value: StringDictionary[String]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setController(value: String | Injectable[IControllerConstructor]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    inline def setControllerFunction1(value: /* repeated */ Any => Unit | IController): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setControllerVarargs(value: (String | IControllerConstructor)*): Self = StObject.set(x, "controller", js.Array(value*))
    
    inline def setRequire(value: StringDictionary[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setTemplate(value: String | (Injectable[js.Function1[/* repeated */ Any, String]])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String | (Injectable[js.Function1[/* repeated */ Any, String]])): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "templateUrl", js.Any.fromFunction1(value))
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setTemplateUrlVarargs(value: (String | (js.Function1[/* repeated */ Any, String]))*): Self = StObject.set(x, "templateUrl", js.Array(value*))
    
    inline def setTemplateVarargs(value: (String | (js.Function1[/* repeated */ Any, String]))*): Self = StObject.set(x, "template", js.Array(value*))
    
    inline def setTransclude(value: Boolean | StringDictionary[String]): Self = StObject.set(x, "transclude", value.asInstanceOf[js.Any])
    
    inline def setTranscludeUndefined: Self = StObject.set(x, "transclude", js.undefined)
  }
}
