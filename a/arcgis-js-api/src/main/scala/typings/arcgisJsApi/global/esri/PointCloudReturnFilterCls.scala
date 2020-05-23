package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PointCloudReturnFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.PointCloudReturnFilter")
@js.native
/**
  * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter. The return number is stored within each point in the `RETURNS` field. For example, the first return is associated with the highest point in the landscape. In some cases the laser pulse returns only one point representing the ground.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
  */
class PointCloudReturnFilterCls ()
  extends typings.arcgisJsApi.esri.PointCloudReturnFilter {
  def this(properties: PointCloudReturnFilterProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

