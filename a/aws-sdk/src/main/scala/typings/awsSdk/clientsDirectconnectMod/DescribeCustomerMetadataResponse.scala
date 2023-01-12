package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomerMetadataResponse extends StObject {
  
  /**
    * The list of customer agreements.
    */
  var agreements: js.UndefOr[AgreementList] = js.undefined
  
  /**
    * The type of network-to-network interface (NNI) partner. The partner type will be one of the following:   V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit connections.   V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.   nonPartner: The customer is not a partner.  
    */
  var nniPartnerType: js.UndefOr[NniPartnerType] = js.undefined
}
object DescribeCustomerMetadataResponse {
  
  inline def apply(): DescribeCustomerMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomerMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCustomerMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setAgreements(value: AgreementList): Self = StObject.set(x, "agreements", value.asInstanceOf[js.Any])
    
    inline def setAgreementsUndefined: Self = StObject.set(x, "agreements", js.undefined)
    
    inline def setAgreementsVarargs(value: CustomerAgreement*): Self = StObject.set(x, "agreements", js.Array(value*))
    
    inline def setNniPartnerType(value: NniPartnerType): Self = StObject.set(x, "nniPartnerType", value.asInstanceOf[js.Any])
    
    inline def setNniPartnerTypeUndefined: Self = StObject.set(x, "nniPartnerType", js.undefined)
  }
}
