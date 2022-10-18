package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingModifiedRelationalDatabaseValues extends StObject {
  
  /**
    * A Boolean value indicating whether automated backup retention is enabled.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The database engine version.
    */
  var engineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The password for the master user of the database.
    */
  var masterUserPassword: js.UndefOr[String] = js.undefined
}
object PendingModifiedRelationalDatabaseValues {
  
  inline def apply(): PendingModifiedRelationalDatabaseValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedRelationalDatabaseValues]
  }
  
  extension [Self <: PendingModifiedRelationalDatabaseValues](x: Self) {
    
    inline def setBackupRetentionEnabled(value: Boolean): Self = StObject.set(x, "backupRetentionEnabled", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionEnabledUndefined: Self = StObject.set(x, "backupRetentionEnabled", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "masterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "masterUserPassword", js.undefined)
  }
}
