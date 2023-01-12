package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryOptions extends StObject {
  
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[PoolName] = js.undefined
  
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.TlsPolicy] = js.undefined
}
object DeliveryOptions {
  
  inline def apply(): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryOptions] (val x: Self) extends AnyVal {
    
    inline def setSendingPoolName(value: PoolName): Self = StObject.set(x, "SendingPoolName", value.asInstanceOf[js.Any])
    
    inline def setSendingPoolNameUndefined: Self = StObject.set(x, "SendingPoolName", js.undefined)
    
    inline def setTlsPolicy(value: TlsPolicy): Self = StObject.set(x, "TlsPolicy", value.asInstanceOf[js.Any])
    
    inline def setTlsPolicyUndefined: Self = StObject.set(x, "TlsPolicy", js.undefined)
  }
}
