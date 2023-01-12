package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameSessionInput extends StObject {
  
  /**
    * A unique identifier for the game session to update. 
    */
  var GameSessionId: ArnStringModel
  
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A policy that determines whether the game session is accepting new players.
    */
  var PlayerSessionCreationPolicy: js.UndefOr[typings.awsSdk.clientsGameliftMod.PlayerSessionCreationPolicy] = js.undefined
  
  /**
    * Game session protection policy to apply to this game session only.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var ProtectionPolicy: js.UndefOr[typings.awsSdk.clientsGameliftMod.ProtectionPolicy] = js.undefined
}
object UpdateGameSessionInput {
  
  inline def apply(GameSessionId: ArnStringModel): UpdateGameSessionInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGameSessionInput] (val x: Self) extends AnyVal {
    
    inline def setGameSessionId(value: ArnStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    inline def setMaximumPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumPlayerSessionCountUndefined: Self = StObject.set(x, "MaximumPlayerSessionCount", js.undefined)
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPlayerSessionCreationPolicy(value: PlayerSessionCreationPolicy): Self = StObject.set(x, "PlayerSessionCreationPolicy", value.asInstanceOf[js.Any])
    
    inline def setPlayerSessionCreationPolicyUndefined: Self = StObject.set(x, "PlayerSessionCreationPolicy", js.undefined)
    
    inline def setProtectionPolicy(value: ProtectionPolicy): Self = StObject.set(x, "ProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setProtectionPolicyUndefined: Self = StObject.set(x, "ProtectionPolicy", js.undefined)
  }
}
