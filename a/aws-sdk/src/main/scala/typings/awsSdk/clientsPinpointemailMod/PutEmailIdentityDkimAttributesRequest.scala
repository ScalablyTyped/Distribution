package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailIdentityDkimAttributesRequest extends StObject {
  
  /**
    * The email identity that you want to change the DKIM settings for.
    */
  var EmailIdentity: Identity
  
  /**
    * Sets the DKIM signing configuration for the identity. When you set this value true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. When you set this value to false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.undefined
}
object PutEmailIdentityDkimAttributesRequest {
  
  inline def apply(EmailIdentity: Identity): PutEmailIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutEmailIdentityDkimAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    inline def setSigningEnabled(value: Enabled): Self = StObject.set(x, "SigningEnabled", value.asInstanceOf[js.Any])
    
    inline def setSigningEnabledUndefined: Self = StObject.set(x, "SigningEnabled", js.undefined)
  }
}
