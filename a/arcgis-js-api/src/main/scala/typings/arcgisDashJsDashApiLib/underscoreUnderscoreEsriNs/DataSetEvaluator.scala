package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSetEvaluator
  extends stdLib.Object {
  /**
    * The array of [DatasetConfigurations](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration) representing the dataset to which the rule applies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DataSetEvaluator)
    */
  var dataSetConfigurations: js.Array[DatasetConfiguration]
  /**
    * The name of the dataset evaluator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DataSetEvaluator)
    */
  var name: java.lang.String
  /**
    * The type of the dataset evaluator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DataSetEvaluator)
    */
  var `type`: java.lang.String
}

object DataSetEvaluator {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSetConfigurations: js.Array[DatasetConfiguration],
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String
  ): DataSetEvaluator = {
    val __obj = js.Dynamic.literal(constructor = constructor, dataSetConfigurations = dataSetConfigurations, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSetEvaluator]
  }
}

