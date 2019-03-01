package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudReturnFilterProperties extends PointCloudFilterProperties {
  /**
    * An array of return types used to filter points. Possible values for the return types are:
    *   * `firstOfMany`: the point was the first to be collected in a series of many returns
    *   * `last`: the last point in a series of many returns or a single point
    *   * `lastOfMany`: the last point in a series of many returns
    *   * `single`: all the points that were collected from laser pulses with a single return
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
    */
  var includedReturns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PointCloudReturnFilterProperties {
  @scala.inline
  def apply(field: java.lang.String = null, includedReturns: js.Array[java.lang.String] = null): PointCloudReturnFilterProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (includedReturns != null) __obj.updateDynamic("includedReturns")(includedReturns)
    __obj.asInstanceOf[PointCloudReturnFilterProperties]
  }
}

