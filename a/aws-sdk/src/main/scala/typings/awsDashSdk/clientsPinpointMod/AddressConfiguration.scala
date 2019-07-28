package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressConfiguration extends js.Object {
  /**
    * The message body to use instead of the default message body. This value overrides the default message body.
    */
  var BodyOverride: js.UndefOr[__string] = js.undefined
  /**
    * The channel to use when sending the message.
    */
  var ChannelType: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.ChannelType] = js.undefined
  /**
    * An object that maps custom attributes to attributes for the address and is attached to the message. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. This value overrides the message.
    */
  var RawContent: js.UndefOr[__string] = js.undefined
  /**
    * An object that maps variable values for the message. Amazon Pinpoint merges these values with the variable values specified by properties of the DefaultMessage object. The substitutions in this map take precedence over all other substitutions.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The message title to use instead of the default message title. This value overrides the default message title.
    */
  var TitleOverride: js.UndefOr[__string] = js.undefined
}

object AddressConfiguration {
  @scala.inline
  def apply(
    BodyOverride: __string = null,
    ChannelType: ChannelType = null,
    Context: MapOf__string = null,
    RawContent: __string = null,
    Substitutions: MapOfListOf__string = null,
    TitleOverride: __string = null
  ): AddressConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BodyOverride != null) __obj.updateDynamic("BodyOverride")(BodyOverride)
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (Context != null) __obj.updateDynamic("Context")(Context)
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (TitleOverride != null) __obj.updateDynamic("TitleOverride")(TitleOverride)
    __obj.asInstanceOf[AddressConfiguration]
  }
}

