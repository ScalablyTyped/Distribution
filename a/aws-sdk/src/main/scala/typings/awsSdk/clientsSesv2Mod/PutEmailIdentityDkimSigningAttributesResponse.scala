package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailIdentityDkimSigningAttributesResponse extends StObject {
  
  /**
    * The DKIM authentication status of the identity. Amazon SES determines the authentication status by searching for specific records in the DNS configuration for your domain. If you used Easy DKIM to set up DKIM authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your domain. If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses the selector that you specified. The value of the TXT record must be a public key that's paired with the private key that you specified in the process of creating the identity. The status can be one of the following:    PENDING – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM records in the DNS configuration for the domain.    SUCCESS – The verification process completed successfully.    FAILED – The verification process failed. This typically occurs when Amazon SES fails to find the DKIM records in the DNS configuration of the domain.    TEMPORARY_FAILURE – A temporary issue is preventing Amazon SES from determining the DKIM authentication status of the domain.    NOT_STARTED – The DKIM verification process hasn't been initiated for the domain.  
    */
  var DkimStatus: js.UndefOr[typings.awsSdk.clientsSesv2Mod.DkimStatus] = js.undefined
  
  /**
    * If you used Easy DKIM to configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process is complete. If you configured DKIM authentication for the domain by providing your own public-private key pair, then this object contains the selector that's associated with your public key. Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS configuration of the domain for up to 72 hours.
    */
  var DkimTokens: js.UndefOr[DnsTokenList] = js.undefined
}
object PutEmailIdentityDkimSigningAttributesResponse {
  
  inline def apply(): PutEmailIdentityDkimSigningAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEmailIdentityDkimSigningAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutEmailIdentityDkimSigningAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setDkimStatus(value: DkimStatus): Self = StObject.set(x, "DkimStatus", value.asInstanceOf[js.Any])
    
    inline def setDkimStatusUndefined: Self = StObject.set(x, "DkimStatus", js.undefined)
    
    inline def setDkimTokens(value: DnsTokenList): Self = StObject.set(x, "DkimTokens", value.asInstanceOf[js.Any])
    
    inline def setDkimTokensUndefined: Self = StObject.set(x, "DkimTokens", js.undefined)
    
    inline def setDkimTokensVarargs(value: DnsToken*): Self = StObject.set(x, "DkimTokens", js.Array(value*))
  }
}
