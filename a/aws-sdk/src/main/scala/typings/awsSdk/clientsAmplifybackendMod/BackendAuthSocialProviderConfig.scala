package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendAuthSocialProviderConfig extends StObject {
  
  /**
    * Describes the client_id, which can be obtained from the third-party social federation provider.
    */
  var ClientId: js.UndefOr[string] = js.undefined
  
  /**
    * Describes the client_secret, which can be obtained from third-party social federation providers.
    */
  var ClientSecret: js.UndefOr[string] = js.undefined
}
object BackendAuthSocialProviderConfig {
  
  inline def apply(): BackendAuthSocialProviderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendAuthSocialProviderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendAuthSocialProviderConfig] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: string): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setClientSecret(value: string): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "ClientSecret", js.undefined)
  }
}
