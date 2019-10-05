package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`return`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.firstOfMany
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.last
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.lastOfMany
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudReturnFilter extends PointCloudFilter {
  /**
    * An array of return types used to filter points. Possible values for the return types are:
    *   * `firstOfMany`: the point was the first to be collected in a series of many returns
    *   * `last`: the last point in a series of many returns or a single point
    *   * `lastOfMany`: the last point in a series of many returns
    *   * `single`: all the points that were collected from laser pulses with a single return
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
    */
  var includedReturns: js.Array[firstOfMany | last | lastOfMany | single] = js.native
  /**
    * For PointCloudReturnFilter the type is always `return`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#type)
    */
  @JSName("type")
  val type_PointCloudReturnFilter: `return` = js.native
}

@JSGlobal("__esri.PointCloudReturnFilter")
@js.native
object PointCloudReturnFilter extends TopLevel[PointCloudReturnFilterConstructor]

