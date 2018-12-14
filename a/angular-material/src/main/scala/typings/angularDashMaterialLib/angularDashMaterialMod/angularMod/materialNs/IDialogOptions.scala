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

