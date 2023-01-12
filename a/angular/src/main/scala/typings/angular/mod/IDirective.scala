package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.angularStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirective[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends StObject {
  
  /**
    * Deprecation warning: although bindings for non-ES6 class controllers are currently bound to this before
    * the controller constructor is called, this use is now deprecated. Please place initialization code that
    * relies upon bindings inside a $onInit method on the controller, instead.
    */
  var bindToController: js.UndefOr[Boolean | StringDictionary[String]] = js.undefined
  
  var compile: js.UndefOr[IDirectiveCompileFn[TScope, TElement, TAttributes, TController]] = js.undefined
  
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  
  var controllerAs: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[
    (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
  ] = js.undefined
  
  var multiElement: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated
    */
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var require: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.undefined
  
  var restrict: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[Boolean | StringDictionary[String]] = js.undefined
  
  var template: js.UndefOr[
    String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])
  ] = js.undefined
  
  var templateNamespace: js.UndefOr[String] = js.undefined
  
  var templateUrl: js.UndefOr[
    String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])
  ] = js.undefined
  
  var terminal: js.UndefOr[Boolean] = js.undefined
  
  var transclude: js.UndefOr[Boolean | element | StringDictionary[String]] = js.undefined
}
object IDirective {
  
  inline def apply[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](): IDirective[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirective[TScope, TElement, TAttributes, TController]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDirective[?, ?, ?, ?], TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] (val x: Self & (IDirective[TScope, TElement, TAttributes, TController])) extends AnyVal {
    
    inline def setBindToController(value: Boolean | StringDictionary[String]): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    inline def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
    inline def setCompile(
      value: (TElement, TAttributes, /* transclude */ ITranscludeFunction) => Unit | (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
    ): Self = StObject.set(x, "compile", js.Any.fromFunction3(value))
    
    inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
    
    inline def setController(value: String | Injectable[IControllerConstructor]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    inline def setControllerFunction1(value: /* repeated */ Any => Unit | IController): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setControllerVarargs(value: (String | IControllerConstructor)*): Self = StObject.set(x, "controller", js.Array(value*))
    
    inline def setLink(
      value: (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
    ): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkFunction5(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = StObject.set(x, "link", js.Any.fromFunction5(value))
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setMultiElement(value: Boolean): Self = StObject.set(x, "multiElement", value.asInstanceOf[js.Any])
    
    inline def setMultiElementUndefined: Self = StObject.set(x, "multiElement", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setRequire(value: String | js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
    
    inline def setRestrict(value: String): Self = StObject.set(x, "restrict", value.asInstanceOf[js.Any])
    
    inline def setRestrictUndefined: Self = StObject.set(x, "restrict", js.undefined)
    
    inline def setScope(value: Boolean | StringDictionary[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTemplate(value: String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(value: (/* tElement */ TElement, /* tAttrs */ TAttributes) => String): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateNamespace(value: String): Self = StObject.set(x, "templateNamespace", value.asInstanceOf[js.Any])
    
    inline def setTemplateNamespaceUndefined: Self = StObject.set(x, "templateNamespace", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlFunction2(value: (/* tElement */ TElement, /* tAttrs */ TAttributes) => String): Self = StObject.set(x, "templateUrl", js.Any.fromFunction2(value))
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    
    inline def setTransclude(value: Boolean | element | StringDictionary[String]): Self = StObject.set(x, "transclude", value.asInstanceOf[js.Any])
    
    inline def setTranscludeUndefined: Self = StObject.set(x, "transclude", js.undefined)
  }
}
