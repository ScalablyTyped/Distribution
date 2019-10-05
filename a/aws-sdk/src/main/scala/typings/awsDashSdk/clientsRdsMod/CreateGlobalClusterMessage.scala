package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGlobalClusterMessage extends js.Object {
  /**
    *  The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Aurora will not create a database in the global database cluster you are creating. 
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    *  The deletion protection setting for the new global database. The global database can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * Provides the name of the database engine to be used for this DB cluster.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The engine version of the Aurora global database.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The cluster identifier of the new global database cluster.
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional. 
    */
  var SourceDBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  The storage encryption setting for the new global database cluster. 
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
}

object CreateGlobalClusterMessage {
  @scala.inline
  def apply(
    DatabaseName: String = null,
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    GlobalClusterIdentifier: String = null,
    SourceDBClusterIdentifier: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (GlobalClusterIdentifier != null) __obj.updateDynamic("GlobalClusterIdentifier")(GlobalClusterIdentifier)
    if (SourceDBClusterIdentifier != null) __obj.updateDynamic("SourceDBClusterIdentifier")(SourceDBClusterIdentifier)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    __obj.asInstanceOf[CreateGlobalClusterMessage]
  }
}

