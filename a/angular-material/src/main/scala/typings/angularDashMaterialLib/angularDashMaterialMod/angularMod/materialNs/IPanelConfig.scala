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
    java.lang.String | angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.angularNs.IControllerConstructor]
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
  var locals: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onCloseSuccess: js.UndefOr[js.Function2[/* panel */ IPanelRef, /* closeReason */ java.lang.String, _]] = js.undefined
   // default: false
  var onDomAdded: js.UndefOr[js.Function1[/* repeated */js.Any, stdLib.PromiseLike[scala.Unit] | scala.Unit]] = js.undefined
  var onDomRemoved: js.UndefOr[js.Function1[/* repeated */js.Any, stdLib.PromiseLike[scala.Unit] | scala.Unit]] = js.undefined
  var onOpenComplete: js.UndefOr[js.Function1[/* repeated */js.Any, stdLib.PromiseLike[scala.Unit] | scala.Unit]] = js.undefined
  var onRemoving: js.UndefOr[js.Function1[/* repeated */js.Any, stdLib.PromiseLike[scala.Unit] | scala.Unit]] = js.undefined
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

