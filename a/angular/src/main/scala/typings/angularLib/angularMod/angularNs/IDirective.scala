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

