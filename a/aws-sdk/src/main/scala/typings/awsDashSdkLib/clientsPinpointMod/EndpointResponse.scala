package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointResponse extends js.Object {
  /**
    * The destination address for messages or push notifications that you send to the endpoint. The address varies by channel. For example, the address for a push-notification channel is typically the token provided by a push notification service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging (FCM) registration token. The address for the SMS channel is a phone number in E.164 format, such as +12065550100. The address for the email channel is an email address.
    */
  var Address: js.UndefOr[__string] = js.undefined
  /**
    * The unique identifier for the application that's associated with the endpoint.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * One or more custom attributes that describe the endpoint by associating a name with an array of values. For example, the value of a custom attribute named Interests might be: ["science", "music", "travel"]. You can use these attributes as filter criteria when you create segments.
    */
  var Attributes: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * The channel that's used when sending messages or push notifications to the endpoint.
    */
  var ChannelType: js.UndefOr[ChannelType] = js.undefined
  /**
    * A number from 0-99 that represents the cohort that the endpoint is assigned to. Endpoints are grouped into cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an application. Amazon Pinpoint assigns cohorts to the holdout or treatment allocations for campaigns.
    */
  var CohortId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the endpoint was created.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The demographic information for the endpoint, such as the time zone and platform.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  /**
    * The date and time, in ISO 8601 format, when the endpoint was last updated.
    */
  var EffectiveDate: js.UndefOr[__string] = js.undefined
  /**
    * Not used.
    */
  var EndpointStatus: js.UndefOr[__string] = js.undefined
  /**
    * The unique identifier that you assigned to the endpoint. The identifier should be a globally unique identifier (GUID) to ensure that it doesn't conflict with other endpoint identifiers that are associated with the application.
    */
  var Id: js.UndefOr[__string] = js.undefined
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
    * The unique identifier for the most recent request to update the endpoint.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with the endpoint.
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

