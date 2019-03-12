package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskNotifySessionParams
  extends stdLib.Object {
  /**
    * Indicates whether to delete the session matches after sending any notifications. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#notifySession)
    */
  var deleteAfter: scala.Boolean
  /**
    * The unique id of the spatial notification session.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#notifySession)
    */
  var sessionid: java.lang.String
  /**
    * The username requesting the sending of notification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#notifySession)
    */
  var user: java.lang.String
}

object NotificationTaskNotifySessionParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    deleteAfter: scala.Boolean,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    sessionid: java.lang.String,
    user: java.lang.String
  ): NotificationTaskNotifySessionParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, deleteAfter = deleteAfter, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sessionid = sessionid, user = user)
  
    __obj.asInstanceOf[NotificationTaskNotifySessionParams]
  }
}

