package typings.arcgisJsApi.directionsFeatureSetMod

import typings.arcgisJsApi.esri.DirectionsFeatureSet
import typings.arcgisJsApi.esri.DirectionsFeatureSetProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/DirectionsFeatureSet", JSImport.Namespace)
@js.native
/**
  * A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) that has properties specific to routing. The [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#features) property contains the turn by turn directions text and geometry of the route. The attributes for each feature provide information associated with the corresponding route segment. The following attributes are returned:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html)
  */
class Class () extends DirectionsFeatureSet {
  def this(properties: DirectionsFeatureSetProperties) = this()
}

