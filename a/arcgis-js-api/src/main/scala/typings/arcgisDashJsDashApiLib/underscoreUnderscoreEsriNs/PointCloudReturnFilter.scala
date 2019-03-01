package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var includedReturns: js.Array[java.lang.String] = js.native
}

