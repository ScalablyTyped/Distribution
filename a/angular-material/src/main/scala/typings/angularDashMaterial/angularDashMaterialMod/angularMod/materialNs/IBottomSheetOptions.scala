package typings.angularDashMaterial.angularDashMaterialMod.angularMod.materialNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.angularMod.IControllerConstructor
import typings.angular.angularMod.IScope
import typings.angular.angularMod.Injectable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBottomSheetOptions extends js.Object {
  var bindToController: js.UndefOr[Boolean] = js.undefined
  var clickOutsideToClose: js.UndefOr[Boolean] = js.undefined
   // default: false
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
   // default: false
  var disableBackdrop: js.UndefOr[Boolean] = js.undefined
   // default: root node
  var disableParentScroll: js.UndefOr[Boolean] = js.undefined
  var escapeToClose: js.UndefOr[Boolean] = js.undefined
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var parent: js.UndefOr[
    (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery
  ] = js.undefined
   // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.undefined
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var scope: js.UndefOr[IScope] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
}

object IBottomSheetOptions {
  @scala.inline
  def apply(
    bindToController: js.UndefOr[Boolean] = js.undefined,
    clickOutsideToClose: js.UndefOr[Boolean] = js.undefined,
    controller: String | Injectable[IControllerConstructor] = null,
    controllerAs: String = null,
    disableBackdrop: js.UndefOr[Boolean] = js.undefined,
    disableParentScroll: js.UndefOr[Boolean] = js.undefined,
    escapeToClose: js.UndefOr[Boolean] = js.undefined,
    locals: StringDictionary[js.Any] = null,
    parent: (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery = null,
    preserveScope: js.UndefOr[Boolean] = js.undefined,
    resolve: ResolveObject = null,
    scope: IScope = null,
    template: String = null,
    templateUrl: String = null
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

