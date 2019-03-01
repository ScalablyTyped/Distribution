package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirective[TScope /* <: IScope */, TElement /* <: angularLib.JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
  /**
    * Deprecation warning: although bindings for non-ES6 class controllers are currently bound to this before
    * the controller constructor is called, this use is now deprecated. Please place initialization code that
    * relies upon bindings inside a $onInit method on the controller, instead.
    */
  var bindToController: js.UndefOr[scala.Boolean | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var compile: js.UndefOr[IDirectiveCompileFn[TScope, TElement, TAttributes, TController]] = js.undefined
  var controller: js.UndefOr[java.lang.String | Injectable[IControllerConstructor]] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[
    (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
  ] = js.undefined
  var multiElement: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  /**
    * @deprecated
    */
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var require: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  var restrict: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[scala.Boolean | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var template: js.UndefOr[
    java.lang.String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, java.lang.String])
  ] = js.undefined
  var templateNamespace: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[
    java.lang.String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, java.lang.String])
  ] = js.undefined
  var terminal: js.UndefOr[scala.Boolean] = js.undefined
  var transclude: js.UndefOr[
    scala.Boolean | angularLib.angularLibStrings.element | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
}

object IDirective {
  @scala.inline
  def apply[TScope /* <: IScope */, TElement /* <: angularLib.JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](
    bindToController: scala.Boolean | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    compile: IDirectiveCompileFn[TScope, TElement, TAttributes, TController] = null,
    controller: java.lang.String | Injectable[IControllerConstructor] = null,
    controllerAs: java.lang.String = null,
    link: (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController]) = null,
    multiElement: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    require: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    restrict: java.lang.String = null,
    scope: scala.Boolean | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    template: java.lang.String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, java.lang.String]) = null,
    templateNamespace: java.lang.String = null,
    templateUrl: java.lang.String | (js.Function2[/* tElement */ TElement, /* tAttrs */ TAttributes, java.lang.String]) = null,
    terminal: js.UndefOr[scala.Boolean] = js.undefined,
    transclude: scala.Boolean | angularLib.angularLibStrings.element | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): IDirective[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    if (bindToController != null) __obj.updateDynamic("bindToController")(bindToController.asInstanceOf[js.Any])
    if (compile != null) __obj.updateDynamic("compile")(compile)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(multiElement)) __obj.updateDynamic("multiElement")(multiElement)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (restrict != null) __obj.updateDynamic("restrict")(restrict)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateNamespace != null) __obj.updateDynamic("templateNamespace")(templateNamespace)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal)
    if (transclude != null) __obj.updateDynamic("transclude")(transclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirective[TScope, TElement, TAttributes, TController]]
  }
}

