package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PointCloudReturnFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PointCloudReturnFilter")
@js.native
/**
  * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
  */
class PointCloudReturnFilterCls ()
  extends typings.arcgisJsApi.esri.PointCloudReturnFilter {
  def this(properties: PointCloudReturnFilterProperties) = this()
}
