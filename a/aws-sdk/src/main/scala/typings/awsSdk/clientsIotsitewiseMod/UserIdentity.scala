package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentity extends StObject {
  
  /**
    * The IAM Identity Center ID of the user.
    */
  var id: IdentityId
}
object UserIdentity {
  
  inline def apply(id: IdentityId): UserIdentity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
  
  extension [Self <: UserIdentity](x: Self) {
    
    inline def setId(value: IdentityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
