package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicEndpoint extends js.Object {
  /**
    * The unique identifier for the recipient, such as a device token, email address, or mobile phone number.
    */
  var Address: js.UndefOr[__string] = js.undefined
  /**
    * One or more custom attributes that describe the endpoint by associating a name with an array of values. You can use these attributes as filter criteria when you create segments.
    */
  var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The channel that's used when sending messages or push notifications to the endpoint.
    */
  var ChannelType: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.ChannelType] = js.undefined
  /**
    * The demographic information for the endpoint, such as the time zone and platform.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the endpoint was last updated.
    */
  var EffectiveDate: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint. Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the same address specified by the Address property.
    */
  var EndpointStatus: js.UndefOr[__string] = js.undefined
  /**
    * The geographic information for the endpoint.
    */
  var Location: js.UndefOr[EndpointLocation] = js.undefined
  /**
    * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
    */
  var Metrics: js.UndefOr[MapOf__double] = js.undefined
  /**
    * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push notifications.
    */
  var OptOut: js.UndefOr[__string] = js.undefined
  /**
    * A unique identifier that's generated each time the endpoint is updated.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with the endpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.undefined
}

object PublicEndpoint {
  @scala.inline
  def apply(
    Address: __string = null,
    Attributes: MapOfListOf__string = null,
    ChannelType: ChannelType = null,
    Demographic: EndpointDemographic = null,
    EffectiveDate: __string = null,
    EndpointStatus: __string = null,
    Location: EndpointLocation = null,
    Metrics: MapOf__double = null,
    OptOut: __string = null,
    RequestId: __string = null,
    User: EndpointUser = null
  ): PublicEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic)
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate)
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[PublicEndpoint]
  }
}

