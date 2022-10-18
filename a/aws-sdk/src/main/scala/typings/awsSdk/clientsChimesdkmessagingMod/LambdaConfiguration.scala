package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaConfiguration extends StObject {
  
  /**
    * Controls how the Lambda function is invoked.
    */
  var InvocationType: typings.awsSdk.clientsChimesdkmessagingMod.InvocationType
  
  /**
    * The ARN of the Lambda message processing function.
    */
  var ResourceArn: LambdaFunctionArn
}
object LambdaConfiguration {
  
  inline def apply(InvocationType: InvocationType, ResourceArn: LambdaFunctionArn): LambdaConfiguration = {
    val __obj = js.Dynamic.literal(InvocationType = InvocationType.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaConfiguration]
  }
  
  extension [Self <: LambdaConfiguration](x: Self) {
    
    inline def setInvocationType(value: InvocationType): Self = StObject.set(x, "InvocationType", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: LambdaFunctionArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
