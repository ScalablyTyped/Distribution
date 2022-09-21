package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined auth0.auth0.ObjectWithId & {  invitation_id :string} */
trait ObjectWithIdinvitationidsId extends StObject {
  
  var id: String
  
  var invitation_id: String
}
object ObjectWithIdinvitationidsId {
  
  inline def apply(id: String, invitation_id: String): ObjectWithIdinvitationidsId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithIdinvitationidsId]
  }
  
  extension [Self <: ObjectWithIdinvitationidsId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvitation_id(value: String): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
  }
}
