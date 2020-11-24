package typings.arcgisJsApi.pointCloudValueFilterMod

import typings.arcgisJsApi.esri.PointCloudValueFilter
import typings.arcgisJsApi.esri.PointCloudValueFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/pointCloudFilters/PointCloudValueFilter", JSImport.Namespace)
@js.native
/**
  * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
  */
class Class () extends PointCloudValueFilter {
  def this(properties: PointCloudValueFilterProperties) = this()
}
