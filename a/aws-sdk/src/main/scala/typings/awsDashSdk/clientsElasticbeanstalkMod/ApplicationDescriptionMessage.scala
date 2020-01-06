package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDescriptionMessage extends js.Object {
  /**
    *  The ApplicationDescription of the application. 
    */
  var Application: js.UndefOr[ApplicationDescription] = js.native
}

object ApplicationDescriptionMessage {
  @scala.inline
  def apply(Application: ApplicationDescription = null): ApplicationDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (Application != null) __obj.updateDynamic("Application")(Application.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDescriptionMessage]
  }
}

