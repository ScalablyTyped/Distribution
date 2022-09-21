package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.exclude
import typings.arcgisJsApi.arcgisJsApiStrings.include
import typings.arcgisJsApi.arcgisJsApiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudValueFilter
  extends StObject
     with PointCloudFilter {
  
  /**
    * Whether points should be included or excluded from the filter.
    *
    * @default "exclude"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#mode)
    */
  var mode: include | exclude = js.native
  
  @JSName("type")
  val type_PointCloudValueFilter: value = js.native
  
  /**
    * An array of numeric values representing the classification codes that the filter should apply.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#values)
    */
  var values: js.Array[Double] = js.native
}
