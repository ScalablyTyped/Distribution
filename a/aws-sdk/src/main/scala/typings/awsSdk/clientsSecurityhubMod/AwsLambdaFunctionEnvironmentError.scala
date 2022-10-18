package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionEnvironmentError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsLambdaFunctionEnvironmentError {
  
  inline def apply(): AwsLambdaFunctionEnvironmentError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionEnvironmentError]
  }
  
  extension [Self <: AwsLambdaFunctionEnvironmentError](x: Self) {
    
    inline def setErrorCode(value: NonEmptyString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
