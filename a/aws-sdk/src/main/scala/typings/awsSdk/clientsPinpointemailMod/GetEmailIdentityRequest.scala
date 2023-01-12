package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEmailIdentityRequest extends StObject {
  
  /**
    * The email identity that you want to retrieve details for.
    */
  var EmailIdentity: Identity
}
object GetEmailIdentityRequest {
  
  inline def apply(EmailIdentity: Identity): GetEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailIdentityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEmailIdentityRequest] (val x: Self) extends AnyVal {
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
