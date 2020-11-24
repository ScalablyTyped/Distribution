package typings.arcgisJsApi.pointCloudReturnFilterMod

import typings.arcgisJsApi.esri.PointCloudReturnFilter
import typings.arcgisJsApi.esri.PointCloudReturnFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/pointCloudFilters/PointCloudReturnFilter", JSImport.Namespace)
@js.native
/**
  * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
  */
class Class () extends PointCloudReturnFilter {
  def this(properties: PointCloudReturnFilterProperties) = this()
}
