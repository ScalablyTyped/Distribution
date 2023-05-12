package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceCreationLimitPolicy extends StObject {
  
  /**
    * A policy that puts limits on the number of game sessions that a player can create within a specified span of time. With this policy, you can control players' ability to consume available resources. The policy is evaluated when a player tries to create a new game session. On receiving a CreateGameSession request, Amazon GameLift checks that the player (identified by CreatorId) has created fewer than game session limit in the specified time period.
    */
  var NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The time span used in evaluating the resource creation limit policy. 
    */
  var PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined
}
object ResourceCreationLimitPolicy {
  
  inline def apply(): ResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCreationLimitPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceCreationLimitPolicy] (val x: Self) extends AnyVal {
    
    inline def setNewGameSessionsPerCreator(value: WholeNumber): Self = StObject.set(x, "NewGameSessionsPerCreator", value.asInstanceOf[js.Any])
    
    inline def setNewGameSessionsPerCreatorUndefined: Self = StObject.set(x, "NewGameSessionsPerCreator", js.undefined)
    
    inline def setPolicyPeriodInMinutes(value: WholeNumber): Self = StObject.set(x, "PolicyPeriodInMinutes", value.asInstanceOf[js.Any])
    
    inline def setPolicyPeriodInMinutesUndefined: Self = StObject.set(x, "PolicyPeriodInMinutes", js.undefined)
  }
}
