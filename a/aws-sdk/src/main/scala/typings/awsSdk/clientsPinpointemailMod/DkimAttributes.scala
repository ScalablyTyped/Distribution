package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DkimAttributes extends StObject {
  
  /**
    * If the value is true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. If the value is false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the domain. The status can be one of the following:    PENDING – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the domain, but will continue to attempt to locate them.    SUCCESS – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.    FAILED – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain, and won't continue to search for them.    TEMPORARY_FAILURE – A temporary issue occurred, which prevented Amazon Pinpoint from determining the DKIM status for the domain.    NOT_STARTED – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records for the domain.  
    */
  var Status: js.UndefOr[DkimStatus] = js.undefined
  
  /**
    * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding them to the DNS configuration for your domain.
    */
  var Tokens: js.UndefOr[DnsTokenList] = js.undefined
}
object DkimAttributes {
  
  inline def apply(): DkimAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DkimAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DkimAttributes] (val x: Self) extends AnyVal {
    
    inline def setSigningEnabled(value: Enabled): Self = StObject.set(x, "SigningEnabled", value.asInstanceOf[js.Any])
    
    inline def setSigningEnabledUndefined: Self = StObject.set(x, "SigningEnabled", js.undefined)
    
    inline def setStatus(value: DkimStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTokens(value: DnsTokenList): Self = StObject.set(x, "Tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "Tokens", js.undefined)
    
    inline def setTokensVarargs(value: DnsToken*): Self = StObject.set(x, "Tokens", js.Array(value*))
  }
}
