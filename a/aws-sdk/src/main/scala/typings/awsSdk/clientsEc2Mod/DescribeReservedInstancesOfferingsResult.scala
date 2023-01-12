package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedInstancesOfferingsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Reserved Instances offerings.
    */
  var ReservedInstancesOfferings: js.UndefOr[ReservedInstancesOfferingList] = js.undefined
}
object DescribeReservedInstancesOfferingsResult {
  
  inline def apply(): DescribeReservedInstancesOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesOfferingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservedInstancesOfferingsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedInstancesOfferings(value: ReservedInstancesOfferingList): Self = StObject.set(x, "ReservedInstancesOfferings", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesOfferingsUndefined: Self = StObject.set(x, "ReservedInstancesOfferings", js.undefined)
    
    inline def setReservedInstancesOfferingsVarargs(value: ReservedInstancesOffering*): Self = StObject.set(x, "ReservedInstancesOfferings", js.Array(value*))
  }
}
