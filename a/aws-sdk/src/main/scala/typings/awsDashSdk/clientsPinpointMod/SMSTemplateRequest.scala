package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSTemplateRequest extends js.Object {
  /**
    * The message body to use in text messages that are based on the message template.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object SMSTemplateRequest {
  @scala.inline
  def apply(Body: __string = null, tags: MapOf__string = null): SMSTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[SMSTemplateRequest]
  }
}

