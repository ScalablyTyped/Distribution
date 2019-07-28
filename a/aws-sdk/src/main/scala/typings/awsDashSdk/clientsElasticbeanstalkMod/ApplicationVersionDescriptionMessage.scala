package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVersionDescriptionMessage extends js.Object {
  /**
    *  The ApplicationVersionDescription of the application version. 
    */
  var ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.undefined
}

object ApplicationVersionDescriptionMessage {
  @scala.inline
  def apply(ApplicationVersion: ApplicationVersionDescription = null): ApplicationVersionDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationVersion != null) __obj.updateDynamic("ApplicationVersion")(ApplicationVersion)
    __obj.asInstanceOf[ApplicationVersionDescriptionMessage]
  }
}

