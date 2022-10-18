package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSMSLambdaVersionConfigType extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function that Amazon Cognito activates to send SMS notifications to users.
    */
  var LambdaArn: ArnType
  
  /**
    * Signature of the "request" attribute in the "event" information that Amazon Cognito passes to your custom SMS Lambda function. The only supported value is V1_0.
    */
  var LambdaVersion: CustomSMSSenderLambdaVersionType
}
object CustomSMSLambdaVersionConfigType {
  
  inline def apply(LambdaArn: ArnType, LambdaVersion: CustomSMSSenderLambdaVersionType): CustomSMSLambdaVersionConfigType = {
    val __obj = js.Dynamic.literal(LambdaArn = LambdaArn.asInstanceOf[js.Any], LambdaVersion = LambdaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSMSLambdaVersionConfigType]
  }
  
  extension [Self <: CustomSMSLambdaVersionConfigType](x: Self) {
    
    inline def setLambdaArn(value: ArnType): Self = StObject.set(x, "LambdaArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaVersion(value: CustomSMSSenderLambdaVersionType): Self = StObject.set(x, "LambdaVersion", value.asInstanceOf[js.Any])
  }
}
