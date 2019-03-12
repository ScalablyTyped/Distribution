package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskDeleteChangeRuleParams
  extends stdLib.Object {
  /**
    * The unique id of the rule to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#deleteChangeRule)
    */
  var ruleId: java.lang.String
  /**
    * The username requesting the deletion of the rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#deleteChangeRule)
    */
  var user: java.lang.String
}

object NotificationTaskDeleteChangeRuleParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    ruleId: java.lang.String,
    user: java.lang.String
  ): NotificationTaskDeleteChangeRuleParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ruleId = ruleId, user = user)
  
    __obj.asInstanceOf[NotificationTaskDeleteChangeRuleParams]
  }
}

