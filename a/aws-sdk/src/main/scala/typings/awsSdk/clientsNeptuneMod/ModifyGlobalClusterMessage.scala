package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyGlobalClusterMessage extends StObject {
  
  /**
    * A value that indicates whether major version upgrades are allowed. Constraints: You must allow major version upgrades if you specify a value for the EngineVersion parameter that is a different major version than the DB cluster's current version. If you upgrade the major version of a global database, the cluster and DB instance parameter groups are set to the default parameter groups for the new version, so you will need to apply any custom parameter groups after completing the upgrade.
    */
  var AllowMajorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Indicates whether the global database has deletion protection enabled. The global database cannot be deleted when deletion protection is enabled.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The version number of the database engine to which you want to upgrade. Changing this parameter will result in an outage. The change is applied during the next maintenance window unless ApplyImmediately is enabled. To list all of the available Neptune engine versions, use the following command:
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The DB cluster identifier for the global cluster being modified. This parameter is not case-sensitive. Constraints: Must match the identifier of an existing global database cluster.
    */
  var GlobalClusterIdentifier: typings.awsSdk.clientsNeptuneMod.GlobalClusterIdentifier
  
  /**
    * A new cluster identifier to assign to the global database. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewGlobalClusterIdentifier: js.UndefOr[GlobalClusterIdentifier] = js.undefined
}
object ModifyGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: GlobalClusterIdentifier): ModifyGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalClusterMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyGlobalClusterMessage] (val x: Self) extends AnyVal {
    
    inline def setAllowMajorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AllowMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAllowMajorVersionUpgradeUndefined: Self = StObject.set(x, "AllowMajorVersionUpgrade", js.undefined)
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNewGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "NewGlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNewGlobalClusterIdentifierUndefined: Self = StObject.set(x, "NewGlobalClusterIdentifier", js.undefined)
  }
}
