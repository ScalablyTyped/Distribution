package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressRequest extends StObject {
  
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: typings.awsSdk.clientsSnowballMod.AddressId
}
object DescribeAddressRequest {
  
  inline def apply(AddressId: AddressId): DescribeAddressRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAddressRequest]
  }
  
  extension [Self <: DescribeAddressRequest](x: Self) {
    
    inline def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
  }
}
