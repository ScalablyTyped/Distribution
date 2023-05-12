package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatalakeExceptionsExpiryRequest extends StObject {
  
  /**
    * The time-to-live (TTL) for the exception message to remain.
    */
  var exceptionMessageExpiry: UpdateDatalakeExceptionsExpiryRequestExceptionMessageExpiryLong
}
object UpdateDatalakeExceptionsExpiryRequest {
  
  inline def apply(exceptionMessageExpiry: UpdateDatalakeExceptionsExpiryRequestExceptionMessageExpiryLong): UpdateDatalakeExceptionsExpiryRequest = {
    val __obj = js.Dynamic.literal(exceptionMessageExpiry = exceptionMessageExpiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatalakeExceptionsExpiryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatalakeExceptionsExpiryRequest] (val x: Self) extends AnyVal {
    
    inline def setExceptionMessageExpiry(value: UpdateDatalakeExceptionsExpiryRequestExceptionMessageExpiryLong): Self = StObject.set(x, "exceptionMessageExpiry", value.asInstanceOf[js.Any])
  }
}
