package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityInfo extends StObject {
  
  /**
    * The address or domain of the identity.
    */
  var IdentityName: js.UndefOr[Identity] = js.undefined
  
  /**
    * The email identity type. Note: the MANAGED_DOMAIN type is not supported for email identity types.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.clientsSesv2Mod.IdentityType] = js.undefined
  
  /**
    * Indicates whether or not you can send email from the identity. An identity is an email address or domain that you send email from. Before you can send email from an identity, you have to demostrate that you own the identity, and that you authorize Amazon SES to send email from that identity.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.undefined
}
object IdentityInfo {
  
  inline def apply(): IdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityInfo]
  }
  
  extension [Self <: IdentityInfo](x: Self) {
    
    inline def setIdentityName(value: Identity): Self = StObject.set(x, "IdentityName", value.asInstanceOf[js.Any])
    
    inline def setIdentityNameUndefined: Self = StObject.set(x, "IdentityName", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    inline def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
  }
}
