package typings.angularDashModal.angularModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularModalSettingsWithTemplateUrl extends AngularModalSettings {
  var templateUrl: String
}

object AngularModalSettingsWithTemplateUrl {
  @scala.inline
  def apply(
    templateUrl: String,
    container: AngularModalJQuerySelector = null,
    controller: AngularModalControllerDefinition = null,
    controllerAs: String = null
  ): AngularModalSettingsWithTemplateUrl = {
    val __obj = js.Dynamic.literal(templateUrl = templateUrl.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularModalSettingsWithTemplateUrl]
  }
}

