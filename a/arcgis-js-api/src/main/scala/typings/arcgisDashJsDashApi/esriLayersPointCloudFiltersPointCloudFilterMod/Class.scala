package typings.arcgisDashJsDashApi.esriLayersPointCloudFiltersPointCloudFilterMod

import typings.arcgisDashJsDashApi.__esri.PointCloudFilter
import typings.arcgisDashJsDashApi.__esri.PointCloudFilterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/pointCloudFilters/PointCloudFilter", JSImport.Namespace)
@js.native
/**
  * Point cloud filters are used to hide points that do not satisfy the filter criteria.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html)
  */
class Class () extends PointCloudFilter {
  def this(properties: PointCloudFilterProperties) = this()
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

