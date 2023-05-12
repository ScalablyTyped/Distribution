package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantTokenConfiguration extends StObject {
  
  /**
    * Application-provided attributes to encode into the corresponding participant token and attach to a stage. Map keys and values can contain UTF-8 encoded text. The maximum length of this field is 1 KB total. This field is exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive information. 
    */
  var attributes: js.UndefOr[ParticipantTokenAttributes] = js.undefined
  
  /**
    * Set of capabilities that the user is allowed to perform in the stage.
    */
  var capabilities: js.UndefOr[ParticipantTokenCapabilities] = js.undefined
  
  /**
    * Duration (in minutes), after which the corresponding participant token expires. Default: 720 (12 hours).
    */
  var duration: js.UndefOr[ParticipantTokenDurationMinutes] = js.undefined
  
  /**
    * Customer-assigned name to help identify the token; this can be used to link a participant to a user in the customer’s own systems. This can be any UTF-8 encoded text. This field is exposed to all stage participants and should not be used for personally identifying, confidential, or sensitive information. 
    */
  var userId: js.UndefOr[ParticipantTokenUserId] = js.undefined
}
object ParticipantTokenConfiguration {
  
  inline def apply(): ParticipantTokenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantTokenConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantTokenConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: ParticipantTokenAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCapabilities(value: ParticipantTokenCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: ParticipantTokenCapability*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setDuration(value: ParticipantTokenDurationMinutes): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setUserId(value: ParticipantTokenUserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
