package typings
package arcgisDashJsDashApiLib.esriTasksSupportQueryMod

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
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Query {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.QueryProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

