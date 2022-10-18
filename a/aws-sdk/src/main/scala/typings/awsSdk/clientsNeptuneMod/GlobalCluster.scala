package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalCluster extends StObject {
  
  /**
    * The deletion protection setting for the global database.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Neptune database engine used by the global database ("neptune").
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The Neptune engine version used by the global database.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the global database.
    */
  var GlobalClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a user-supplied global database cluster identifier. This identifier is the unique key that identifies a global database.
    */
  var GlobalClusterIdentifier: js.UndefOr[typings.awsSdk.clientsNeptuneMod.GlobalClusterIdentifier] = js.undefined
  
  /**
    * A list of cluster ARNs and instance ARNs for all the DB clusters that are part of the global database.
    */
  var GlobalClusterMembers: js.UndefOr[GlobalClusterMemberList] = js.undefined
  
  /**
    * An immutable identifier for the global database that is unique within in all regions. This identifier is found in CloudTrail log entries whenever the KMS key for the DB cluster is accessed.
    */
  var GlobalClusterResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the current state of this global database.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The storage encryption setting for the global database.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
}
object GlobalCluster {
  
  inline def apply(): GlobalCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalCluster]
  }
  
  extension [Self <: GlobalCluster](x: Self) {
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalClusterArn(value: String): Self = StObject.set(x, "GlobalClusterArn", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterArnUndefined: Self = StObject.set(x, "GlobalClusterArn", js.undefined)
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
    
    inline def setGlobalClusterMembers(value: GlobalClusterMemberList): Self = StObject.set(x, "GlobalClusterMembers", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterMembersUndefined: Self = StObject.set(x, "GlobalClusterMembers", js.undefined)
    
    inline def setGlobalClusterMembersVarargs(value: GlobalClusterMember*): Self = StObject.set(x, "GlobalClusterMembers", js.Array(value*))
    
    inline def setGlobalClusterResourceId(value: String): Self = StObject.set(x, "GlobalClusterResourceId", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterResourceIdUndefined: Self = StObject.set(x, "GlobalClusterResourceId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
  }
}
