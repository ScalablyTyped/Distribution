package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBEngineVersion extends js.Object {
  /**
    * The description of the database engine.
    */
  var DBEngineDescription: js.UndefOr[String] = js.undefined
  /**
    * The description of the database engine version.
    */
  var DBEngineVersionDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the DB parameter group family for the database engine.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * The name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The version number of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The types of logs that the database engine has available for export to Amazon CloudWatch Logs.
    */
  var ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of engine versions that this database engine version can be upgraded to.
    */
  var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined
}

object DBEngineVersion {
  @scala.inline
  def apply(
    DBEngineDescription: String = null,
    DBEngineVersionDescription: String = null,
    DBParameterGroupFamily: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    ExportableLogTypes: LogTypeList = null,
    SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined,
    ValidUpgradeTarget: ValidUpgradeTargetList = null
  ): DBEngineVersion = {
    val __obj = js.Dynamic.literal()
    if (DBEngineDescription != null) __obj.updateDynamic("DBEngineDescription")(DBEngineDescription)
    if (DBEngineVersionDescription != null) __obj.updateDynamic("DBEngineVersionDescription")(DBEngineVersionDescription)
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (ExportableLogTypes != null) __obj.updateDynamic("ExportableLogTypes")(ExportableLogTypes)
    if (!js.isUndefined(SupportsLogExportsToCloudwatchLogs)) __obj.updateDynamic("SupportsLogExportsToCloudwatchLogs")(SupportsLogExportsToCloudwatchLogs)
    if (ValidUpgradeTarget != null) __obj.updateDynamic("ValidUpgradeTarget")(ValidUpgradeTarget)
    __obj.asInstanceOf[DBEngineVersion]
  }
}

