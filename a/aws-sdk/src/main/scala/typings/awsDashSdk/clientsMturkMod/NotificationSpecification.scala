package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSpecification extends js.Object {
  /**
    *  The target for notification messages. The Destination’s format is determined by the specified Transport:    When Transport is Email, the Destination is your email address.   When Transport is SQS, the Destination is your queue URL.   When Transport is SNS, the Destination is the ARN of your topic.  
    */
  var Destination: String
  /**
    *  The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted | AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved | HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the SendTestEventNotification operation. 
    */
  var EventTypes: EventTypeList
  /**
    *  The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS. 
    */
  var Transport: NotificationTransport
  /**
    * The version of the Notification API to use. Valid value is 2006-05-05.
    */
  var Version: String
}

object NotificationSpecification {
  @scala.inline
  def apply(Destination: String, EventTypes: EventTypeList, Transport: NotificationTransport, Version: String): NotificationSpecification = {
    val __obj = js.Dynamic.literal(Destination = Destination, EventTypes = EventTypes, Transport = Transport.asInstanceOf[js.Any], Version = Version)
  
    __obj.asInstanceOf[NotificationSpecification]
  }
}

