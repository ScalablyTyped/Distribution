package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The unique identifier of a customer profile.
    */
  var ProfileId: uuid
}
object DeleteProfileRequest {
  
  inline def apply(DomainName: name, ProfileId: uuid): DeleteProfileRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setProfileId(value: uuid): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
  }
}
