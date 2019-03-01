package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AOIEvaluator
  extends stdLib.Object {
  /**
    * The area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var aoi: Polygon
  /**
    * Indicates whether to inverse the spatial relationship or not. For example, if the spatial relationship is inversed for operator Within, then features that are not within will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var inverse: scala.Boolean
  /**
    * The name of the AOI evaluator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var name: java.lang.String
  /**
    * The spatial relationship to be applied for evaluation of the rule.  **Possible Values:** intersects | contains | crosses | envelope-intersects | index-intersects | overlaps | touches | within | relation
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var relation: java.lang.String
  /**
    * The type of the AOI evaluator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var `type`: java.lang.String
  /**
    * Indicates whether job AOI should be used as the extent or not for the evaluation of the rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var useJobAOI: scala.Boolean
}

object AOIEvaluator {
  @scala.inline
  def apply(
    aoi: Polygon,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    inverse: scala.Boolean,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    relation: java.lang.String,
    `type`: java.lang.String,
    useJobAOI: scala.Boolean
  ): AOIEvaluator = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("aoi")(aoi)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("inverse")(inverse)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("relation")(relation)
    __obj.updateDynamic("useJobAOI")(useJobAOI)
    __obj.asInstanceOf[AOIEvaluator]
  }
}

