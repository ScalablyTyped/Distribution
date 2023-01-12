package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewStudioMember extends StObject {
  
  /**
    * The persona.
    */
  var persona: StudioPersona
  
  /**
    * The principal ID.
    */
  var principalId: String
}
object NewStudioMember {
  
  inline def apply(persona: StudioPersona, principalId: String): NewStudioMember = {
    val __obj = js.Dynamic.literal(persona = persona.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewStudioMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewStudioMember] (val x: Self) extends AnyVal {
    
    inline def setPersona(value: StudioPersona): Self = StObject.set(x, "persona", value.asInstanceOf[js.Any])
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
  }
}
