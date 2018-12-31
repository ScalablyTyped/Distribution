package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastOptions extends js.Object {
  var autoWrap: js.UndefOr[scala.Boolean] = js.undefined
  var bindToController: js.UndefOr[scala.Boolean] = js.undefined
  var controller: js.UndefOr[
    java.lang.String | angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.angularNs.IControllerConstructor]
  ] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var hideDelay: js.UndefOr[scala.Double | angularDashMaterialLib.angularDashMaterialLibNumbers.`false`] = js.undefined
  var locals: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var parent: js.UndefOr[java.lang.String | stdLib.Element | angularLib.JQuery] = js.undefined
   // default (ms): 3000
  var position: js.UndefOr[java.lang.String] = js.undefined
   // default: new child scope
  var preserveScope: js.UndefOr[scala.Boolean] = js.undefined
   // default: false
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var scope: js.UndefOr[angularLib.angularMod.angularNs.IScope] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
   // any combination of 'bottom'/'left'/'top'/'right'/'fit'; default: 'bottom left'
  var toastClass: js.UndefOr[java.lang.String] = js.undefined
}

