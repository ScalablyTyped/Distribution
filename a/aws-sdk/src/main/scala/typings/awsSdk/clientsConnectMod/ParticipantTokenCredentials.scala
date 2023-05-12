package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantTokenCredentials extends StObject {
  
  /**
    * The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var Expiry: js.UndefOr[ISO8601Datetime] = js.undefined
  
  /**
    * The token used by the chat participant to call CreateParticipantConnection. The participant token is valid for the lifetime of a chat participant. 
    */
  var ParticipantToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ParticipantToken] = js.undefined
}
object ParticipantTokenCredentials {
  
  inline def apply(): ParticipantTokenCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantTokenCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantTokenCredentials] (val x: Self) extends AnyVal {
    
    inline def setExpiry(value: ISO8601Datetime): Self = StObject.set(x, "Expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "Expiry", js.undefined)
    
    inline def setParticipantToken(value: ParticipantToken): Self = StObject.set(x, "ParticipantToken", value.asInstanceOf[js.Any])
    
    inline def setParticipantTokenUndefined: Self = StObject.set(x, "ParticipantToken", js.undefined)
  }
}
