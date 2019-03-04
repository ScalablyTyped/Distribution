package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskSendNotificationParams
  extends stdLib.Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#sendNotification)
    */
  var jobId: scala.Double
  /**
    * The name of the [notification type](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#NotificationType) to be sent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#sendNotification)
    */
  var notificationType: java.lang.String
  /**
    * The username requesting to send the notification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#sendNotification)
    */
  var user: java.lang.String
}

object NotificationTaskSendNotificationParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    notificationType: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): NotificationTaskSendNotificationParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, jobId = jobId, notificationType = notificationType, propertyIsEnumerable = propertyIsEnumerable, user = user)
  
    __obj.asInstanceOf[NotificationTaskSendNotificationParams]
  }
}

