package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFunctionConfiguration extends js.Object {
  /**
    * 
    */
  var CloudFunction: js.UndefOr[CloudFunction] = js.undefined
  var Event: js.UndefOr[Event] = js.undefined
  /**
    * 
    */
  var Events: js.UndefOr[EventList] = js.undefined
  var Id: js.UndefOr[NotificationId] = js.undefined
  /**
    * 
    */
  var InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.undefined
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
    if (CloudFunction != null) __obj.updateDynamic("CloudFunction")(CloudFunction)
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InvocationRole != null) __obj.updateDynamic("InvocationRole")(InvocationRole)
    __obj.asInstanceOf[CloudFunctionConfiguration]
  }
}

