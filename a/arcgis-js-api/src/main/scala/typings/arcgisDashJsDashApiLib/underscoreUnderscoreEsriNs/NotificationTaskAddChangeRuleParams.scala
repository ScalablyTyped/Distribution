package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskAddChangeRuleParams
  extends stdLib.Object {
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
  var user: java.lang.String
}

object NotificationTaskAddChangeRuleParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    rule: ChangeRule,
    user: java.lang.String
  ): NotificationTaskAddChangeRuleParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, rule = rule, user = user)
  
    __obj.asInstanceOf[NotificationTaskAddChangeRuleParams]
  }
}

