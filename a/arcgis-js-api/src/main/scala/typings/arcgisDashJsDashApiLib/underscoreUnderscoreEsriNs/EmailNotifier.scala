package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailNotifier
  extends stdLib.Object {
  /**
    * Indicates whether the job's file attachment will be attached to the email.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var attachJobAttachments: scala.Boolean
  /**
    * The message content sent as part of the email.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var message: java.lang.String
  /**
    * The name of the notifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var name: java.lang.String
  /**
    * The sender's (from) email address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var senderEmail: java.lang.String
  /**
    * The sender's (from) name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var senderName: java.lang.String
  /**
    * The subject of the email.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var subject: java.lang.String
  /**
    * The array of subscribers who will get the email.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var subscribers: js.Array[java.lang.String]
  /**
    * The type of notifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var `type`: java.lang.String
}

object EmailNotifier {
  @scala.inline
  def apply(
    attachJobAttachments: scala.Boolean,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    message: java.lang.String,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    senderEmail: java.lang.String,
    senderName: java.lang.String,
    subject: java.lang.String,
    subscribers: js.Array[java.lang.String],
    `type`: java.lang.String
  ): EmailNotifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attachJobAttachments")(attachJobAttachments)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("senderEmail")(senderEmail)
    __obj.updateDynamic("senderName")(senderName)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("subscribers")(subscribers)
    __obj.asInstanceOf[EmailNotifier]
  }
}

