package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DkimSigningAttributes extends StObject {
  
  /**
    * [Bring Your Own DKIM] A private key that's used to generate a DKIM signature. The private key must use 1024 or 2048-bit RSA encryption, and must be encoded using base64 encoding.
    */
  var DomainSigningPrivateKey: js.UndefOr[PrivateKey] = js.undefined
  
  /**
    * [Bring Your Own DKIM] A string that's used to identify a public key in the DNS configuration for a domain.
    */
  var DomainSigningSelector: js.UndefOr[Selector] = js.undefined
  
  /**
    * [Easy DKIM] The key length of the future DKIM key pair to be generated. This can be changed at most once per day.
    */
  var NextSigningKeyLength: js.UndefOr[DkimSigningKeyLength] = js.undefined
}
object DkimSigningAttributes {
  
  inline def apply(): DkimSigningAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DkimSigningAttributes]
  }
  
  extension [Self <: DkimSigningAttributes](x: Self) {
    
    inline def setDomainSigningPrivateKey(value: PrivateKey): Self = StObject.set(x, "DomainSigningPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setDomainSigningPrivateKeyUndefined: Self = StObject.set(x, "DomainSigningPrivateKey", js.undefined)
    
    inline def setDomainSigningSelector(value: Selector): Self = StObject.set(x, "DomainSigningSelector", value.asInstanceOf[js.Any])
    
    inline def setDomainSigningSelectorUndefined: Self = StObject.set(x, "DomainSigningSelector", js.undefined)
    
    inline def setNextSigningKeyLength(value: DkimSigningKeyLength): Self = StObject.set(x, "NextSigningKeyLength", value.asInstanceOf[js.Any])
    
    inline def setNextSigningKeyLengthUndefined: Self = StObject.set(x, "NextSigningKeyLength", js.undefined)
  }
}
