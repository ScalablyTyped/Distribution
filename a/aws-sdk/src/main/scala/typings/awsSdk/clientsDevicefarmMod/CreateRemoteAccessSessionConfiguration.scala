package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRemoteAccessSessionConfiguration extends StObject {
  
  /**
    * The billing method for the remote access session.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.undefined
  
  /**
    * An array of ARNs included in the VPC endpoint configuration.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined
}
object CreateRemoteAccessSessionConfiguration {
  
  inline def apply(): CreateRemoteAccessSessionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRemoteAccessSessionConfiguration]
  }
  
  extension [Self <: CreateRemoteAccessSessionConfiguration](x: Self) {
    
    inline def setBillingMethod(value: BillingMethod): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
    
    inline def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
    
    inline def setVpceConfigurationArns(value: AmazonResourceNames): Self = StObject.set(x, "vpceConfigurationArns", value.asInstanceOf[js.Any])
    
    inline def setVpceConfigurationArnsUndefined: Self = StObject.set(x, "vpceConfigurationArns", js.undefined)
    
    inline def setVpceConfigurationArnsVarargs(value: AmazonResourceName*): Self = StObject.set(x, "vpceConfigurationArns", js.Array(value*))
  }
}
