package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSetEvaluator extends Object {
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
  var name: String
  /**
    * The type of the dataset evaluator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DataSetEvaluator)
    */
  var `type`: String
}

object DataSetEvaluator {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSetConfigurations: js.Array[DatasetConfiguration],
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): DataSetEvaluator = {
    val __obj = js.Dynamic.literal(constructor = constructor, dataSetConfigurations = dataSetConfigurations, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSetEvaluator]
  }
}

