package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PointCloudValueFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.PointCloudValueFilter")
@js.native
/**
  * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse. The different categories (for example building, high vegetation, ground) are defined using numeric integer codes in the LAS files. The full list of categories including the corresponding codes can be found in the LAS specification.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
  */
class PointCloudValueFilterCls ()
  extends typings.arcgisJsApi.esri.PointCloudValueFilter {
  def this(properties: PointCloudValueFilterProperties) = this()
}

