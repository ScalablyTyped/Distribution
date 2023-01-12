package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedInstanceOfferingsRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  /**
    * If your initial DescribeReservedInstanceOfferings operation returns a nextToken, you can include the returned nextToken in subsequent DescribeReservedInstanceOfferings operations, which returns results in the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
  
  /**
    * The Reserved Instance identifier filter value. Use this parameter to show only the available instance types that match the specified reservation identifier.
    */
  var ReservedInstanceOfferingId: js.UndefOr[GUID] = js.undefined
}
object DescribeReservedInstanceOfferingsRequest {
  
  inline def apply(): DescribeReservedInstanceOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstanceOfferingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservedInstanceOfferingsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedInstanceOfferingId(value: GUID): Self = StObject.set(x, "ReservedInstanceOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceOfferingIdUndefined: Self = StObject.set(x, "ReservedInstanceOfferingId", js.undefined)
  }
}
