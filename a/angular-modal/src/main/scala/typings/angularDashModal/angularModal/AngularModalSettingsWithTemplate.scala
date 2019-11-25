package typings.angularDashModal.angularModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularModalSettingsWithTemplate extends AngularModalSettings {
  var template: js.Any
}

object AngularModalSettingsWithTemplate {
  @scala.inline
  def apply(
    template: js.Any,
    container: AngularModalJQuerySelector = null,
    controller: AngularModalControllerDefinition = null,
    controllerAs: String = null
  ): AngularModalSettingsWithTemplate = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularModalSettingsWithTemplate]
  }
}

