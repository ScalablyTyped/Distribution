package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`return`
import typings.arcgisJsApi.arcgisJsApiStrings.firstOfMany
import typings.arcgisJsApi.arcgisJsApiStrings.last
import typings.arcgisJsApi.arcgisJsApiStrings.lastOfMany
import typings.arcgisJsApi.arcgisJsApiStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudReturnFilter extends PointCloudFilter {
  /**
    * An array of return types used to filter points. Possible values for the return types are:
    *
    * Value | Description
    * ------|------------
    * `firstOfMany` | The point was the first to be collected in a series of many returns.
    * `last` | The last point in a series of many returns or a single point.
    * `lastOfMany` | The last point in a series of many returns.
    * `single` | All the points that were collected from laser pulses with a single return.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
    */
  var includedReturns: js.Array[firstOfMany | last | lastOfMany | single] = js.native
  @JSName("type")
  val type_PointCloudReturnFilter: `return` = js.native
}

@JSGlobal("__esri.PointCloudReturnFilter")
@js.native
object PointCloudReturnFilter extends TopLevel[PointCloudReturnFilterConstructor]

