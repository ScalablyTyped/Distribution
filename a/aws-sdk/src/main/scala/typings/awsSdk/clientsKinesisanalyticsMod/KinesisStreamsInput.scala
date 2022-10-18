package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamsInput extends StObject {
  
  /**
    * ARN of the input Amazon Kinesis stream to read.
    */
  var ResourceARN: typings.awsSdk.clientsKinesisanalyticsMod.ResourceARN
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to grant the necessary permissions to this role.
    */
  var RoleARN: typings.awsSdk.clientsKinesisanalyticsMod.RoleARN
}
object KinesisStreamsInput {
  
  inline def apply(ResourceARN: ResourceARN, RoleARN: RoleARN): KinesisStreamsInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsInput]
  }
  
  extension [Self <: KinesisStreamsInput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
