package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogSettingsRequest extends StObject {
  
  /**
    * Where the logs will be delivered. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered to an S3 bucket.
    */
  var destination: Destination
  
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for encrypting audio logs delivered to an S3 bucket. The key does not apply to CloudWatch Logs and is optional for S3 buckets.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The type of logging to enable. Text logs are delivered to a CloudWatch Logs log group. Audio logs are delivered to an S3 bucket.
    */
  var logType: LogType
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs should be delivered.
    */
  var resourceArn: ResourceArn
}
object LogSettingsRequest {
  
  inline def apply(destination: Destination, logType: LogType, resourceArn: ResourceArn): LogSettingsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSettingsRequest]
  }
  
  extension [Self <: LogSettingsRequest](x: Self) {
    
    inline def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setLogType(value: LogType): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
