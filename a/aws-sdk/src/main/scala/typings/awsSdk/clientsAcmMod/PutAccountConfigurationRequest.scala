package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountConfigurationRequest extends StObject {
  
  /**
    * Specifies expiration events associated with an account.
    */
  var ExpiryEvents: js.UndefOr[ExpiryEventsConfiguration] = js.undefined
  
  /**
    * Customer-chosen string used to distinguish between calls to PutAccountConfiguration. Idempotency tokens time out after one hour. If you call PutAccountConfiguration multiple times with the same unexpired idempotency token, ACM treats it as the same request and returns the original result. If you change the idempotency token for each call, ACM treats each call as a new request.
    */
  var IdempotencyToken: typings.awsSdk.clientsAcmMod.IdempotencyToken
}
object PutAccountConfigurationRequest {
  
  inline def apply(IdempotencyToken: IdempotencyToken): PutAccountConfigurationRequest = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAccountConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setExpiryEvents(value: ExpiryEventsConfiguration): Self = StObject.set(x, "ExpiryEvents", value.asInstanceOf[js.Any])
    
    inline def setExpiryEventsUndefined: Self = StObject.set(x, "ExpiryEvents", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
  }
}
