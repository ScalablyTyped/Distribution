package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEmailIdentityRequest extends StObject {
  
  /**
    * The identity (that is, the email address or domain) to delete.
    */
  var EmailIdentity: Identity
}
object DeleteEmailIdentityRequest {
  
  inline def apply(EmailIdentity: Identity): DeleteEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailIdentityRequest]
  }
  
  extension [Self <: DeleteEmailIdentityRequest](x: Self) {
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
