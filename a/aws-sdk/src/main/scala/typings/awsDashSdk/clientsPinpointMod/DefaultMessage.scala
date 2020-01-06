package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultMessage extends js.Object {
  /**
    * The default body of the message.
    */
  var Body: js.UndefOr[__string] = js.native
  /**
    * The default message variables to use in the message. You can override these default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.native
}

object DefaultMessage {
  @scala.inline
  def apply(Body: __string = null, Substitutions: MapOfListOf__string = null): DefaultMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMessage]
  }
}

