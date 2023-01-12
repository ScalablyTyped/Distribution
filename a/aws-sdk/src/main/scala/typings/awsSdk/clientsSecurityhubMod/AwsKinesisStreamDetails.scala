package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsKinesisStreamDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream. 
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the Kinesis stream. If you don't specify a name, CloudFront generates a unique physical ID and uses that ID for the stream name. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of hours for the data records that are stored in shards to remain accessible. 
    */
  var RetentionPeriodHours: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of shards that the stream uses. 
    */
  var ShardCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * When specified, enables or updates server-side encryption using an KMS key for a specified stream. Removing this property from your stack template and updating your stack disables encryption. 
    */
  var StreamEncryption: js.UndefOr[AwsKinesisStreamStreamEncryptionDetails] = js.undefined
}
object AwsKinesisStreamDetails {
  
  inline def apply(): AwsKinesisStreamDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsKinesisStreamDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsKinesisStreamDetails] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRetentionPeriodHours(value: Integer): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodHoursUndefined: Self = StObject.set(x, "RetentionPeriodHours", js.undefined)
    
    inline def setShardCount(value: Integer): Self = StObject.set(x, "ShardCount", value.asInstanceOf[js.Any])
    
    inline def setShardCountUndefined: Self = StObject.set(x, "ShardCount", js.undefined)
    
    inline def setStreamEncryption(value: AwsKinesisStreamStreamEncryptionDetails): Self = StObject.set(x, "StreamEncryption", value.asInstanceOf[js.Any])
    
    inline def setStreamEncryptionUndefined: Self = StObject.set(x, "StreamEncryption", js.undefined)
  }
}
