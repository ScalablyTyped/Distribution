package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The ID of the user or group. Pattern: ^([0-9a-fA-F]{10}-|)[A-Fa-f0-9]{8}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{12}$ 
    */
  var id: SsoId
  
  /**
    * Specifies whether this is a single user or a group.
    */
  var `type`: UserType
}
object User {
  
  inline def apply(id: SsoId, `type`: UserType): User = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setId(value: SsoId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: UserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
