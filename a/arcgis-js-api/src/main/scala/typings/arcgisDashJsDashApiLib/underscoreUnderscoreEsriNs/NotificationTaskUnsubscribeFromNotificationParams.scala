package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskUnsubscribeFromNotificationParams
  extends stdLib.Object {
  /**
    * The email address to remove from the notification type's subscriber list. May contain tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#unsubscribeFromNotification)
    */
  var email: java.lang.String
  /**
    * The unique id of the notification type from which the email address will be removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#unsubscribeFromNotification)
    */
  var notificationTypeId: scala.Double
  /**
    * The username requesting the removal of email address to the notification subscriber's list.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#unsubscribeFromNotification)
    */
  var user: java.lang.String
}

object NotificationTaskUnsubscribeFromNotificationParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    email: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    notificationTypeId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): NotificationTaskUnsubscribeFromNotificationParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("notificationTypeId")(notificationTypeId)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[NotificationTaskUnsubscribeFromNotificationParams]
  }
}

