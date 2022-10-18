package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageReviewHandler extends StObject {
  
  /**
    * Specifies the fallback behavior (whether the message is allowed or denied) if the handler does not return a valid response, encounters an error, or times out. (For the timeout period, see  Service Quotas.) If allowed, the message is delivered with returned content to all users connected to the room. If denied, the message is not delivered to any user. Default: ALLOW.
    */
  var fallbackResult: js.UndefOr[FallbackResult] = js.undefined
  
  /**
    * Identifier of the message review handler. Currently this must be an ARN of a lambda function.
    */
  var uri: js.UndefOr[LambdaArn] = js.undefined
}
object MessageReviewHandler {
  
  inline def apply(): MessageReviewHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageReviewHandler]
  }
  
  extension [Self <: MessageReviewHandler](x: Self) {
    
    inline def setFallbackResult(value: FallbackResult): Self = StObject.set(x, "fallbackResult", value.asInstanceOf[js.Any])
    
    inline def setFallbackResultUndefined: Self = StObject.set(x, "fallbackResult", js.undefined)
    
    inline def setUri(value: LambdaArn): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
