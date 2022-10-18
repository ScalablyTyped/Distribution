package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDestinationRequest extends StObject {
  
  /**
    * A name for the destination.
    */
  var destinationName: DestinationName
  
  /**
    * The ARN of an IAM role that grants CloudWatch Logs permissions to call the Amazon Kinesis PutRecord operation on the destination stream.
    */
  var roleArn: RoleArn
  
  /**
    * The ARN of an Amazon Kinesis stream to which to deliver matching log events.
    */
  var targetArn: TargetArn
}
object PutDestinationRequest {
  
  inline def apply(destinationName: DestinationName, roleArn: RoleArn, targetArn: TargetArn): PutDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationName = destinationName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDestinationRequest]
  }
  
  extension [Self <: PutDestinationRequest](x: Self) {
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArn(value: TargetArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
