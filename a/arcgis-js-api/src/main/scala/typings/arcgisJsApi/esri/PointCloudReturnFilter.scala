package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`return`
import typings.arcgisJsApi.arcgisJsApiStrings.firstOfMany
import typings.arcgisJsApi.arcgisJsApiStrings.last
import typings.arcgisJsApi.arcgisJsApiStrings.lastOfMany
import typings.arcgisJsApi.arcgisJsApiStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudReturnFilter
  extends StObject
     with PointCloudFilter {
  
  /**
    * An array of return types used to filter points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
    */
  var includedReturns: js.Array[firstOfMany | last | lastOfMany | single] = js.native
  
  @JSName("type")
  val type_PointCloudReturnFilter: `return` = js.native
}
