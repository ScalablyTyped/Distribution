package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskUnsubscribeFromNotificationParams extends Object {
  /**
    * The email address to remove from the notification type's subscriber list. May contain tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#unsubscribeFromNotification)
    */
  var email: String
  /**
    * The unique id of the notification type from which the email address will be removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#unsubscribeFromNotification)
    */
  var notificationTypeId: Double
  /**
    * The username requesting the removal of email address to the notification subscriber's list.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#unsubscribeFromNotification)
    */
  var user: String
}

object NotificationTaskUnsubscribeFromNotificationParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    email: String,
    hasOwnProperty: PropertyKey => Boolean,
    notificationTypeId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): NotificationTaskUnsubscribeFromNotificationParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), notificationTypeId = notificationTypeId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationTaskUnsubscribeFromNotificationParams]
  }
}

