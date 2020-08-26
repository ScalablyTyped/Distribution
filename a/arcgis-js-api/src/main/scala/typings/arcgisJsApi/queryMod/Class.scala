package typings.arcgisJsApi.queryMod

import typings.arcgisJsApi.esri.Query
import typings.arcgisJsApi.esri.QueryProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/Query", JSImport.Namespace)
@js.native
/**
  * This class defines parameters for executing queries for features from a layer or layer view. Once a Query object's properties are defined, it can then be passed into an [executable function](?search=queryfeatures), which will return the features in a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html)
  */
class Class () extends Query {
  def this(properties: QueryProperties) = this()
}

