package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBEngineVersionsMessage extends js.Object {
  /**
    * The name of a specific DB parameter group family to return details for. Constraints:   If supplied, must match an existing DBParameterGroupFamily.  
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether only the default version of the specified engine or engine and major version combination is returned.
    */
  var DefaultOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The database engine to return.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The database engine version to return. Example: 5.1.49 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * A value that indicates whether to include engine versions that aren't available in the list. The default is to list only available engine versions.
    */
  var IncludeAll: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that indicates whether to list the supported character sets for each engine version. If this parameter is enabled and the requested engine supports the CharacterSetName parameter for CreateDBInstance, the response includes a list of supported character sets for each engine version. 
    */
  var ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that indicates whether to list the supported time zones for each engine version. If this parameter is enabled and the requested engine supports the TimeZone parameter for CreateDBInstance, the response includes a list of supported time zones for each engine version. 
    */
  var ListSupportedTimezones: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so that the following results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeDBEngineVersionsMessage {
  @scala.inline
  def apply(
    DBParameterGroupFamily: String = null,
    DefaultOnly: js.UndefOr[scala.Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    Filters: FilterList = null,
    IncludeAll: js.UndefOr[scala.Boolean] = js.undefined,
    ListSupportedCharacterSets: js.UndefOr[scala.Boolean] = js.undefined,
    ListSupportedTimezones: js.UndefOr[scala.Boolean] = js.undefined,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeDBEngineVersionsMessage = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily)
    if (!js.isUndefined(DefaultOnly)) __obj.updateDynamic("DefaultOnly")(DefaultOnly)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(IncludeAll)) __obj.updateDynamic("IncludeAll")(IncludeAll)
    if (!js.isUndefined(ListSupportedCharacterSets)) __obj.updateDynamic("ListSupportedCharacterSets")(ListSupportedCharacterSets)
    if (!js.isUndefined(ListSupportedTimezones)) __obj.updateDynamic("ListSupportedTimezones")(ListSupportedTimezones)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBEngineVersionsMessage]
  }
}

