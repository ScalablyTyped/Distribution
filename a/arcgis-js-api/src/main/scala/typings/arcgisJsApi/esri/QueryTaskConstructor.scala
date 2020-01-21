package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTaskConstructor
  extends /**
  * Executes different types of query operations on a layer. The most common method used in this class is [execute()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#execute), which executes the query as defined in the [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) object that is passed as a parameter to the function. `QueryTask.execute()` returns a Promise that resolves to a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html), which contains the features in the layer that satisfy the [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html)
  */
Instantiable0[QueryTask]
     with Instantiable1[/* properties */ QueryTaskProperties, QueryTask]

