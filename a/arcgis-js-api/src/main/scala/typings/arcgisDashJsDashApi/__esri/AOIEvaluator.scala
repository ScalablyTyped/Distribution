package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AOIEvaluator extends Object {
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
  var inverse: Boolean
  /**
    * The name of the AOI evaluator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var name: String
  /**
    * The spatial relationship to be applied for evaluation of the rule.  **Possible Values:** intersects | contains | crosses | envelope-intersects | index-intersects | overlaps | touches | within | relation
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var relation: String
  /**
    * The type of the AOI evaluator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var `type`: String
  /**
    * Indicates whether job AOI should be used as the extent or not for the evaluation of the rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#AOIEvaluator)
    */
  var useJobAOI: Boolean
}

object AOIEvaluator {
  @scala.inline
  def apply(
    aoi: Polygon,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    inverse: Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    relation: String,
    `type`: String,
    useJobAOI: Boolean
  ): AOIEvaluator = {
    val __obj = js.Dynamic.literal(aoi = aoi.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), inverse = inverse.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relation = relation.asInstanceOf[js.Any], useJobAOI = useJobAOI.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AOIEvaluator]
  }
}

