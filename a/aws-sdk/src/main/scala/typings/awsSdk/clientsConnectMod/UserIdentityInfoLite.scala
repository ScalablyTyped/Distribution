package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentityInfoLite extends StObject {
  
  /**
    * The user's first name.
    */
  var FirstName: js.UndefOr[AgentFirstName] = js.undefined
  
  /**
    * The user's last name.
    */
  var LastName: js.UndefOr[AgentLastName] = js.undefined
}
object UserIdentityInfoLite {
  
  inline def apply(): UserIdentityInfoLite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentityInfoLite]
  }
  
  extension [Self <: UserIdentityInfoLite](x: Self) {
    
    inline def setFirstName(value: AgentFirstName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setLastName(value: AgentLastName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
  }
}
