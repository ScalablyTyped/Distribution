package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamodbDataSourceConfig extends StObject {
  
  /**
    * The Amazon Web Services Region.
    */
  var awsRegion: String
  
  /**
    * The DeltaSyncConfig for a versioned data source.
    */
  var deltaSyncConfig: js.UndefOr[DeltaSyncConfig] = js.undefined
  
  /**
    * The table name.
    */
  var tableName: String
  
  /**
    * Set to TRUE to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to TRUE to use Conflict Detection and Resolution with this data source.
    */
  var versioned: js.UndefOr[Boolean] = js.undefined
}
object DynamodbDataSourceConfig {
  
  inline def apply(awsRegion: String, tableName: String): DynamodbDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamodbDataSourceConfig]
  }
  
  extension [Self <: DynamodbDataSourceConfig](x: Self) {
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setDeltaSyncConfig(value: DeltaSyncConfig): Self = StObject.set(x, "deltaSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setDeltaSyncConfigUndefined: Self = StObject.set(x, "deltaSyncConfig", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setUseCallerCredentials(value: Boolean): Self = StObject.set(x, "useCallerCredentials", value.asInstanceOf[js.Any])
    
    inline def setUseCallerCredentialsUndefined: Self = StObject.set(x, "useCallerCredentials", js.undefined)
    
    inline def setVersioned(value: Boolean): Self = StObject.set(x, "versioned", value.asInstanceOf[js.Any])
    
    inline def setVersionedUndefined: Self = StObject.set(x, "versioned", js.undefined)
  }
}
