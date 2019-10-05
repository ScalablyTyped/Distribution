package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.angularMod.IControllerConstructor
import typings.angular.angularMod.Injectable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelConfig extends js.Object {
   // default: false
  var animation: js.UndefOr[IPanelAnimation] = js.undefined
  var attachTo: js.UndefOr[String | JQuery | Element] = js.undefined
  var bindToController: js.UndefOr[Boolean] = js.undefined
  var clickOutsideToClose: js.UndefOr[Boolean] = js.undefined
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
   // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.undefined
   // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.undefined
   // default: false
  var focusOnOpen: js.UndefOr[Boolean] = js.undefined
   // default: true
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
   // default: true
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onCloseSuccess: js.UndefOr[js.Function2[/* panel */ IPanelRef, /* closeReason */ String, _]] = js.undefined
   // default: false
  var onDomAdded: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.undefined
  var onDomRemoved: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.undefined
  var onOpenComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.undefined
  var onRemoving: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.undefined
  var origin: js.UndefOr[String | JQuery | Element] = js.undefined
  var panelClass: js.UndefOr[String] = js.undefined
   // default: 80
  var position: js.UndefOr[IPanelPosition] = js.undefined
  var propagateContainerEvents: js.UndefOr[Boolean] = js.undefined
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
   // default: false
  var trapFocus: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IPanelConfig {
  @scala.inline
  def apply(
    animation: IPanelAnimation = null,
    attachTo: String | JQuery | Element = null,
    bindToController: js.UndefOr[Boolean] = js.undefined,
    clickOutsideToClose: js.UndefOr[Boolean] = js.undefined,
    controller: String | Injectable[IControllerConstructor] = null,
    controllerAs: String = null,
    disableParentScroll: js.UndefOr[Boolean] = js.undefined,
    escapeToClose: js.UndefOr[Boolean] = js.undefined,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    locals: StringDictionary[js.Any] = null,
    onCloseSuccess: (/* panel */ IPanelRef, /* closeReason */ String) => _ = null,
    onDomAdded: /* repeated */ js.Any => js.Thenable[Unit] | Unit = null,
    onDomRemoved: /* repeated */ js.Any => js.Thenable[Unit] | Unit = null,
    onOpenComplete: /* repeated */ js.Any => js.Thenable[Unit] | Unit = null,
    onRemoving: /* repeated */ js.Any => js.Thenable[Unit] | Unit = null,
    origin: String | JQuery | Element = null,
    panelClass: String = null,
    position: IPanelPosition = null,
    propagateContainerEvents: js.UndefOr[Boolean] = js.undefined,
    resolve: ResolveObject = null,
    template: String = null,
    templateUrl: String = null,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): IPanelConfig = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo.asInstanceOf[js.Any])
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController)
    if (!js.isUndefined(clickOutsideToClose)) __obj.updateDynamic("clickOutsideToClose")(clickOutsideToClose)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (!js.isUndefined(disableParentScroll)) __obj.updateDynamic("disableParentScroll")(disableParentScroll)
    if (!js.isUndefined(escapeToClose)) __obj.updateDynamic("escapeToClose")(escapeToClose)
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop)
    if (id != null) __obj.updateDynamic("id")(id)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (onCloseSuccess != null) __obj.updateDynamic("onCloseSuccess")(js.Any.fromFunction2(onCloseSuccess))
    if (onDomAdded != null) __obj.updateDynamic("onDomAdded")(js.Any.fromFunction1(onDomAdded))
    if (onDomRemoved != null) __obj.updateDynamic("onDomRemoved")(js.Any.fromFunction1(onDomRemoved))
    if (onOpenComplete != null) __obj.updateDynamic("onOpenComplete")(js.Any.fromFunction1(onOpenComplete))
    if (onRemoving != null) __obj.updateDynamic("onRemoving")(js.Any.fromFunction1(onRemoving))
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (panelClass != null) __obj.updateDynamic("panelClass")(panelClass)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(propagateContainerEvents)) __obj.updateDynamic("propagateContainerEvents")(propagateContainerEvents)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelConfig]
  }
}

