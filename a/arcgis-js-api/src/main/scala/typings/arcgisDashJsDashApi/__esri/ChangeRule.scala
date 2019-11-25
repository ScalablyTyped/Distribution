package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeRule extends Object {
  /**
    * The description of the change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule)
    */
  var description: String
  /**
    * An array of [AOI](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator) and [Dataset](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DataSetEvaluator) evaluators.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule)
    */
  var evaluators: js.Array[_]
  /**
    * The unique id of the change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule)
    */
  var id: Double
  /**
    * The name of the change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule)
    */
  var name: String
  /**
    * The type of notifier, the default is [email notifier](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#EmailNotifier). This can be extended to use your own notifiers like SMS, instant messaging.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule)
    */
  var notifier: js.Any
  /**
    * Indicates whether to summarize email contents or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule)
    */
  var summarize: Boolean
}

object ChangeRule {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    evaluators: js.Array[_],
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    name: String,
    notifier: js.Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    summarize: Boolean
  ): ChangeRule = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], evaluators = evaluators.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifier = notifier.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), summarize = summarize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeRule]
  }
}

