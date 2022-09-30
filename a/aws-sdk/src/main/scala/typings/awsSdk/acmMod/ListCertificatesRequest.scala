package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificatesRequest extends StObject {
  
  /**
    * Filter the certificate list by status value.
    */
  var CertificateStatuses: js.UndefOr[typings.awsSdk.acmMod.CertificateStatuses] = js.undefined
  
  /**
    * Filter the certificate list. For more information, see the Filters structure.
    */
  var Includes: js.UndefOr[Filters] = js.undefined
  
  /**
    * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.acmMod.MaxItems] = js.undefined
  
  /**
    * Use this parameter only when paginating results and only in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmMod.NextToken] = js.undefined
  
  /**
    * Specifies the field to sort results by. If you specify SortBy, you must also specify SortOrder.
    */
  var SortBy: js.UndefOr[typings.awsSdk.acmMod.SortBy] = js.undefined
  
  /**
    * Specifies the order of sorted results. If you specify SortOrder, you must also specify SortBy.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.acmMod.SortOrder] = js.undefined
}
object ListCertificatesRequest {
  
  inline def apply(): ListCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesRequest]
  }
  
  extension [Self <: ListCertificatesRequest](x: Self) {
    
    inline def setCertificateStatuses(value: CertificateStatuses): Self = StObject.set(x, "CertificateStatuses", value.asInstanceOf[js.Any])
    
    inline def setCertificateStatusesUndefined: Self = StObject.set(x, "CertificateStatuses", js.undefined)
    
    inline def setCertificateStatusesVarargs(value: CertificateStatus*): Self = StObject.set(x, "CertificateStatuses", js.Array(value*))
    
    inline def setIncludes(value: Filters): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    inline def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
