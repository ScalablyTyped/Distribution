package typings.angular.angularMod

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
trait IComponentOptions extends js.Object {
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
  var template: js.UndefOr[String | (Injectable[js.Function1[/* repeated */ _, String]])] = js.undefined
  /**
    * Path or function that returns a path to an html template that should be used as the contents of this component.
    * If templateUrl is a function, then it is injected with the following locals:
    * $element - Current element
    * $attrs - Current attributes object for the element
    * Use the array form to define dependencies (necessary if strictDi is enabled and you require dependency injection)
    */
  var templateUrl: js.UndefOr[String | (Injectable[js.Function1[/* repeated */ _, String]])] = js.undefined
  /**
    * Whether transclusion is enabled. Disabled by default.
    */
  var transclude: js.UndefOr[Boolean | StringDictionary[String]] = js.undefined
}

object IComponentOptions {
  @scala.inline
  def apply(
    bindings: StringDictionary[String] = null,
    controller: String | Injectable[IControllerConstructor] = null,
    controllerAs: String = null,
    require: StringDictionary[String] = null,
    template: String | (Injectable[js.Function1[/* repeated */ _, String]]) = null,
    templateUrl: String | (Injectable[js.Function1[/* repeated */ _, String]]) = null,
    transclude: Boolean | StringDictionary[String] = null
  ): IComponentOptions = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (require != null) __obj.updateDynamic("require")(require)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (transclude != null) __obj.updateDynamic("transclude")(transclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponentOptions]
  }
}

