package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelConfig extends js.Object {
   // default: false
  var animation: js.UndefOr[IPanelAnimation] = js.undefined
  var attachTo: js.UndefOr[java.lang.String | angularLib.JQuery | stdLib.Element] = js.undefined
  var bindToController: js.UndefOr[scala.Boolean] = js.undefined
  var clickOutsideToClose: js.UndefOr[scala.Boolean] = js.undefined
  var controller: js.UndefOr[
    java.lang.String | angularLib.angularMod.Injectable[angularLib.angularMod.IControllerConstructor]
  ] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var disableParentScroll: js.UndefOr[scala.Boolean] = js.undefined
   // default: false
  var escapeToClose: js.UndefOr[scala.Boolean] = js.undefined
   // default: false
  var focusOnOpen: js.UndefOr[scala.Boolean] = js.undefined
   // default: true
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
   // default: true
  var locals: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onCloseSuccess: js.UndefOr[js.Function2[/* panel */ IPanelRef, /* closeReason */ java.lang.String, _]] = js.undefined
   // default: false
  var onDomAdded: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[scala.Unit] | scala.Unit]] = js.undefined
  var onDomRemoved: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[scala.Unit] | scala.Unit]] = js.undefined
  var onOpenComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[scala.Unit] | scala.Unit]] = js.undefined
  var onRemoving: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[scala.Unit] | scala.Unit]] = js.undefined
  var origin: js.UndefOr[java.lang.String | angularLib.JQuery | stdLib.Element] = js.undefined
  var panelClass: js.UndefOr[java.lang.String] = js.undefined
   // default: 80
  var position: js.UndefOr[IPanelPosition] = js.undefined
  var propagateContainerEvents: js.UndefOr[scala.Boolean] = js.undefined
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var trapFocus: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object IPanelConfig {
  @scala.inline
  def apply(
    animation: IPanelAnimation = null,
    attachTo: java.lang.String | angularLib.JQuery | stdLib.Element = null,
    bindToController: js.UndefOr[scala.Boolean] = js.undefined,
    clickOutsideToClose: js.UndefOr[scala.Boolean] = js.undefined,
    controller: java.lang.String | angularLib.angularMod.Injectable[angularLib.angularMod.IControllerConstructor] = null,
    controllerAs: java.lang.String = null,
    disableParentScroll: js.UndefOr[scala.Boolean] = js.undefined,
    escapeToClose: js.UndefOr[scala.Boolean] = js.undefined,
    focusOnOpen: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    locals: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onCloseSuccess: (/* panel */ IPanelRef, /* closeReason */ java.lang.String) => _ = null,
    onDomAdded: /* repeated */ js.Any => js.Thenable[scala.Unit] | scala.Unit = null,
    onDomRemoved: /* repeated */ js.Any => js.Thenable[scala.Unit] | scala.Unit = null,
    onOpenComplete: /* repeated */ js.Any => js.Thenable[scala.Unit] | scala.Unit = null,
    onRemoving: /* repeated */ js.Any => js.Thenable[scala.Unit] | scala.Unit = null,
    origin: java.lang.String | angularLib.JQuery | stdLib.Element = null,
    panelClass: java.lang.String = null,
    position: IPanelPosition = null,
    propagateContainerEvents: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: ResolveObject = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null,
    trapFocus: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
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

