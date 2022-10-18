package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaConfiguration extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var LambdaArn: Arn
  
  /**
    * The ARN of an IAM role that has permission to invoke the Lambda function.
    */
  var RoleArn: Arn
}
object LambdaConfiguration {
  
  inline def apply(LambdaArn: Arn, RoleArn: Arn): LambdaConfiguration = {
    val __obj = js.Dynamic.literal(LambdaArn = LambdaArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaConfiguration]
  }
  
  extension [Self <: LambdaConfiguration](x: Self) {
    
    inline def setLambdaArn(value: Arn): Self = StObject.set(x, "LambdaArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
