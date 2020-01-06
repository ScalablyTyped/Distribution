package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkewedInfo extends js.Object {
  /**
    * A list of names of columns that contain skewed values.
    */
  var SkewedColumnNames: js.UndefOr[NameStringList] = js.native
  /**
    * A mapping of skewed values to the columns that contain them.
    */
  var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap] = js.native
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var SkewedColumnValues: js.UndefOr[ColumnValueStringList] = js.native
}

object SkewedInfo {
  @scala.inline
  def apply(
    SkewedColumnNames: NameStringList = null,
    SkewedColumnValueLocationMaps: LocationMap = null,
    SkewedColumnValues: ColumnValueStringList = null
  ): SkewedInfo = {
    val __obj = js.Dynamic.literal()
    if (SkewedColumnNames != null) __obj.updateDynamic("SkewedColumnNames")(SkewedColumnNames.asInstanceOf[js.Any])
    if (SkewedColumnValueLocationMaps != null) __obj.updateDynamic("SkewedColumnValueLocationMaps")(SkewedColumnValueLocationMaps.asInstanceOf[js.Any])
    if (SkewedColumnValues != null) __obj.updateDynamic("SkewedColumnValues")(SkewedColumnValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkewedInfo]
  }
}

