package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsHttpEndpointConfig extends StObject {
  
  /**
    * AWS Region for RDS HTTP endpoint.
    */
  var awsRegion: js.UndefOr[String] = js.undefined
  
  /**
    * AWS secret store ARN for database credentials.
    */
  var awsSecretStoreArn: js.UndefOr[String] = js.undefined
  
  /**
    * Logical database name.
    */
  var databaseName: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon RDS cluster ARN.
    */
  var dbClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Logical schema name.
    */
  var schema: js.UndefOr[String] = js.undefined
}
object RdsHttpEndpointConfig {
  
  @scala.inline
  def apply(): RdsHttpEndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsHttpEndpointConfig]
  }
  
  @scala.inline
  implicit class RdsHttpEndpointConfigMutableBuilder[Self <: RdsHttpEndpointConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    @scala.inline
    def setAwsSecretStoreArn(value: String): Self = StObject.set(x, "awsSecretStoreArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsSecretStoreArnUndefined: Self = StObject.set(x, "awsSecretStoreArn", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
    
    @scala.inline
    def setDbClusterIdentifier(value: String): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterIdentifierUndefined: Self = StObject.set(x, "dbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
