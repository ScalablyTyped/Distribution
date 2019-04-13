package typings
package awsDashSdkLib.clientsRdsMod

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
    *  The default character set for new instances of this engine version, if the CharacterSetName parameter of the CreateDBInstance API is not specified. 
    */
  var DefaultCharacterSet: js.UndefOr[CharacterSet] = js.undefined
  /**
    * The name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The version number of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The types of logs that the database engine has available for export to CloudWatch Logs.
    */
  var ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined
  /**
    *  A list of the character sets supported by this engine for the CharacterSetName parameter of the CreateDBInstance action. 
    */
  var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined
  /**
    * A list of the supported DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
  /**
    *  A list of features supported by the DB engine. Supported feature names include the following.    s3Import  
    */
  var SupportedFeatureNames: js.UndefOr[FeatureNameList] = js.undefined
  /**
    * A list of the time zones supported by this engine for the Timezone parameter of the CreateDBInstance action. 
    */
  var SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.undefined
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the database engine version supports read replicas.
    */
  var SupportsReadReplica: js.UndefOr[Boolean] = js.undefined
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
    DefaultCharacterSet: CharacterSet = null,
    Engine: String = null,
    EngineVersion: String = null,
    ExportableLogTypes: LogTypeList = null,
    SupportedCharacterSets: SupportedCharacterSetsList = null,
    SupportedEngineModes: EngineModeList = null,
    SupportedFeatureNames: FeatureNameList = null,
    SupportedTimezones: SupportedTimezonesList = null,
    SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined,
    SupportsReadReplica: js.UndefOr[Boolean] = js.undefined,
    ValidUpgradeTarget: ValidUpgradeTargetList = null
  ): DBEngineVersion = {
    val __obj = js.Dynamic.literal()
    if (DBEngineDescription != null) __obj.updateDynamic("DBEngineDescription")(DBEngineDescription)
    if (DBEngineVersionDescription != null) __obj.updateDynamic("DBEngineVersionDescription")(DBEngineVersionDescription)
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily)
    if (DefaultCharacterSet != null) __obj.updateDynamic("DefaultCharacterSet")(DefaultCharacterSet)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (ExportableLogTypes != null) __obj.updateDynamic("ExportableLogTypes")(ExportableLogTypes)
    if (SupportedCharacterSets != null) __obj.updateDynamic("SupportedCharacterSets")(SupportedCharacterSets)
    if (SupportedEngineModes != null) __obj.updateDynamic("SupportedEngineModes")(SupportedEngineModes)
    if (SupportedFeatureNames != null) __obj.updateDynamic("SupportedFeatureNames")(SupportedFeatureNames)
    if (SupportedTimezones != null) __obj.updateDynamic("SupportedTimezones")(SupportedTimezones)
    if (!js.isUndefined(SupportsLogExportsToCloudwatchLogs)) __obj.updateDynamic("SupportsLogExportsToCloudwatchLogs")(SupportsLogExportsToCloudwatchLogs)
    if (!js.isUndefined(SupportsReadReplica)) __obj.updateDynamic("SupportsReadReplica")(SupportsReadReplica)
    if (ValidUpgradeTarget != null) __obj.updateDynamic("ValidUpgradeTarget")(ValidUpgradeTarget)
    __obj.asInstanceOf[DBEngineVersion]
  }
}

