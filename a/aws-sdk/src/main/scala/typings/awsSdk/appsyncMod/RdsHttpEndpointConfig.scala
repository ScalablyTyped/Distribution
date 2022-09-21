package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsHttpEndpointConfig extends StObject {
  
  /**
    * Amazon Web Services Region for Amazon RDS HTTP endpoint.
    */
  var awsRegion: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Web Services secret store Amazon Resource Name (ARN) for database credentials.
    */
  var awsSecretStoreArn: js.UndefOr[String] = js.undefined
  
  /**
    * Logical database name.
    */
  var databaseName: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon RDS cluster Amazon Resource Name (ARN).
    */
  var dbClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Logical schema name.
    */
  var schema: js.UndefOr[String] = js.undefined
}
object RdsHttpEndpointConfig {
  
  inline def apply(): RdsHttpEndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsHttpEndpointConfig]
  }
  
  extension [Self <: RdsHttpEndpointConfig](x: Self) {
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    inline def setAwsSecretStoreArn(value: String): Self = StObject.set(x, "awsSecretStoreArn", value.asInstanceOf[js.Any])
    
    inline def setAwsSecretStoreArnUndefined: Self = StObject.set(x, "awsSecretStoreArn", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
    
    inline def setDbClusterIdentifier(value: String): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbClusterIdentifierUndefined: Self = StObject.set(x, "dbClusterIdentifier", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
