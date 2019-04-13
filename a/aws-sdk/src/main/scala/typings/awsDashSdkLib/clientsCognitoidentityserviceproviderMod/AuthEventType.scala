package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthEventType extends js.Object {
  /**
    * The challenge responses.
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponseListType] = js.undefined
  /**
    * The creation date
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The user context data captured at the time of an event request. It provides additional information about the client from which event the request is received.
    */
  var EventContextData: js.UndefOr[EventContextDataType] = js.undefined
  /**
    * A flag specifying the user feedback captured at the time of an event request is good or bad. 
    */
  var EventFeedback: js.UndefOr[EventFeedbackType] = js.undefined
  /**
    * The event ID.
    */
  var EventId: js.UndefOr[StringType] = js.undefined
  /**
    * The event response.
    */
  var EventResponse: js.UndefOr[EventResponseType] = js.undefined
  /**
    * The event risk.
    */
  var EventRisk: js.UndefOr[EventRiskType] = js.undefined
  /**
    * The event type.
    */
  var EventType: js.UndefOr[EventType] = js.undefined
}

object AuthEventType {
  @scala.inline
  def apply(
    ChallengeResponses: ChallengeResponseListType = null,
    CreationDate: DateType = null,
    EventContextData: EventContextDataType = null,
    EventFeedback: EventFeedbackType = null,
    EventId: StringType = null,
    EventResponse: EventResponseType = null,
    EventRisk: EventRiskType = null,
    EventType: EventType = null
  ): AuthEventType = {
    val __obj = js.Dynamic.literal()
    if (ChallengeResponses != null) __obj.updateDynamic("ChallengeResponses")(ChallengeResponses)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (EventContextData != null) __obj.updateDynamic("EventContextData")(EventContextData)
    if (EventFeedback != null) __obj.updateDynamic("EventFeedback")(EventFeedback)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    if (EventResponse != null) __obj.updateDynamic("EventResponse")(EventResponse.asInstanceOf[js.Any])
    if (EventRisk != null) __obj.updateDynamic("EventRisk")(EventRisk)
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthEventType]
  }
}

