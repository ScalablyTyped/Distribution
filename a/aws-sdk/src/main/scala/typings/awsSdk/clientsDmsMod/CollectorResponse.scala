package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectorResponse extends StObject {
  
  var CollectorHealthCheck: js.UndefOr[typings.awsSdk.clientsDmsMod.CollectorHealthCheck] = js.undefined
  
  /**
    * The name of the Fleet Advisor collector .
    */
  var CollectorName: js.UndefOr[String] = js.undefined
  
  /**
    * The reference ID of the Fleet Advisor collector.
    */
  var CollectorReferencedId: js.UndefOr[String] = js.undefined
  
  /**
    * The version of your Fleet Advisor collector, in semantic versioning format, for example 1.0.2 
    */
  var CollectorVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when you created the collector, in the following format: 2022-01-24T19:04:02.596113Z 
    */
  var CreatedDate: js.UndefOr[String] = js.undefined
  
  /**
    * A summary description of the Fleet Advisor collector.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  var InventoryData: js.UndefOr[typings.awsSdk.clientsDmsMod.InventoryData] = js.undefined
  
  /**
    * The timestamp of the last time the collector received data, in the following format: 2022-01-24T19:04:02.596113Z 
    */
  var LastDataReceived: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when DMS last modified the collector, in the following format: 2022-01-24T19:04:02.596113Z 
    */
  var ModifiedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when DMS registered the collector, in the following format: 2022-01-24T19:04:02.596113Z 
    */
  var RegisteredDate: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The IAM role that grants permissions to access the specified Amazon S3 bucket.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the collector version is up to date.
    */
  var VersionStatus: js.UndefOr[typings.awsSdk.clientsDmsMod.VersionStatus] = js.undefined
}
object CollectorResponse {
  
  inline def apply(): CollectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectorResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectorHealthCheck(value: CollectorHealthCheck): Self = StObject.set(x, "CollectorHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setCollectorHealthCheckUndefined: Self = StObject.set(x, "CollectorHealthCheck", js.undefined)
    
    inline def setCollectorName(value: String): Self = StObject.set(x, "CollectorName", value.asInstanceOf[js.Any])
    
    inline def setCollectorNameUndefined: Self = StObject.set(x, "CollectorName", js.undefined)
    
    inline def setCollectorReferencedId(value: String): Self = StObject.set(x, "CollectorReferencedId", value.asInstanceOf[js.Any])
    
    inline def setCollectorReferencedIdUndefined: Self = StObject.set(x, "CollectorReferencedId", js.undefined)
    
    inline def setCollectorVersion(value: String): Self = StObject.set(x, "CollectorVersion", value.asInstanceOf[js.Any])
    
    inline def setCollectorVersionUndefined: Self = StObject.set(x, "CollectorVersion", js.undefined)
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInventoryData(value: InventoryData): Self = StObject.set(x, "InventoryData", value.asInstanceOf[js.Any])
    
    inline def setInventoryDataUndefined: Self = StObject.set(x, "InventoryData", js.undefined)
    
    inline def setLastDataReceived(value: String): Self = StObject.set(x, "LastDataReceived", value.asInstanceOf[js.Any])
    
    inline def setLastDataReceivedUndefined: Self = StObject.set(x, "LastDataReceived", js.undefined)
    
    inline def setModifiedDate(value: String): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "ModifiedDate", js.undefined)
    
    inline def setRegisteredDate(value: String): Self = StObject.set(x, "RegisteredDate", value.asInstanceOf[js.Any])
    
    inline def setRegisteredDateUndefined: Self = StObject.set(x, "RegisteredDate", js.undefined)
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
    
    inline def setVersionStatus(value: VersionStatus): Self = StObject.set(x, "VersionStatus", value.asInstanceOf[js.Any])
    
    inline def setVersionStatusUndefined: Self = StObject.set(x, "VersionStatus", js.undefined)
  }
}
