package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.angularMod.IControllerConstructor
import typings.angular.angularMod.IScope
import typings.angular.angularMod.Injectable
import typings.angularDashMaterial.angularDashMaterialNumbers.`false`
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

