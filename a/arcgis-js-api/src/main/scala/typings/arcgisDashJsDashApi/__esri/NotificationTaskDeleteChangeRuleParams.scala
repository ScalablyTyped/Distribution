package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskDeleteChangeRuleParams extends Object {
  /**
    * The unique id of the rule to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#deleteChangeRule)
    */
  var ruleId: String
  /**
    * The username requesting the deletion of the rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#deleteChangeRule)
    */
  var user: String
}

object NotificationTaskDeleteChangeRuleParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    ruleId: String,
    user: String
  ): NotificationTaskDeleteChangeRuleParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ruleId = ruleId, user = user)
  
    __obj.asInstanceOf[NotificationTaskDeleteChangeRuleParams]
  }
}

