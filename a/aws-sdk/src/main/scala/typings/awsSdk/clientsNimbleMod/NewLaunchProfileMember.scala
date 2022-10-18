package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewLaunchProfileMember extends StObject {
  
  /**
    * The persona.
    */
  var persona: LaunchProfilePersona
  
  /**
    * The principal ID.
    */
  var principalId: String
}
object NewLaunchProfileMember {
  
  inline def apply(persona: LaunchProfilePersona, principalId: String): NewLaunchProfileMember = {
    val __obj = js.Dynamic.literal(persona = persona.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewLaunchProfileMember]
  }
  
  extension [Self <: NewLaunchProfileMember](x: Self) {
    
    inline def setPersona(value: LaunchProfilePersona): Self = StObject.set(x, "persona", value.asInstanceOf[js.Any])
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
  }
}
