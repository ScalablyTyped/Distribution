package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingModifiedValues extends js.Object {
  /**
    *  Contains the new AllocatedStorage size for the DB instance that will be applied or is currently being applied. 
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Specifies the pending number of days for which automated backups are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Specifies the identifier of the certificate authority (CA) certificate for the DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  Contains the new DBInstanceClass for the DB instance that will be applied or is currently being applied. 
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    *  Contains the new DBInstanceIdentifier for the DB instance that will be applied or is currently being applied. 
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The new DB subnet group for the DB instance. 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The license model for the DB instance. Valid values: license-included, bring-your-own-license, general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * Contains the pending or currently in-progress change of the master credentials for the DB instance.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  /**
    * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A list of the log types whose configuration is still pending. These log types are in the process of being activated or deactivated.
    */
  var PendingCloudwatchLogsExports: js.UndefOr[PendingCloudwatchLogsExports] = js.undefined
  /**
    * Specifies the pending port for the DB instance.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Specifies the storage type to be associated with the DB instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
}

object PendingModifiedValues {
  @scala.inline
  def apply(
    AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    CACertificateIdentifier: String = null,
    DBInstanceClass: String = null,
    DBInstanceIdentifier: String = null,
    DBSubnetGroupName: String = null,
    EngineVersion: String = null,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    LicenseModel: String = null,
    MasterUserPassword: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    PendingCloudwatchLogsExports: PendingCloudwatchLogsExports = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    StorageType: String = null
  ): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod)
    if (CACertificateIdentifier != null) __obj.updateDynamic("CACertificateIdentifier")(CACertificateIdentifier)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier)
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (PendingCloudwatchLogsExports != null) __obj.updateDynamic("PendingCloudwatchLogsExports")(PendingCloudwatchLogsExports)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    __obj.asInstanceOf[PendingModifiedValues]
  }
}

