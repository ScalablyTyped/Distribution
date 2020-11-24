package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnowflakeConnectorProfileProperties extends js.Object {
  
  /**
    *  The name of the account. 
    */
  var accountName: js.UndefOr[AccountName] = js.native
  
  /**
    *  The name of the Amazon S3 bucket associated with Snowflake. 
    */
  var bucketName: BucketName = js.native
  
  /**
    *  The bucket path that refers to the Amazon S3 bucket associated with Snowflake. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.native
  
  /**
    *  The Snowflake Private Link service name to be used for private data transfers. 
    */
  var privateLinkServiceName: js.UndefOr[PrivateLinkServiceName] = js.native
  
  /**
    *  The AWS Region of the Snowflake account. 
    */
  var region: js.UndefOr[Region] = js.native
  
  /**
    *  The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;. 
    */
  var stage: Stage = js.native
  
  /**
    *  The name of the Snowflake warehouse. 
    */
  var warehouse: Warehouse = js.native
}
object SnowflakeConnectorProfileProperties {
  
  @scala.inline
  def apply(bucketName: BucketName, stage: Stage, warehouse: Warehouse): SnowflakeConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], warehouse = warehouse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnowflakeConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class SnowflakeConnectorProfilePropertiesOps[Self <: SnowflakeConnectorProfileProperties] (val x: Self) extends AnyVal {
    
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
    def setBucketName(value: BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: Stage): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarehouse(value: Warehouse): Self = this.set("warehouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountName(value: AccountName): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPrefix: Self = this.set("bucketPrefix", js.undefined)
    
    @scala.inline
    def setPrivateLinkServiceName(value: PrivateLinkServiceName): Self = this.set("privateLinkServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateLinkServiceName: Self = this.set("privateLinkServiceName", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
