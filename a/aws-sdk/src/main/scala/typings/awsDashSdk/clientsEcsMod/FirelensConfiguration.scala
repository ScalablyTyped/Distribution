package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirelensConfiguration extends js.Object {
  /**
    * The options to use when configuring the log router. This field is optional and can be used to add additional metadata, such as the task, task definition, cluster, and container instance details to the log event. If specified, the syntax to use is "options":{"enable-ecs-log-metadata":"true|false"}.
    */
  var options: js.UndefOr[FirelensConfigurationOptionsMap] = js.undefined
  /**
    * The log router to use. The valid values are fluentd or fluentbit.
    */
  var `type`: FirelensConfigurationType
}

object FirelensConfiguration {
  @scala.inline
  def apply(`type`: FirelensConfigurationType, options: FirelensConfigurationOptionsMap = null): FirelensConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[FirelensConfiguration]
  }
}

