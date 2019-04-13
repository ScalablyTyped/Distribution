package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastOptions extends js.Object {
  var autoWrap: js.UndefOr[scala.Boolean] = js.undefined
  var bindToController: js.UndefOr[scala.Boolean] = js.undefined
  var controller: js.UndefOr[
    java.lang.String | angularLib.angularMod.Injectable[angularLib.angularMod.IControllerConstructor]
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
  var scope: js.UndefOr[angularLib.angularMod.IScope] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
   // any combination of 'bottom'/'left'/'top'/'right'/'fit'; default: 'bottom left'
  var toastClass: js.UndefOr[java.lang.String] = js.undefined
}

object IToastOptions {
  @scala.inline
  def apply(
    autoWrap: js.UndefOr[scala.Boolean] = js.undefined,
    bindToController: js.UndefOr[scala.Boolean] = js.undefined,
    controller: java.lang.String | angularLib.angularMod.Injectable[angularLib.angularMod.IControllerConstructor] = null,
    controllerAs: java.lang.String = null,
    hideDelay: scala.Double | angularDashMaterialLib.angularDashMaterialLibNumbers.`false` = null,
    locals: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    parent: java.lang.String | stdLib.Element | angularLib.JQuery = null,
    position: java.lang.String = null,
    preserveScope: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: ResolveObject = null,
    scope: angularLib.angularMod.IScope = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null,
    toastClass: java.lang.String = null
  ): IToastOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWrap)) __obj.updateDynamic("autoWrap")(autoWrap)
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(preserveScope)) __obj.updateDynamic("preserveScope")(preserveScope)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass)
    __obj.asInstanceOf[IToastOptions]
  }
}

