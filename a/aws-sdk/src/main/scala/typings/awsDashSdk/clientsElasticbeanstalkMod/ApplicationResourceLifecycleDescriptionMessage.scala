package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationResourceLifecycleDescriptionMessage extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
}

object ApplicationResourceLifecycleDescriptionMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    ResourceLifecycleConfig: ApplicationResourceLifecycleConfig = null
  ): ApplicationResourceLifecycleDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (ResourceLifecycleConfig != null) __obj.updateDynamic("ResourceLifecycleConfig")(ResourceLifecycleConfig)
    __obj.asInstanceOf[ApplicationResourceLifecycleDescriptionMessage]
  }
}

