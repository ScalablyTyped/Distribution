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
    java.lang.String | angularLib.angularMod.Injectable[angularLib.angularMod.IControllerConstructor]
  ] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var disableBackdrop: js.UndefOr[scala.Boolean] = js.undefined
   // default: root node
  var disableParentScroll: js.UndefOr[scala.Boolean] = js.undefined
  var escapeToClose: js.UndefOr[scala.Boolean] = js.undefined
  var locals: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var parent: js.UndefOr[
    (js.Function2[
      /* scope */ angularLib.angularMod.IScope, 
      /* element */ angularLib.JQuery, 
      stdLib.Element | angularLib.JQuery
    ]) | java.lang.String | stdLib.Element | angularLib.JQuery
  ] = js.undefined
   // default: new child scope
  var preserveScope: js.UndefOr[scala.Boolean] = js.undefined
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var scope: js.UndefOr[angularLib.angularMod.IScope] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
}

object IBottomSheetOptions {
  @scala.inline
  def apply(
    bindToController: js.UndefOr[scala.Boolean] = js.undefined,
    clickOutsideToClose: js.UndefOr[scala.Boolean] = js.undefined,
    controller: java.lang.String | angularLib.angularMod.Injectable[angularLib.angularMod.IControllerConstructor] = null,
    controllerAs: java.lang.String = null,
    disableBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    disableParentScroll: js.UndefOr[scala.Boolean] = js.undefined,
    escapeToClose: js.UndefOr[scala.Boolean] = js.undefined,
    locals: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    parent: (js.Function2[
      /* scope */ angularLib.angularMod.IScope, 
      /* element */ angularLib.JQuery, 
      stdLib.Element | angularLib.JQuery
    ]) | java.lang.String | stdLib.Element | angularLib.JQuery = null,
    preserveScope: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: ResolveObject = null,
    scope: angularLib.angularMod.IScope = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null
  ): IBottomSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController)
    if (!js.isUndefined(clickOutsideToClose)) __obj.updateDynamic("clickOutsideToClose")(clickOutsideToClose)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (!js.isUndefined(disableBackdrop)) __obj.updateDynamic("disableBackdrop")(disableBackdrop)
    if (!js.isUndefined(disableParentScroll)) __obj.updateDynamic("disableParentScroll")(disableParentScroll)
    if (!js.isUndefined(escapeToClose)) __obj.updateDynamic("escapeToClose")(escapeToClose)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScope)) __obj.updateDynamic("preserveScope")(preserveScope)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[IBottomSheetOptions]
  }
}

