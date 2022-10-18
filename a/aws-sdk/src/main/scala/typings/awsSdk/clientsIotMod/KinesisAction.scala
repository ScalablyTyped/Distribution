package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisAction extends StObject {
  
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[PartitionKey] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
    */
  var roleArn: AwsArn
  
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: StreamName
}
object KinesisAction {
  
  inline def apply(roleArn: AwsArn, streamName: StreamName): KinesisAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisAction]
  }
  
  extension [Self <: KinesisAction](x: Self) {
    
    inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
  }
}
