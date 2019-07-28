package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrderableDBInstanceOptionsMessage extends js.Object {
  /**
    * The DB instance class filter value. Specify this parameter to show only the available offerings that match the specified DB instance class.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The name of the engine to retrieve DB instance options for.
    */
  var Engine: String
  /**
    * The engine version filter value. Specify this parameter to show only the available offerings that match the specified engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The license model filter value. Specify this parameter to show only the available offerings that match the specified license model.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or non-VPC offerings.
    */
  var Vpc: js.UndefOr[BooleanOptional] = js.undefined
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
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    Vpc: js.UndefOr[BooleanOptional] = js.undefined
  ): DescribeOrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal(Engine = Engine)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (!js.isUndefined(Vpc)) __obj.updateDynamic("Vpc")(Vpc)
    __obj.asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
  }
}

