package typings.arcgisDashJsDashApi.esriLayersPointCloudFiltersPointCloudValueFilterMod

import typings.arcgisDashJsDashApi.__esri.PointCloudValueFilter
import typings.arcgisDashJsDashApi.__esri.PointCloudValueFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/pointCloudFilters/PointCloudValueFilter", JSImport.Namespace)
@js.native
/**
  * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse. The different categories (for example building, high vegetation, ground) are defined using numeric integer codes in the LAS files. The full list of categories including the corresponding codes can be found in the LAS specification.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
  */
class Class () extends PointCloudValueFilter {
  def this(properties: PointCloudValueFilterProperties) = this()
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

