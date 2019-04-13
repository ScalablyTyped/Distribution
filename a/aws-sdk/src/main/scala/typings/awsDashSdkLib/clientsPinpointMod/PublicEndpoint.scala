package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicEndpoint extends js.Object {
  /**
    * The unique identifier for the recipient. For example, an address could be a device token, email address, or mobile phone number.
    */
  var Address: js.UndefOr[__string] = js.undefined
  /**
    * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create a segment.
    */
  var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The channel type.
  Valid values: APNS, GCM
    */
  var ChannelType: js.UndefOr[ChannelType] = js.undefined
  /**
    * The endpoint demographic attributes.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  /**
    * The date and time when the endpoint was last updated, in  ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[__string] = js.undefined
  /**
    * The status of the endpoint. If the update fails, the value is INACTIVE. If the endpoint is updated successfully, the value is ACTIVE.
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
    * A unique identifier that is generated each time the endpoint is updated.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
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

