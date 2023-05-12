package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantToken extends StObject {
  
  /**
    * Application-provided attributes to encode into the token and attach to a stage. This field is exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive information. 
    */
  var attributes: js.UndefOr[ParticipantTokenAttributes] = js.undefined
  
  /**
    * Set of capabilities that the user is allowed to perform in the stage.
    */
  var capabilities: js.UndefOr[ParticipantTokenCapabilities] = js.undefined
  
  /**
    * Duration (in minutes), after which the participant token expires. Default: 720 (12 hours).
    */
  var duration: js.UndefOr[ParticipantTokenDurationMinutes] = js.undefined
  
  /**
    * ISO 8601 timestamp (returned as a string) for when this token expires.
    */
  var expirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Unique identifier for this participant token, assigned by IVS.
    */
  var participantId: js.UndefOr[ParticipantTokenId] = js.undefined
  
  /**
    * The issued client token, encrypted.
    */
  var token: js.UndefOr[ParticipantTokenString] = js.undefined
  
  /**
    * Customer-assigned name to help identify the token; this can be used to link a participant to a user in the customer’s own systems. This can be any UTF-8 encoded text. This field is exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive information. 
    */
  var userId: js.UndefOr[ParticipantTokenUserId] = js.undefined
}
object ParticipantToken {
  
  inline def apply(): ParticipantToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantToken] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: ParticipantTokenAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCapabilities(value: ParticipantTokenCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: ParticipantTokenCapability*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setDuration(value: ParticipantTokenDurationMinutes): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setParticipantId(value: ParticipantTokenId): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setToken(value: ParticipantTokenString): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserId(value: ParticipantTokenUserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
