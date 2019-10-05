package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskAddChangeRuleParams extends Object {
  /**
    * The [change rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule) to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#addChangeRule)
    */
  var rule: ChangeRule
  /**
    * The username requesting the addition of the rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#addChangeRule)
    */
  var user: String
}

object NotificationTaskAddChangeRuleParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    rule: ChangeRule,
    user: String
  ): NotificationTaskAddChangeRuleParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rule = rule, user = user)
  
    __obj.asInstanceOf[NotificationTaskAddChangeRuleParams]
  }
}

