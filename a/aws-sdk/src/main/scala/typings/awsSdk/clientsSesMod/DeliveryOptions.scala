package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryOptions extends StObject {
  
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[typings.awsSdk.clientsSesMod.TlsPolicy] = js.undefined
}
object DeliveryOptions {
  
  inline def apply(): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryOptions]
  }
  
  extension [Self <: DeliveryOptions](x: Self) {
    
    inline def setTlsPolicy(value: TlsPolicy): Self = StObject.set(x, "TlsPolicy", value.asInstanceOf[js.Any])
    
    inline def setTlsPolicyUndefined: Self = StObject.set(x, "TlsPolicy", js.undefined)
  }
}
