package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncS3Destination extends StObject {
  
  /**
    * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same Region as the destination S3 bucket.
    */
  var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.undefined
  
  /**
    * The name of the S3 bucket where the aggregated data is stored.
    */
  var BucketName: ResourceDataSyncS3BucketName
  
  /**
    * Enables destination data sharing. By default, this field is null.
    */
  var DestinationDataSharing: js.UndefOr[ResourceDataSyncDestinationDataSharing] = js.undefined
  
  /**
    * An Amazon S3 prefix for the bucket.
    */
  var Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.undefined
  
  /**
    * The Amazon Web Services Region with the S3 bucket targeted by the resource data sync.
    */
  var Region: ResourceDataSyncS3Region
  
  /**
    * A supported sync format. The following format is currently supported: JsonSerDe
    */
  var SyncFormat: ResourceDataSyncS3Format
}
object ResourceDataSyncS3Destination {
  
  inline def apply(
    BucketName: ResourceDataSyncS3BucketName,
    Region: ResourceDataSyncS3Region,
    SyncFormat: ResourceDataSyncS3Format
  ): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], SyncFormat = SyncFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
  
  extension [Self <: ResourceDataSyncS3Destination](x: Self) {
    
    inline def setAWSKMSKeyARN(value: ResourceDataSyncAWSKMSKeyARN): Self = StObject.set(x, "AWSKMSKeyARN", value.asInstanceOf[js.Any])
    
    inline def setAWSKMSKeyARNUndefined: Self = StObject.set(x, "AWSKMSKeyARN", js.undefined)
    
    inline def setBucketName(value: ResourceDataSyncS3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setDestinationDataSharing(value: ResourceDataSyncDestinationDataSharing): Self = StObject.set(x, "DestinationDataSharing", value.asInstanceOf[js.Any])
    
    inline def setDestinationDataSharingUndefined: Self = StObject.set(x, "DestinationDataSharing", js.undefined)
    
    inline def setPrefix(value: ResourceDataSyncS3Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setRegion(value: ResourceDataSyncS3Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setSyncFormat(value: ResourceDataSyncS3Format): Self = StObject.set(x, "SyncFormat", value.asInstanceOf[js.Any])
  }
}
