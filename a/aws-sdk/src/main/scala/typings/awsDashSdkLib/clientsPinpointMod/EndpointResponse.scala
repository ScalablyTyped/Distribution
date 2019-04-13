package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointResponse extends js.Object {
  /**
    * The address of the endpoint as provided by your push provider. For example, the DeviceToken or RegistrationId.
    */
  var Address: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the application that is associated with the endpoint.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
  The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
    */
  var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The channel type.
  Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
    */
  var ChannelType: js.UndefOr[ChannelType] = js.undefined
  /**
    * A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon Pinpoint assigns cohorts to the holdout or treatment allocations for a campaign.
    */
  var CohortId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the endpoint was created, shown in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The endpoint demographic attributes.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  /**
    * The date and time when the endpoint was last updated, shown in ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[__string] = js.undefined
  /**
    * Unused.
    */
  var EndpointStatus: js.UndefOr[__string] = js.undefined
  /**
    * The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to ensure that it doesn't conflict with other endpoint IDs associated with the application.
    */
  var Id: js.UndefOr[__string] = js.undefined
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

object EndpointResponse {
  @scala.inline
  def apply(
    Address: __string = null,
    ApplicationId: __string = null,
    Attributes: MapOfListOf__string = null,
    ChannelType: ChannelType = null,
    CohortId: __string = null,
    CreationDate: __string = null,
    Demographic: EndpointDemographic = null,
    EffectiveDate: __string = null,
    EndpointStatus: __string = null,
    Id: __string = null,
    Location: EndpointLocation = null,
    Metrics: MapOf__double = null,
    OptOut: __string = null,
    RequestId: __string = null,
    User: EndpointUser = null
  ): EndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (CohortId != null) __obj.updateDynamic("CohortId")(CohortId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic)
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate)
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[EndpointResponse]
  }
}

