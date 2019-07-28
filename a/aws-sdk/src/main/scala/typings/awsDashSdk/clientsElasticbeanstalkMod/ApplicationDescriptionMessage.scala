package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationDescriptionMessage extends js.Object {
  /**
    *  The ApplicationDescription of the application. 
    */
  var Application: js.UndefOr[ApplicationDescription] = js.undefined
}

object ApplicationDescriptionMessage {
  @scala.inline
  def apply(Application: ApplicationDescription = null): ApplicationDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (Application != null) __obj.updateDynamic("Application")(Application)
    __obj.asInstanceOf[ApplicationDescriptionMessage]
  }
}

