package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointSendConfiguration extends js.Object {
  /**
    * The body of the message. If specified, this value overrides the default message body.
    */
  var BodyOverride: js.UndefOr[__string] = js.undefined
  /**
    * A map of custom attributes to attach to the message for the address. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides the message.
    */
  var RawContent: js.UndefOr[__string] = js.undefined
  /**
    * A map of the message variables to merge with the variables specified for the default message (DefaultMessage.Substitutions). The variables specified in this map take precedence over all other variables.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The title or subject line of the message. If specified, this value overrides the default message title or subject line.
    */
  var TitleOverride: js.UndefOr[__string] = js.undefined
}

object EndpointSendConfiguration {
  @scala.inline
  def apply(
    BodyOverride: __string = null,
    Context: MapOf__string = null,
    RawContent: __string = null,
    Substitutions: MapOfListOf__string = null,
    TitleOverride: __string = null
  ): EndpointSendConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BodyOverride != null) __obj.updateDynamic("BodyOverride")(BodyOverride)
    if (Context != null) __obj.updateDynamic("Context")(Context)
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (TitleOverride != null) __obj.updateDynamic("TitleOverride")(TitleOverride)
    __obj.asInstanceOf[EndpointSendConfiguration]
  }
}

