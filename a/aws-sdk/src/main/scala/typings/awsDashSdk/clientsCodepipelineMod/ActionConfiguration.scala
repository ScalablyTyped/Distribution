package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionConfiguration extends js.Object {
  /**
    * The configuration data for the action.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
}

object ActionConfiguration {
  @scala.inline
  def apply(configuration: ActionConfigurationMap = null): ActionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    __obj.asInstanceOf[ActionConfiguration]
  }
}

