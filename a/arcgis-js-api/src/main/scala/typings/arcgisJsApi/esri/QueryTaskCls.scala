package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.QueryTask")
@js.native
/**
  * Executes different types of query operations on a layer. The most common method used in this class is [execute()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#execute), which executes the query as defined in the [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) object that is passed as a parameter to the function. `QueryTask.execute()` returns a Promise that resolves to a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html), which contains the features in the layer that satisfy the [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html)
  */
class QueryTaskCls () extends QueryTask {
  def this(properties: QueryTaskProperties) = this()
}

