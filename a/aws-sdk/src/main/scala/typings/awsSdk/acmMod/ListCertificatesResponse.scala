package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificatesResponse extends StObject {
  
  /**
    * A list of ACM certificates.
    */
  var CertificateSummaryList: js.UndefOr[typings.awsSdk.acmMod.CertificateSummaryList] = js.undefined
  
  /**
    * When the list is truncated, this value is present and contains the value to use for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmMod.NextToken] = js.undefined
}
object ListCertificatesResponse {
  
  inline def apply(): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResponse]
  }
  
  extension [Self <: ListCertificatesResponse](x: Self) {
    
    inline def setCertificateSummaryList(value: CertificateSummaryList): Self = StObject.set(x, "CertificateSummaryList", value.asInstanceOf[js.Any])
    
    inline def setCertificateSummaryListUndefined: Self = StObject.set(x, "CertificateSummaryList", js.undefined)
    
    inline def setCertificateSummaryListVarargs(value: CertificateSummary*): Self = StObject.set(x, "CertificateSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
