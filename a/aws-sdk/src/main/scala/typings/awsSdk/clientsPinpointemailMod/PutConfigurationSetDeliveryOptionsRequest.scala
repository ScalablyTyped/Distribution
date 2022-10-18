package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationSetDeliveryOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to associate with a dedicated IP pool.
    */
  var ConfigurationSetName: typings.awsSdk.clientsPinpointemailMod.ConfigurationSetName
  
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.SendingPoolName] = js.undefined
  
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.TlsPolicy] = js.undefined
}
object PutConfigurationSetDeliveryOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetDeliveryOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
  }
  
  extension [Self <: PutConfigurationSetDeliveryOptionsRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setSendingPoolName(value: SendingPoolName): Self = StObject.set(x, "SendingPoolName", value.asInstanceOf[js.Any])
    
    inline def setSendingPoolNameUndefined: Self = StObject.set(x, "SendingPoolName", js.undefined)
    
    inline def setTlsPolicy(value: TlsPolicy): Self = StObject.set(x, "TlsPolicy", value.asInstanceOf[js.Any])
    
    inline def setTlsPolicyUndefined: Self = StObject.set(x, "TlsPolicy", js.undefined)
  }
}
