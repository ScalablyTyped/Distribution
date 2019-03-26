package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudFilter
  extends Accessor
     with JSONSupport {
  /**
    * The field used for applying the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#field)
    */
  var field: java.lang.String = js.native
  /**
    * The type of filter.  **Possible values**: value | bitfield | return
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#type)
    */
  val `type`: java.lang.String = js.native
}

@JSGlobal("__esri.PointCloudFilter")
@js.native
/**
  * Point cloud filters are used to hide points that do not satisfy the filter criteria.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html)
  */
class PointCloudFilterCls () extends PointCloudFilter {
  def this(properties: PointCloudFilterProperties) = this()
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

