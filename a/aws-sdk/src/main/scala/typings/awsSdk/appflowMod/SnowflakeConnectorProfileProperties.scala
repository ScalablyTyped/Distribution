package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowflakeConnectorProfileProperties extends StObject {
  
  /**
    *  The name of the account. 
    */
  var accountName: js.UndefOr[AccountName] = js.undefined
  
  /**
    *  The name of the Amazon S3 bucket associated with Snowflake. 
    */
  var bucketName: BucketName
  
  /**
    *  The bucket path that refers to the Amazon S3 bucket associated with Snowflake. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
  
  /**
    *  The Snowflake Private Link service name to be used for private data transfers. 
    */
  var privateLinkServiceName: js.UndefOr[PrivateLinkServiceName] = js.undefined
  
  /**
    *  The AWS Region of the Snowflake account. 
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    *  The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the Snowflake account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;. 
    */
  var stage: Stage
  
  /**
    *  The name of the Snowflake warehouse. 
    */
  var warehouse: Warehouse
}
object SnowflakeConnectorProfileProperties {
  
  @scala.inline
  def apply(bucketName: BucketName, stage: Stage, warehouse: Warehouse): SnowflakeConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], warehouse = warehouse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnowflakeConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class SnowflakeConnectorProfilePropertiesMutableBuilder[Self <: SnowflakeConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: AccountName): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    @scala.inline
    def setPrivateLinkServiceName(value: PrivateLinkServiceName): Self = StObject.set(x, "privateLinkServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateLinkServiceNameUndefined: Self = StObject.set(x, "privateLinkServiceName", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setStage(value: Stage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarehouse(value: Warehouse): Self = StObject.set(x, "warehouse", value.asInstanceOf[js.Any])
  }
}
