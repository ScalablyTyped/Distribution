package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOptionGroupsMessage extends js.Object {
  /**
    * Filters the list of option groups to only include groups associated with a specific database engine.
    */
  var EngineName: js.UndefOr[String] = js.undefined
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * Filters the list of option groups to only include groups associated with a specific database engine version. If specified, then EngineName must also be specified.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.undefined
  /**
    *  An optional pagination token provided by a previous DescribeOptionGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The name of the option group to describe. Can't be supplied together with EngineName or MajorEngineVersion.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
}

object DescribeOptionGroupsMessage {
  @scala.inline
  def apply(
    EngineName: String = null,
    Filters: FilterList = null,
    MajorEngineVersion: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    OptionGroupName: String = null
  ): DescribeOptionGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MajorEngineVersion != null) __obj.updateDynamic("MajorEngineVersion")(MajorEngineVersion)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    __obj.asInstanceOf[DescribeOptionGroupsMessage]
  }
}

