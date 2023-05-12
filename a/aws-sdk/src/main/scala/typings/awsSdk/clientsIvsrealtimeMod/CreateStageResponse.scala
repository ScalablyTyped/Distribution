package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStageResponse extends StObject {
  
  /**
    * Participant tokens attached to the stage. These correspond to the participants in the request.
    */
  var participantTokens: js.UndefOr[ParticipantTokenList] = js.undefined
  
  /**
    * The stage that was created.
    */
  var stage: js.UndefOr[Stage] = js.undefined
}
object CreateStageResponse {
  
  inline def apply(): CreateStageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStageResponse] (val x: Self) extends AnyVal {
    
    inline def setParticipantTokens(value: ParticipantTokenList): Self = StObject.set(x, "participantTokens", value.asInstanceOf[js.Any])
    
    inline def setParticipantTokensUndefined: Self = StObject.set(x, "participantTokens", js.undefined)
    
    inline def setParticipantTokensVarargs(value: ParticipantToken*): Self = StObject.set(x, "participantTokens", js.Array(value*))
    
    inline def setStage(value: Stage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
