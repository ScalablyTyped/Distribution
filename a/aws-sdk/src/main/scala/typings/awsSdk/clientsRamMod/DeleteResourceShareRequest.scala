package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceShareRequest extends StObject {
  
  /**
    * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This lets you safely retry the request without accidentally performing the same operation a second time. Passing the same value to a later call to an operation requires that you also pass the same value for all other parameters. We recommend that you use a UUID type of value.. If you don't provide this value, then Amazon Web Services generates a random one for you. If you retry the operation with the same ClientToken, but with different parameters, the retry fails with an IdempotentParameterMismatch error.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the resource share to delete.
    */
  var resourceShareArn: String
}
object DeleteResourceShareRequest {
  
  inline def apply(resourceShareArn: String): DeleteResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceShareRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourceShareRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
