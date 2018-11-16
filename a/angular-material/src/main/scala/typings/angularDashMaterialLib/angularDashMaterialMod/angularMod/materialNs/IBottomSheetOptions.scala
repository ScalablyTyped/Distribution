package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBottomSheetOptions extends js.Object {
  var bindToController: js.UndefOr[scala.Boolean] = js.undefined
  var clickOutsideToClose: js.UndefOr[scala.Boolean] = js.undefined
   // default: false
  var controller: js.UndefOr[
    java.lang.String | angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.angularNs.IControllerConstructor]
  ] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var disableBackdrop: js.UndefOr[scala.Boolean] = js.undefined
   // default: root node
  var disableParentScroll: js.UndefOr[scala.Boolean] = js.undefined
  var escapeToClose: js.UndefOr[scala.Boolean] = js.undefined
  var locals: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  var parent: js.UndefOr[
    (js.Function2[
      /* scope */ angularLib.angularMod.angularNs.IScope, 
      /* element */ angularLib.JQuery, 
      stdLib.Element | angularLib.JQuery
    ]) | java.lang.String | stdLib.Element | angularLib.JQuery
  ] = js.undefined
   // default: new child scope
  var preserveScope: js.UndefOr[scala.Boolean] = js.undefined
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var scope: js.UndefOr[angularLib.angularMod.angularNs.IScope] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
}

