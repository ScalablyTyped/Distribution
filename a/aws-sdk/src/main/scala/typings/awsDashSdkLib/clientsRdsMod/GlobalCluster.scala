package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalCluster extends js.Object {
  /**
    *  The default database name within the new global database cluster. 
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    *  The deletion protection setting for the new global database cluster. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  The Aurora database engine used by the global database cluster. 
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the global database cluster.
    */
  var GlobalClusterArn: js.UndefOr[String] = js.undefined
  /**
    *  Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  The list of cluster IDs for secondary clusters within the global database cluster. Currently limited to 1 item. 
    */
  var GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.undefined
  /**
    *  The AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed. 
    */
  var GlobalClusterResourceId: js.UndefOr[String] = js.undefined
  /**
    * Specifies the current state of this global database cluster.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    *  The storage encryption setting for the global database cluster. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
}

object GlobalCluster {
  @scala.inline
  def apply(
    DatabaseName: String = null,
    DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    GlobalClusterArn: String = null,
    GlobalClusterIdentifier: String = null,
    GlobalClusterMembers: GlobalClusterMemberList = null,
    GlobalClusterResourceId: String = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
  ): GlobalCluster = {
    val __obj = js.Dynamic.literal()
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (GlobalClusterArn != null) __obj.updateDynamic("GlobalClusterArn")(GlobalClusterArn)
    if (GlobalClusterIdentifier != null) __obj.updateDynamic("GlobalClusterIdentifier")(GlobalClusterIdentifier)
    if (GlobalClusterMembers != null) __obj.updateDynamic("GlobalClusterMembers")(GlobalClusterMembers)
    if (GlobalClusterResourceId != null) __obj.updateDynamic("GlobalClusterResourceId")(GlobalClusterResourceId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    __obj.asInstanceOf[GlobalCluster]
  }
}

