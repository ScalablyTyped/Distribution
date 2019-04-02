package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudValueFilter extends PointCloudFilter {
  /**
    * Whether points should be included or excluded from the filter.  **Possible values:** include | exclude
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#mode)
    *
    * @default "exclude"
    */
  var mode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.include | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.exclude = js.native
  /**
    * For PointCloudValueFilter the type is always `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#type)
    */
  @JSName("type")
  val type_PointCloudValueFilter: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.value = js.native
  /**
    * An array of numeric values representing the classification codes that the filter should apply.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#values)
    */
  var values: js.Array[scala.Double] = js.native
}

@JSGlobal("__esri.PointCloudValueFilter")
@js.native
/**
  * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse. The different categories (for example building, high vegetation, ground) are defined using numeric integer codes in the LAS files. The full list of categories including the corresponding codes can be found in the LAS specification.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
  */
class PointCloudValueFilterCls () extends PointCloudValueFilter {
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

