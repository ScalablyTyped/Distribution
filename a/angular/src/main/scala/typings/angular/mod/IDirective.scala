package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.angularStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirective[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
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
  @scala.inline
  def apply[TScope, TElement, TAttributes, TController](
    bindToController: Boolean | StringDictionary[String] = null,
    compile: (TElement, TAttributes, /* transclude */ ITranscludeFunction) => Unit | (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController]) = null,
    controller: String | Injectable[IControllerConstructor] = null,
    controllerAs: String = null,
    link: (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController]) = null,
    multiElement: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    require: String | js.Array[String] | StringDictionary[String] = null,
    restrict: String = null,
    scope: Boolean | StringDictionary[String] = null,
    template: String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String]) = null,
    templateNamespace: String = null,
    templateUrl: String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, String]) = null,
    terminal: js.UndefOr[Boolean] = js.undefined,
    transclude: Boolean | element | StringDictionary[String] = null
  ): IDirective[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    if (bindToController != null) __obj.updateDynamic("bindToController")(bindToController.asInstanceOf[js.Any])
    if (compile != null) __obj.updateDynamic("compile")(js.Any.fromFunction3(compile))
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(multiElement)) __obj.updateDynamic("multiElement")(multiElement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (restrict != null) __obj.updateDynamic("restrict")(restrict.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateNamespace != null) __obj.updateDynamic("templateNamespace")(templateNamespace.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal.get.asInstanceOf[js.Any])
    if (transclude != null) __obj.updateDynamic("transclude")(transclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirective[TScope, TElement, TAttributes, TController]]
  }
}

