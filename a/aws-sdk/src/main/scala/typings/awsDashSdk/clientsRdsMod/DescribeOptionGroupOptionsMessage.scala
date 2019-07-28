package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOptionGroupOptionsMessage extends js.Object {
  /**
    * A required parameter. Options available for the given engine name are described.
    */
  var EngineName: String
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * If specified, filters the results to include only options for the specified major engine version.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.undefined
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeOptionGroupOptionsMessage {
  @scala.inline
  def apply(
    EngineName: String,
    Filters: FilterList = null,
    MajorEngineVersion: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  ): DescribeOptionGroupOptionsMessage = {
    val __obj = js.Dynamic.literal(EngineName = EngineName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MajorEngineVersion != null) __obj.updateDynamic("MajorEngineVersion")(MajorEngineVersion)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    __obj.asInstanceOf[DescribeOptionGroupOptionsMessage]
  }
}

