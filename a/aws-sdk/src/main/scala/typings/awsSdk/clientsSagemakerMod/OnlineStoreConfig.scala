package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineStoreConfig extends StObject {
  
  /**
    * Turn OnlineStore off by specifying False for the EnableOnlineStore flag. Turn OnlineStore on by specifying True for the EnableOnlineStore flag.  The default value is False.
    */
  var EnableOnlineStore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use to specify KMS Key ID (KMSKeyId) for at-rest encryption of your OnlineStore.
    */
  var SecurityConfig: js.UndefOr[OnlineStoreSecurityConfig] = js.undefined
}
object OnlineStoreConfig {
  
  inline def apply(): OnlineStoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineStoreConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineStoreConfig] (val x: Self) extends AnyVal {
    
    inline def setEnableOnlineStore(value: Boolean): Self = StObject.set(x, "EnableOnlineStore", value.asInstanceOf[js.Any])
    
    inline def setEnableOnlineStoreUndefined: Self = StObject.set(x, "EnableOnlineStore", js.undefined)
    
    inline def setSecurityConfig(value: OnlineStoreSecurityConfig): Self = StObject.set(x, "SecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "SecurityConfig", js.undefined)
  }
}
