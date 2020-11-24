package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamodbDataSourceConfig extends js.Object {
  
  /**
    * The AWS Region.
    */
  var awsRegion: String = js.native
  
  /**
    * The DeltaSyncConfig for a versioned datasource.
    */
  var deltaSyncConfig: js.UndefOr[DeltaSyncConfig] = js.native
  
  /**
    * The table name.
    */
  var tableName: String = js.native
  
  /**
    * Set to TRUE to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to TRUE to use Conflict Detection and Resolution with this data source.
    */
  var versioned: js.UndefOr[Boolean] = js.native
}
object DynamodbDataSourceConfig {
  
  @scala.inline
  def apply(awsRegion: String, tableName: String): DynamodbDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamodbDataSourceConfig]
  }
  
  @scala.inline
  implicit class DynamodbDataSourceConfigOps[Self <: DynamodbDataSourceConfig] (val x: Self) extends AnyVal {
    
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
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaSyncConfig(value: DeltaSyncConfig): Self = this.set("deltaSyncConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaSyncConfig: Self = this.set("deltaSyncConfig", js.undefined)
    
    @scala.inline
    def setUseCallerCredentials(value: Boolean): Self = this.set("useCallerCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCallerCredentials: Self = this.set("useCallerCredentials", js.undefined)
    
    @scala.inline
    def setVersioned(value: Boolean): Self = this.set("versioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersioned: Self = this.set("versioned", js.undefined)
  }
}
