package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeRule
  extends stdLib.Object {
  /**
    * The description of the change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule)
    */
  var description: java.lang.String
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
  var id: scala.Double
  /**
    * The name of the change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule)
    */
  var name: java.lang.String
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
  var summarize: scala.Boolean
}

object ChangeRule {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: java.lang.String,
    evaluators: js.Array[_],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    notifier: js.Any,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    summarize: scala.Boolean
  ): ChangeRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("evaluators")(evaluators)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("notifier")(notifier)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("summarize")(summarize)
    __obj.asInstanceOf[ChangeRule]
  }
}

