package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalClusterMessage extends StObject {
  
  /**
    * The deletion protection setting for the new global database. The global database can't be deleted when deletion protection is enabled.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the database engine to be used in the global database. Valid values: neptune 
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The Neptune engine version to be used by the global database. Valid values: 1.2.0.0 or above.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster identifier of the new global database cluster.
    */
  var GlobalClusterIdentifier: typings.awsSdk.clientsNeptuneMod.GlobalClusterIdentifier
  
  /**
    * (Optional) The Amazon Resource Name (ARN) of an existing Neptune DB cluster to use as the primary cluster of the new global database.
    */
  var SourceDBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The storage encryption setting for the new global database cluster.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
}
object CreateGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: GlobalClusterIdentifier): CreateGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalClusterMessage]
  }
  
  extension [Self <: CreateGlobalClusterMessage](x: Self) {
    
    inline def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceDBClusterIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceDBClusterIdentifierUndefined: Self = StObject.set(x, "SourceDBClusterIdentifier", js.undefined)
    
    inline def setStorageEncrypted(value: BooleanOptional): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
  }
}
