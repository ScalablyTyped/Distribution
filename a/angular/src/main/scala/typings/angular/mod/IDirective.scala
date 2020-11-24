package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.angularStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirective[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
  
  /**
    * Deprecation warning: although bindings for non-ES6 class controllers are currently bound to this before
    * the controller constructor is called, this use is now deprecated. Please place initialization code that
    * relies upon bindings inside a $onInit method on the controller, instead.
    */
  var bindToController: js.UndefOr[Boolean | StringDictionary[String]] = js.native
  
  var compile: js.UndefOr[IDirectiveCompileFn[TScope, TElement, TAttributes, TController]] = js.native
  
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
  var link: js.UndefOr[
    (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
  ] = js.native
  
  var multiElement: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated
    */
  var replace: js.UndefOr[Boolean] = js.native
  
  var require: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.native
  
  var restrict: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[Boolean | StringDictionary[String]] = js.native
  
  var template: js.UndefOr[
    String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])
  ] = js.native
  
  var templateNamespace: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[
    String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])
  ] = js.native
  
  var terminal: js.UndefOr[Boolean] = js.native
  
  var transclude: js.UndefOr[Boolean | element | StringDictionary[String]] = js.native
}
object IDirective {
  
  @scala.inline
  def apply[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](): IDirective[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirective[TScope, TElement, TAttributes, TController]]
  }
  
  @scala.inline
  implicit class IDirectiveOps[Self <: IDirective[_, _, _, _], TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] (val x: Self with (IDirective[TScope, TElement, TAttributes, TController])) extends AnyVal {
    
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
    def setBindToController(value: Boolean | StringDictionary[String]): Self = this.set("bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindToController: Self = this.set("bindToController", js.undefined)
    
    @scala.inline
    def setCompile(
      value: (TElement, TAttributes, /* transclude */ ITranscludeFunction) => Unit | (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
    ): Self = this.set("compile", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCompile: Self = this.set("compile", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: (String | IControllerConstructor)*): Self = this.set("controller", js.Array(value :_*))
    
    @scala.inline
    def setControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self = this.set("controller", js.Any.fromFunction1(value))
    
    @scala.inline
    def setController(value: String | Injectable[IControllerConstructor]): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setLinkFunction5(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = this.set("link", js.Any.fromFunction5(value))
    
    @scala.inline
    def setLink(
      value: (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
    ): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setMultiElement(value: Boolean): Self = this.set("multiElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiElement: Self = this.set("multiElement", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setRequireVarargs(value: String*): Self = this.set("require", js.Array(value :_*))
    
    @scala.inline
    def setRequire(value: String | js.Array[String] | StringDictionary[String]): Self = this.set("require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    
    @scala.inline
    def setRestrict(value: String): Self = this.set("restrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrict: Self = this.set("restrict", js.undefined)
    
    @scala.inline
    def setScope(value: Boolean | StringDictionary[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(value: (/* tElement */ TElement, /* tAttrs */ TAttributes) => String): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplate(value: String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateNamespace(value: String): Self = this.set("templateNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateNamespace: Self = this.set("templateNamespace", js.undefined)
    
    @scala.inline
    def setTemplateUrlFunction2(value: (/* tElement */ TElement, /* tAttrs */ TAttributes) => String): Self = this.set("templateUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplateUrl(value: String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String])): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setTerminal(value: Boolean): Self = this.set("terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
    
    @scala.inline
    def setTransclude(value: Boolean | element | StringDictionary[String]): Self = this.set("transclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransclude: Self = this.set("transclude", js.undefined)
  }
}
