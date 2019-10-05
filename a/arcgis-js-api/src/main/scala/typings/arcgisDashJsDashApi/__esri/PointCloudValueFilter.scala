package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.exclude
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.include
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.value
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
  var mode: include | exclude = js.native
  /**
    * For PointCloudValueFilter the type is always `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#type)
    */
  @JSName("type")
  val type_PointCloudValueFilter: value = js.native
  /**
    * An array of numeric values representing the classification codes that the filter should apply.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#values)
    */
  var values: js.Array[Double] = js.native
}

@JSGlobal("__esri.PointCloudValueFilter")
@js.native
object PointCloudValueFilter extends TopLevel[PointCloudValueFilterConstructor]

