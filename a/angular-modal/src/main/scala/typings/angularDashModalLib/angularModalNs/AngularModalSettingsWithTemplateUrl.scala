package typings
package angularDashModalLib.angularModalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularModalSettingsWithTemplateUrl extends AngularModalSettings {
  var templateUrl: java.lang.String
}

object AngularModalSettingsWithTemplateUrl {
  @scala.inline
  def apply(
    templateUrl: java.lang.String,
    container: AngularModalJQuerySelector = null,
    controller: AngularModalControllerDefinition = null,
    controllerAs: java.lang.String = null
  ): AngularModalSettingsWithTemplateUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("templateUrl")(templateUrl)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    __obj.asInstanceOf[AngularModalSettingsWithTemplateUrl]
  }
}

