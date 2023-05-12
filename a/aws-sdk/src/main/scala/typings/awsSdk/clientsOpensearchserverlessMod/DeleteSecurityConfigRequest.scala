package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSecurityConfigRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The security configuration identifier. For SAML the ID will be saml/&lt;accountId&gt;/&lt;idpProviderName&gt;. For example, saml/123456789123/OKTADev.
    */
  var id: SecurityConfigId
}
object DeleteSecurityConfigRequest {
  
  inline def apply(id: SecurityConfigId): DeleteSecurityConfigRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSecurityConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setId(value: SecurityConfigId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
