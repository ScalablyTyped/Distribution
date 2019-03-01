package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogOptions extends js.Object {
  var autoWrap: js.UndefOr[scala.Boolean] = js.undefined
  var bindToController: js.UndefOr[scala.Boolean] = js.undefined
   // default: true
  var clickOutsideToClose: js.UndefOr[scala.Boolean] = js.undefined
  var closeTo: js.UndefOr[js.Any] = js.undefined
  var contentElement: js.UndefOr[java.lang.String | stdLib.Element] = js.undefined
   // default: true
  var controller: js.UndefOr[
    java.lang.String | angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.angularNs.IControllerConstructor]
  ] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var disableParentScroll: js.UndefOr[scala.Boolean] = js.undefined
   // default: false
  var escapeToClose: js.UndefOr[scala.Boolean] = js.undefined
   // default: true
  var focusOnOpen: js.UndefOr[scala.Boolean] = js.undefined
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
   // default: true
  var hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var locals: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onComplete: js.UndefOr[
    js.Function2[
      /* scope */ angularLib.angularMod.angularNs.IScope, 
      /* element */ angularLib.JQuery, 
      scala.Unit
    ]
  ] = js.undefined
  var onRemoving: js.UndefOr[
    js.Function2[
      /* element */ angularLib.JQuery, 
      /* removePromise */ angularLib.angularMod.angularNs.IPromise[_], 
      scala.Unit
    ]
  ] = js.undefined
   // default: root node
  var onShowing: js.UndefOr[
    js.Function2[
      /* scope */ angularLib.angularMod.angularNs.IScope, 
      /* element */ angularLib.JQuery, 
      scala.Unit
    ]
  ] = js.undefined
  var openFrom: js.UndefOr[js.Any] = js.undefined
  var parent: js.UndefOr[java.lang.String | stdLib.Element | angularLib.JQuery] = js.undefined
   // default: new child scope
  var preserveScope: js.UndefOr[scala.Boolean] = js.undefined
   // default: false
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var scope: js.UndefOr[angularLib.angularMod.angularNs.IScope] = js.undefined
  var skipHide: js.UndefOr[scala.Boolean] = js.undefined
   // default: true
  var targetEvent: js.UndefOr[stdLib.MouseEvent] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
}

object IDialogOptions {
  @scala.inline
  def apply(
    autoWrap: js.UndefOr[scala.Boolean] = js.undefined,
    bindToController: js.UndefOr[scala.Boolean] = js.undefined,
    clickOutsideToClose: js.UndefOr[scala.Boolean] = js.undefined,
    closeTo: js.Any = null,
    contentElement: java.lang.String | stdLib.Element = null,
    controller: java.lang.String | angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.angularNs.IControllerConstructor] = null,
    controllerAs: java.lang.String = null,
    disableParentScroll: js.UndefOr[scala.Boolean] = js.undefined,
    escapeToClose: js.UndefOr[scala.Boolean] = js.undefined,
    focusOnOpen: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    locals: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onComplete: js.Function2[
      /* scope */ angularLib.angularMod.angularNs.IScope, 
      /* element */ angularLib.JQuery, 
      scala.Unit
    ] = null,
    onRemoving: js.Function2[
      /* element */ angularLib.JQuery, 
      /* removePromise */ angularLib.angularMod.angularNs.IPromise[_], 
      scala.Unit
    ] = null,
    onShowing: js.Function2[
      /* scope */ angularLib.angularMod.angularNs.IScope, 
      /* element */ angularLib.JQuery, 
      scala.Unit
    ] = null,
    openFrom: js.Any = null,
    parent: java.lang.String | stdLib.Element | angularLib.JQuery = null,
    preserveScope: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: ResolveObject = null,
    scope: angularLib.angularMod.angularNs.IScope = null,
    skipHide: js.UndefOr[scala.Boolean] = js.undefined,
    targetEvent: stdLib.MouseEvent = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null
  ): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWrap)) __obj.updateDynamic("autoWrap")(autoWrap)
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController)
    if (!js.isUndefined(clickOutsideToClose)) __obj.updateDynamic("clickOutsideToClose")(clickOutsideToClose)
    if (closeTo != null) __obj.updateDynamic("closeTo")(closeTo)
    if (contentElement != null) __obj.updateDynamic("contentElement")(contentElement.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (!js.isUndefined(disableParentScroll)) __obj.updateDynamic("disableParentScroll")(disableParentScroll)
    if (!js.isUndefined(escapeToClose)) __obj.updateDynamic("escapeToClose")(escapeToClose)
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onRemoving != null) __obj.updateDynamic("onRemoving")(onRemoving)
    if (onShowing != null) __obj.updateDynamic("onShowing")(onShowing)
    if (openFrom != null) __obj.updateDynamic("openFrom")(openFrom)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScope)) __obj.updateDynamic("preserveScope")(preserveScope)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(skipHide)) __obj.updateDynamic("skipHide")(skipHide)
    if (targetEvent != null) __obj.updateDynamic("targetEvent")(targetEvent)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[IDialogOptions]
  }
}

