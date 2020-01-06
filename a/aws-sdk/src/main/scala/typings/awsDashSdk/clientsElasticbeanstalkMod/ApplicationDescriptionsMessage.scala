package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDescriptionsMessage extends js.Object {
  /**
    * This parameter contains a list of ApplicationDescription.
    */
  var Applications: js.UndefOr[ApplicationDescriptionList] = js.native
}

object ApplicationDescriptionsMessage {
  @scala.inline
  def apply(Applications: ApplicationDescriptionList = null): ApplicationDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Applications != null) __obj.updateDynamic("Applications")(Applications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDescriptionsMessage]
  }
}

