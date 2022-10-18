package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSummary extends StObject {
  
  /**
    *  The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task. 
    */
  var CloudWatchLogGroupArn: js.UndefOr[typings.awsSdk.clientsDynamodbMod.CloudWatchLogGroupArn] = js.undefined
  
  /**
    *  The time at which this import task ended. (Does this include the successful complete creation of the table it was imported to?) 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Number (ARN) corresponding to the import request. 
    */
  var ImportArn: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ImportArn] = js.undefined
  
  /**
    *  The status of the import operation. 
    */
  var ImportStatus: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ImportStatus] = js.undefined
  
  /**
    *  The format of the source data. Valid values are CSV, DYNAMODB_JSON or ION.
    */
  var InputFormat: js.UndefOr[typings.awsSdk.clientsDynamodbMod.InputFormat] = js.undefined
  
  /**
    *  The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required), S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester). 
    */
  var S3BucketSource: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3BucketSource] = js.undefined
  
  /**
    *  The time at which this import task began. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Number (ARN) of the table being imported into. 
    */
  var TableArn: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableArn] = js.undefined
}
object ImportSummary {
  
  inline def apply(): ImportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSummary]
  }
  
  extension [Self <: ImportSummary](x: Self) {
    
    inline def setCloudWatchLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setImportArn(value: ImportArn): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
    
    inline def setImportArnUndefined: Self = StObject.set(x, "ImportArn", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
    
    inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
    
    inline def setS3BucketSourceUndefined: Self = StObject.set(x, "S3BucketSource", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
  }
}
