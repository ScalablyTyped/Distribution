package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Database extends StObject {
  
  /**
    * The ID of the application.
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ApplicationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the database.
    */
  var Arn: js.UndefOr[SsmSapArn] = js.undefined
  
  /**
    * The ID of the component.
    */
  var ComponentId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ComponentId] = js.undefined
  
  /**
    * The credentials of the database.
    */
  var Credentials: js.UndefOr[ApplicationCredentialList] = js.undefined
  
  /**
    * The ID of the SAP HANA database.
    */
  var DatabaseId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.DatabaseId] = js.undefined
  
  /**
    * The name of the database.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the database.
    */
  var DatabaseType: js.UndefOr[typings.awsSdk.clientsSsmsapMod.DatabaseType] = js.undefined
  
  /**
    * The time at which the database was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The primary host of the database.
    */
  var PrimaryHost: js.UndefOr[String] = js.undefined
  
  /**
    * The SQL port of the database.
    */
  var SQLPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The status of the database.
    */
  var Status: js.UndefOr[DatabaseStatus] = js.undefined
}
object Database {
  
  inline def apply(): Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Database] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: SsmSapArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setComponentId(value: ComponentId): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    inline def setCredentials(value: ApplicationCredentialList): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setCredentialsVarargs(value: ApplicationCredential*): Self = StObject.set(x, "Credentials", js.Array(value*))
    
    inline def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDatabaseType(value: DatabaseType): Self = StObject.set(x, "DatabaseType", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTypeUndefined: Self = StObject.set(x, "DatabaseType", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setPrimaryHost(value: String): Self = StObject.set(x, "PrimaryHost", value.asInstanceOf[js.Any])
    
    inline def setPrimaryHostUndefined: Self = StObject.set(x, "PrimaryHost", js.undefined)
    
    inline def setSQLPort(value: Integer): Self = StObject.set(x, "SQLPort", value.asInstanceOf[js.Any])
    
    inline def setSQLPortUndefined: Self = StObject.set(x, "SQLPort", js.undefined)
    
    inline def setStatus(value: DatabaseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
