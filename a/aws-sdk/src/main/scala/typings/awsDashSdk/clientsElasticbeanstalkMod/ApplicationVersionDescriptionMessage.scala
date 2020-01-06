package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionDescriptionMessage extends js.Object {
  /**
    *  The ApplicationVersionDescription of the application version. 
    */
  var ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.native
}

object ApplicationVersionDescriptionMessage {
  @scala.inline
  def apply(ApplicationVersion: ApplicationVersionDescription = null): ApplicationVersionDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationVersion != null) __obj.updateDynamic("ApplicationVersion")(ApplicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionDescriptionMessage]
  }
}

