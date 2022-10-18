package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEmailLambdaVersionConfigType extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function that Amazon Cognito activates to send email notifications to users.
    */
  var LambdaArn: ArnType
  
  /**
    * Signature of the "request" attribute in the "event" information Amazon Cognito passes to your custom email Lambda function. The only supported value is V1_0.
    */
  var LambdaVersion: CustomEmailSenderLambdaVersionType
}
object CustomEmailLambdaVersionConfigType {
  
  inline def apply(LambdaArn: ArnType, LambdaVersion: CustomEmailSenderLambdaVersionType): CustomEmailLambdaVersionConfigType = {
    val __obj = js.Dynamic.literal(LambdaArn = LambdaArn.asInstanceOf[js.Any], LambdaVersion = LambdaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEmailLambdaVersionConfigType]
  }
  
  extension [Self <: CustomEmailLambdaVersionConfigType](x: Self) {
    
    inline def setLambdaArn(value: ArnType): Self = StObject.set(x, "LambdaArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaVersion(value: CustomEmailSenderLambdaVersionType): Self = StObject.set(x, "LambdaVersion", value.asInstanceOf[js.Any])
  }
}
