package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceTypeOfferingsResult extends StObject {
  
  /**
    * The instance types offered.
    */
  var InstanceTypeOfferings: js.UndefOr[InstanceTypeOfferingsList] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeInstanceTypeOfferingsResult {
  
  inline def apply(): DescribeInstanceTypeOfferingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceTypeOfferingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstanceTypeOfferingsResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceTypeOfferings(value: InstanceTypeOfferingsList): Self = StObject.set(x, "InstanceTypeOfferings", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeOfferingsUndefined: Self = StObject.set(x, "InstanceTypeOfferings", js.undefined)
    
    inline def setInstanceTypeOfferingsVarargs(value: InstanceTypeOffering*): Self = StObject.set(x, "InstanceTypeOfferings", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
