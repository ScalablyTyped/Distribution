package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMessage extends js.Object {
  /**
    * The default message body of the push notification, email, or SMS message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The default message variables to use in the push notification, email, or SMS message. You can override these default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
}

object DefaultMessage {
  @scala.inline
  def apply(Body: __string = null, Substitutions: MapOfListOf__string = null): DefaultMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    __obj.asInstanceOf[DefaultMessage]
  }
}

