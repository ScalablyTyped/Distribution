package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFunctionConfiguration extends js.Object {
  /**
    * Lambda cloud function ARN that Amazon S3 can invoke when it detects events of the specified type.
    */
  var CloudFunction: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CloudFunction] = js.native
  var Event: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Event] = js.native
  /**
    * Bucket events for which to send notifications.
    */
  var Events: js.UndefOr[EventList] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The role supporting the invocation of the Lambda function
    */
  var InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.native
}

object CloudFunctionConfiguration {
  @scala.inline
  def apply(
    CloudFunction: CloudFunction = null,
    Event: Event = null,
    Events: EventList = null,
    Id: NotificationId = null,
    InvocationRole: CloudFunctionInvocationRole = null
  ): CloudFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CloudFunction != null) __obj.updateDynamic("CloudFunction")(CloudFunction.asInstanceOf[js.Any])
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InvocationRole != null) __obj.updateDynamic("InvocationRole")(InvocationRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFunctionConfiguration]
  }
}

