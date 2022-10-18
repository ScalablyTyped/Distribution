package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompromisedCredentialsActionsType extends StObject {
  
  /**
    * The event action.
    */
  var EventAction: CompromisedCredentialsEventActionType
}
object CompromisedCredentialsActionsType {
  
  inline def apply(EventAction: CompromisedCredentialsEventActionType): CompromisedCredentialsActionsType = {
    val __obj = js.Dynamic.literal(EventAction = EventAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompromisedCredentialsActionsType]
  }
  
  extension [Self <: CompromisedCredentialsActionsType](x: Self) {
    
    inline def setEventAction(value: CompromisedCredentialsEventActionType): Self = StObject.set(x, "EventAction", value.asInstanceOf[js.Any])
  }
}
