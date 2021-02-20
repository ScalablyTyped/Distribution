package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCertificatesRequest extends StObject {
  
  /**
    * Filter the certificate list by status value.
    */
  var CertificateStatuses: js.UndefOr[typings.awsSdk.acmMod.CertificateStatuses] = js.native
  
  /**
    * Filter the certificate list. For more information, see the Filters structure.
    */
  var Includes: js.UndefOr[Filters] = js.native
  
  /**
    * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.acmMod.MaxItems] = js.native
  
  /**
    * Use this parameter only when paginating results and only in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmMod.NextToken] = js.native
}
object ListCertificatesRequest {
  
  @scala.inline
  def apply(): ListCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesRequest]
  }
  
  @scala.inline
  implicit class ListCertificatesRequestMutableBuilder[Self <: ListCertificatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateStatuses(value: CertificateStatuses): Self = StObject.set(x, "CertificateStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateStatusesUndefined: Self = StObject.set(x, "CertificateStatuses", js.undefined)
    
    @scala.inline
    def setCertificateStatusesVarargs(value: CertificateStatus*): Self = StObject.set(x, "CertificateStatuses", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: Filters): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    @scala.inline
    def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
