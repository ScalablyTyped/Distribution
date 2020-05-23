package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IControllerConstructor
import typings.angular.mod.IScope
import typings.angular.mod.Injectable
import typings.angularMaterial.angularMaterialBooleans.`false`
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastOptions extends js.Object {
  var autoWrap: js.UndefOr[Boolean] = js.undefined
  var bindToController: js.UndefOr[Boolean] = js.undefined
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
   // default: false
  var hideDelay: js.UndefOr[Double | `false`] = js.undefined
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var parent: js.UndefOr[String | Element | JQuery] = js.undefined
   // default (ms): 3000
  var position: js.UndefOr[String] = js.undefined
   // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.undefined
   // default: false
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var scope: js.UndefOr[IScope] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
   // any combination of 'bottom'/'left'/'top'/'right'/'fit'; default: 'bottom left'
  var toastClass: js.UndefOr[String] = js.undefined
}

object IToastOptions {
  @scala.inline
  def apply(
    autoWrap: js.UndefOr[Boolean] = js.undefined,
    bindToController: js.UndefOr[Boolean] = js.undefined,
    controller: String | Injectable[IControllerConstructor] = null,
    controllerAs: String = null,
    hideDelay: Double | `false` = null,
    locals: StringDictionary[js.Any] = null,
    parent: String | Element | JQuery = null,
    position: String = null,
    preserveScope: js.UndefOr[Boolean] = js.undefined,
    resolve: ResolveObject = null,
    scope: IScope = null,
    template: String = null,
    templateUrl: String = null,
    toastClass: String = null
  ): IToastOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWrap)) __obj.updateDynamic("autoWrap")(autoWrap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController.get.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScope)) __obj.updateDynamic("preserveScope")(preserveScope.get.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastOptions]
  }
}

