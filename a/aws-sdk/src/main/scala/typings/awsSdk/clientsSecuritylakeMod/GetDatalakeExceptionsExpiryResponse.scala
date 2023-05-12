package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatalakeExceptionsExpiryResponse extends StObject {
  
  /**
    * The expiration period and time-to-live (TTL).
    */
  var exceptionMessageExpiry: Long
}
object GetDatalakeExceptionsExpiryResponse {
  
  inline def apply(exceptionMessageExpiry: Long): GetDatalakeExceptionsExpiryResponse = {
    val __obj = js.Dynamic.literal(exceptionMessageExpiry = exceptionMessageExpiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatalakeExceptionsExpiryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatalakeExceptionsExpiryResponse] (val x: Self) extends AnyVal {
    
    inline def setExceptionMessageExpiry(value: Long): Self = StObject.set(x, "exceptionMessageExpiry", value.asInstanceOf[js.Any])
  }
}
