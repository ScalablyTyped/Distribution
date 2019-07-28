package typings.angularDashModal.angularModalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularModalSettings extends js.Object {
  var container: js.UndefOr[AngularModalJQuerySelector] = js.undefined
  var controller: js.UndefOr[AngularModalControllerDefinition] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
}

object AngularModalSettings {
  @scala.inline
  def apply(
    container: AngularModalJQuerySelector = null,
    controller: AngularModalControllerDefinition = null,
    controllerAs: String = null
  ): AngularModalSettings = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    __obj.asInstanceOf[AngularModalSettings]
  }
}

