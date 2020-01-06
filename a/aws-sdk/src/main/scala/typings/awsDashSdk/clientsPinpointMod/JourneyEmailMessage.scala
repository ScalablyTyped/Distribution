package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyEmailMessage extends js.Object {
  /**
    * The verified email address to send the email message from. The default address is the FromAddress specified for the email channel for the application.
    */
  var FromAddress: js.UndefOr[__string] = js.native
}

object JourneyEmailMessage {
  @scala.inline
  def apply(FromAddress: __string = null): JourneyEmailMessage = {
    val __obj = js.Dynamic.literal()
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyEmailMessage]
  }
}

