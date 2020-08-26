package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// Component
// see http://angularjs.blogspot.com.br/2015/11/angularjs-15-beta2-and-14-releases.html
// and http://toddmotto.com/exploring-the-angular-1-5-component-method/
///////////////////////////////////////////////////////////////////////////
/**
  * Component definition object (a simplified directive definition object)
  */
@js.native
trait IComponentOptions extends js.Object {
  /**
    * Define DOM attribute binding to component properties. Component properties are always bound to the component
    * controller and not to the scope.
    */
  var bindings: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Controller constructor function that should be associated with newly created scope or the name of a registered
    * controller if passed as a string. Empty function by default.
    * Use the array form to define dependencies (necessary if strictDi is enabled and you require dependency injection)
    */
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  /**
    * An identifier name for a reference to the controller. If present, the controller will be published to its scope under
    * the specified name. If not present, this will default to '$ctrl'.
    */
  var controllerAs: js.UndefOr[String] = js.native
  /**
    * Requires the controllers of other directives and binds them to this component's controller.
    * The object keys specify the property names under which the required controllers (object values) will be bound.
    * Note that the required controllers will not be available during the instantiation of the controller,
    * but they are guaranteed to be available just before the $onInit method is executed!
    */
  var require: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * html template as a string or a function that returns an html template as a string which should be used as the
    * contents of this component. Empty string by default.
    * If template is a function, then it is injected with the following locals:
    * $element - Current element
    * $attrs - Current attributes object for the element
    * Use the array form to define dependencies (necessary if strictDi is enabled and you require dependency injection)
    */
  var template: js.UndefOr[String | (Injectable[js.Function1[/* repeated */ _, String]])] = js.native
  /**
    * Path or function that returns a path to an html template that should be used as the contents of this component.
    * If templateUrl is a function, then it is injected with the following locals:
    * $element - Current element
    * $attrs - Current attributes object for the element
    * Use the array form to define dependencies (necessary if strictDi is enabled and you require dependency injection)
    */
  var templateUrl: js.UndefOr[String | (Injectable[js.Function1[/* repeated */ _, String]])] = js.native
  /**
    * Whether transclusion is enabled. Disabled by default.
    */
  var transclude: js.UndefOr[Boolean | StringDictionary[String]] = js.native
}

object IComponentOptions {
  @scala.inline
  def apply(): IComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentOptions]
  }
  @scala.inline
  implicit class IComponentOptionsOps[Self <: IComponentOptions] (val x: Self) extends AnyVal {
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
    def setBindings(value: StringDictionary[String]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
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
    def setRequire(value: StringDictionary[String]): Self = this.set("require", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    @scala.inline
    def setTemplateVarargs(value: (String | (js.Function1[js.Any, String]))*): Self = this.set("template", js.Array(value :_*))
    @scala.inline
    def setTemplateFunction1(value: /* repeated */ _ => String): Self = this.set("template", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplate(value: String | (Injectable[js.Function1[/* repeated */ _, String]])): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateUrlVarargs(value: (String | (js.Function1[js.Any, String]))*): Self = this.set("templateUrl", js.Array(value :_*))
    @scala.inline
    def setTemplateUrlFunction1(value: /* repeated */ _ => String): Self = this.set("templateUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplateUrl(value: String | (Injectable[js.Function1[/* repeated */ _, String]])): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    @scala.inline
    def setTransclude(value: Boolean | StringDictionary[String]): Self = this.set("transclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransclude: Self = this.set("transclude", js.undefined)
  }
  
}

