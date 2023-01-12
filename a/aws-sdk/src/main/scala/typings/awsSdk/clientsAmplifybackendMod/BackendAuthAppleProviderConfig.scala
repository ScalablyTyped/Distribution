package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendAuthAppleProviderConfig extends StObject {
  
  /**
    * Describes the client_id (also called Services ID) that comes from Apple.
    */
  var ClientId: js.UndefOr[string] = js.undefined
  
  /**
    * Describes the key_id that comes from Apple.
    */
  var KeyId: js.UndefOr[string] = js.undefined
  
  /**
    * Describes the private_key that comes from Apple.
    */
  var PrivateKey: js.UndefOr[string] = js.undefined
  
  /**
    * Describes the team_id that comes from Apple.
    */
  var TeamId: js.UndefOr[string] = js.undefined
}
object BackendAuthAppleProviderConfig {
  
  inline def apply(): BackendAuthAppleProviderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendAuthAppleProviderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendAuthAppleProviderConfig] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: string): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setKeyId(value: string): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setPrivateKey(value: string): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "PrivateKey", js.undefined)
    
    inline def setTeamId(value: string): Self = StObject.set(x, "TeamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "TeamId", js.undefined)
  }
}
