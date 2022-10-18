package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientDetail extends StObject {
  
  /**
    * The AWS Single Sign-On (AWS SSO) authentication information.
    */
  var ssoIdentity: js.UndefOr[SSOIdentity] = js.undefined
}
object RecipientDetail {
  
  inline def apply(): RecipientDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientDetail]
  }
  
  extension [Self <: RecipientDetail](x: Self) {
    
    inline def setSsoIdentity(value: SSOIdentity): Self = StObject.set(x, "ssoIdentity", value.asInstanceOf[js.Any])
    
    inline def setSsoIdentityUndefined: Self = StObject.set(x, "ssoIdentity", js.undefined)
  }
}
