package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentityRequest extends StObject {
  
  /**
    * The identity to be removed from the list of identities for the AWS Account.
    */
  var Identity: typings.awsSdk.clientsSesMod.Identity
}
object DeleteIdentityRequest {
  
  inline def apply(Identity: Identity): DeleteIdentityRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityRequest]
  }
  
  extension [Self <: DeleteIdentityRequest](x: Self) {
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
  }
}
