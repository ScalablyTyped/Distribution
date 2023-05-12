package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParticipantTokenResponse extends StObject {
  
  /**
    * The participant token that was created.
    */
  var participantToken: js.UndefOr[ParticipantToken] = js.undefined
}
object CreateParticipantTokenResponse {
  
  inline def apply(): CreateParticipantTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParticipantTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateParticipantTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setParticipantToken(value: ParticipantToken): Self = StObject.set(x, "participantToken", value.asInstanceOf[js.Any])
    
    inline def setParticipantTokenUndefined: Self = StObject.set(x, "participantToken", js.undefined)
  }
}
