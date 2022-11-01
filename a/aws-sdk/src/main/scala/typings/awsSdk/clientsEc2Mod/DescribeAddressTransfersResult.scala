package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressTransfersResult extends StObject {
  
  /**
    * The Elastic IP address transfer.
    */
  var AddressTransfers: js.UndefOr[AddressTransferList] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeAddressTransfersResult {
  
  inline def apply(): DescribeAddressTransfersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressTransfersResult]
  }
  
  extension [Self <: DescribeAddressTransfersResult](x: Self) {
    
    inline def setAddressTransfers(value: AddressTransferList): Self = StObject.set(x, "AddressTransfers", value.asInstanceOf[js.Any])
    
    inline def setAddressTransfersUndefined: Self = StObject.set(x, "AddressTransfers", js.undefined)
    
    inline def setAddressTransfersVarargs(value: AddressTransfer*): Self = StObject.set(x, "AddressTransfers", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
