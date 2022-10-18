package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressesAttributeResult extends StObject {
  
  /**
    * Information about the IP addresses.
    */
  var Addresses: js.UndefOr[AddressSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeAddressesAttributeResult {
  
  inline def apply(): DescribeAddressesAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesAttributeResult]
  }
  
  extension [Self <: DescribeAddressesAttributeResult](x: Self) {
    
    inline def setAddresses(value: AddressSet): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    inline def setAddressesVarargs(value: AddressAttribute*): Self = StObject.set(x, "Addresses", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
