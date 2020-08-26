package typings.arcgisJsApi.pointCloudReturnFilterMod

import typings.arcgisJsApi.esri.PointCloudReturnFilter
import typings.arcgisJsApi.esri.PointCloudReturnFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/pointCloudFilters/PointCloudReturnFilter", JSImport.Namespace)
@js.native
/**
  * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter. The return number is stored within each point in the `RETURNS` field. For example, the first return is associated with the highest point in the landscape. In some cases the laser pulse returns only one point representing the ground.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
  */
class Class () extends PointCloudReturnFilter {
  def this(properties: PointCloudReturnFilterProperties) = this()
}

