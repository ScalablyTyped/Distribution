package typings.awsSdk.clientsElasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorOfferingsRequest extends StObject {
  
  /**
    *  The list of accelerator types to describe. 
    */
  var acceleratorTypes: js.UndefOr[AcceleratorTypeNameList] = js.undefined
  
  /**
    *  The location type that you want to describe accelerator type offerings for. It can assume the following values: region: will return the accelerator type offering at the regional level. availability-zone: will return the accelerator type offering at the availability zone level. availability-zone-id: will return the accelerator type offering at the availability zone level returning the availability zone id. 
    */
  var locationType: LocationType
}
object DescribeAcceleratorOfferingsRequest {
  
  inline def apply(locationType: LocationType): DescribeAcceleratorOfferingsRequest = {
    val __obj = js.Dynamic.literal(locationType = locationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorOfferingsRequest]
  }
  
  extension [Self <: DescribeAcceleratorOfferingsRequest](x: Self) {
    
    inline def setAcceleratorTypes(value: AcceleratorTypeNameList): Self = StObject.set(x, "acceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "acceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: AcceleratorTypeName*): Self = StObject.set(x, "acceleratorTypes", js.Array(value*))
    
    inline def setLocationType(value: LocationType): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
  }
}
