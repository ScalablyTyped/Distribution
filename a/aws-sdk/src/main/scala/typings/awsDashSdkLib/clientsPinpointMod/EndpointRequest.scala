package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointRequest extends js.Object {
  /**
    * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push channels, use the token provided by the push notification service, such as the APNs device token or the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
    */
  var Address: js.UndefOr[__string] = js.undefined
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
  The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
    */
  var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The channel type.
  Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
    */
  var ChannelType: js.UndefOr[ChannelType] = js.undefined
  /**
    * Demographic attributes for the endpoint.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  /**
    * The date and time when the endpoint was updated, shown in ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[__string] = js.undefined
  /**
    * Unused.
    */
  var EndpointStatus: js.UndefOr[__string] = js.undefined
  /**
    * The endpoint location attributes.
    */
  var Location: js.UndefOr[EndpointLocation] = js.undefined
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  var Metrics: js.UndefOr[MapOf__double] = js.undefined
  /**
    * Indicates whether a user has opted out of receiving messages with one of the following values:
  ALL - User has opted out of all messages.
  NONE - Users has not opted out and receives all messages.
    */
  var OptOut: js.UndefOr[__string] = js.undefined
  /**
    * The unique ID for the most recent request to update the endpoint.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.undefined
}

object EndpointRequest {
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
  ): EndpointRequest = {
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
    __obj.asInstanceOf[EndpointRequest]
  }
}

