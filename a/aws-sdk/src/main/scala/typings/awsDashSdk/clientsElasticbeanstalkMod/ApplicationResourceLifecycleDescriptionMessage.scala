package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationResourceLifecycleDescriptionMessage extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
}

object ApplicationResourceLifecycleDescriptionMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    ResourceLifecycleConfig: ApplicationResourceLifecycleConfig = null
  ): ApplicationResourceLifecycleDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName.asInstanceOf[js.Any])
    if (ResourceLifecycleConfig != null) __obj.updateDynamic("ResourceLifecycleConfig")(ResourceLifecycleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationResourceLifecycleDescriptionMessage]
  }
}

