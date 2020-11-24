package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RdsHttpEndpointConfig extends js.Object {
  
  /**
    * AWS Region for RDS HTTP endpoint.
    */
  var awsRegion: js.UndefOr[String] = js.native
  
  /**
    * AWS secret store ARN for database credentials.
    */
  var awsSecretStoreArn: js.UndefOr[String] = js.native
  
  /**
    * Logical database name.
    */
  var databaseName: js.UndefOr[String] = js.native
  
  /**
    * Amazon RDS cluster ARN.
    */
  var dbClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Logical schema name.
    */
  var schema: js.UndefOr[String] = js.native
}
object RdsHttpEndpointConfig {
  
  @scala.inline
  def apply(): RdsHttpEndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsHttpEndpointConfig]
  }
  
  @scala.inline
  implicit class RdsHttpEndpointConfigOps[Self <: RdsHttpEndpointConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRegion: Self = this.set("awsRegion", js.undefined)
    
    @scala.inline
    def setAwsSecretStoreArn(value: String): Self = this.set("awsSecretStoreArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsSecretStoreArn: Self = this.set("awsSecretStoreArn", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    
    @scala.inline
    def setDbClusterIdentifier(value: String): Self = this.set("dbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterIdentifier: Self = this.set("dbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
