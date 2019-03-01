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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    ruleId: java.lang.String,
    user: java.lang.String
  ): NotificationTaskDeleteChangeRuleParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("ruleId")(ruleId)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[NotificationTaskDeleteChangeRuleParams]
  }
}

