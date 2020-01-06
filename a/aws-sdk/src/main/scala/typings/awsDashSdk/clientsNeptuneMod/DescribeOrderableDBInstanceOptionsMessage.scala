package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrderableDBInstanceOptionsMessage extends js.Object {
  /**
    * The DB instance class filter value. Specify this parameter to show only the available offerings matching the specified DB instance class.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The name of the engine to retrieve DB instance options for.
    */
  var Engine: String = js.native
  /**
    * The engine version filter value. Specify this parameter to show only the available offerings matching the specified engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The license model filter value. Specify this parameter to show only the available offerings matching the specified license model.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The VPC filter value. Specify this parameter to show only the available VPC or non-VPC offerings.
    */
  var Vpc: js.UndefOr[BooleanOptional] = js.native
}

object DescribeOrderableDBInstanceOptionsMessage {
  @scala.inline
  def apply(
    Engine: String,
    DBInstanceClass: String = null,
    EngineVersion: String = null,
    Filters: FilterList = null,
    LicenseModel: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    Vpc: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeOrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal(Engine = Engine.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (!js.isUndefined(Vpc)) __obj.updateDynamic("Vpc")(Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
  }
}

