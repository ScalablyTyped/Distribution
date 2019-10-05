package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.angularMod.IControllerConstructor
import typings.angular.angularMod.IPromise
import typings.angular.angularMod.IScope
import typings.angular.angularMod.Injectable
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogOptions extends js.Object {
  var autoWrap: js.UndefOr[Boolean] = js.undefined
  var bindToController: js.UndefOr[Boolean] = js.undefined
   // default: true
  var clickOutsideToClose: js.UndefOr[Boolean] = js.undefined
  var closeTo: js.UndefOr[js.Any] = js.undefined
  var contentElement: js.UndefOr[String | Element] = js.undefined
   // default: true
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
   // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.undefined
   // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.undefined
   // default: true
  var focusOnOpen: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
   // default: true
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onComplete: js.UndefOr[js.Function2[/* scope */ IScope, /* element */ JQuery, Unit]] = js.undefined
  var onRemoving: js.UndefOr[js.Function2[/* element */ JQuery, /* removePromise */ IPromise[_], Unit]] = js.undefined
   // default: root node
  var onShowing: js.UndefOr[js.Function2[/* scope */ IScope, /* element */ JQuery, Unit]] = js.undefined
  var openFrom: js.UndefOr[js.Any] = js.undefined
  var parent: js.UndefOr[String | Element | JQuery] = js.undefined
   // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.undefined
   // default: false
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var scope: js.UndefOr[IScope] = js.undefined
  var skipHide: js.UndefOr[Boolean] = js.undefined
   // default: true
  var targetEvent: js.UndefOr[MouseEvent] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
   // default: false
  var title: js.UndefOr[String] = js.undefined
}

object IDialogOptions {
  @scala.inline
  def apply(
    autoWrap: js.UndefOr[Boolean] = js.undefined,
    bindToController: js.UndefOr[Boolean] = js.undefined,
    clickOutsideToClose: js.UndefOr[Boolean] = js.undefined,
    closeTo: js.Any = null,
    contentElement: String | Element = null,
    controller: String | Injectable[IControllerConstructor] = null,
    controllerAs: String = null,
    disableParentScroll: js.UndefOr[Boolean] = js.undefined,
    escapeToClose: js.UndefOr[Boolean] = js.undefined,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    locals: StringDictionary[js.Any] = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onComplete: (/* scope */ IScope, /* element */ JQuery) => Unit = null,
    onRemoving: (/* element */ JQuery, /* removePromise */ IPromise[_]) => Unit = null,
    onShowing: (/* scope */ IScope, /* element */ JQuery) => Unit = null,
    openFrom: js.Any = null,
    parent: String | Element | JQuery = null,
    preserveScope: js.UndefOr[Boolean] = js.undefined,
    resolve: ResolveObject = null,
    scope: IScope = null,
    skipHide: js.UndefOr[Boolean] = js.undefined,
    targetEvent: MouseEvent = null,
    template: String = null,
    templateUrl: String = null,
    title: String = null
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
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2(onComplete))
    if (onRemoving != null) __obj.updateDynamic("onRemoving")(js.Any.fromFunction2(onRemoving))
    if (onShowing != null) __obj.updateDynamic("onShowing")(js.Any.fromFunction2(onShowing))
    if (openFrom != null) __obj.updateDynamic("openFrom")(openFrom)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScope)) __obj.updateDynamic("preserveScope")(preserveScope)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(skipHide)) __obj.updateDynamic("skipHide")(skipHide)
    if (targetEvent != null) __obj.updateDynamic("targetEvent")(targetEvent)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IDialogOptions]
  }
}

