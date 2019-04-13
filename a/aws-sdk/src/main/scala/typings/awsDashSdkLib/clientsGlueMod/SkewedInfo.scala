package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkewedInfo extends js.Object {
  /**
    * A list of names of columns that contain skewed values.
    */
  var SkewedColumnNames: js.UndefOr[NameStringList] = js.undefined
  /**
    * A mapping of skewed values to the columns that contain them.
    */
  var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap] = js.undefined
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var SkewedColumnValues: js.UndefOr[ColumnValueStringList] = js.undefined
}

object SkewedInfo {
  @scala.inline
  def apply(
    SkewedColumnNames: NameStringList = null,
    SkewedColumnValueLocationMaps: LocationMap = null,
    SkewedColumnValues: ColumnValueStringList = null
  ): SkewedInfo = {
    val __obj = js.Dynamic.literal()
    if (SkewedColumnNames != null) __obj.updateDynamic("SkewedColumnNames")(SkewedColumnNames)
    if (SkewedColumnValueLocationMaps != null) __obj.updateDynamic("SkewedColumnValueLocationMaps")(SkewedColumnValueLocationMaps)
    if (SkewedColumnValues != null) __obj.updateDynamic("SkewedColumnValues")(SkewedColumnValues)
    __obj.asInstanceOf[SkewedInfo]
  }
}

