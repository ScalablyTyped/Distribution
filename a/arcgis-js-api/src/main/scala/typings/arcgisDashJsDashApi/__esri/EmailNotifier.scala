package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailNotifier extends Object {
  /**
    * Indicates whether the job's file attachment will be attached to the email.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var attachJobAttachments: Boolean
  /**
    * The message content sent as part of the email.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var message: String
  /**
    * The name of the notifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var name: String
  /**
    * The sender's (from) email address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var senderEmail: String
  /**
    * The sender's (from) name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var senderName: String
  /**
    * The subject of the email.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var subject: String
  /**
    * The array of subscribers who will get the email.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var subscribers: js.Array[String]
  /**
    * The type of notifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier)
    */
  var `type`: String
}

object EmailNotifier {
  @scala.inline
  def apply(
    attachJobAttachments: Boolean,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    message: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    senderEmail: String,
    senderName: String,
    subject: String,
    subscribers: js.Array[String],
    `type`: String
  ): EmailNotifier = {
    val __obj = js.Dynamic.literal(attachJobAttachments = attachJobAttachments, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), message = message, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), senderEmail = senderEmail, senderName = senderName, subject = subject, subscribers = subscribers)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EmailNotifier]
  }
}

