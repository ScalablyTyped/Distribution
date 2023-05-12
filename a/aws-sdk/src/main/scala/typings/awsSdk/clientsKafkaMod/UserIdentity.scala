package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentity extends StObject {
  
  /**
    * 
    A unique identifier for the requester that calls the API operation.
    
    */
  var PrincipalId: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The identity type of the requester that calls the API operation.
    
    */
  var Type: js.UndefOr[UserIdentityType] = js.undefined
}
object UserIdentity {
  
  inline def apply(): UserIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserIdentity] (val x: Self) extends AnyVal {
    
    inline def setPrincipalId(value: string): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setType(value: UserIdentityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
