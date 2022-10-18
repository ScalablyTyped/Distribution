package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameSessionDetail extends StObject {
  
  /**
    * Object that describes a game session.
    */
  var GameSession: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameSession] = js.undefined
  
  /**
    * Current status of protection for the game session.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var ProtectionPolicy: js.UndefOr[typings.awsSdk.clientsGameliftMod.ProtectionPolicy] = js.undefined
}
object GameSessionDetail {
  
  inline def apply(): GameSessionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionDetail]
  }
  
  extension [Self <: GameSessionDetail](x: Self) {
    
    inline def setGameSession(value: GameSession): Self = StObject.set(x, "GameSession", value.asInstanceOf[js.Any])
    
    inline def setGameSessionUndefined: Self = StObject.set(x, "GameSession", js.undefined)
    
    inline def setProtectionPolicy(value: ProtectionPolicy): Self = StObject.set(x, "ProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setProtectionPolicyUndefined: Self = StObject.set(x, "ProtectionPolicy", js.undefined)
  }
}
