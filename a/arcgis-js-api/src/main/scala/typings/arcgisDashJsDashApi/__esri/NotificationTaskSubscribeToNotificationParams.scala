package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskSubscribeToNotificationParams extends Object {
  /**
    * The email address to add to the notification type's subscriber list. May contain tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#subscribeToNotification)
    */
  var email: String
  /**
    * The unique id of the notification type to which the email address will be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#subscribeToNotification)
    */
  var notificationTypeId: Double
  /**
    * The username requesting the addition of email address to the notification subscriber's list.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#subscribeToNotification)
    */
  var user: String
}

object NotificationTaskSubscribeToNotificationParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    email: String,
    hasOwnProperty: PropertyKey => Boolean,
    notificationTypeId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): NotificationTaskSubscribeToNotificationParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), notificationTypeId = notificationTypeId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationTaskSubscribeToNotificationParams]
  }
}

