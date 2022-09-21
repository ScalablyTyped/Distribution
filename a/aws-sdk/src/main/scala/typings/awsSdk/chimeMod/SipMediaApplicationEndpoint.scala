package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipMediaApplicationEndpoint extends StObject {
  
  /**
    * Valid Amazon Resource Name (ARN) of the Lambda function. The function must be created in the same AWS Region as the SIP media application.
    */
  var LambdaArn: js.UndefOr[FunctionArn] = js.undefined
}
object SipMediaApplicationEndpoint {
  
  inline def apply(): SipMediaApplicationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationEndpoint]
  }
  
  extension [Self <: SipMediaApplicationEndpoint](x: Self) {
    
    inline def setLambdaArn(value: FunctionArn): Self = StObject.set(x, "LambdaArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaArnUndefined: Self = StObject.set(x, "LambdaArn", js.undefined)
  }
}
